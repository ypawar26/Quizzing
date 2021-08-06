private void FnameActionPerformed(java.awt.event.ActionEvent evt) {
String Firstname=Fname.getText();
if(Firstname.length()==0)
JOptionPane.showMessageDialog(null,&quot;Enter Valid Name&quot;); }
private void saveActionPerformed(java.awt.event.ActionEvent evt) {
String Firstname=Fname.getText();
String Lastname=Lname.getText();
String Stud=stu_id.getText();
String User=Lname.getText();
String Pass=pass2.getText();
if(User.length()==0)
{ JOptionPane.showMessageDialog(null,&quot;Enter Valid Username&quot;);
Lname.setText(&quot;&quot;);
Lname.requestFocus(); }
if(Pass.length()==0)
JOptionPane.showMessageDialog(null,&quot;Enter Valid Password&quot;);

if(Firstname.length()==0)
JOptionPane.showMessageDialog(null,&quot;Name Cannot be Blank&quot;);
if(Lastname.length()==0)
JOptionPane.showMessageDialog(null,&quot;Last Name Cannot be Blank&quot;);
if(Stud.length()==0)
JOptionPane.showMessageDialog(null,&quot;Student ID Cannot be Blank&quot;);
try{
Class.forName(&quot;com.mysql.jdbc.Driver&quot;);
con=DriverManager.getConnection(db_url,user_name,user_pass);
JOptionPane.showMessageDialog(null,&quot;Connection established&quot;);
st=con.createStatement();
String s1=t1.getText();
String s2=pass2.getText();
String query=&quot;insert into account values(&#39;&quot;+s1+&quot;&#39;,&#39;&quot;+s2+&quot;&#39;)&quot;;
int count=st.executeUpdate(query);
if(count&gt;=1)
{ JOptionPane.showMessageDialog(null,&quot;Records Inserted Successfully&quot;); }
Else{ JOptionPane.showMessageDialog(null,&quot;Records Cannot Be Inserted&quot;);}}
catch(Exception e){
JOptionPane.showMessageDialog(null,&quot;Connection not established&quot;);}
new Home().setVisible(true); }