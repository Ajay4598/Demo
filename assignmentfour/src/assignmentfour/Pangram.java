package assignmentfour;

public class Pangram {

	public static void main(String[] args) {
		boolean flag=false;
		String s1="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		String s2="";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==' ') {
				s2=s2+"";
			}else {
				s2=s2+s1.charAt(i);
			}
		}

		char[] ch1=new char[s2.length()];
		for(int i=0;i<ch1.length;i++) {
			ch1[i]=s2.charAt(i);
		}
		int[] ar=new int[26];
		
		for(int i=0;i<ch1.length;i++)
		{
			int index=ch1[i]-65;
			ar[index]++;  
		}
		for(int i=0; i<ar.length;i++)
		{
			if(ar[i]==0)
			{
				System.out.println("It's not pangram");
				flag=true;
			}
		}
		if(flag==false)
		{
		System.out.println("It's pangram");
		}

	}

}
