/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoole;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Goldy
 */
public class AccountManager {

    public ArrayList<Account> Parents;
    public ArrayList<Account> Students;
    public ArrayList<Account> Teachers;

    public AccountManager() {
        this.Parents = new ArrayList<Account>();
        this.Students = new ArrayList<Account>();
        this.Teachers = new ArrayList<Account>();
        Database dbst = new Database();
        String x = "Student";
        ResultSet rs = null;
        try {
            Statement stmt = dbst.db.createStatement();
            rs = stmt.executeQuery("select * from account where acesstoken='" + x + "'");
            while (rs.next()) {
                Students.add(new Account(rs.getString("Username"), rs.getString("Password"), rs.getString("AcessToken"), rs.getBoolean("Active")));
            }

        } catch (Exception e) {
            System.err.println("DATABASE QUERY ERROR: " + e.toString());
        }

        String y = "Parent";
        ResultSet rs1 = null;
        try {
            Statement stmt = dbst.db.createStatement();
            rs1 = stmt.executeQuery("select * from account where acesstoken='" + y + "'");
            while (rs1.next()) {
                Parents.add(new Account(rs1.getString("Username"), rs1.getString("Password"), rs1.getString("AcessToken"), rs1.getBoolean("Active")));
            }
        } catch (Exception e) {
            System.err.println("DATABASE QUERY ERROR: " + e.toString());
        }

        String z = "Teacher";
        ResultSet rs2 = null;
        try {
            Statement stmt = dbst.db.createStatement();
            rs2 = stmt.executeQuery("select * from account where acesstoken='" + z + "'");
            while (rs2.next()) {
                Teachers.add(new Account(rs2.getString("Username"), rs2.getString("Password"), rs2.getString("AcessToken"), rs2.getBoolean("Active")));
            }
        } catch (Exception e) {
            System.err.println("DATABASE QUERY ERROR: " + e.toString());
        }
    }

    public void AddParents(Account P) {
        Parents.add(P);
    }

    public void AddStudents(Account S) {
        Students.add(S);
    }

    public void AddTeachers(Account T) {
        Teachers.add(T);
    }

    public ArrayList<Account> getParents() {
        return Parents;
    }

    public ArrayList<Account> getStudents() {
        return Students;
    }

    public ArrayList<Account> getTeachers() {
        return Teachers;
    }

    
        public boolean CheckUsername(String x) {
        Database dbun = new Database();
        boolean z = false;
        ResultSet rs = null;
        try {
            Statement stmt = dbun.db.createStatement();
            rs = stmt.executeQuery("SELECT * FROM account WHERE Username ='" + x + "'");
            if (rs.next()) {
                z = true;
            } else {
                z = false;
            }
        } catch (Exception e) {
            System.err.println("DATABASE QUERY ERROR: " + e.toString());
        }
        return z;
    }

    public boolean CheckPassword(String x) {
        Database dbpw = new Database();
        boolean z = false;
        ResultSet rs = null;
        try {
            Statement stmt = dbpw.db.createStatement();
            rs = stmt.executeQuery("SELECT * FROM account WHERE Password ='" + x + "'");
            if (rs.next()) {
                z = true;
            } else {
                z = false;
            }
        } catch (Exception e) {
            System.err.println("DATABASE QUERY ERROR: " + e.toString());
        }
        return z;
    }

    @Override
    public String toString() {
        return "AccountManager{" + "Parents=" + Parents + ", Students=" + Students + ", Teachers=" + Teachers + '}';
    }
    
}
