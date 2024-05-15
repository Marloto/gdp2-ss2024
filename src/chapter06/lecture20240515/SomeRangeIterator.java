package chapter06.lecture20240515;

import java.util.Iterator;

public class SomeRangeIterator implements Iterator<Integer> {

	private int current;
	private int end;
	private int step;

	public SomeRangeIterator(int start, int end, int step) {
		this.current = start; // ggf.
		this.end = end;
		this.step = step;
	}
	
	@Override
	public boolean hasNext() {
		return current <= end;
	}

	@Override
	public Integer next() {
		int tmp = current;
		current += step;
		return tmp;
	}

}
