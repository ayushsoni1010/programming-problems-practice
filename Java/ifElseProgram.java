package Java;
import java.util.Scanner;

public class ifElseProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int time = input.nextInt();

        if(time>20){
            System.out.printfln("Good Morning");
        }
        else{
            System.out.printfln("Good Evening");
        }
    }
}