package br.com.jiankowalsi.loja.http;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {

    @Override
    public void post(String url, Map<String, Object> dados) {
        try {
            var urlDaApi = new URL(url);
            URLConnection connnetion = urlDaApi.openConnection();
            connnetion.connect();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao enviar os dados ", e);
        }
        
    }
    
}
