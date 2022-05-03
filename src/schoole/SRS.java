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
public class SRS implements ObserverSubject {

    private ArrayList<Observer> Observers = new ArrayList<>();
    private Double grade;
    private String feedback;

    public SRS() {

    }

    public void AddSubmissionLink(Assignment A) {

    }

    public void SetGrade(Student S, Double grade, String Sub) {
        this.grade = grade;
        this.NotifyParents();
        System.out.println(grade);
    }

    public void AddSubjectContent(Subject S, String content) {
        S.setSub_Content(content);
    }

    public void AddFeedback(Student s, String feedback) {
        this.feedback = feedback;
        this.NotifyParents();
    }

    public String GetFeedback() {
        return this.feedback;
    }

    public void GetStudentGrade(Student S, String Sub) {
        for (int i = 0; i < S.Subjects.size(); i++) {
            if (S.Subjects.get(i) == Sub) {
                System.out.println(S.GradeList.get(i));
            }
        }
    }

    @Override
    public void NotifyParents() {
        for (int i = 0; i < Observers.size(); i++) {
            Observers.get(i).update(grade, feedback);
        }
    }

    @Override
    public void AddObserver(Observer o) {
        Observers.add(o);
    }

    @Override
    public void RemoveObserver(Observer o) {
        int observerindex = Observers.indexOf(o);
        Observers.remove(observerindex);
    }

    @Override
    public String toString() {
        return "SRS{" + "Observers=" + Observers + ", grade=" + grade + ", feedback=" + feedback + '}';
    }

}
