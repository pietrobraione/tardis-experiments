package maps;

import tardis.Main;
import tardis.Options;

public final class RunMaps {
	public static void main(String[] args) {
		final MapsConfigurator config = new MapsConfigurator();
		final Options o = new Options();
		config.configure(o);
		final Main m = new Main(o);
		m.start();
	}
}
