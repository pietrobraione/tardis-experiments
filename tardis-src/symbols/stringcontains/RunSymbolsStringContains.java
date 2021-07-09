package symbols.stringcontains;

import java.io.IOException;

import tardis.Main;
import tardis.Options;

public final class RunSymbolsStringContains {
	public static void main(String[] s) throws IOException {
		final SymbolsStringContainsConfigurator config = new SymbolsStringContainsConfigurator();
		final Options o = new Options();
		config.configure(o);
		final Main m = new Main(o);
		m.start();
	}
}
