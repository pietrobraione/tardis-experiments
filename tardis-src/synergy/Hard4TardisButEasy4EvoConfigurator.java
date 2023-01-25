package synergy;

import java.util.concurrent.TimeUnit;

import common.Settings;
import tardis.Options;
import tardis.OptionsConfigurator;

public final class Hard4TardisButEasy4EvoConfigurator implements OptionsConfigurator {
	@Override
	public void configure(Options o) {
		final String targetClass = "synergy/Hard4TardisButEasy4Evo";
		//final String targetMethodDescriptor = "()I";
		//final String targetMethodName  = "hard4TardisButEasy4Evo";

		final int maxDepth = 1000;
		final int numOfThreadsJBSE = 1;
		final int numOfThreadsEvosuite = 1;
		final int numTargetsEvosuiteJob = 2;
		final float throttleFactorEvosuite = 1.0f;
		final long timeBudgetDuration = 10;
		final TimeUnit timeBudgetTimeUnit = TimeUnit.MINUTES;

		o.setTmpDirectoryBase(Settings.TMP_BASE_PATH);
		o.setJava8Home(Settings.JAVA8_HOME);
		o.setZ3Path(Settings.Z3_PATH);
		o.setJBSELibraryPath(Settings.JBSE_PATH);
		o.setClassesPath(Settings.BIN_PATH);
		o.setOutDirectory(Settings.OUT_PATH);
		o.setSushiLibPath(Settings.SUSHI_LIB_PATH);
		o.setEvosuitePath(Settings.EVOSUITE_PATH);
	    o.setEvosuiteNoDependency(true);

	    o.setTargetClass(targetClass);
		//o.setTargetMethod(targetClass, targetMethodDescriptor, targetMethodName);
		//o.setInitialTestCase(initialTestClass, initialTestMethodDescriptor, initialTestMethodName);
		//o.setInitialTestCasePath(Settings.EXAMPLES_PATH);
		
		o.setMaxDepth(maxDepth);
		o.setMaxTestCaseDepth(maxDepth);
		o.setNumOfThreadsJBSE(numOfThreadsJBSE);
		o.setNumOfThreadsEvosuite(numOfThreadsEvosuite);
		o.setNumTargetsEvosuitePerJob(numTargetsEvosuiteJob);
		o.setNumTargetsEvosuiteOverloaded(10);
		o.setThrottleFactorEvosuite(throttleFactorEvosuite);
		o.setGlobalTimeBudgetDuration(timeBudgetDuration);
		o.setGlobalTimeBudgetUnit(timeBudgetTimeUnit);
		o.setEvosuiteMultiSearch(true);
		o.setMaximumElapsedWithoutPathConditions(10);		
		o.setUseIndexInfeasibility(false);
		o.setUseIndexNovelty(false);
		o.setIndexNoveltyBranchPattern("sinergy/Hard4TardisButEasy4Evo:.*:.*:.*:.*");
		o.setUseIndexImprovability(true);
		o.setIndexImprovabilityBranchPattern("sinergy/Hard4TardisButEasy4Evo:.*:.*:.*:.*");
	}
}
