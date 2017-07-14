public class Logger

{
	private static boolean isDebugEnable = true;
	private static boolean isInfoEnable = true;
	private static boolean isErrorEnable = true;

	private static String className = "";
 
	public Logger(@SuppressWarnings("rawtypes") Class clazz) {
		if (clazz != null) {
  		
			System.out.println("clazz.getCanonicalName(): "+clazz.getClass().getCanonicalName());
		try {
			className =  clazz.newInstance().getClass().getCanonicalName();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

	public void debug(String msg) {

		if (isDebugEnable())
			System.out.println("[" + className + "]" + msg);

	}

	public void info(String msg) {
		if (isInfoEnable())
			System.out.println("[" + className + "]" + msg);

	}

	public void error(String msg) {
		if (isErrorEnable())
			System.out.println("[" + className + "]" + msg);
	}

	public void error(String msg, Throwable throwable) {
		System.out.println("[" + className + "]" + msg);
		System.out.println(throwable.getMessage());
		throwable.printStackTrace();

	}

	private static boolean isDebugEnable() {
		return isDebugEnable;
	}

	private static void setDebugEnable(boolean isDebugEnable) {
		Logger.isDebugEnable = isDebugEnable;
	}

	private static boolean isInfoEnable() {
		return isInfoEnable;
	}

	private static void setInfoEnable(boolean isInfoEnable) {
		Logger.isInfoEnable = isInfoEnable;
	}

	private static boolean isErrorEnable() {
		return isErrorEnable;
	}

	private static void setErrorEnable(boolean isErrorEnable) {
		Logger.isErrorEnable = isErrorEnable;
	}

}
