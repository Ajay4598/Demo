package assignmentfour;

public class UniqueCharacters {

	public static void main(String[] args) {
			String str="abcdefg";
			boolean flag=false;
			Z:for(int i=0;i<str.length();i++) {
				for(int j=0;j<i;j++) {
					if(str.charAt(i)==str.charAt(j)) {
						flag=true;
						break Z;
					}
				}
			}
			if(flag) {
				System.out.println("All characters are not unique");
			}
			else {
				System.out.println("All characters are  unique");
			}
	}

}
