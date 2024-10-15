import java.util.*;
import java.util.Random;
public class Guessing_number {

	public static void main(String[] args) {
		System.out.println("Welcome to Guessing Game \n Guess the Number Between 0 to 10 \n Guess a Number:");
		Scanner sc= new Scanner(System.in);
		int input=sc.nextInt();
		int target=(int)(Math.random() * 11);
//		System.out.println(target);
		int c=1;
		if(input!=target) {
			System.out.println("Nope! :)");
			while(input!=target) {
				input=sc.nextInt();
				c++;
				if(input==target) {
					System.out.println("Congrats You Won");
					System.out.println("Number of Attempts:"+c);
				}
				if(input<target) {
					System.out.println("Hint: Little High");
				}
				if(input>target) {
					System.out.println("Hint: Little Low");
				}
				}
		}
		else {
			System.out.println("Congrats");	
		}
		sc.close();	
	}	
	}


