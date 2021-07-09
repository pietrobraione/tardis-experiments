package symbols.constants;

import java.io.IOException;
import tardis.Main;
import tardis.Options;

public final class RunSymbolsConstants {
	public static void main(String[] s) throws IOException {
		final SymbolsConstantsConfigurator config = new SymbolsConstantsConfigurator();
		final Options o = new Options();
		config.configure(o);
		final Main m = new Main(o);
		m.start();
	}
}
