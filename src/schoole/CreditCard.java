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
public class CreditCard implements Payment {

    private int CCnumber;
    private String CCType;
    private String CVV;
    private String DOE;

    public void CCStrategy(int ccn, String cct, String cvv, String doe) {

    }

    @Override
    public void pay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
