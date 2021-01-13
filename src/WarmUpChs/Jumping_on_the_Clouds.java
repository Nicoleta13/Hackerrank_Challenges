package warmUpChs;

public class Jumping_on_the_Clouds {

	public static void main(String[] args) {
		int[] clouds = {0,0,1,0,0,1,0};
		System.out.println(jumpingOnClouds(clouds));

	}
	

	public static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        for(int i = 0; i < c.length-1; i++){
            jumps++;
            if(i+2 < c.length && c[i+2] == 0){
               i++; 
            }
        }
        return jumps;
    }

}
