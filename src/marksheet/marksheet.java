package marksheet;
import java.util.Scanner;


public class marksheet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables to store data for all students
        int[] studentNumbers = new int[3];
        String[] studentNames = new String[3];
        int[] Sub1Marks = new int[3];
        int[] Sub2Marks = new int[3];
        int[] Sub3Marks = new int[3];
        int[] Sub4Marks = new int[3];
        int[] Sub5Marks = new int[3];
        int[] totals = new int[3];
        double[] averages = new double[3];

        for (int sNo = 0; sNo < 3; sNo++) {
            System.out.println("ENTER STUDENT NUMBER: ");
            studentNumbers[sNo] = scanner.nextInt();
            scanner.nextLine(); 
            System.out.println("ENTER THE STUDENT NAME: ");
            studentNames[sNo] = scanner.nextLine();
            System.out.println("ENTER MARKS FOR SUBJECT 1: ");
            Sub1Marks[sNo] = scanner.nextInt();
            System.out.println("ENTER MARKS FOR SUBJECT 2: ");
            Sub2Marks[sNo] = scanner.nextInt();
            System.out.println("ENTER MARKS FOR SUBJECT 3: ");
            Sub3Marks[sNo] = scanner.nextInt();
            System.out.println("ENTER MARKS FOR SUBJECT 4: ");
            Sub4Marks[sNo] = scanner.nextInt();
            System.out.println("ENTER MARKS FOR SUBJECT 5: ");
            Sub5Marks[sNo] = scanner.nextInt();

            // Calculate total and average for each student
            totals[sNo] = Sub1Marks[sNo] + Sub2Marks[sNo] + Sub3Marks[sNo] + Sub4Marks[sNo] + Sub5Marks[sNo];
            averages[sNo] = totals[sNo] / 5.0;
       
        }
        System.out.println("");
        System.out.println("Welcome to Student Mark List Application");
        System.out.println("__________________________________________________________________________________________");
        System.out.println("SNo  Student Name\t\tSub1\tSub2\tSub3\tSub4\tSub5\tTotal\tAverage");
        System.out.println("__________________________________________________________________________________________");

        for (int sNo = 0; sNo < 3; sNo++) {
        	System.out.println(studentNumbers[sNo] + "    " + studentNames[sNo] + "\t\t\t" + Sub1Marks[sNo] +"\t" +Sub2Marks[sNo]  + "\t" + Sub3Marks[sNo] + "\t" + Sub4Marks[sNo] + "\t" +Sub5Marks[sNo] +"\t" +  totals[sNo] +"\t" +averages[sNo]);
        
        	double sub1average = Sub1Marks[sNo] /3;
    		double sub2average = Sub2Marks[sNo] /3;
    		double sub3average = Sub3Marks[sNo] /3;
    		double sub4average = Sub4Marks[sNo] /3;
    		double sub5average = Sub5Marks[sNo] /3;
    		if(sNo == 2)
    		{
    			System.out.println("__________________________________________________________________________________________");
    			System.out.println("\t\tAverage"+ "\t\t" + (int)sub1average + "\t" + (int)sub2average+ "\t" + (int)sub3average +"\t" + (int)sub4average+"\t"+ (int)sub5average +"\t");
    		}
       


        // Close the scanner
        scanner.close();
    }
}
}
