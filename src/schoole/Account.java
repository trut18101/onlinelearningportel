/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoole;

/**
 *
 * 
 */
public class Account {

    private AccountManager AM;
    private String Username;
    private String Password;
    private String AccessToken;
    private Boolean Active;

    public Account(String Username, String Password, String AccessToken, Boolean Active) {
        this.Username = Username;
        this.Password = Password;
        this.AccessToken = AccessToken;
        this.Active = Active;
    }

    public AccountManager getAM() {
        return AM;
    }

    public void setAM(AccountManager AM) {
        this.AM = AM;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getAccessToken() {
        return AccessToken;
    }

    public void setAccessToken(String AccessToken) {
        this.AccessToken = AccessToken;
    }

    public Boolean getActive() {
        return Active;
    }

    public void setActive(Boolean Active) {
        this.Active = Active;
    }

    @Override
    public String toString() {
        return "Account{" + "AM=" + AM + ", Username=" + Username + ", Password=" + Password + ", AccessToken=" + AccessToken + ", Active=" + Active + '}';
    }

}
