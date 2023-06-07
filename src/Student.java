


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Student {
                        
    
                public void insertUpdateDelete( char operation ,Integer Serial_No,String Student_Id ,String fname,String lname,String gender,String bdate,
                         String phone,String email , String address ){
        
        
        Connection con = MyConnection.getConnection();
        PreparedStatement ps ;
        
        if(operation == 'i'){
            
            try {
                ps = con.prepareStatement("INSERT INTO student( Student_Id, First_Name, Last_Name, Gender, Birthdate, Phone, Email, Address) VALUES(?,?,?,?,?,?,?,?)");
                
                ps.setString(1, Student_Id);
                ps.setString(2, fname);
                ps.setString(3, lname);
                ps.setString(4, gender);
                ps.setString(5, bdate);
                ps.setString(6, phone);
                ps.setString(7, email);
                ps.setString(8, address);
                
                if(ps.executeUpdate()>0){
                    
                    JOptionPane.showMessageDialog(null, "New Student added successfully");
                    
                }
                
                
            
            
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        if(operation == 'u'){
            
            try {
                ps = con.prepareStatement("UPDATE `student` SET `Serial_No`= ?,`Student_Id`= ?,`First_Name`= ? ,`Last_Name`= ?,`Gender`= ?,`Birthdate`= ? ,`Phone`= ? ,`Email`= ?,`Address`= ? WHERE `Serial_No`= ?");
                
                ps.setString(1, Student_Id);
                ps.setString(2, fname);
                ps.setString(3, lname);
                ps.setString(4, gender);
                ps.setString(5, bdate);
                ps.setString(6, phone);
                ps.setString(7, email);
                ps.setString(8, address);
                
                ps.setInt(9, Serial_No);
                
                if(ps.executeUpdate()>0){
                    
                    JOptionPane.showMessageDialog(null, "Student record updated successfully");
                    
                }
                
                
            
            
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                           
                           
        
    }
                
                
        public void fillstudentJtable(JTable table,String valueToSearch ){
             
           Connection con = MyConnection.getConnection();
                             
           PreparedStatement ps ;
             
           try {
                       
               ps = con.prepareStatement("SELECT * FROM `student` WHERE CONCAT (`Student_Id` , `First_Name` , `Last_Name`,`Phone`,`Email`,`Address`) LIKE ?");
                        
               ps.setString(1, "%"+ valueToSearch + "%");
                        
               ResultSet rs = ps.executeQuery();
                        
               DefaultTableModel model = (DefaultTableModel) table.getModel();
                        
               Object[] row ;
                        
               while (rs.next()){
                   
                row = new Object [9] ;
                            
                row[0] = rs.getInt(1);
                            
                row[1] = rs.getInt(2);
                            
                row[2] = rs.getString(3);
                            
                row[3] = rs.getString(4);
                            
                row[4] = rs.getString(5);
                            
                row[5] = rs.getString(6);
                            
                row[6] = rs.getString(7);
                            
                row[7] = rs.getString(8);
                            
                row[8] = rs.getString(9);
                            
                
                            
                model.addRow(row);
                            
                            
                        }
                                
                    } catch (SQLException ex) {
                        Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
             
         }
    
}
