package avl;

import java.util.concurrent.TimeUnit;

import common.Settings;
import tardis.Options;
//import tardis.Randomness;
import tardis.OptionsConfigurator;

public final class AvlConfigurator implements OptionsConfigurator {
	@Override
	public void configure(Options o) {
		final String targetClass = "avl/AvlTree";
		//final String targetMethodDescriptor = "(I)I";
		//final String targetMethodName  = "find";
		//final String initialTestClass = "avl/Test";
		//final String initialTestMethodDescriptor = "()V";
		//final String initialTestMethodName = "testFind";
		final int maxDepth = 50;
		final int numOfThreads = 2;
		final int numTargetsEvosuiteJob = 5;
		final float throttleFactorEvosuite = 1.0f;
		final long globalTimeBudgetDuration = 30;
		final TimeUnit globalTimeBudgetTimeUnit = TimeUnit.MINUTES;
		
		o.setTargetClass(targetClass);
		//o.setTargetMethod(targetClass, targetMethodDescriptor, targetMethodName);
		//o.setInitialTestCaseRandom(Randomness.SUITE);
		//o.setInitialTestCasePath(Settings.EXAMPLES_PATH);
		//o.setInitialTestCase(initialTestClass, initialTestMethodDescriptor, initialTestMethodName);
		o.setEvosuiteMultiSearch(true);
		o.setMaxDepth(maxDepth);
		//o.setNumOfThreadsJBSE(numOfThreads);
		//o.setNumOfThreadsEvosuite(numOfThreads);
		o.setNumOfThreadsJBSE(10); //for Evosuite multisearch
		o.setNumOfThreadsEvosuite(1); //for Evosuite multisearch
		o.setThrottleFactorEvosuite(throttleFactorEvosuite);
		o.setGlobalTimeBudgetDuration(globalTimeBudgetDuration);
		o.setGlobalTimeBudgetUnit(globalTimeBudgetTimeUnit);
		o.setTmpDirectoryBase(Settings.TMP_BASE_PATH);
		o.setJava8Home(Settings.JAVA8_HOME);
		o.setZ3Path(Settings.Z3_PATH);
		o.setJBSELibraryPath(Settings.JBSE_PATH);
		o.setClassesPath(Settings.BIN_PATH);
		o.setOutDirectory(Settings.OUT_PATH);
		o.setEvosuitePath(Settings.EVOSUITE_PATH);
		o.setSushiLibPath(Settings.SUSHI_LIB_PATH);
		o.setNumTargetsEvosuiteJob(numTargetsEvosuiteJob);
		o.setEvosuiteNoDependency(true);
	}
}