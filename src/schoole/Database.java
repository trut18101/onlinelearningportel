/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoole;

/**
 *
 * @author Zeyad Mohamed
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

    private final String Username = "root";
    private final String Password = "";
    private final String DBname = "school_1";
    public Connection db;

    public Database() {
        try {
            //Loading the jdbc driver
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            //Get a connection to database
            db = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + DBname, Username, Password);
        } catch (Exception e) {
            System.err.println("DATABASE CONNECTION ERROR: " + e.toString());
        }
    }

    public void addStudent(Student s) {
        try {
            Statement stmt = db.createStatement();
            stmt.executeUpdate("insert into student values('" + s.getSt_name() + "', " + s.getSt_age() + ")");
            System.out.println("Student added");
        } catch (Exception e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        }
    }

    public ArrayList<Student> getAllStudents() {
        ArrayList<Student> result = new ArrayList();
        String x;
        int y;
        try {
            Statement stmt = db.createStatement();
            ResultSet rs = stmt.executeQuery("select * from student");
            while (rs.next()) {
                result.add(new Student(null, null, rs.getString("Name"), rs.getInt("Age"), rs.getInt("ID"), rs.getString("Email"), rs.getDouble("Grade"), null, null, ""));
            }
        } catch (Exception e) {
            System.err.println("DATABASE QUERY ERROR: " + e.toString());
        }
        return result;
    }

    public ArrayList<Teacher> getAllTeacher() {
        ArrayList<Teacher> result = new ArrayList();
        String x;
        int y;
        try {
            Statement stmt = db.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Teacher");
            while (rs.next()) {
                result.add(new Teacher(null, null, rs.getString("Name"), rs.getString("Address"), rs.getInt("ID"), rs.getInt("Phone"), rs.getString("Email"), rs.getString("SubjectName")));
            }
        } catch (Exception e) {
            System.err.println("DATABASE QUERY ERROR: " + e.toString());
        }
        return result;
    }

    public ArrayList<Parent> getAllParents() {
        ArrayList<Parent> result = new ArrayList();
        String x;
        int y;
        try {
            Statement stmt = db.createStatement();
            ResultSet rs = stmt.executeQuery("select * from parent");
            while (rs.next()) {
                result.add(new Parent(null, rs.getString("Name"), rs.getString("Address"), rs.getInt("ID"), rs.getInt("Phone"), rs.getString("Email"), 0, null));
            }
        } catch (Exception e) {
            System.err.println("DATABASE QUERY ERROR: " + e.toString());
        }
        return result;
    }

    public ArrayList<Subject> getAllSubjects() {
        ArrayList<Subject> result = new ArrayList();
        String x;
        int y;
        try {
            Statement stmt = db.createStatement();
            ResultSet rs = stmt.executeQuery("select * from subject");
            while (rs.next()) {
                result.add(new Subject(rs.getInt("SubjectID"), rs.getString("Name"), rs.getString("Content"), rs.getInt("Credit Hours")));
            }
        } catch (Exception e) {
            System.err.println("DATABASE QUERY ERROR: " + e.toString());
        }
        return result;
    }

    public void deleteStudent(String name) {
        try {
            Statement stmt = db.createStatement();
            stmt.executeUpdate("delete from student where name = '" + name + "'");
            System.out.println("Student deleted");
        } catch (Exception e) {
            System.err.println("DATABASE DELETION ERROR: " + e.toString());
        }
    }

    public void deleteParent(String name) {
        try {
            Statement stmt = db.createStatement();
            stmt.executeUpdate("delete from parent where name = '" + name + "'");
            System.out.println("Student deleted");
        } catch (Exception e) {
            System.err.println("DATABASE DELETION ERROR: " + e.toString());
        }
    }

    public void deleteTeacher(String name) {
        try {
            Statement stmt = db.createStatement();
            stmt.executeUpdate("delete from teacher where name = '" + name + "'");
            System.out.println("Student deleted");
        } catch (Exception e) {
            System.err.println("DATABASE DELETION ERROR: " + e.toString());
        }
    }

    public ResultSet getAllStudentsResultSet() {
        ResultSet rs = null;
        try {
            Statement stmt = db.createStatement();
            rs = stmt.executeQuery("select * from student");
        } catch (Exception e) {
            System.err.println("DATABASE QUERY ERROR: " + e.toString());
        }
        return rs;
    }

    public ResultSet getAllTeachersResultSet() {
        ResultSet rs = null;
        try {
            Statement stmt = db.createStatement();
            rs = stmt.executeQuery("select * from teacher");
        } catch (Exception e) {
            System.err.println("DATABASE QUERY ERROR: " + e.toString());
        }
        return rs;
    }

    public ResultSet getAllSubjectssResultSet() {
        ResultSet rs = null;
        try {
            Statement stmt = db.createStatement();
            rs = stmt.executeQuery("select * from subject");
        } catch (Exception e) {
            System.err.println("DATABASE QUERY ERROR: " + e.toString());
        }
        return rs;
    }

    public ResultSet getAllParentResultSet() {
        ResultSet rs = null;
        try {
            Statement stmt = db.createStatement();
            rs = stmt.executeQuery("select * from parent");
        } catch (Exception e) {
            System.err.println("DATABASE QUERY ERROR: " + e.toString());
        }
        return rs;
    }

    public void addStudent(int ID, String name, String email, int age, float grade) {
        try {
            Statement stmt = db.createStatement();
            stmt.executeUpdate("insert into student values('" + ID + "', '" + name + "', '" + age + "', '" + email + "','" + grade + "','" + " " + "','" + 1 + "','" + 2 + "')");
            System.out.println("Student added");
        } catch (Exception e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        }
    }

    public void addTeacher(int ID, String name, String email, int phone, String address) {
        try {
            Statement stmt = db.createStatement();
            stmt.executeUpdate("insert into teacher values('" + ID + "', '" + name + "', '" + email + "', '" + phone + "','" + address + "','" + 1 + "','" + 2 + "')");
            System.out.println("Teacher added");
        } catch (Exception e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        }

    }

    public void addParent(int ID, String name, String email, int phone, String address) {
        try {
            Statement stmt = db.createStatement();
            stmt.executeUpdate("insert into parent values('" + ID + "', '" + name + "', '" + email + "', '" + phone + "','" + address + "','" + 1 + "')");
            System.out.println("Parent added");
        } catch (Exception e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        }

    }

    public void addAccount(String name, String password, String AccessToken, int Active) {
        try {
            Statement stmt = db.createStatement();
            stmt.executeUpdate("insert into account values('" + 30 + "', '" + name + "', '" + password + "', '" + AccessToken + "','" + Active + "')");
            System.out.println("Account added");
        } catch (Exception e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        }

    }

}
