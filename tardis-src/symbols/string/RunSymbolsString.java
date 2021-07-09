package symbols.string;

import java.io.IOException;

import tardis.Main;
import tardis.Options;

public final class RunSymbolsString {
	public static void main(String[] s) throws IOException {
		final SymbolsStringConfigurator config = new SymbolsStringConfigurator();
		final Options o = new Options();
		config.configure(o);
		final Main m = new Main(o);
		m.start();
	}
}
