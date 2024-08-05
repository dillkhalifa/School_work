 import java.util.Scanner;
public class CGPA{
    public static void main(String[] args) {

        System.out.println("A = 5\n B = 4\n C = 3\n D = 2\n E = 1\n F = 0");
        int i;
        double unitsum  = 0;
        double GPsum = 0;
        double Newunitsum  = 0;
        double NewGPsum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println( " how many courses did you offer?");
        int courses = scanner.nextInt();
        scanner.nextLine();
        int[] unit = new int[courses];
        int[] point = new int [courses];
        int[] GP= new int[courses]; 
        int[] Newunit = new int[courses];
        int[] Newpoint = new int [courses];
        int[] NewGP= new int[courses]; 
         
        
        for(i = 0; i<courses;i++){
            System.out.println( " input course unit");
            unit[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.println( " input course points");
            point[i] = scanner.nextInt();
            scanner.nextLine();
            GP[i]= unit[i]*point[i];
            unitsum += unit[i];
             GPsum += GP[i];

        }
        System.out.println("TCR:"+ unitsum);
        System.out.println("TGP:"+ GPsum);
        double GPA = (GPsum / unitsum);
        System.out.println("GPA for the semester is :" + GPA);
        
        System.out.println(" Do you want to calculate your CGPA?\n yes/no");
        String Answer = scanner.nextLine();

        if(Answer.equals("yes")){
            System.out.println("how many courses?");
            courses =scanner.nextInt();
        
            System.out.println("enter values of next semester");

            for(i = 0; i<courses;i++){
                System.out.println( " input course unit");
                Newunit[i] = scanner.nextInt();
                scanner.nextLine();
                System.out.println( " input course points");
                Newpoint[i] = scanner.nextInt();
                scanner.nextLine();
                NewGP[i]= Newunit[i]*Newpoint[i];
                Newunitsum += Newunit[i];
                NewGPsum += NewGP[i];
                
            }
        System.out.println("TCR:"+ Newunitsum);
        System.out.println("TGP:"+ NewGPsum);
        System.out.printf("GPA:%f\n", NewGPsum/Newunitsum);
        double NewGPA = ((GPsum + NewGPsum) /(unitsum + Newunitsum));
        System.out.println("CGPA for the semester is :" + NewGPA);
       
        }

    }
    
}
