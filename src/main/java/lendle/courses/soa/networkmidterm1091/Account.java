/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.soa.networkmidterm1091;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lendle
 */
public class Account {
    private String realName=null;
    private String userName=null;
    private String password=null;
    private String birthdate=null;
    private boolean subscribe=false;

    public Account(String realName, String userName, 
            String password, String birthdate, boolean subscribe) {
        this.realName=realName;
        this.userName=userName;
        this.password=password;
        this.birthdate=birthdate;
        this.subscribe=subscribe;
    }
    
    

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public boolean isSubscribe() {
        return subscribe;
    }

    public void setSubscribe(boolean subscribe) {
        this.subscribe = subscribe;
    }
    
    private static Map<String, Account> accounts=new HashMap<>();
    static{
        accounts.put("lendle", new Account("C.H", "lendle", "12345", "2000-10-10", false));
        accounts.put("amy", new Account("amy", "amy", "12345", "1995-10-10", false));
    }
    public static Account getAccount(String userName){
        return accounts.get(userName);
    }
}
