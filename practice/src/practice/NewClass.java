/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author l3ioty
 */
public class NewClass {
    public static void main(String[] args) {
        int a,b;
        Scanner S = new Scanner(System.in);
        System.out.print("input a : ");
        a = S.nextInt();
        System.out.print("input b : ");
        b = S.nextInt();
    }
    
    public static int test(int num1,int num2){
        return num1 - num2;
    }
}
