package Assesment.Q11;

public class CheckedException {

	public static void main(String[] args) {
		try
		{
			System.out.println(10/0);
		}
		catch (Exception e) {
			System.out.println("Checked Exception");
		}
	}

}
