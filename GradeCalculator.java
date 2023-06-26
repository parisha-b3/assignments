import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr test scores:");
        int score = sc.nextInt();
        char grade;
        if(score>=90 && score<=100){
        grade = 'A';
        System.out.println("Grade" + grade);
        }
        else if(score>=80 && score<=89){
            grade = 'B';
        System.out.println("Grade" + grade);
        }
        else if(score>=70 && score<=79){
             grade = 'C';
        System.out.println("Grade" + grade);
        }
        else if(score>=60 && score<=69){
             grade = 'D';
        System.out.println("Grade" + grade); 
        } 
        else if(score>=50 && score<=59){
             grade = 'E';
        System.out.println("Grade" + grade);
        }
        else if(score<50){
             grade = 'F';
        System.out.println("Grade" + grade); 
        }
        else{
            System.out.println("invalid scores");
        }
        


    }
    
}
