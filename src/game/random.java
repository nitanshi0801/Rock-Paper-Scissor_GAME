package game;

import java.util.Scanner;
import java.util.Random;

public class random {

    public static void main(String[] args) {


        int rock=0;
        int paper=1;
        int scissors=2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Choice");
        int userinput = sc.nextInt();

        Random rnd = new Random();
        int computerinput = rnd.nextInt(3);

        if (computerinput==userinput)
        {
            System.out.println("Draw !..or no one will win or lose");
        }
        else if(computerinput==0 && userinput==1 || computerinput==1 && userinput==2 || computerinput==2 && userinput==0)
        {
            System.out.println("HUMAN..WINS !!...");
        }
        else
        {
            System.out.println("COMPUTER..WINS!!...");
        }
        System.out.println("computer choice is " + computerinput);

        if(computerinput==0){
            System.out.println("Computer choice is Rock");
        }
        else if(computerinput==1)
        {
            System.out.println("Computer choice is Paper");
        }
        else{
            System.out.println("Computer choice is Scissors");
        }
    }

}
