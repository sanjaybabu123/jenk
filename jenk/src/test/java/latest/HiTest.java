package latest;

import org.testng.annotations.Test;

public class HiTest {
	@Test
	public void hi()
	{
		System.out.println("hi guys");
		hello();
	}
	public void hello()
	{
		System.out.println("hello guys");
	}
	public void demo()
	{
		System.out.println("bye");
		System.out.println("bye bye");
	}
}