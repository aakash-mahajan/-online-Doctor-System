package com.aakash.ods;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;



public class RegisterRequest extends StringRequest {

    private static final   String REGISTER_REQUEST_URL="Enter your 000webhost URl here";
    private Map<String,String> params;

    public RegisterRequest(String name, String email, String phone, String password , Response.Listener<String>listener){
        super(Method.POST,REGISTER_REQUEST_URL,listener,null);
        params=new HashMap<>();
        params.put("name",name);

        params.put("password",password);
        params.put("phone", phone);
        params.put("email",email);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
