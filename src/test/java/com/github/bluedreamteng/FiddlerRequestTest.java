package com.github.bluedreamteng;

import com.github.bluedreamteng.fiddlerrequest.FiddlerRequest;
import com.github.bluedreamteng.fiddlerrequest.ParseException;
import org.junit.Assert;
import org.junit.Test;


public class FiddlerRequestTest {

    @Test
    public void fiddlerRequest_singleGet() throws ParseException {
        String sessionContent = "GET http://192.168.1.65/v4.0/meter/common/finModelNoLink?type=%E6%B8%A9%E5%BA%A6%E9%9D%A2%E6%9D%BF HTTP/1.1\n" +
                "Host: 192.168.1.65\n" +
                "Connection: keep-alive\n" +
                "Accept: application/json, text/plain, */*\n" +
                "Authorization: Bearer 0a0c2c0a-8844-4b70-ab75-ebf13ed22374\n" +
                "User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36\n" +
                "Referer: http://192.168.1.65/web-meter/\n" +
                "Accept-Encoding: gzip, deflate\n" +
                "Accept-Language: zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7,pl;q=0.6\n" +
                "Cookie: loginToken=0a0c2c0a-8844-4b70-ab75-ebf13ed22374; refresh_token=efa16c64-7777-46e7-992e-65661ab57ff8; loginToken_msg=0a0c2c0a-8844-4b70-ab75-ebf13ed22374; refresh_token_msg=efa16c64-7777-46e7-992e-65661ab57ff8\n" +
                "\n";
        FiddlerRequest fiddlerRequest = new FiddlerRequest(sessionContent);
        String expectResult = "###\n" +
                "GET http://192.168.1.65/v4.0/meter/common/finModelNoLink?type=%E6%B8%A9%E5%BA%A6%E9%9D%A2%E6%9D%BF\n" +
                "Host: 192.168.1.65\n" +
                "Connection: keep-alive\n" +
                "Accept: application/json, text/plain, */*\n" +
                "Authorization: Bearer 0a0c2c0a-8844-4b70-ab75-ebf13ed22374\n" +
                "User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36\n" +
                "Referer: http://192.168.1.65/web-meter/\n" +
                "Accept-Encoding: gzip, deflate\n" +
                "Accept-Language: zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7,pl;q=0.6\n" +
                "Cookie: loginToken=0a0c2c0a-8844-4b70-ab75-ebf13ed22374; refresh_token=efa16c64-7777-46e7-992e-65661ab57ff8; loginToken_msg=0a0c2c0a-8844-4b70-ab75-ebf13ed22374; refresh_token_msg=efa16c64-7777-46e7-992e-65661ab57ff8\n";
        String result = fiddlerRequest.convertToRestClientRequest();
        Assert.assertEquals(expectResult, result);
    }


    @Test
    public void fiddlerRequest_singlePost() throws ParseException {
        String sessionContent = "PUT http://192.168.1.65/v4.0/maintain/organization/updateDepartment HTTP/1.1\n" +
                "Host: 192.168.1.65\n" +
                "Connection: keep-alive\n" +
                "Content-Length: 108\n" +
                "Accept: application/json, text/plain, */*\n" +
                "Authorization: Bearer 0a0c2c0a-8844-4b70-ab75-ebf13ed22374\n" +
                "User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36\n" +
                "Content-Type: application/json;charset=UTF-8\n" +
                "Origin: http://192.168.1.65\n" +
                "Referer: http://192.168.1.65/web-maintain/\n" +
                "Accept-Encoding: gzip, deflate\n" +
                "Accept-Language: zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7,pl;q=0.6\n" +
                "Cookie: loginToken=0a0c2c0a-8844-4b70-ab75-ebf13ed22374; refresh_token=efa16c64-7777-46e7-992e-65661ab57ff8; loginToken_msg=0a0c2c0a-8844-4b70-ab75-ebf13ed22374; refresh_token_msg=efa16c64-7777-46e7-992e-65661ab57ff8\n" +
                "\n" +
                "{\"code\":\"001002\",\"dutyName\":\"\",\"attribute\":5,\"wcId\":1,\"memo\":\"\",\"name\":\"一部门1112\",\"level\":2,\"number\":1}";
        FiddlerRequest fiddlerRequest = new FiddlerRequest(sessionContent);
        String expectResult = "###\n" +
                "PUT http://192.168.1.65/v4.0/maintain/organization/updateDepartment\n" +
                "Host: 192.168.1.65\n" +
                "Connection: keep-alive\n" +
                "Content-Length: 108\n" +
                "Accept: application/json, text/plain, */*\n" +
                "Authorization: Bearer 0a0c2c0a-8844-4b70-ab75-ebf13ed22374\n" +
                "User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36\n" +
                "Content-Type: application/json;charset=UTF-8\n" +
                "Origin: http://192.168.1.65\n" +
                "Referer: http://192.168.1.65/web-maintain/\n" +
                "Accept-Encoding: gzip, deflate\n" +
                "Accept-Language: zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7,pl;q=0.6\n" +
                "Cookie: loginToken=0a0c2c0a-8844-4b70-ab75-ebf13ed22374; refresh_token=efa16c64-7777-46e7-992e-65661ab57ff8; loginToken_msg=0a0c2c0a-8844-4b70-ab75-ebf13ed22374; refresh_token_msg=efa16c64-7777-46e7-992e-65661ab57ff8\n" +
                "\n" +
                "{\"code\":\"001002\",\"dutyName\":\"\",\"attribute\":5,\"wcId\":1,\"memo\":\"\",\"name\":\"一部门1112\",\"level\":2,\"number\":1}";
        String result = fiddlerRequest.convertToRestClientRequest();
        Assert.assertEquals(expectResult, result);
    }

}