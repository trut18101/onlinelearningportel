/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoole;

/**
 *
 * @author Goldy
 */
public class Teacher {

    private Subject S;
    private Account Acc;
    private String T_name;
    private String T_address;
    private int T_ID;
    private int T_phone;
    private String T_email;
    private String SubjectName;

    public Teacher(Subject S, Account Acc, String T_name, String T_address, int T_ID, int T_phone, String T_email, String SubjectName) {
        this.S = S;
        this.Acc = Acc;
        this.T_name = T_name;
        this.T_address = T_address;
        this.T_ID = T_ID;
        this.T_phone = T_phone;
        this.T_email = T_email;
        this.SubjectName = SubjectName;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String SubjectName) {
        this.SubjectName = SubjectName;
    }

    public String Answer_Question(Student obj, String st) {
        String x = "";
        return x;
    }

    public Subject getS() {
        return S;
    }

    public void setS(Subject S) {
        this.S = S;
    }

    public Account getAcc() {
        return Acc;
    }

    public void setAcc(Account Acc) {
        this.Acc = Acc;
    }

    public String getT_name() {
        return T_name;
    }

    public void setT_name(String T_name) {
        this.T_name = T_name;
    }

    public String getT_address() {
        return T_address;
    }

    public void setT_address(String T_address) {
        this.T_address = T_address;
    }

    public int getT_ID() {
        return T_ID;
    }

    public void setT_ID(int T_ID) {
        this.T_ID = T_ID;
    }

    public int getT_phone() {
        return T_phone;
    }

    public void setT_phone(int T_phone) {
        this.T_phone = T_phone;
    }

    public String getT_email() {
        return T_email;
    }

    public void setT_email(String T_email) {
        this.T_email = T_email;
    }

    @Override
    public String toString() {
        return "Teacher{" + "S=" + S + ", Acc=" + Acc + ", T_name=" + T_name + ", T_address=" + T_address + ", T_ID=" + T_ID + ", T_phone=" + T_phone + ", T_email=" + T_email + ", SubjectName=" + SubjectName + '}';
    }

}
