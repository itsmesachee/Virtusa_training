package com.virtusa.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestSimpleLoop {
		private SimpleLoop sim=null;
	@BeforeEach
	void setUp() throws Exception {
		sim= new SimpleLoop();
	}

	@AfterEach
	void tearDown() throws Exception {
		sim=null;
	}

	@Test
	void test_find_total_atLeastOnce() {
		int actual=sim.findTotal(1),expected=5;
		assertEquals(actual, expected);
	}
	
	@Test
	public void test_find_total_loopignored() {
		int actual=sim.findTotal(-1),expected=0;
		assertEquals(actual, expected);
	}
	

	@Test
	public void test_find_total_moreThanOnce() {
		int actual=sim.findTotal(4),expected=83;
		assertEquals(actual, expected);
	}
	

	@Test
	public void test_find_total_loopComplete() {
		int actual=sim.findTotal(sim.array.length),expected=124;
		assertEquals(actual, expected);
	}

	@Test
	public void test_find_total_loopComplete_PlusOne() {
		int actual,expected=124;
		try {
			actual=sim.findTotal(sim.array.length+1);
			assertTrue(false);
			
		}
		catch(Exception e) {
			assertTrue(true);
		}
		
		} 
}
