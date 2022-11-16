package assignmentfour;

public class RemoveDuplicateString {

	public static void main(String[] args) {

		char str[] = "ajayvijay".toCharArray();
		int n = str.length;
		String fstr="";
		for (int i = 0; i < n; i++)
		{
			int j;
			for (j = 0; j < i; j++)
			{
				if (str[i] == str[j])
				{
					break;
				}
			}
			if (j == i)
			{
				fstr = fstr+str[i];
			}
		}
		System.out.println(fstr);
	}

}
