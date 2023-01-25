package synergy;

import tardis.Main;
import tardis.Options;

public final class RunHard4TardisButEasy4Evo {
	public static void main(String[] s) throws Exception {
		final Hard4TardisButEasy4EvoConfigurator config = new Hard4TardisButEasy4EvoConfigurator();
		final Options o = new Options();
		config.configure(o);
		final Main m = new Main(o);
		m.start();
	}
}
