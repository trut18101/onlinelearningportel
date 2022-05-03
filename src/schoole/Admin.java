/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoole;

import java.util.ArrayList;

/**
 *
 * 
 */
public class Admin {
    private final String A_username="Admin";
    private final String A_password="Admin";

    public String getA_username() {
        return A_username;
    }

    public String getA_password() {
        return A_password;
    }
    private static Admin UniqueAdmin;
    private String A_name="Ahmed";
    private String A_address="cairo";
    private int A_phone=9088777;

    public static Admin GetInstance()
    {
        if(UniqueAdmin==null)
        {
            UniqueAdmin=new Admin();
        }
        return UniqueAdmin; 
    }
    public static Admin getUniqueAdmin() {
        return UniqueAdmin;
    }

    public static void setUniqueAdmin(Admin UniqueAdmin) {
        Admin.UniqueAdmin = UniqueAdmin;
    }
    
    public void AssociateParentAccount(Parent P,Student S)
    {
        S.P=P;
    }
    
    public void  AssignSubjectTeacher(Subject S, Teacher T)
    {
        T.setS(S);
    }
    public void  Create_ParentAccount(String Un,String Pass,String AccessToken,Boolean Token,AccountManager am)
    {
        Account p=new Account(Un,Pass,AccessToken,Token);
        am.AddParents(p);
    }
    
    public void  Create_StudentAccount(String Un,String Pass,String AccessToken,Boolean Token,AccountManager am)
    {
        Account s=new Account(Un,Pass,AccessToken,Token);
        am.AddStudents(s);
    }
    public void  Create_TeacherAccount(String Un,String Pass,String AccessToken,Boolean Token,AccountManager am)
    {
        Account t=new Account(Un,Pass,AccessToken,Token);
        am.AddTeachers(t);
    }
    
    public void  Remove_Account(Account a,String AccessToken,AccountManager am)
    {
        if(a.getAccessToken() == "Parent")
        {         
        for(int i=0;i<am.Parents.size();i++){
            if(am.Parents.get(i).getUsername()==a.getUsername())
            {
                am.Parents.remove(i);
            }
        }
        }
        if(a.getAccessToken() == "Student")
        {         
        for(int i=0;i<am.Students.size();i++){
            if(am.Students.get(i).getUsername()==a.getUsername())
            {
                am.Students.remove(i);
            }
        }
        }
        if(a.getAccessToken() == "Teacher")
        {         
        for(int i=0;i<am.Teachers.size();i++){
            if(am.Teachers.get(i).getUsername()==a.getUsername())
            {
                am.Teachers.remove(i);
            }
        }
        }
        
        
        
    }

    public String getA_name() {
        return A_name;
    }

    public void setA_name(String A_name) {
        this.A_name = A_name;
    }

    public String getA_address() {
        return A_address;
    }

    public void setA_address(String A_address) {
        this.A_address = A_address;
    }

    public int getA_phone() {
        return A_phone;
    }

    public void setA_phone(int A_phone) {
        this.A_phone = A_phone;
    }

    @Override
    public String toString() {
        return "Admin{" + "A_name=" + A_name + ", A_address=" + A_address + ", A_phone=" + A_phone + '}';
    }
    
    
}
