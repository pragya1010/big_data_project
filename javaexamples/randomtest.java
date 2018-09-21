import java.util.Random;
class RandomTestDataGenerator {

	public static void main(String args[])
	{
		Random r = new Random();
		
		String fullName = "fullname" +r.nextInt();
		String address = "address" +r.nextInt();
		long phone = (long)(Math.random()*100000+3333000000L);


		System.out.println("Fullname: "+fullName);
		System.out.println("Address: "+address);
		System.out.println("Phone no.: "+phone);
	}
}
