package com.github.bluedreamteng.fiddlerrequest;

import org.apache.commons.lang3.StringUtils;

import java.util.LinkedHashMap;
import java.util.Map;

public class FiddlerRequest {
    private final String requestType;

    private final String requestUrl;

    private final Map<String, String> requestHeaders = new LinkedHashMap<>();

    private String requestBody = "";

    public FiddlerRequest(String sessionContent) throws ParseException {
        try {
            String[] sessionSegments = sessionContent.split("(HTTP/1.1) ([0-9]{3}) ([A-Z]+)");
            String requestContentsString = StringUtils.chomp(sessionSegments[0].trim());
            String[] requestContents = requestContentsString.split("\n\n");
            String[] requestHeaderSegments = requestContents[0].split("\n");
            String[] requestAddress = requestHeaderSegments[0].split(" ");
            requestType = requestAddress[0];
            requestUrl = requestAddress[1];
            for (int i = 1; i < requestHeaderSegments.length; i++) {
                String requestHeader = requestHeaderSegments[i];
                String[] requestHeaderKeyValue = requestHeader.split(": ");
                String requestHeaderKey = requestHeaderKeyValue[0].trim();
                String requestHeaderValue = requestHeaderKeyValue[1].replaceAll("\n", "").trim();
                this.requestHeaders.put(requestHeaderKey, requestHeaderValue);
            }
            if (requestContents.length > 1) {
                requestBody = StringUtils.chomp(requestContents[1]).trim();
            }
        } catch (Exception e) {
            throw new ParseException("请求解析错误");
        }
    }

    public String getRequestType() {
        return requestType;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public String getRequestBody() {
        return requestBody;
    }

    public Map<String, String> getRequestHeaders() {
        return requestHeaders;
    }

    public String convertToRestClientRequest() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("###\n");
        stringBuilder.append(getRequestType()).append(" ").append(getRequestUrl()).append("\n");
        for (Map.Entry<String, String> stringStringEntry : getRequestHeaders().entrySet()) {
            stringBuilder.append(stringStringEntry.getKey()).append(": ").append(stringStringEntry.getValue()).append( "\n");
        }
        if(StringUtils.isNotEmpty(getRequestBody())) {
            stringBuilder.append("\n");
            stringBuilder.append(getRequestBody());
        }
        return StringUtils.chomp(stringBuilder.toString());
    }
}