package avl;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import common.Settings;
import tardis.Main;
import tardis.Options;
//import tardis.Randomness;

public class RunAvl {
	public static void main(String[] s) throws IOException {
		final String targetClass = "avl/AvlTree";
		//final String targetMethodDescriptor = "(I)I";
		//final String targetMethodName  = "find";
		//final String initialTestClass = "avl/Test";
		//final String initialTestMethodDescriptor = "()V";
		//final String initialTestMethodName = "testFind";
		final int maxDepth = 50;
		final int numOfThreads = 5;
		final long globalTimeBudgetDuration = 30;
		final TimeUnit globalTimeBudgetTimeUnit = TimeUnit.MINUTES;
		
		final Options o = new Options();
		o.setTargetClass(targetClass);
		//o.setTargetMethod(targetClass, targetMethodDescriptor, targetMethodName);
		//o.setInitialTestCaseRandom(Randomness.SUITE);
		//o.setInitialTestCasePath(Settings.EXAMPLES_PATH);
		//o.setInitialTestCase(initialTestClass, initialTestMethodDescriptor, initialTestMethodName);
		o.setMaxDepth(maxDepth);
		o.setNumOfThreadsJBSE(numOfThreads);
		o.setNumOfThreadsEvosuite(numOfThreads);
		o.setTmpDirectoryBase(Settings.TMP_BASE_PATH);
		o.setJava8Home(Settings.JAVA8_HOME);
		o.setZ3Path(Settings.Z3_PATH);
		o.setJBSELibraryPath(Settings.JBSE_PATH);
		o.setClassesPath(Settings.BIN_PATH);
		o.setOutDirectory(Settings.OUT_PATH);
		o.setEvosuitePath(Settings.EVOSUITE_PATH);
		o.setSushiLibPath(Settings.SUSHI_LIB_PATH);
		o.setNumMOSATargets(5);
		o.setGlobalTimeBudgetDuration(globalTimeBudgetDuration);
		o.setGlobalTimeBudgetUnit(globalTimeBudgetTimeUnit);

		final Main m = new Main(o);
		m.start();
	}
}