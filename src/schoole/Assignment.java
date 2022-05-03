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
public class Assignment {

    private int DeadlineWindow;
    private String Status;
    private ArrayList<String> StudentSubmissions;
    private ArrayList<Student> StudentsSubmitted;

    public Assignment(int DeadlineWindow, String Status) {
        this.DeadlineWindow = DeadlineWindow;
        this.Status = Status;

    }

    public void AddStudentSubmissions(String S, Student St) {
        StudentSubmissions.add(St.getSubmittedAssignment());
        StudentsSubmitted.add(St);
    }

    public int getDeadlineWindow() {
        return DeadlineWindow;
    }

    public void setDeadlineWindow(int DeadlineWindow) {
        this.DeadlineWindow = DeadlineWindow;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ArrayList<String> getStudentSubmissions() {
        return StudentSubmissions;
    }

    public ArrayList<Student> getStudentsSubmitted() {
        return StudentsSubmitted;
    }

}
