package synergy;

public class Hard4TardisButEasy4Evo {
	public final int Y = 1000000;
	public final int SIZE = 14;
	private int a;
	private int b;
	private int[] array = new int[SIZE];
	private int[] array1 = new int[SIZE];
	
	public Hard4TardisButEasy4Evo(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void setArrayAt(int i, int value) {
		this.array[Math.abs(i) % this.array.length] = value;
	}

	public void setArray1At(int i, int value) {
		this.array1[Math.abs(i) % this.array1.length] = value;
	}

	public void setA(int a) {
		this.a = a;		
	}

	public void setB(int b) {
		this.b = b;		
	}
	
	public int hard4TardisButEasy4Evo() {
		int count = 0;
		for (int i = 0; i < array.length; ++i) {
			if (array[i] != 0) {
				++count;
			}
		}
		if (count > SIZE * 0.5) {
			//this branch is hard for Tardis
			return easy4TardisButHard4Evo();
		}
		return 0;
	}

	private int easy4TardisButHard4Evo() {
		int target = Y * 1000;
		int x = target;
		if (a > Y) {
			x = b;
		}
		if (x > target) {
			//this branch is hard for EvoSuite
			return sink();	
		}
		return 0;
	}
	
	private int sink() {
		int count = 0;
		for (int i = 0; i < array1.length; ++i) {
			if (array1[i] != 0) {
				++count;
			}
		}
		if (count > SIZE * 0.5) {
			//this branch is hard for Tardis
			return 1;
		}
		return 0;
	}

}
