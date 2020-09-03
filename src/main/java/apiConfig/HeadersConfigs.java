package apiConfig;

import java.util.HashMap;
import java.util.Map;

public class HeadersConfigs {

	public Map<String ,String> defaultHeaders(){
		
		Map<String, String> defaultHeaders =new HashMap<String, String>();
		defaultHeaders.put("Content-Type", "application/json; charset=utf-8");
		defaultHeaders.put("Test key", "TEST VALUE");
		return defaultHeaders;
	}
	
public Map<String ,String> headerWithToken(){
		
		Map<String, String> defaultHeaders =new HashMap<String, String>();
		defaultHeaders.put("Content-Type", "application/json; charset=utf-8");
		defaultHeaders.put("Access-Token", "gfsafgaskfaslfiaskfgas");
		defaultHeaders.put("Accesshgsfs-Token", "lksjdlskdskgfsafgaskfaslfiaskfgas");
		defaultHeaders.put("Access-Token", "test");
		return defaultHeaders;
	}

 public static void main(String[] args) {
	 HeadersConfigs hed = new HeadersConfigs();
	 
	 System.out.println(hed.defaultHeaders());
}
}
