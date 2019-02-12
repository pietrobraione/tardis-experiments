package priority;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import common.Settings;
import tardis.Main;
import tardis.Options;

public class RunPriority {
	public static void main(String[] s) throws IOException {
		final String className = "priority/Priority";
		final String parametersSignature = "(IIIIIIII)Z";
		final String methodName  = "getBool";
		final int maxDepth = 50;
		final int numOfThreads = 5;
		final long timeBudgetDuration = 10;
		final TimeUnit timeBudgetTimeUnit = TimeUnit.MINUTES;

 		final Options o = new Options();
		o.setTargetMethod(className, parametersSignature, methodName);
		o.setMaxDepth(maxDepth);
		o.setNumOfThreads(numOfThreads);
		o.setTmpDirectoryBase(Settings.TMP_BASE_PATH);
		o.setZ3Path(Settings.Z3_PATH);
		o.setJBSELibraryPath(Settings.JBSE_PATH);
		o.setClassesPath(Settings.BIN_PATH);
		o.setOutDirectory(Settings.OUT_PATH);
		o.setSushiLibPath(Settings.SUSHI_LIB_PATH);
		o.setEvosuitePath(Settings.EVOSUITE_MOSA_PATH);
		o.setUseMOSA(true);
		o.setNumMOSATargets(1);
		o.setGlobalTimeBudgetDuration(timeBudgetDuration);
		o.setGlobalTimeBudgetUnit(timeBudgetTimeUnit);

 		final Main m = new Main(o);
		m.start();
	}
}
