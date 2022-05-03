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
public class Parent implements Observer {
    
    private Account PA;
    private String P_name;
    private String P_address;
    private int P_ID;
    private int P_phone;
    private String P_email;
    private float Payment ;
    private String feedback;
    private Double grade;
    private static int observerIdTracker=0;
    private int ObserverId;
    private ObserverSubject GradeFeedback;
    private ReadOnlyFeedback roi;

    public Parent(Account PA, String P_name, String P_address, int P_ID, int P_phone, String P_email, float Payment,ObserverSubject os) {
        this.PA = PA;
        this.P_name = P_name;
        this.P_address = P_address;
        this.P_ID = P_ID;
        this.P_phone = P_phone;
        this.P_email = P_email;
        this.Payment = Payment;
        this.GradeFeedback=os;
    }
    
    
    
    
    
    public void Set_Payment()
    {
        
    }

    
    
    
    public Account getPA() {
        return PA;
    }

    public void setPA(Account PA) {
        this.PA = PA;
    }

    public String getP_name() {
        return P_name;
    }

    public void setP_name(String P_name) {
        this.P_name = P_name;
    }

    public String getP_address() {
        return P_address;
    }

    public void setP_address(String P_address) {
        this.P_address = P_address;
    }

    public int getP_ID() {
        return P_ID;
    }

    public void setP_ID(int P_ID) {
        this.P_ID = P_ID;
    }

    public int getP_phone() {
        return P_phone;
    }

    public void setP_phone(int P_phone) {
        this.P_phone = P_phone;
    }

    public String getP_email() {
        return P_email;
    }

    public void setP_email(String P_email) {
        this.P_email = P_email;
    }

    public float getPayment() {
        return Payment;
    }

    public void setPayment(float Payment) {
        this.Payment = Payment;
    }

    
     public void getfeedback()
    {
        roi.getfeedback();
    }
    public void getgrade()
    {
        roi.getgrade();
    }

    @Override
    public String toString() {
        return "Parent{" + "PA=" + PA + ", P_name=" + P_name + ", P_address=" + P_address + ", P_ID=" + P_ID + ", P_phone=" + P_phone + ", P_email=" + P_email + ", Payment=" + Payment + ", feedback=" + feedback + ", grade=" + grade + ", ObserverId=" + ObserverId + ", GradeFeedback=" + GradeFeedback + ", roi=" + roi + '}';
    }
    
    @Override
    public void update(Double grade, String feedback) {
        
        this.grade = grade; 
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
