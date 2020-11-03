package symbols.string;

import static tardis.Options.sig;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import common.Settings;
import tardis.Main;
import tardis.Options;

public class RunSymbolsString {
	public static void main(String[] s) throws IOException {
		final String targetClass = "symbols/string/SymbolsString";
		final String targetMethodDescriptor = "(Lsymbols/string/SymbolsString$C1;Lsymbols/string/SymbolsString$C2;)I";
		final String targetMethodName  = "entryPoint";
		final int maxDepth = 50;
		final int numOfThreads = 5;
		final long timeBudgetDuration = 10;
		final TimeUnit timeBudgetTimeUnit = TimeUnit.MINUTES;
		
		final Options o = new Options();
		o.setTargetMethod(targetClass, targetMethodDescriptor, targetMethodName);
		o.setMaxDepth(maxDepth);
		o.setNumOfThreadsJBSE(numOfThreads);
                o.setNumOfThreadsEvosuite(numOfThreads);
		o.setTmpDirectoryBase(Settings.TMP_BASE_PATH);
		o.setZ3Path(Settings.Z3_PATH);
		o.setJBSELibraryPath(Settings.JBSE_PATH);
		o.setClassesPath(Settings.BIN_PATH);
		o.setOutDirectory(Settings.OUT_PATH);
		o.setSushiLibPath(Settings.SUSHI_LIB_PATH);
		o.setEvosuitePath(Settings.EVOSUITE_MOSA_PATH);
		o.setUseMOSA(true);
		o.setNumMOSATargets(5);
		o.setGlobalTimeBudgetDuration(timeBudgetDuration);
		o.setGlobalTimeBudgetUnit(timeBudgetTimeUnit);
		o.setUninterpreted(
			sig("symbols/string/SymbolsString$C1", "()Ljava/lang/String;", "toString"),
			sig("symbols/string/SymbolsString$C2", "()Ljava/lang/String;", "toString"),
			sig("java/lang/String", "(Ljava/lang/Object;)Z", "equals")
		);
	
		final Main m = new Main(o);
		m.start();
	}
}
