package com.jonas.jnj.test;

import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.jonas.jnj.SubsetFinder;

public class NSumByRangeTest {
	
	SubsetFinder subsetFinder;
	
	@Before
	public void setup() {
		subsetFinder = new SubsetFinder();
	}
	
	@Test
	public void test() {
		Set<List<Integer>> subsets = subsetFinder.nSumByRange(1, 10, 13, 2);
		for(List<Integer> l : subsets) {
			System.out.println(l.toString());
		}
	}
	
	@Test
	public void test3() {
		Set<List<Integer>> subsets = subsetFinder.nSumByRange(1, 10, 13, 3);
		for(List<Integer> l : subsets) {
			System.out.println(l.toString());
		}
	}
	
	@Test
	public void test5() {
		Set<List<Integer>> subsets = subsetFinder.nSumByRange(1, 10, 32, 5);
		for(List<Integer> l : subsets) {
			System.out.println(l.toString());
		}
	}
}
