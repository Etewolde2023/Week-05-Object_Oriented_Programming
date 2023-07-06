package codingAssignment;

public class AsteriskLogger implements Logger {
	@Override
	public void log(String log) {		
		System.out.println("***" + log + "***");
		
	}
	@Override
	public void error(String error) {
		String newline = System.lineSeparator();
		System.out.println("****************" + newline  + "***" + error + "***" + newline + "****************");
		
	
		
		
	}

}
