import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //marks out of 100
        // sum of subjects
        //avg %
        //grade
        //display total marks,avg%,grade
        Scanner in =new Scanner(System.in);
        int number_sub=0;
        System.out.println("Enter the number of subjects");
        number_sub=in.nextInt();
        int[] marks=new int[number_sub];
        int sum=0;
        for(int i=0;i<number_sub;i++)
        {
            int j=i+1;
            System.out.println("Enter the marks of "+j+" Subject");
            marks[i]=in.nextInt();
            sum+=marks[i];
        }
        char grade;
        int avg=sum/number_sub; // as max marks is 100 so avg marks = avg percentage
        if(avg>90)
        {
            grade='A';
        }
        else if(avg>80 )
        {
            grade='B';
        }
        else if(avg>70 )
        {
            grade='C';
        }
        else if(avg>60 )
        {
            grade='D';
        }
        else if(avg>50 )
        {
            grade='E';
        }
        else
        {
            grade='F';
        }
        System.out.println("Total marks of the student ="+sum);
        System.out.println("Average % of the student ="+avg+"%");
        System.out.println("Grade obtained by the student ="+grade);
    }
}
