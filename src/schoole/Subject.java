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
public class Subject {

    private int Sub_ID;
    private String Sub_name;
    private String Sub_Content;
    private int Sub_Credit_Hours;
    public ArrayList<Student> EnrolledStudents;
    public ArrayList<Assignment> Assignments;

    public Subject(int Sub_ID, String Sub_name, String Sub_Content, int Sub_Credit_Hours) {
        this.Sub_ID = Sub_ID;
        this.Sub_name = Sub_name;
        this.Sub_Content = Sub_Content;
        this.Sub_Credit_Hours = Sub_Credit_Hours;
        EnrolledStudents = new ArrayList<Student>();
    }

    public void AddAssignment(Assignment A) {
        Assignments.add(A);
    }

    public void EnrollStudnet(Student S) {
        EnrolledStudents.add(S);
    }

    public void UnEnrollStudnet(Student S) {
        for (int i = 0; i < EnrolledStudents.size(); i++) {
            if (EnrolledStudents.get(i).getSt_ID() == S.getSt_ID()) {
                EnrolledStudents.remove(i);
            }
        }
    }

    public int getSub_ID() {
        return Sub_ID;
    }

    public void setSub_ID(int Sub_ID) {
        this.Sub_ID = Sub_ID;
    }

    public String getSub_name() {
        return Sub_name;
    }

    public void setSub_name(String Sub_name) {
        this.Sub_name = Sub_name;
    }

    public String getSub_Content() {
        return Sub_Content;
    }

    public void setSub_Content(String Sub_Content) {
        this.Sub_Content = Sub_Content;
    }

    public int getSub_Credit_Hours() {
        return Sub_Credit_Hours;
    }

    public void setSub_Credit_Hours(int Sub_Credit_Hours) {
        this.Sub_Credit_Hours = Sub_Credit_Hours;
    }

    public void Display_Subject_Info() {
        System.out.println("Subject{" + "Sub_ID=" + Sub_ID + ", Sub_name=" + Sub_name + ", Sub_Content=" + Sub_Content + ", Sub_Credit_Hours=" + Sub_Credit_Hours + '}');
    }

    @Override
    public String toString() {
        return "Subject{" + "Sub_ID=" + Sub_ID + ", Sub_name=" + Sub_name + ", Sub_Content=" + Sub_Content + ", Sub_Credit_Hours=" + Sub_Credit_Hours + ", EnrolledStudents=" + EnrolledStudents + ", Assignments=" + Assignments + '}';
    }

}
