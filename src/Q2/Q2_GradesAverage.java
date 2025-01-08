/*Write a program called GradesAverage, which prompts user for the number of students, reads it
from the keyboard, and saves it in an int variable called numStudents. It then prompts user for the
grades of each of the students and saves them in an int array called grades. Your program shall
check that the grade is between 0 and 100. A sample session is as follow:
Enter the number of students: 3
Enter the grade for student 1: 55
Enter the grade for student 2: 108
Invalid grade, try again...
Enter the grade for student 2: 56
Enter the grade for student 3: 57
The average is: 56.0*/
package Q2;

import java.util.Scanner;

public class Q2_GradesAverage {
    int numStudents, i=0;
    int[] grades;

    public void checkGrade(int numStudents){
        Scanner input=new Scanner(System.in);
        this.numStudents=numStudents;
        this.grades = new int[numStudents];
        while(i<numStudents){
        System.out.println("Enter the grade for student "+i +":");
        int gradeValue = input.nextInt();
        if(gradeValue>=1 &&  gradeValue<=100) {
            grades[i] = gradeValue;
            i++;
            }else{
            System.out.println("Invalid grade, try again...");
            }
        }
    }

    public void getAverage(){
        int sum=0,length;
        long average;
        length=grades.length;
        for(int i=0;i<length;i++){
            sum=sum+grades[i];
        }
        average=sum/length;
        System.out.println("The average is "+average);
    }

    public static void main(String[] args) {
        int studentCount;
        Scanner in=new Scanner(System.in);
        Q2_GradesAverage grade=new Q2_GradesAverage();
        System.out.print("Enter the number of students: ");
        studentCount=in.nextInt();
        grade.checkGrade(studentCount);
        grade.getAverage();
    }
}
