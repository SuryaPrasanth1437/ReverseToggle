package program;

public class EachWord
{
	static String word(String st)
	{
		String[] words=st.split("\\s");
		String capital="";
		for (String s:words)
		{
			StringBuilder sb=new StringBuilder(s);
			sb.reverse();
			capital+=sb+" ";
		}
		return capital.trim();
		
	}

	public static void main(String[] args)
	{
	System.out.println(EachWord.word("hi surya"));
	
	}

}
