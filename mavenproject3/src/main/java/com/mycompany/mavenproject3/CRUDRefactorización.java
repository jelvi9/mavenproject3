/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject3;

import java.util.Date;


/**
 *
 * @author jelvi
 */
public class CRUDRefactorización {

    public static void main(String[] args) {
     
        
        User firstUser = new User ();
        Date birthday = new Date(12/12/12);
        firstUser.setId("00 A00");
        firstUser.setName("Luis Ricardo");
        firstUser.setBirthady("12/12/12");
        System.out.println(firstUser.toString());
        
    }
}
