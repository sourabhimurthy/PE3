package com.stackroute.PE3;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num of students");
        int numOfStudents = sc.nextInt();

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter the number of grades of student");
            int grades = sc.nextInt();
            int[] stuGrade = new int[grades];
            for (int j = 0; j < grades; j++) {
                stuGrade[j] = sc.nextInt();
            }
            boolean result = checkGrades(stuGrade);
            if(result==true)
            {
                System.out.println("Valid grades");
            }
            else{
                System.out.println("Not valid grades");
            }

        }
    }

    public static boolean checkGrades(int[] grade) {
        for (int i = 0; i < grade.length; i++) {

                if (grade[i] < 0 || grade[i] > 100) {
                    return false;
                }
            }


        return true;

    }
}
