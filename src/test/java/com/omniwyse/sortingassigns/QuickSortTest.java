package com.omniwyse.sortingassigns;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickSortTest {
	private static QuickSort QUICK_SORT;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		QUICK_SORT = new QuickSort();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		QUICK_SORT = null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSort() {
		int arr[] = { 10,5,4,6,3,1,2};
		int[] expected = {1,2,3,4,5,6,10};
		int[] result = QUICK_SORT.sort(arr, 0, arr.length - 1);
		/*int arr2[] = { -2,3,5,-10,1};
		int[] expected2 = {-10,-2,1,3,5};*/
		int arr2[] = {0,0,0,0,0,0,-5};
		int[] expected2 = {-5,0,0,0,0,0,0};
		int[] result2 = QUICK_SORT.sort(arr2, 0, arr2.length - 1);
		assertArrayEquals(expected2, result2);
		QUICK_SORT.printArray(result2);
	}

}
