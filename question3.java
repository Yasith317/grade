import java.util.Scanner;

public class question3 {
    public static void main(String[] args){

        Scanner myScan = new Scanner(System.in);

        System.out.println("Enter marks : ");
        double mark = myScan.nextDouble();

        if (mark>=0 && mark<25){
            System.out.println("Your Grade is F");
        } else if (mark>=25 && mark<45){
            System.out.println("Your Grade is E");
        } else if (mark>=45 && mark<50){
            System.out.println("Your Grade is D");
        } else if (mark>=50 && mark<60){
            System.out.println("Your Grade is C");
        } else if (mark>=60 && mark<80){
            System.out.println("Your Grade is B");
        } else if (mark>=80 && mark<=100) {
            System.out.println("Your Grade is A");
        }
    }
}
