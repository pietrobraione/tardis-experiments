package symbols.string;

import static tardis.Options.sig;

import java.util.concurrent.TimeUnit;

import common.Settings;
import tardis.Options;
import tardis.OptionsConfigurator;

public final class SymbolsStringConfigurator implements OptionsConfigurator {
	@Override
	public void configure(Options o) {
		final String targetClass = "symbols/string/SymbolsString";
		final String targetMethodDescriptor = "(Lsymbols/string/SymbolsString$C1;Lsymbols/string/SymbolsString$C2;)I";
		final String targetMethodName  = "entryPoint";
		final String initialTestClass = "symbols/string/Test";
		final String initialTestMethodDescriptor = "()V";
		final String initialTestMethodName = "test";
		final int maxDepth = 50;
		final int numOfThreads = 5;
		final long timeBudgetDuration = 10;
		final TimeUnit timeBudgetTimeUnit = TimeUnit.MINUTES;

		o.setTargetMethod(targetClass, targetMethodDescriptor, targetMethodName);
		//o.setInitialTestCase(initialTestClass, initialTestMethodDescriptor, initialTestMethodName);
		o.setInitialTestCasePath(Settings.EXAMPLES_PATH);
		o.setMaxDepth(maxDepth);
		o.setNumOfThreadsJBSE(numOfThreads);
		o.setNumOfThreadsEvosuite(numOfThreads);
		o.setTmpDirectoryBase(Settings.TMP_BASE_PATH);
		o.setJava8Home(Settings.JAVA8_HOME);
		o.setZ3Path(Settings.Z3_PATH);
		o.setJBSELibraryPath(Settings.JBSE_PATH);
		o.setClassesPath(Settings.BIN_PATH);
		o.setOutDirectory(Settings.OUT_PATH);
		o.setSushiLibPath(Settings.SUSHI_LIB_PATH);
		o.setEvosuitePath(Settings.EVOSUITE_PATH);
		o.setNumTargetsEvosuiteJob(5);
		o.setGlobalTimeBudgetDuration(timeBudgetDuration);
		o.setGlobalTimeBudgetUnit(timeBudgetTimeUnit);
		o.setUninterpreted(
		                   sig("symbols/string/SymbolsString$C1", "()Ljava/lang/String;", "toString"),
		                   sig("symbols/string/SymbolsString$C2", "()Ljava/lang/String;", "toString")
		);
	}
}
