package Tests;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    List<String> game = fizzbuzz(100);
    System.out.print(game);
}
    public static List<String> fizzbuzz(int n) {
    	List<String> output = new ArrayList<String>();
    	for(int i=1;i<=n;i++) {
    		String draft = "";
    		boolean div3 = (i %3 == 0);
    		boolean div5 = (i %5 == 0);
    		if(div3 && div5){
    		    draft += ("FizzBuzz");
    		}
    		else if(div3){
    		    draft += ("Fizz");
    		}
    		else if(div5){
    		    draft += ("Buzz");
    		}
    		else {
    			draft += (Integer.toString(i));
    		}
    		output.add(draft);
    	}
        return output;
    }
}
