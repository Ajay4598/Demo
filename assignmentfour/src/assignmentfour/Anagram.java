package assignmentfour;

public class Anagram {
	
	static char[] sort(char[] a) {
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
					if(a[j]<a[j-1])
					{
					char tempVar=a[j];
					a[j]=a[j-1];
					a[j-1]=tempVar;
					}
			}
		}
		return a;
		}

	public static void main(String[] args) {
		String s1="a gentle Man";
		String s2="elegant Man";
		String s3="";
		String s4="";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==' ') {
				s3=s3+"";
			}else {
				s3=s3+s1.charAt(i);
			}
		}
		s1=s3;
		s3="";
		for(int i=0;i<s2.length();i++) {
			if(s2.charAt(i)==' ') {
				s4=s4+"";
			}else {
				s4=s4+s2.charAt(i);
			}
		}
		s2=s4;
		s4="";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)>='A'&&s1.charAt(i)<='Z') {
				s3=s3+(char)(s1.charAt(i)+32);
			}else {
				s3=s3+s1.charAt(i);
			}
		}
		s1=s3;
		s3="";
		for(int i=0;i<s2.length();i++) {
			if(s2.charAt(i)>='A'&&s2.charAt(i)<='Z') {
				s4=s4+(char)(s2.charAt(i)+32);
			}else {
				s4=s4+s2.charAt(i);
			}
		}
		s2=s4;
		s4="";
		char[] ch1=new char[s1.length()];
		for(int i=0;i<ch1.length;i++) {
			ch1[i]=s1.charAt(i);
		}
		char[] ch2=new char[s2.length()];
		for(int i=0;i<ch2.length;i++) {
			ch2[i]=s2.charAt(i);
		}
		ch1=sort(ch1);
		ch2=sort(ch2);
		boolean flag=true;
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]!=ch2[i]) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("It is Anagram");
		}
		else {
			System.out.println("It's not Anagram");
		}
		
	}

}
