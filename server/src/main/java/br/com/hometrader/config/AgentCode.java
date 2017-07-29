package br.com.hometrader.config;

public class AgentCode {
	
	private static final ThreadLocal<String> agentCode = new ThreadLocal<>();

	public static String get() {
		return agentCode.get();
	}


	public static void set(String pAgentCode){
		agentCode.set(pAgentCode);
	}

	public static void close(){
		agentCode.remove();
	}
	
}
