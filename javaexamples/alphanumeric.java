import java.util.Random;

public class Alphanumeric
{
	private final String LETTERS = "abcdefghijklmnopqrstuvwxyz";
	private final char[] Alphanumeric = (LETTERS+ LETTERS.toUpperCase()+"0123456789").toCharArray();
	
	public String generateRandomAlphanumeric(int length);
	{
		StringBuilder result = new StringBuilder();
		for(int i =0; i<length; i++)
		{
			result.append(Alphanumeric[new Random().nextInt(Alphanumeric.length)]);
		}
		return result.toString();
	}
}

public class main
{
	public static void main(String args[])
	{
		Alphanumeric ran = new Alphanumeric();
		System.out.println(ran.generateRandomAlphanumeric(7));
	}
}
