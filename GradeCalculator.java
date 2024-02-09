package CodewayInternship.GradeCalculator;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input: Take marks obtained in each subject
        System.out.println("Enter number of Subjects : ");
        int Subjects=s.nextInt();
        
        System.out.println("Enter marks obtained in each subject (out of 100):");
        int numSubjects = 0;
        int totalMarks = 0;

//        while (Subjects>0) {
//            System.out.print("Subject " + (numSubjects + 1) + ": ");
//            int marks = s.nextInt();
//
//            // Break the loop when the user enters a negative value
//            if (marks < 0 && marks > 100) {
//                break;
//            }
//            else if(numSubjects>Subjects)
//            {
//            	break;
//            }
//
//            totalMarks += marks;
//            numSubjects++;
//        }
     
        if(Subjects > 0 )
        {
        	for(int i = 0; i < Subjects; i++)
        	{
        	System.out.println("Subject" + (numSubjects + 1) + " : ");
        	int marks=s.nextInt();
        	
        	totalMarks += marks;
        	numSubjects++;
        	}
        }
      
        // Calculate Total Marks
        double averagePercentage = (double) totalMarks / numSubjects;

        // Grade Calculation
        String grade = calculateGrade(averagePercentage);

        // Display Results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

    }

    // Function to calculate grade based on average percentage
    private static String calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A";
        } else if (averagePercentage >= 80) {
            return "B";
        } else if (averagePercentage >= 70) {
            return "C";
        } else if (averagePercentage >= 60) {
            return "D";
        } else if(averagePercentage >= 50) {
        	return "E";
        }
          else {
            return "F";
        }
    }
}
