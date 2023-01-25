package synergy;

public class Easy4TardisButHard4Evo {
	public final int Y = 1000000;
	public final int SIZE = 14;
	private int a;
	private int b;
	private int a1;
	private int b1;
	private int[] array = new int[SIZE];
	
	public Easy4TardisButHard4Evo(int a, int b, int a1, int b1) {
		this.a = a;
		this.b = b;
		this.a1 = a1;
		this.b1 = b1;
	}
	
	public void setA(int a) {
		this.a = a;		
	}

	public void setB(int b) {
		this.b = b;		
	}
	
	public void setA1(int a1) {
		this.a1 = a1;		
	}

	public void setB1(int b1) {
		this.b1 = b1;		
	}

	public void setArrayAt(int i, int value) {
		this.array[Math.abs(i) % this.array.length] = value;
	}
	
	public int easy4TardisButHard4Evo() {
		int target = Y * 1000;
		int x = target;
		if (a > Y) {
			x = b;
		}
		if (x > target) {
			//this branch is hard for EvoSuite
			return hard4TardisButEasy4Evo();	
		}
		return 0;
	}

	private int hard4TardisButEasy4Evo() {
		int count = 0;
		for (int i = 0; i < array.length; ++i) {
			if (array[i] != 0) {
				++count;
			}
		}
		if (count > SIZE * 0.5) {
			//this branch is hard for Tardis
			return sink();
		}
		return 0;
	}

	private int sink() {
		int target = -Y * 1000;
		int x = target;
		if (a1 < -Y) {
			x = b1;
		}
		if (x < target) {
			//this branch is hard for EvoSuite
			return 1;	
		}
		return 0;
	}

}
