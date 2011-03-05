package br.usp.ime.cg.automatedld.client;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestBuilder.Method;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.URL;
import com.google.gwt.user.client.Window;

public class HttpProxyRequestBuilder {

	private final Method method;
	private final String url;
	
	private final Map<String, Object> params = new HashMap<String, Object>();

	public HttpProxyRequestBuilder(Method method, String url) {
		this.method = method;
		this.url = url;
	}
	
	public HttpProxyRequestBuilder setParam(String param, Object value) {
		params.put(param, value);
		return this;
	}
	
	public Request sendRequest(String requestData, RequestCallback callback) {
		StringBuffer postBuilder = new StringBuffer();
		if (!params.isEmpty()) {
			postBuilder.append("?ajax=");
			postBuilder.append("true");
		}
		for (String key : params.keySet()) {
			postBuilder.append("&" + key + "=");
			postBuilder.append(URL.encodeComponent(params.get(key).toString()));
		}
		
		RequestBuilder requestBuilder = new RequestBuilder(method, url + postBuilder.toString());
		requestBuilder.setHeader("Content-type", "application/x-www-form-urlencoded");
		
		try {
			return requestBuilder.sendRequest(requestData, callback);
		} catch (RequestException e) {
			Window.alert("ERROR: " + e.getMessage() + " in HTTPProxyRequestBuilder");
			return null;
		}
	}
	
}
