/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akmal_130423;

/**
 *
 * @author LABP1KOMP
 */
public class InterfaceExample {
    public static void main(String[] args){
        Relation myInteger = new MyInteger();
        Relation myDouble = new MyDouble();
        
        System.out.println(" 10 dan 11" +
                myInteger.isEqual(10, 11));
         System.out.println(" 10.4 dan 10.6" +
                myInteger.isEqual(10.4, 10.6));
        
    }
        
}
