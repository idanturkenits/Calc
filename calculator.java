
import java.text.DecimalFormat;
import java.util.*;

import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.math.*;
public class Calc {

	
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String [] args)throws ScriptException{
		
		char operation = regularSing();
	
		System.out.println();
		
	}
	
	
	public static char regularSing(){
		char ch = in.next().charAt(0);
		while(ch!='+' && ch!='*' && ch!='/' && ch!='-' && ch!='%'){
			System.out.println("You stupid! this aint operation");
			ch = in.next().charAt(0);
		}
		
		return ch;
	}
	
	
	public static void printTargil(int x , int y , char c)throws ScriptException{
		System.out.println(x + " " + c + " "+ y + " = ? ");
	}
	
	public static String solveTargil(String targil) throws ScriptException{
		System.out.println((String)new ScriptEngineManager().getEngineByName("js").eval(targil));
		return new DecimalFormat("#").format(Math.floor(Double.parseDouble(new ScriptEngineManager().getEngineByName("js").eval("9/4").toString())));
	}
	
	
}
