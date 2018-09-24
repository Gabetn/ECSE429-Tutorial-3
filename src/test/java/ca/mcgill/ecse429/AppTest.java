package ca.mcgill.ecse429;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
	@Test
	public void testMainMethodForNull() {
		App.main(null);
	}

	@Test
	public void testMainMethodForEmptyArray() {
		App.main(new String[0]);
	}

	@Test
	public void testMainMethodForNonEmptyArray() {
		String[] args = {"Hello", "World"};
		App.main(args);
	}
}