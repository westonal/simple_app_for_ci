package info.burrows.ciexample.test;

import junit.framework.Assert;
import junit.framework.TestCase;

public final class SimpleTest extends TestCase {

	public void testPass()
	{
		Assert.assertTrue(true);		
	}	
	
	public void testFail()
	{
		Assert.fail();		
	}	
	
}
