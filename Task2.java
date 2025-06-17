import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int number_sub=0;
        System.out.println("Enter the number of subjects:");
        number_sub=in.nextInt();
        int[] marks=new int[number_sub];
        float sum=0;
        for(int i=0;i<number_sub;i++)
        {
            int j=i+1;
            System.out.println("Enter marks obtained in subject "+j+":");
            marks[i]=in.nextInt();
            sum+=marks[i];
        }
        char grade;
        float avg=sum/number_sub; // as max marks is 100 so avg marks = avg percentage
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
        System.out.println("Total Marks: "+sum);
        System.out.println("Average Percentage: "+avg+"%");
        System.out.println("Grade: "+grade);
    }
}
