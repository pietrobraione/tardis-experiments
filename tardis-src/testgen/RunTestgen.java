package testgen;

import java.io.IOException;

import tardis.Main;
import tardis.Options;

public final class RunTestgen {
	public static void main(String[] s) throws IOException {
		final TestgenConfigurator config = new TestgenConfigurator();
		final Options o = new Options();
		config.configure(o);
		final Main m = new Main(o);
		m.start();
	}
}
