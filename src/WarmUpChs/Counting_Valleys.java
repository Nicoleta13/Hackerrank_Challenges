package warmUpChs;

public class Counting_Valleys {

	public static void main(String[] args) {
		System.out.println(countingValleys(12, "DDUUDDUDUUUD"));

	}
	
	public static int countingValleys(int steps, String path) {
	    // Write your code here
	        int count = 0;
	        int valeys = 0;
	        
	        for(int i=0; i < path.length(); i++){
	            if(path.charAt(i)==('D')){
	                count--;
	            } else if(path.charAt(i)==('U')){
	                count++;
	            }
	            if(count == 0 && path.charAt(i)==('U')){
	                valeys++;
	            }
	        }
	        return valeys;
	    }

	}
