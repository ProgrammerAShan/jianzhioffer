package DataStructureLib;

public class HeapClass {
	public int[] data;
	public int number;

	public HeapClass(int[] inputdata) {
		this.number = inputdata.length;
		data = inputdata;
	}

	public void makeheap() {
		int startnumber = this.number / 2;
		for (int i = startnumber - 1; i > -1; i--) {
			tripdown(i);
			System.out.print(Integer.toString(i) + ":\t");
			format();
			System.out.println();
		}
	}

	private void tripdown(int index) {
		int currentindex = index;
		int replaceindex = index;
		while (currentindex * 2 + 1 < number) {
			replaceindex = currentindex;
			if (currentindex * 2 + 2 == number) {
				replaceindex = currentindex + 1;
			} else {
				if (data[currentindex * 2 + 1] > data[currentindex * 2 + 2]) {
					replaceindex = currentindex * 2 + 1;
				} else {
					replaceindex = currentindex * 2 + 2;
				}
				if (data[replaceindex] > data[currentindex]) {
					swap(currentindex, replaceindex);
					currentindex = replaceindex;
				} else {
					break;
				}
			}
		}
	}

	private void swap(int indexi, int indexj) {
		int tmp = data[indexi];
		data[indexi] = data[indexj];
		data[indexj] = tmp;
	}

	public void format() {
		for (int i = 0; i < number; i++) {
			System.out.print(Integer.toString(data[i]));
			System.out.print("-");
		}
	}

	public int remove() {
		int result = 0;
		if (number > 0) {
			result = data[0];
			number--;
			data[0] = data[number - 1];
			tripdown(0);
			return result;
		} else {
			System.out.println("堆为空");
			return -1;
		}
	}

	public void insert(int element) {
		number++;
		int[] newdata = new int[number];
		for (int i = 0; i < number - 1; i++) {
			newdata[i] = data[i];
		}
		newdata[number - 1] = element;
		data = newdata;
		tripup();
	}

	private void tripup() {
		int index = (number - 1 - 1) / 2;
		int currentindex = (number - 1);
		while (index >= 0) {
			if (data[index] < data[currentindex]) {
				swap(index, currentindex);
				currentindex = index;
				index = (currentindex - 1) / 2;

			} else {
				break;
			}
		}
	}

	// public static void format(int[] testdata)
	// {
	// for(int i=0;i<testdata.length;i++)
	// {
	// System.out.print(Integer.toString(testdata[i]));
	// System.out.print("-");
	// }
	// }
}
