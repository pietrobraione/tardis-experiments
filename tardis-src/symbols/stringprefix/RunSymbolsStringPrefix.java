package symbols.stringprefix;

import java.io.IOException;

import tardis.Main;
import tardis.Options;

public final class RunSymbolsStringPrefix {
	public static void main(String[] s) throws IOException {
		final SymbolsStringPrefixConfigurator config = new SymbolsStringPrefixConfigurator();
		final Options o = new Options();
		config.configure(o);
		final Main m = new Main(o);
		m.start();
	}
}
