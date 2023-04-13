/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package akmal_120423;

import akmal_050423.StudentRecord;

/**
 *
 * @author PC5
 */
public class StudentRecordExam extends StudentRecord {
    public StudentRecordExam(){
    super.name = "akmal";
    super.address = "andaleh";
    super.age = 19;
    
    super.mathGrade = 89;
    super.englishGrade = 90;
    super.scienceGrade = 78;
    super.average = (mathGrade+scienceGrade)/2;
}
}