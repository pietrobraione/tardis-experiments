package testgen;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import common.Settings;
import tardis.Main;
import tardis.Options;

public class RunTestgen {
	public static void main(String[] s) throws IOException {
		final String targetClass = "testgen/Testgen";
		final String targetMethodDescriptor = "(Ltestgen/Testgen$Node;I)Ltestgen/Testgen$Node;";
		final String targetMethodName  = "getNode";
		final String initialTestClass = "testgen/Test";
		final String initialTestMethodDescriptor = "()V";
		final String initialTestMethodName = "test1";
		final int maxDepth = 50;
		final int numOfThreads = 5;
		final int numOfMOSATargets = 5;
		final float throttleFactorEvosuite = 1.0f;
		final long timeBudgetDuration = 10;
		final TimeUnit timeBudgetTimeUnit = TimeUnit.MINUTES;

		final Options o = new Options();
		o.setTargetClass(targetClass);
		o.setTargetMethod(targetClass, targetMethodDescriptor, targetMethodName);
		o.setInitialTestCase(initialTestClass, initialTestMethodDescriptor, initialTestMethodName);
		o.setInitialTestCasePath(Settings.EXAMPLES_PATH);
		o.setMaxDepth(maxDepth);
		o.setNumOfThreadsJBSE(numOfThreads);
		o.setNumOfThreadsEvosuite(numOfThreads);
		o.setNumMOSATargets(numOfMOSATargets);
		o.setThrottleFactorEvosuite(throttleFactorEvosuite);
		o.setGlobalTimeBudgetDuration(timeBudgetDuration);
		o.setGlobalTimeBudgetUnit(timeBudgetTimeUnit);
		o.setTmpDirectoryBase(Settings.TMP_BASE_PATH);
		o.setJava8Home(Settings.JAVA8_HOME);
		o.setZ3Path(Settings.Z3_PATH);
		o.setJBSELibraryPath(Settings.JBSE_PATH);
		o.setClassesPath(Settings.BIN_PATH);
		o.setOutDirectory(Settings.OUT_PATH);
		o.setSushiLibPath(Settings.SUSHI_LIB_PATH);
		o.setEvosuitePath(Settings.EVOSUITE_PATH);

		final Main m = new Main(o);
		m.start();
	}
}
