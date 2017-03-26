/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package letures;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 *
 * @author mzoon
 */
public class EmailSender extends Authenticator  {
   
       String user;
     String pw;
     public EmailSender (String username, String password)
     {
        super();
        this.user = username;
        this.pw = password;
     }
    public PasswordAuthentication getPasswordAuthentication()
    {
       return new PasswordAuthentication(user, pw);
    }
    
    }
