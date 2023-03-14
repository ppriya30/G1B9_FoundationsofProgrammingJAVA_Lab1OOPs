package com.lab1.oops.foundation.view;

import com.lab1.oops.foundation.Employee;
import com.lab1.oops.foundation.InterfaceShowDetail;

import java.util.Random;

public class ImpleShowDetail implements InterfaceShowDetail {
    @Override
    public String genpasword() {
        String pas ="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz*&^%$#@!><.?(){}~=";
        String mypasword = "";
        Random random = new Random();
        for(int i=0;i<8;i++){
            mypasword=mypasword+String.valueOf(pas.charAt(random.nextInt(pas.length())));
        }
        return mypasword;
    }

    @Override
    public String genemail(String firstname,String lastname,String dep) {
        return firstname+lastname+"@"+dep+".gl.com";
    }

    @Override
    public void personaldetail(Employee employee) {
        System.out.println("Employee first name is : "+employee.getFirstname());
        System.out.println("Employee last name is : "+employee.getLastname());
        System.out.println("Employee Email Id name is : "+employee.getEmail());
        System.out.println("Employee Password is : "+employee.getPasword());
    }
}
