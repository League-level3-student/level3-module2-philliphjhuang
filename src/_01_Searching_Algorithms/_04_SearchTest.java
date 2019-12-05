package _01_Searching_Algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		_00_LinearSearch ls = new _00_LinearSearch();
		String[] name = {"Bob","Joe","Jack","Justin"};
		assertEquals(3,ls.linearSearch(name, "Justin"));
		assertEquals(2,ls.linearSearch(name, "Jack"));
		assertEquals(1,ls.linearSearch(name, "Joe"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		_01_BinarySearch bs = new _01_BinarySearch();
		int[] num = {1,3,6,8,10,63,74};
		assertEquals(2,bs.binarySearch(num, 0, num.length, 6));
		assertEquals(5,bs.binarySearch(num, 0, num.length, 63));
		assertEquals(6,bs.binarySearch(num, 0, num.length, 74));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		_02_InterpolationSearch is = new _02_InterpolationSearch();
		int[] num = {1,3,6,8,10,63,74};
		assertEquals(0,is.interpolationSearch(num,1));
		assertEquals(3,is.interpolationSearch(num,8));
		assertEquals(5,is.interpolationSearch(num,63));
		
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		_03_ExponentialSearch es = new _03_ExponentialSearch();
		int[] num = {1,3,6,8,10,63,74};
		assertEquals(0,es.exponentialSearch(num,1));
		assertEquals(3,es.exponentialSearch(num,8));
		assertEquals(5,es.exponentialSearch(num,63));
		
		
		
		
	}
}
