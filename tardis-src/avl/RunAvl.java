package avl;

import java.io.IOException;
import tardis.Main;
import tardis.Options;

public final class RunAvl {
	public static void main(String[] s) throws IOException {
		final AvlConfigurator config = new AvlConfigurator();
		final Options o = new Options();
		config.configure(o);
		final Main m = new Main(o);
		m.start();
	}
}