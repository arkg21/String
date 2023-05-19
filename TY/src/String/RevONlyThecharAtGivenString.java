package String;

public class RevONlyThecharAtGivenString {

	public static void main(String[] args) 
	{

		String s="as%g#h($%k==m";//mkhgsa

		char[] ch = s.toCharArray();
		int start=0;
		int end=ch.length-1;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[start]>='a'&&ch[start]<='z')
			{
				if(ch[end]>='a'&&ch[end]<='z')
				{
					if(start<end) {
						char temp = ch[start];
						ch[start]=ch[end];
						ch[end]=temp;
						start++;
						end--;
					}
				}
				else {

					end--;
				}
			}
			else {
				start++;
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+" ");
			
		}
	}

}


