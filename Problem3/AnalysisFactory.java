public class AnalysisFactory{
	Logging logfile;
	public Logging getLogType(String type){
		
		if (type.equalsIgnoreCase("text")){
			logfile = new LogText();
		}
		else if (type.equalsIgnoreCase("xml")){
			logfile = new LogXML();
		}
		else if (type.equalsIgnoreCase("html"))
			logfile = new LogHTML();
		else if (type.equalsIgnoreCase("md"))
			logfile = new LogMD();
		else
			logfile = new LogText();
		return logfile;	
	}
}
