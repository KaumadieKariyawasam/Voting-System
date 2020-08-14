/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.votingsystem.validation;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Validation {
    public boolean nicValidation(String nic){
        if(nic.matches("[0-9]{9}[vV]")){
           return true;
        }else{
            return false;
        }
    }
    public boolean teleValidation(String tp){
        if(tp.matches("[0-9]{3}[-][0-9]{7}")){
            return true;
        }else{
            return false;
        }
    }
    public boolean emailValidation(String mail){
        if(mail.matches("[a-z]+[@][g][m][a][i][l][.][c][o][m]")){
            return true;
        }else{
            return false;
        }
    }
   
   
}
