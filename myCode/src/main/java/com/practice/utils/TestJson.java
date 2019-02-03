//package com.practice.utils;
//
//import org.json.simple.JSONObject;
//import org.json.simple.JSONValue;
//
//
//public class TestJson
//{
//
//
//    public static void main(String args[]){
//        String input ="{ \"Version\": \"2012-10-17\", \"Statement\": [ { \"Effect\": \"Deny\", \"Principal\": \"*\", \"Action\": \"*\", \"Resource\": \"arn:aws:s3:::gimlet-dev/*\", \"Condition\": { \"Bool\": { \"aws:SecureTransport\": \"false\" } } } ] }";
//        JSONObject object   =(JSONObject) JSONValue.parse( input );
//
//        object.toJSONString();
//
//
//
//    }
//}
