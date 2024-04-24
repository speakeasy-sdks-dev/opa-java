/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.styra.opa.sdk.utils;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpRequest.BodyPublishers;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

public class HTTPRequest {

    private final String baseURL;
    private final String method;
    private final List<NameValuePair> queryParams = new ArrayList<>();
    private final Map<String, List<String>> headers = new HashMap<>();
    private Optional<SerializedBody> body = Optional.empty(); // mutable

    public HTTPRequest(String baseURL, String method) {
        Utils.checkNotNull(baseURL, "baseURL");
        Utils.checkNotNull(method, "method");
        this.baseURL = baseURL;
        this.method = method;
    }
    
    public void setBody(Optional<SerializedBody> body) {
        Utils.checkNotNull(body, "body");
        this.body = body;
    }
    
    public HTTPRequest addHeader(String key, String value) {
        List<String> headerValues = headers.get(key);
        if (headerValues == null) {
            headerValues = new ArrayList<>();
            headers.put(key, headerValues);
        }
        headerValues.add(value);
        return this;
    }
    
    public HTTPRequest addHeaders(Map<String, List<String>> map) {
        map.forEach((key, list) -> list.forEach(v -> addHeader(key, v)));
        return this;
    }
    
    public HTTPRequest addQueryParam(String name, String value) {
        addQueryParam(new BasicNameValuePair(name, value));
        return this;
    }

    public HTTPRequest addQueryParam(NameValuePair param) {
        this.queryParams.add(param);
        return this;
    }
    
    public HTTPRequest addQueryParams(Collection<NameValuePair> params) {
        params.forEach(p -> addQueryParam(p));
        return this;
    }

    public HttpRequest build() {
        HttpRequest.Builder requestBuilder = HttpRequest.newBuilder();

        final BodyPublisher bodyPublisher;
        if (body.isPresent()) {
            bodyPublisher = body.get().body();
            requestBuilder.header("Content-Type", body.get().contentType());
        } else {
            bodyPublisher = BodyPublishers.noBody();
        }
        requestBuilder.method(method, bodyPublisher);
        requestBuilder.uri(resolveURL());

        headers.forEach((k, list) -> list.forEach(v -> requestBuilder.header(k, v)));
        return requestBuilder.build();
    }

    private URI resolveURL() {
        String url = this.baseURL;
        if (queryParams != null && queryParams.size() > 0) {
            url += "?" + URLEncodedUtils.format(queryParams, StandardCharsets.UTF_8);
        }
        return URI.create(url);
    }
}