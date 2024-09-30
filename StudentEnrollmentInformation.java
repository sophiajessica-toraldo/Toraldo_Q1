import java.util.Scanner;

//Class name 
public class StudentEnrollmentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Input the necessary information for a student
        System.out.println("Student Name:");
        String StudentName = scanner.nextLine();
        
        System.out.println("Course:"); //Not displayed in output
        String Course = scanner.nextLine();
        
        System.out.println("Course Code:"); //Not displayed in output
        String CourseCode = scanner.nextLine();
        
        System.out.println("Number of Units (Maximum number of subjects is 10):");
        int Units = scanner.nextInt();
        
        //Compute the enrollment fee
        final int FeePerUnit = 1000;
        int EnrollmentFee = Units * FeePerUnit;
        
        System.out.println("------------------------------------------------");
        
        //Output
        System.out.println("Student's Name: " + StudentName);
        System.out.println("Total Enrollment Fee: " + EnrollmentFee);
        
        System.out.println("------------------------------------------------");
        
        //Payment
        System.out.println("Enter payment amount:");
        int payment = scanner.nextInt();
        
        if (payment == EnrollmentFee) {
            //If payment is equal to the total fee
            System.out.println("Fully Paid");
        } else if (payment < EnrollmentFee) {
            int RemainingFee = EnrollmentFee - payment;
            //If payment is less than the total fee
            System.out.println("Partial Payment.");
            System.out.println("The amount paid is: " + payment);
            System.out.println("The remaining fee is: " + RemainingFee);
        }
        
        System.out.println("------------------------------------------------");
        
        scanner.close();
    }
}