package lesson8Day1HomeWork1;

import java.util.Arrays;

public class MyStringList {
	private final int INITIAL_LENGTH = 4;
	private String[] strArray;
	private int size;

	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}

	public void add(String s) {
		if (size == strArray.length)
			resize();
		strArray[size++] = s;
	}

	public String get(int i) {
		if (i < 0 || i >= size) {
			return null;
		}
		return strArray[i];
	}

	public boolean find(String s) {
		for (String test : strArray) {
			if (test.equals(s))
				return true;
		}
		return false;
	}

	// 1 utility method
	public boolean binarySearch(String val) {
		boolean b = binarySearch(0, size - 1, val);
		return b;
	}

	// 2 binary search
	private boolean binarySearch(int low, int high, String val) {
		int mid = (low + high) / 2;
		if (get(mid) == val)
			return true;
		if (low > high)
			return false;
		if (val.compareTo(get(mid)) > 0)
			return binarySearch(mid + 1, high, val);
		return binarySearch(low, mid - 1, val);
	}

	// sort method
	public void sort() {
		if (size <= 1)
			return;
		int len = size;
		for (int i = 0; i < len; ++i) {
			int nextMinPos = minpos(i, len - 1);
			swap(i, nextMinPos);
		}

	}

	void swap(int i, int j) {
		String temp1 = get(i);
		String temp2 = get(j);
		remove(temp2);
		insert(temp1, j);

		remove(temp1);
		insert(temp2, i);

	}

	// find minimum of arr between the indices bottom and top
	public int minpos(int bottom, int top) {
		String m = get(bottom);
		int index = bottom;
		for (int i = bottom + 1; i <= top; ++i) {
			if (get(i).compareTo(m) < 0) {
				m = get(i);
				index = i;
			}
		}
		return index;
	}
	// sort method until this section

	public void insert(String s, int pos) {
		if (pos > size)
			return;
		if (pos >= strArray.length || size + 1 > strArray.length) {
			resize();
		}
		String[] temp = new String[strArray.length + 1];
		System.arraycopy(strArray, 0, temp, 0, pos);
		temp[pos] = s;

		System.arraycopy(strArray, pos, temp, pos + 1, strArray.length - pos);
		strArray = temp;
		++size;

	}

	public boolean remove(String s) {
		if (size == 0)
			return false;
		int index = -1;
		for (int i = 0; i < size; ++i) {
			if (strArray[i].equals(s)) {
				index = i;
				break;
			}
		}
		if (index == -1)
			return false;
		String[] temp = new String[strArray.length];
		System.arraycopy(strArray, 0, temp, 0, index);
		System.arraycopy(strArray, index + 1, temp, index, strArray.length - (index + 1));
		strArray = temp;
		--size;
		return true;
	}

	private void resize() {
		System.out.println("resizing");
		int len = strArray.length;
		int newlen = 2 * len;
		String[] temp = new String[newlen];
		System.arraycopy(strArray, 0, temp, 0, len);
		strArray = temp;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size - 1; ++i) {
			sb.append(strArray[i] + ", ");
		}
		sb.append(strArray[size - 1] + "]");
		return sb.toString();
	}

	public int size() {
		return size;
	}

	
	// sorting and searching
	public static void main(String[] args) {
		String[] names = { "big", "small", "tall", "short", "round", "square", "enormous", "tiny", "gargantuan",
				"lilliputian", "numberless", "none", "vast", "miniscule" };
		MyStringList l = new MyStringList();
		for (String name : names) {
			l.add(name);
		}
		System.out.println("Before Sorting: ");
		System.out.println(l);
		l.sort();
		System.out.println("After Sorting");
		System.out.println(l);
		
		System.out.println(l.binarySearch("number"));
		System.out.println(l.binarySearch("tiny"));
	}
}
