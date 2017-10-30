/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Noah
 */
import javax.swing.*;
import java.text.*;

public class Main {

    public static void main(String[] args) {
    
    JOptionPane.showMessageDialog(null,"In this program, you will be prompted for: your grade, your time,"
    + " and then you will be given your speed rating.");
    
    Object[] gradeOption = {"Freshman", "Sophomore", "Junior", "Senior"};
    int gradeMenu = JOptionPane.showOptionDialog(null,"Please choose your grade.","Grade",JOptionPane.YES_NO_OPTION,
    JOptionPane.QUESTION_MESSAGE,null,gradeOption,gradeOption[3]);
    
    int userTime = Integer.parseInt(JOptionPane.showInputDialog("Please enter your time in second." +
    " If you need a time converter, check my 'Converter' page of my website."));
    
    int courseCorrection = 0; //Initializes the course correction factor variable
    
    switch (gradeMenu) {
    
    case 0: //Freshman
    
    int firstPlaceFR = //FIRSTPLACEPERSON(INPUT AFTER RACE)
    int secondPlaceFR = //SECONDPLACEPERSON(INPUT AFTER RACE)
    int thirdPlaceFR = //THIRDPLACEPERSON(INPUT AFTER RACE)
    
    double averageTimeFR = (firstPlace + secondPlace + thirdPlace)/3;
    
    int standardTimeFR = //FIGURE OUT AVERAGE FOR JIM SMITH RACES BY AGE AND THEN ADD IF STATEMENT
    
    courseCorrection = standardTimeFR-averageTimeFR;
    
    case 1: //Sophomore
    
    int firstPlaceSR = //FIRSTPLACEPERSON(INPUT AFTER RACE)
    int secondPlaceSR = //SECONDPLACEPERSON(INPUT AFTER RACE)
    int thirdPlaceSR = //THIRDPLACEPERSON(INPUT AFTER RACE)
    
    double averageTimeSR = (firstPlace + secondPlace + thirdPlace)/3;
    
    int standardTimeSR = //FIGURE OUT AVERAGE FOR JIM SMITH RACES BY AGE AND THEN ADD IF STATEMENT
    
    courseCorrection = standardTimeFR-averageTimeSR;
    
    case 2: //Junior
    
    int firstPlaceJR = //FIRSTPLACEPERSON(INPUT AFTER RACE)
    int secondPlaceJR = //SECONDPLACEPERSON(INPUT AFTER RACE)
    int thirdPlaceJR = //THIRDPLACEPERSON(INPUT AFTER RACE)
    
    double averageTimeJR = (firstPlace + secondPlace + thirdPlace)/3;
    
    int standardTimeJR = //FIGURE OUT AVERAGE FOR JIM SMITH RACES BY AGE AND THEN ADD IF STATEMENT
    
    courseCorrection = standardTimeJR-averageTimeJR;
    
    case 3: //Senior
    
    int firstPlaceSNR = //FIRSTPLACEPERSON(INPUT AFTER RACE)
    int secondPlaceSNR = //SECONDPLACEPERSON(INPUT AFTER RACE)
    int thirdPlaceSNR = //THIRDPLACEPERSON(INPUT AFTER RACE)
    
    double averageTimeSNR = (firstPlace + secondPlace + thirdPlace)/3;
    
    int standardTimeSNR = //FIGURE OUT AVERAGE FOR JIM SMITH RACES BY AGE AND THEN ADD IF STATEMENT
    
    courseCorrection = standardTimeSNR-averageTimeSNR;
    
    }
    
    
    
    
    
    
