package com.jonas.jnj;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetFinder {

	public Set<List<Integer>> nSumByRange(int smallest, int largest, int target,
			int n) throws AssertionError {
		
		assert ((smallest * n) >= target
				&& target <= (largest * n)) : "Cannot be formed";

		Set<List<Integer>> subsets = new HashSet<List<Integer>>();
		int begin = target - (largest * (n - 1));
		
		for (int i = Math.max(begin, smallest); i <= largest; i++) {
			if ((i + ((n - 1) * largest) < target) 
					|| i + ((n - 1) * smallest) > target) {
				//not possible to get there
				break;
			} else if (n > 1) {
				try {
					//probably should cache these, go with DP solution
					Set<List<Integer>> recursed = nSumByRange(smallest, largest,
							target - i, n - 1);
					for (List<Integer> l : recursed) {
						l.add(i);
						subsets.add(l);
					}
				} catch (AssertionError e) {
					//no-op
				}
			} else {
				List<Integer> l = new ArrayList<Integer>();
				l.add(i);
				subsets.add(l);
				break;
			}
		}
		return subsets;
	}
}
