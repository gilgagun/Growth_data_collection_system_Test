package com.example.myapplication;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class SttRequest extends StringRequest {
    //서버 URL 설정(php 파일 연동)
    final static private String URL = "http://ksm2853305.ivyro.net/join.php";
    private Map<String, String> parameters;
    // STT 텍스트 저장에 필요한 정보
    public SttRequest(String text, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);

        parameters = new HashMap<>();
        parameters.put("text", text);

    }

    @Override
    public Map<String, String> getParams() throws AuthFailureError {
        return parameters;
    }
}
