import java.util.*;
import java.math.*;
public class Eval {

	
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String [] args){
		
		char operation = regularSing();
		int n1 = (int)(Math.random()*19+1);
		int n2 = (int)(Math.random()*19+1);
		
		while(operation!= '!'){
			play(n1 , n2 , operation);
		
			 n1 = (int)(Math.random()*19+1);
			 n2 = (int)(Math.random()*19+1);
			 operation = regularSing();
		}
	}
	
	
	
	public static char regularSing(){
		System.out.println("Enter the operation");
		char ch = in.next().charAt(0);
		while(ch!='+' && ch!='*' && ch!='/' && ch!='-' && ch!='%' && ch!= '!'){
			System.out.println("You stupid! this aint operation");
			ch = in.next().charAt(0);
		}
		
		return ch;
	}
	
	
	public static void printTargil(int x , int y , char c){
		System.out.println(x + " " + c + " "+ y + " = ? ");
	}
	
	public static int solveTargil(int x , int y , char c){
		switch(c){
			case '+' : return x + y; 
			case '-' : return x - y;
			case '/' : return x / y;
			case '*' : return x * y;
			case '%' : return x % y;
			
		}
		return -1;
			
	}
	
	public static void play(int n1 , int n2 , char operation){
		
		
		
		printTargil(n1,n2,operation);
		int answer = solveTargil(n1,n2,operation);
		
		for(int i = 3; i > 0 ; i--){
			System.out.println("Enter your answer : ");
			int userAnswer = in.nextInt();
			if(userAnswer == answer){
				System.out.println("You Are Correct!!");
				System.out.println("You finished in " + (4-i) + " tries. Good Job!");
				return;
			}else{
				System.out.println("Your are Wrong , you have " + (i-1) + " tries left");
			}
		}
	}
}
