package assignmentfour;

public class PrintDuplicates {

	public static void main(String[] args) {
		String str="Ajbcdfresfbefay";
		str=str.toLowerCase();
		int[] count=new int[256];
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)]++;
		}
		System.out.print("Dublicates character are:- ");
		for (int i = 0; i < count.length; i++) {
			if (count[i] > 1)
				System.out.print((char)(i)+" " );
		}

	}

}
