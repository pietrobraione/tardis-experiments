package synergy;

import tardis.Main;
import tardis.Options;

public final class RunEasy4TardisButHard4Evo {
	public static void main(String[] s) throws Exception {
		final Easy4TardisButHard4EvoConfigurator config = new Easy4TardisButHard4EvoConfigurator();
		final Options o = new Options();
		config.configure(o);
		final Main m = new Main(o);
		m.start();
	}
}
