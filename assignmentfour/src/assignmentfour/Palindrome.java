package assignmentfour;

public class Palindrome {

	public static void main(String[] args) {
		String str="2552";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str)) {
			System.out.println("It is a palindrome");
		}else {
			System.out.println("it is not a palindrome");
		}

	}

}
