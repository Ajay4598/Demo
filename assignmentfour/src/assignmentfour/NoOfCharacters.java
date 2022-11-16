package assignmentfour;

public class NoOfCharacters {

	public static void main(String[] args) {
		String str="Ajay@kumar";
		str=str.toLowerCase();
		int vcount=0,ccount=0,scount=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vcount++;
			}
			else {
				ccount++;
			}
			}
			else {
				scount++;
			}
		}
		System.out.println("No of vowels present - "+vcount);
		System.out.println("No of consonants present - "+ccount);
		System.out.println("No of special characters present - "+scount);

	}

}
