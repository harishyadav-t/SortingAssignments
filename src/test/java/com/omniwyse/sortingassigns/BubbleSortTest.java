package com.omniwyse.sortingassigns;

import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BubbleSortTest {
	private static BubbleSort BUBBLE_SORT;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		BUBBLE_SORT = new BubbleSort();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		BUBBLE_SORT = null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSortArray() {
		int [] expectedArr = {2,3,4,5,12,15,24,51};
		int [] inputArr = {12,5,24,51,2,15,4,3};
		assertArrayEquals(expectedArr, BUBBLE_SORT.sortArray(inputArr));
	}
}
