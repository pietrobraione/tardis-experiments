package multimpl;

public class Multimpl {
	public static abstract class Super {
		abstract int m();
	}
	
	public static final class Sub0 extends Super {
		@Override
		int m() {
			return 0;
		}
	}
	
	public static final class Sub1 extends Super {
		@Override
		int m() {
			return 1;
		}
	}
	
	public static class Sub2 extends Super {
		@Override
		int m() {
			return 2;
		}
	}
	
	public static final class Sub3 extends Sub2 {
		@Override
		int m() {
			return 3;
		}
	}
	
	public static final class Sub4 extends Sub2 {
		@Override
		int m() {
			return 4;
		}
	}
	
	public void entryPoint(Super x) {
		final int i = x.m();
		if (i == 0) {
			System.out.println("0");
		} else if (i == 1) {
			System.out.println("1");
		} else if (i == 2) {
			System.out.println("2");
		} else if (i == 3) {
			System.out.println("3");
		} else {
			System.out.println(">3");
		}
	}
}
