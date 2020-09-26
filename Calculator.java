//A program that gets your grade for CSE 110 because 
//the Professor can't be fucked to do anything.

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		double NUM_A		=0;
		double AGrade		=0;
		double NUM_L 		=0;
		double L			=0;
		double NUM_Q		=0;
		double Q			=0; 
		double NUM_E		=0;
		double Final 		=0;
		double Percent 		=0;
		int i 				=0;
		while (i < 8) 
        {
            if (i == 0) 
            {
            	System.out.print("Input the Number of Assignments you have completed");
        		NUM_A = keyboard.nextDouble();
                //checking if the entered value is in the domain or not
                if (NUM_A >= 0 && NUM_A <= 8) 
                {
                    //increment loop variable
                    i++;
                } 
                else 
                {
                    //prompt to enter a valid grade
                    System.out.println("[ERR] Invalid input. There are 8 Assignments in this course");
                }
            }
            if (i == 1) 
            {
            	System.out.print("Input the total score you have for Assignments");
        		AGrade = keyboard.nextDouble();
                //checking if the entered value is in the domain or not
                if (AGrade >= 0 && AGrade <= 800) 
                {
                    //increment loop variable
                    i++;
                } 
                else 
                {
                    //prompt to enter a valid grade
                    System.out.println("[ERR] Invalid input. Assignment points should be between [0 and 800]");
                }
            }
            if (i == 2) 
            {
            	System.out.print("Input the Number of Labs you have completed");
        		NUM_L = keyboard.nextDouble();
                //checking if the entered value is in the domain or not
                if (NUM_L >= 0 && NUM_L <= 8) 
                {
                    //increment loop variable
                    i++;
                } 
                else 
                {
                    //prompt to enter a valid grade
                    System.out.println("[ERR] Invalid input. There are 8 Labs in this course");
                }
            }
            if (i == 3) 
            {
            	System.out.print("Input the total score you have for Labs");
        		L = keyboard.nextDouble();
                //checking if the entered value is in the domain or not
                if (L >= 0 && L <= 160) 
                {
                    //increment loop variable
                    i++;
                } 
                else 
                {
                    //prompt to enter a valid grade
                    System.out.println("[ERR] Invalid input. Lab points should be between [0 and 160]");
                }
            }
            if (i == 4) 
            {
            	System.out.print("Input the Number of Quizzes you have completed (Do not include Academic Integrity Quiz)");
            	NUM_Q = keyboard.nextDouble();
                //checking if the entered value is in the domain or not
                if (NUM_Q >= 0 && NUM_Q <= 11) 
                {
                    //increment loop variable
                    i++;
                } 
                else 
                {
                    //prompt to enter a valid grade
                    System.out.println("[ERR] Invalid input. There are 11 Quizzes in this course");
                }
            }
            if (i == 5) 
            {
            	System.out.print("Input the total score for Quizzes");
        		Q = keyboard.nextDouble();
                //checking if the entered value is in the domain or not
                if (Q >= 0 && Q <= 110) 
                {
                    //increment loop variable
                    i++;
                } 
                else 
                {
                    //prompt to enter a valid grade
                    System.out.println("[ERR] Invalid input. Quiz points should be between [0 and 110]");
                }
            }
            if (i == 6) 
            {
            	System.out.print("Input the number of tests taken (Midterm and Final Exam)");
        		NUM_E = keyboard.nextDouble();
                //checking if the entered value is in the domain or not
                if (NUM_E >= 0 && NUM_E <= 2) 
                {
                    //increment loop variable
                    i++;
                } 
                else 
                {
                    //prompt to enter a valid grade
                    System.out.println("[ERR] Invalid input. Only two exams are available in the course");
                }
            }
            if (i == 7) 
            {
            	System.out.print("Input your total Exam Grades");
        		Final = keyboard.nextDouble();
                //checking if the entered value is in the domain or not
                if (Final >= 0 && Final <= 200) 
                {
                    //increment loop variable
                    i++;
                } 
                else 
                {
                    //prompt to enter a valid grade
                    System.out.println("[ERR] Invalid input. Exam score should be between [0 and 200]");
                }
            }
        }
		//calculating your percentage total
		double FinalPercent;
		double APercent;
		double QPercent;
		double LPercent;
				FinalPercent = (Final)/(NUM_E *100) *35; 
				System.out.println("[INFO] Student's Exam Percentage is " +FinalPercent + " out of 35");
				APercent = (AGrade)/(NUM_A * 100)*25; 
				System.out.println("[INFO] Student's Assignment Percentage is " +APercent + " out of 25");
				QPercent = (Q) /(NUM_Q *10)*15; 
				System.out.println("[INFO] Student's Quiz Percentage is " +QPercent + " out of 15");
				LPercent = (L)/(NUM_L *20)*30;
				System.out.println("[INFO] Student's Lab Percentage is " +LPercent + " out of 30");
				Percent = FinalPercent + APercent + QPercent + LPercent;
				
        //printing weighted total
        System.out.println("[INFO] Student's Percentage is " + Percent);
        //checking weighted total is greater than or equals to 50
        if (Percent >= 98)
            System.out.println("[INFO] Student receieved an A+ in the class");
        if (Percent >= 90 && Percent < 98)
            System.out.println("[INFO] Student receieved an A in the class");
        if (Percent >= 88 && Percent < 90)
            System.out.println("[INFO] Student receieved a B+ in the class");
        if (Percent >= 80 && Percent < 88)
            System.out.println("[INFO] Student receieved a B in the class");
        if (Percent >= 78 && Percent < 80)
            System.out.println("[INFO] Student receieved a C+ in the class");
        if (Percent >= 70 && Percent < 78)
            System.out.println("[INFO] Student receieved a C in the class");
        if (Percent >= 60 && Percent < 70)
            System.out.println("[INFO] Student receieved a D in the class");
        if (Percent < 60)
            System.out.println("[INFO] Student failed the class");
        
        keyboard.close();
		}
}
