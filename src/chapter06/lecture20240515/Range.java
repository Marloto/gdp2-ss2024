package chapter06.lecture20240515;

import java.util.Iterator;

public class Range implements Iterable<Integer> {

	private int start;
	private int end;
	private int step;

	public Range(int start, int end, int step) {
		this.start = start;
		this.end = end;
		this.step = step;
		
	}
	public Range(int start, int end) {
		this(start, end, 1);
	}

	public Iterator<Integer> iterator() {
		return new SomeRangeIterator(start, end, step);
	}
	
}
