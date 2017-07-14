
public class LoggerAccess {

	private static Logger log = new Logger(LoggerAccess.class);
	
	public static void main(String[] args) {
		
		log.debug("in main()");
		LoggerAccess l=new LoggerAccess();
		l.register();
		System.out.println(System.getProperty("java.runtime.version"));
		
		
	}
	public  void register()
	{
		
		log.debug("In register()");
		
	}
	
}
