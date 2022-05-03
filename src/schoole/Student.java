/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoole;

import java.util.ArrayList;

/**
 *
 * @author Goldy
 */
public class Student implements Observer {

    public Account acc;
    public Parent P;
    private String St_name;
    private int St_age;
    private int St_ID;
    private String St_email;
    private double grade;
    public ArrayList<String> Subjects; //=new ArrayList<String>();
    public ArrayList<Double> GradeList;
    private String SubmittedAssignment;
    private ReadOnlyFeedback roi;

    public Student(Account acc, Parent P, String St_name, int St_age, int St_ID, String St_email, double grade, ArrayList<String> Subjects, ArrayList<Double> GradeList, String SubmittedAssignment) {
        this.acc = acc;
        this.P = P;
        this.St_name = St_name;
        this.St_age = St_age;
        this.St_ID = St_ID;
        this.St_email = St_email;
        this.grade = grade;
        this.Subjects = Subjects;
        this.GradeList = GradeList;
        this.SubmittedAssignment = SubmittedAssignment;
    }

    public void View_Subject_List() {

        System.out.println(Subjects);
    }

    public void View_Subject_Content(Subject S) {

        System.out.println(S.getSub_Content());
    }

    public String Ask_Question(String s, Teacher T) {
        return T.Answer_Question(this, s);
    }

    public void Pay_Student_Fees(Payment pay) {

    }

    public String getSt_name() {
        return St_name;
    }

    public void setSt_name(String St_name) {
        this.St_name = St_name;
    }

    public int getSt_age() {
        return St_age;
    }

    public void setSt_age(int St_age) {
        this.St_age = St_age;
    }

    public int getSt_ID() {
        return St_ID;
    }

    public void setSt_ID(int St_ID) {
        this.St_ID = St_ID;
    }

    public String getSt_email() {
        return St_email;
    }

    public void setSt_email(String St_email) {
        this.St_email = St_email;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public ArrayList<String> getSubjects() {
        return Subjects;
    }

    public void setSubjects(ArrayList<String> Subjects) {
        this.Subjects = Subjects;
    }

    public ArrayList<Double> getGradeList() {
        return GradeList;
    }

    public void setGradeList(ArrayList<Double> GradeList) {
        this.GradeList = GradeList;
    }

    public String getSubmittedAssignment() {
        return SubmittedAssignment;
    }

    public void setSubmittedAssignment(String SubmittedAssignment) {
        this.SubmittedAssignment = SubmittedAssignment;
    }

    public void getfeedback() {
        roi.getfeedback();
    }

    public void getgrade() {
        roi.getgrade();
    }

    @Override
    public String toString() {
        return "Student{" + "acc=" + acc + ", P=" + P + ", St_name=" + St_name + ", St_age=" + St_age + ", St_ID=" + St_ID + ", St_email=" + St_email + ", grade=" + grade + ", Subjects=" + Subjects + ", GradeList=" + GradeList + ", SubmittedAssignment=" + SubmittedAssignment + ", roi=" + roi + '}';
    }

    @Override
    public void update(Double grade, String feedback) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
