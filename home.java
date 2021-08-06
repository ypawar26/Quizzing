private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
new Home().setVisible(true); dispose() ;}

private void submitActionPerformed(java.awt.event.ActionEvent evt) {
String Username=jTextField1.getText();
String Password=jPasswordField1.getText();
if(Username.length()==0)
{ JOptionPane.showMessageDialog(null,&quot;Enter Valid Username&quot;);
jTextField1.setText(&quot;&quot;);
jTextField1.requestFocus(); }
if(Password.length()==0)
JOptionPane.showMessageDialog(null,&quot;Enter Valid Password&quot;);
jPasswordField1.setText(&quot;&quot;);
jPasswordField1.requestFocus();
try{
Class.forName(&quot;com.mysql.jdbc.Driver&quot;);
Connection
connection=DriverManager.getConnection(&quot;jdbc:mysql://localhost:3306/data?zeroDateTim
eBehavior=convertToNull&quot;,&quot;root&quot;,&quot;&quot;);
String query=&quot;select * from account where Username=? and Password=?&quot;;
PreparedStatement statement= connection.prepareStatement(query);
statement.setString(1,Username);
statement.setString(2,Password);
ResultSet set=statement.executeQuery();

if(set.next())
{ JOptionPane.showMessageDialog(null,&quot;Login Succesful&quot;);
new Question1().setVisible(true);
dispose(); }
else
{ JOptionPane.showMessageDialog(null,&quot;Invalid Username or Password&quot;);}
}catch(ClassNotFoundException | SQLException e)
{ e.printStackTrace(); } }
private void newuserActionPerformed(java.awt.event.ActionEvent evt) {
new Account().setVisible(true); dispose(); }