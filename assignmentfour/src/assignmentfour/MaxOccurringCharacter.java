package assignmentfour;

public class MaxOccurringCharacter {

	public static void main(String[] args) {
		String str="Hyderabas";
		int max=0,res=0;

		int[] count=new int[256];
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)]++;
		}
		for(int i=0;i<count.length;i++) {
			if(count[i]>max) {
				max=count[i];
				res=i;
			}
		}
		
		System.out.println("Maximum ocuuring character is "+(char)res);

	}

}
