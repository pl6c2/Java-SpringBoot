package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Custom implements Comparator<Integer>
{
	@Override
	public int compare(Integer i1, Integer i2) {
		
		if(i1>i2)
			return -1;
		if(i1<i2)
			return 1;
		else
			return 0;
		
	}

}

public class MyComparator extends Custom{
	
	

	public static void main(String[] args) {

		MyComparator m =new MyComparator();
		ArrayList<Integer> a=new ArrayList<>();
		a.add(12);
		a.add(23);
		a.add(43);
		a.add(56);
		a.add(11);
	
		Collections.sort(a, new Custom());
		
		for(int l:a)
		{
			System.out.println(l);
		}
		
	}

	
}
