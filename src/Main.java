import java.util.Scanner;

public class Main {

	public static void main(String[] args){
    	Scanner scanner = new Scanner (System.in);
    	
    	 int totalNumber = 0;
        int count = 1;
    
    	while (count <= 5) {
    	    System.out.print("Enter a number:");
    	    System.out.println(totalNumber + " ");
            int Number = scanner.nextInt();
            totalNumber += Number;
            count ++;
       		}
        	System.out.println("\nTotal Number" + totalNumber);
        
    	scanner.close();
    }
}
