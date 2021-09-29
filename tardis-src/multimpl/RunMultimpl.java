package multimpl;

import tardis.Main;
import tardis.Options;

public final class RunMultimpl {
	public static void main(String[] args) {
		final MultimplConfigurator config = new MultimplConfigurator();
		final Options o = new Options();
		config.configure(o);
		final Main m = new Main(o);
		m.start();
	}
}
