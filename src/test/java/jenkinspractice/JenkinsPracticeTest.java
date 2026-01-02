package jenkinspractice;

import org.testng.annotations.Test;

public class JenkinsPracticeTest {
	
	@Test
	public void  jenkinsPracticeTest() {
		System.out.println("Hi jenkins");
		String ref=System.getProperty("chrome");// runtime parameters for maven cmd
		System.out.println(ref);
	}

}
