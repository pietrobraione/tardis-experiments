package maps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import common.Settings;
import tardis.Main;
import tardis.Options;

public final class RunMaps {
	public static void main(String[] s) throws IOException {
		final String targetClass = "maps/Maps";
		final String targetMethodDescriptor = "(Ljava/util/HashMap;Ljava/lang/String;)I";
		final String targetMethodName  = "m";
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
		o.setJava8Home(Settings.JAVA8_HOME);
		o.setZ3Path(Settings.Z3_PATH);
		o.setJBSELibraryPath(Settings.JBSE_PATH);
		o.setClassesPath(Settings.BIN_PATH);
		o.setOutDirectory(Settings.OUT_PATH);
		o.setSushiLibPath(Settings.SUSHI_LIB_PATH);
		o.setEvosuitePath(Settings.EVOSUITE_PATH);
		o.setNumMOSATargets(5);
		o.setGlobalTimeBudgetDuration(timeBudgetDuration);
		o.setGlobalTimeBudgetUnit(timeBudgetTimeUnit);

		final Main m = new Main(o);
		m.start();
	}
}
