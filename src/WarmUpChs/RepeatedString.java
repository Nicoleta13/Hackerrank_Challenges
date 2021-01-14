package warmUpChs;

public class RepeatedString {

	public static void main(String[] args) {
		String s = "aba";
		System.out.println(repeatedString(s, 10));

	}
	
	public static long repeatedString(String s, long n) {
        long countA = 0;
        long div = n / s.length();
        long rem = n % s.length();
        
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == 'a'){
                countA++;
            }
        }
        
        countA = countA * div;
        
        for(int i = 0; i < rem; i++){
            if(s.charAt(i) == 'a'){
                countA++;
            }
        }
        return countA;

    }

}
