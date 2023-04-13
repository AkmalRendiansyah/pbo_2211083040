/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package akmal_120423;

/**
 *
 * @author akmal
 */
public class Student extends Person {
    public Student(){
     super("budi","padang");
    System.out.println("Inside Student:Constructor");
 } 
 @Override
    public String getName(){
    System.out.println("get name Student"); 
    return name;
        }        
    public static void main(String[] args){
        Student student = new Student();
        student.name = "ali";
        student.address="taluak";
        
    }
}

