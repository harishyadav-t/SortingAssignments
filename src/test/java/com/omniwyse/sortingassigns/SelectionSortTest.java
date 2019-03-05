package com.omniwyse.sortingassigns;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * SelectionSortTest class forms part of the Test driven development approach used to test the SelectionSort class
 * @author harish
 *
 */
public class SelectionSortTest {
	private static SelectionSort SELECTION_SORT;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		SELECTION_SORT = new SelectionSort();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		SELECTION_SORT = null;
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
		assertArrayEquals(expectedArr, SELECTION_SORT.sortArray(inputArr));
	}

}
