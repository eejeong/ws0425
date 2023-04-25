package com.kbstar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.Random;
@RestController
public class ChartController {
    @RequestMapping("/chart0301")
    public  Object chart0301(){
        // [[], []]
        JSONArray ja = new JSONArray();
        for(int i=1; i<=5; i++){
            Random r = new Random();
            int num = r.nextInt(20)+1;
            JSONArray jadata = new JSONArray();
            jadata.add("data:"+num);
            jadata.add(num);
            ja.add(jadata);
        }
        return ja;
    }
    @RequestMapping("/chart0302")
    public Object chart0302(){
        // [ [],[] ] - 배열 안의 배열
        JSONArray ja = new JSONArray();
        for(int i = 1; i <=5; i++){
            Random r = new Random();
            int num = r.nextInt(50) + 11;
            JSONArray jadata = new JSONArray();
            jadata.add("city" + num);
            jadata.add(num);
            ja.add(jadata);
        }
        return ja;
    }

}