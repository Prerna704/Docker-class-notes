package com.example;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, String> data = new HashMap<>();
        data.put("app", "Shade Demo");
        data.put("status", "Uber JAR Created Successfully");

        Gson gson = new Gson();
        String json = gson.toJson(data);

        System.out.println(json);
    }
}