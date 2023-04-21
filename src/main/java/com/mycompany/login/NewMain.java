/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.login;
import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author skywo
 */
public class NewMain {

    public static ArrayList<Usuario> usuarios;
    public static ArrayList<CreaciondeEquipo> equipo;
   
    
    //
    //Toto
    
    //
    
    public static void main(String[] args) {
        usuarios = new  ArrayList<>();
        equipo = new ArrayList<>();
       login log = new login();
       log.setVisible(true);
    }
}
