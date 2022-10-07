package com.github.bluedreamteng;

import com.github.bluedreamteng.fiddlerrequest.FiddlerRequest;
import com.github.bluedreamteng.fiddlerrequest.ParseException;
import com.github.bluedreamteng.fiddlerrequest.RequestConvertConfig;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;


public class FiddlerRequestTest {

    @Test
    public void fiddlerRequest_get() throws ParseException {
        String sessionContent =
                "GET http://192.168.1.65/v4.0/meter/panelMonitor/findTemperaturePanelCurrentData?pageIndex=1&pageSize=20&sortName=&sortType=&treeId=001&treeLevel=1&communicateType=2&menuId=0525&save=false&type=0&uniqueIds= HTTP/1.1\n" +
                "Host: 192.168.1.65\n" +
                "Connection: keep-alive\n" +
                "Accept: application/json, text/plain, */*\n" +
                "Authorization: Bearer 1a90ce59-6592-4ba5-a43e-1970a78d5425\n" +
                "User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36\n" +
                "Referer: http://192.168.1.65/web-meter/\n" +
                "Accept-Encoding: gzip, deflate\n" +
                "Accept-Language: zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7,pl;q=0.6\n" +
                "Cookie: loginToken=1a90ce59-6592-4ba5-a43e-1970a78d5425; refresh_token=300ed705-d4c0-4cdb-ba22-5e7f04163b2c; loginToken_msg=1a90ce59-6592-4ba5-a43e-1970a78d5425; refresh_token_msg=300ed705-d4c0-4cdb-ba22-5e7f04163b2c; sidebarStatus=1\n" +
                "\n" +
                "\n" +
                "HTTP/1.1 200 OK\n" +
                "Server: nginx\n" +
                "Date: Mon, 26 Sep 2022 06:39:07 GMT\n" +
                "Content-Type: application/json;charset=UTF-8\n" +
                "Connection: keep-alive\n" +
                "X-Content-Type-Options: nosniff\n" +
                "X-XSS-Protection: 1; mode=block\n" +
                "Cache-Control: no-cache, no-store, max-age=0, must-revalidate\n" +
                "Pragma: no-cache\n" +
                "Expires: 0\n" +
                "Cache-Control: no-cache\n" +
                "Access-Control-Allow-Origin: *\n" +
                "Access-Control-Allow-Methods: PUT, DELETE, GET, POST, OPTIONS, PATCH\n" +
                "Access-Control-Allow-Headers: DNT,X-Mx-ReqToken,Keep-Alive,User-Agent,X-Requested-With,If-Modified-Since,Cache-Control,Content-Type,Authorization\n" +
                "X-Frame-Options: SAMEORIGIN\n" +
                "Content-Length: 17080\n" +
                "\n" +
                "{\"resultCode\":0,\"message\":\"操作成功\",\"data\":{\"total\":772,\"pageCount\":39,\"pageIndex\":1,\"param\":true,\"listCode\":null,\"pageSize\":20,\"sortName\":\"\",\"sortType\":\"\",\"data\":[{\"reason\":\"网络设备掉线\",\"chargeState\":\"未缴纳\",\"householder\":\"232\",\"readTime\":null,\"heatExchangeStationName\":\"12集中器站\",\"householdName\":\"301\",\"collector\":null,\"timeout\":1000,\"stateName\":false,\"netEqu\":\"123400011\",\"temperature\":null,\"heatingArea\":686.00,\"humidity\":null,\"model\":\"test-MB-0011\",\"canReadMeter\":false,\"state\":1,\"floor\":3,\"communicateType\":2,\"signal\":null,\"batteryLevel\":null,\"factory\":\"test11\",\"stateMsg\":\"2020-05-22 13:57:00 :\",\"buildName\":\"01号楼\",\"unitName\":\"1单元\",\"panel_stateCode\":null,\"isFault\":true,\"paneType\":\"温控\",\"netEquFactory\":\"瑞纳\",\"serialNo\":\"93130905\",\"heatingState\":\"开通\",\"phoneNumber\":\"\",\"isAlarm\":false,\"planTime\":\"2020-05-22 13:57:00\",\"equTime\":null,\"compensation\":1.00,\"position\":\"12集中器小区-01号楼-1单元-301\",\"detailPosition\":\"\",\"inHousingName\":\"12集中器小区\",\"uniqueId\":307},{\"reason\":null,\"chargeState\":\"未缴纳\",\"householder\":\"101\",\"readTime\":\"2022-03-08 10:00:28\",\"heatExchangeStationName\":\"12集中器站\",\"householdName\":\"101\",\"collector\":null,\"timeout\":60000,\"stateName\":true,\"netEqu\":\"77000001\",\"temperature\":\"18.70\",\"heatingArea\":686.00,\"humidity\":null,\"model\":\"test-MB-0011\",\"canReadMeter\":false,\"state\":2,\"floor\":1,\"communicateType\":2,\"signal\":null,\"batteryLevel\":null,\"factory\":\"test11\",\"stateMsg\":\"2022-03-08 10:00:00 :\",\"buildName\":\"01号楼\",\"unitName\":\"2单元\",\"panel_stateCode\":\"00\",\"isFault\":false,\"paneType\":\"温控\",\"netEquFactory\":\"瑞纳\",\"serialNo\":\"04234749\",\"heatingState\":\"报停\",\"phoneNumber\":\"\",\"isAlarm\":true,\"planTime\":\"2022-03-08 10:00:00\",\"equTime\":\"2022-03-08 10:00:28\",\"compensation\":1.00,\"position\":\"12集中器小区-01号楼-2单元-101\",\"detailPosition\":\"\",\"inHousingName\":\"12集中器小区\",\"uniqueId\":1450},{\"reason\":\"设备未读\",\"chargeState\":\"未缴纳\",\"householder\":\"102\",\"readTime\":\"2022-02-18 16:10:20\",\"heatExchangeStationName\":\"12集中器站\",\"householdName\":\"102\",\"collector\":null,\"timeout\":60000,\"stateName\":false,\"netEqu\":\"77000001\",\"temperature\":\"-99.90\",\"heatingArea\":686.00,\"humidity\":null,\"model\":\"test-MB-0011\",\"canReadMeter\":false,\"state\":4,\"floor\":1,\"communicateType\":2,\"signal\":null,\"batteryLevel\":null,\"factory\":\"test11\",\"stateMsg\":\"\",\"buildName\":\"01号楼\",\"unitName\":\"2单元\",\"panel_stateCode\":\"00\",\"isFault\":false,\"paneType\":\"温控\",\"netEquFactory\":\"瑞纳\",\"serialNo\":\"04234723\",\"heatingState\":\"开通\",\"phoneNumber\":\"\",\"isAlarm\":false,\"planTime\":\"2022-02-18 16:10:00\",\"equTime\":\"2022-02-18 16:10:20\",\"compensation\":1.00,\"position\":\"12集中器小区-01号楼-2单元-102\",\"detailPosition\":\"\",\"inHousingName\":\"12集中器小区\",\"uniqueId\":1451},{\"reason\":null,\"chargeState\":\"未缴纳\",\"householder\":\"301\",\"readTime\":null,\"heatExchangeStationName\":\"12集中器站\",\"householdName\":\"301\",\"collector\":null,\"timeout\":60000,\"stateName\":false,\"netEqu\":\"77000001\",\"temperature\":null,\"heatingArea\":686.00,\"humidity\":null,\"model\":\"test-MB-0011\",\"canReadMeter\":true,\"state\":1,\"floor\":3,\"communicateType\":2,\"signal\":null,\"batteryLevel\":null,\"factory\":\"test11\",\"stateMsg\":\"2021-10-13 15:55:50 :\",\"buildName\":\"01号楼\",\"unitName\":\"2单元\",\"panel_stateCode\":null,\"isFault\":true,\"paneType\":\"测温\",\"netEquFactory\":\"瑞纳\",\"serialNo\":\"04234742\",\"heatingState\":\"开通\",\"phoneNumber\":\"\",\"isAlarm\":false,\"planTime\":\"2021-10-13 15:55:50\",\"equTime\":null,\"compensation\":0.00,\"position\":\"12集中器小区-01号楼-2单元-301\",\"detailPosition\":\"\",\"inHousingName\":\"12集中器小区\",\"uniqueId\":1456},{\"reason\":null,\"chargeState\":\"未缴纳\",\"householder\":\"jrx\",\"readTime\":null,\"heatExchangeStationName\":\"12集中器站\",\"householdName\":\"11\",\"collector\":null,\"timeout\":1000,\"stateName\":true,\"netEqu\":\"1028001\",\"temperature\":\"18.89\",\"heatingArea\":686.00,\"humidity\":null,\"model\":\"test-MB-0011\",\"canReadMeter\":true,\"state\":1,\"floor\":11,\"communicateType\":2,\"signal\":null,\"batteryLevel\":null,\"factory\":\"test11\",\"stateMsg\":\"2022-01-06 09:40:00 :\",\"buildName\":\"01号楼\",\"unitName\":\"3单元\",\"panel_stateCode\":null,\"isFault\":true,\"paneType\":\"测温\",\"netEquFactory\":\"test11\",\"serialNo\":\"123jrx\",\"heatingState\":\"开通\",\"phoneNumber\":\"\",\"isAlarm\":false,\"planTime\":\"2022-01-06 09:40:00\",\"equTime\":null,\"compensation\":0.00,\"position\":\"12集中器小区-01号楼-3单元-11\",\"detailPosition\":\"\",\"inHousingName\":\"12集中器小区\",\"uniqueId\":1521},{\"reason\":null,\"chargeState\":\"未缴纳\",\"householder\":\"10\",\"readTime\":null,\"heatExchangeStationName\":\"tst\",\"householdName\":\"10\",\"collector\":null,\"timeout\":1000,\"stateName\":true,\"netEqu\":\"12131\",\"temperature\":null,\"heatingArea\":805.00,\"humidity\":null,\"model\":\"RU-TC-02\",\"canReadMeter\":false,\"state\":1,\"floor\":10,\"communicateType\":2,\"signal\":null,\"batteryLevel\":null,\"factory\":\"瑞纳\",\"stateMsg\":\"2020-06-23 14:33:00 :\",\"buildName\":\"1楼\",\"unitName\":\"1单元\",\"panel_stateCode\":null,\"isFault\":true,\"paneType\":\"温控\",\"netEquFactory\":\"test11\",\"serialNo\":\"99\",\"heatingState\":\"开通\",\"phoneNumber\":\"\",\"isAlarm\":false,\"planTime\":\"2020-06-23 14:33:00\",\"equTime\":null,\"compensation\":1.00,\"position\":\"1小区-1楼-1单元-10\",\"detailPosition\":\"\",\"inHousingName\":\"1小区\",\"uniqueId\":400},{\"reason\":null,\"chargeState\":\"未缴纳\",\"householder\":\"\",\"readTime\":null,\"heatExchangeStationName\":\"2021060311\",\"householdName\":\"211626\",\"collector\":null,\"timeout\":1000,\"stateName\":false,\"netEqu\":\"20210621\",\"temperature\":null,\"heatingArea\":111.00,\"humidity\":null,\"model\":\"RU-TC-02\",\"canReadMeter\":false,\"state\":1,\"floor\":1,\"communicateType\":2,\"signal\":null,\"batteryLevel\":null,\"factory\":\"瑞纳\",\"stateMsg\":\"2021-06-21 16:27:30 :\",\"buildName\":\"1\",\"unitName\":\"2\",\"panel_stateCode\":null,\"isFault\":true,\"paneType\":\"温控\",\"netEquFactory\":\"test11\",\"serialNo\":\"11\",\"heatingState\":\"未开户\",\"phoneNumber\":\"\",\"isAlarm\":false,\"planTime\":\"2021-06-21 16:27:30\",\"equTime\":null,\"compensation\":1.00,\"position\":\"2021060711-1-2-211626\",\"detailPosition\":\"\",\"inHousingName\":\"2021060711\",\"uniqueId\":792},{\"reason\":\"网络设备掉线\",\"chargeState\":\"未缴纳\",\"householder\":\"客户111\",\"readTime\":\"2022-07-04 19:32:47\",\"heatExchangeStationName\":\"A站1\",\"householdName\":\"*02\",\"collector\":null,\"timeout\":1000,\"stateName\":false,\"netEqu\":\"123400011\",\"temperature\":\"23.00\",\"heatingArea\":111.00,\"humidity\":null,\"model\":\"OCC-1111\",\"canReadMeter\":true,\"state\":1,\"floor\":1,\"communicateType\":2,\"signal\":null,\"batteryLevel\":null,\"factory\":\"德宝\",\"stateMsg\":\"2022-07-14 10:32:47 :\",\"buildName\":\"1#\",\"unitName\":\"1单元\",\"panel_stateCode\":null,\"isFault\":true,\"paneType\":\"测温\",\"netEquFactory\":\"瑞纳\",\"serialNo\":\"0819001\",\"heatingState\":\"开通\",\"phoneNumber\":\"\",\"isAlarm\":false,\"planTime\":\"2022-07-14 10:32:47\",\"equTime\":\"2022-07-04 19:32:47\",\"compensation\":0.00,\"position\":\"4234-1#-1单元-*02\",\"detailPosition\":\"\",\"inHousingName\":\"4234\",\"uniqueId\":1382},{\"reason\":null,\"chargeState\":\"未缴纳\",\"householder\":\"423423\",\"readTime\":null,\"heatExchangeStationName\":\"A站1\",\"householdName\":\"102\",\"collector\":null,\"timeout\":1000,\"stateName\":true,\"netEqu\":\"0408\",\"temperature\":null,\"heatingArea\":111.00,\"humidity\":null,\"model\":\"RU-TC-02\",\"canReadMeter\":false,\"state\":1,\"floor\":1,\"communicateType\":2,\"signal\":null,\"batteryLevel\":null,\"factory\":\"瑞纳\",\"stateMsg\":\"2020-06-18 13:59:00 :\",\"buildName\":\"1#\",\"unitName\":\"1单元\",\"panel_stateCode\":null,\"isFault\":true,\"paneType\":\"温控\",\"netEquFactory\":\"德宝\",\"serialNo\":\"222\",\"heatingState\":\"注销\",\"phoneNumber\":\"\",\"isAlarm\":false,\"planTime\":\"2020-06-18 13:59:00\",\"equTime\":null,\"compensation\":1.00,\"position\":\"4234-1#-1单元-102\",\"detailPosition\":\"\",\"inHousingName\":\"4234\",\"uniqueId\":387},{\"reason\":null,\"chargeState\":\"未缴纳\",\"householder\":\"通断时间面积法\",\"readTime\":null,\"heatExchangeStationName\":\"A4站\",\"householdName\":\"206\",\"collector\":null,\"timeout\":\"5000\",\"stateName\":true,\"netEqu\":\"A001改\",\"temperature\":null,\"heatingArea\":9898.00,\"humidity\":null,\"model\":\"888\",\"canReadMeter\":false,\"state\":1,\"floor\":2,\"communicateType\":2,\"signal\":null,\"batteryLevel\":null,\"factory\":\"test11\",\"stateMsg\":\"2020-06-10 16:06:00 :\",\"buildName\":\"A2楼-通断时间面积\",\"unitName\":\"二单元\",\"panel_stateCode\":null,\"isFault\":true,\"paneType\":\"通断时间\",\"netEquFactory\":\"瑞纳\",\"serialNo\":\"0618555\",\"heatingState\":\"开通\",\"phoneNumber\":\"18226642545\",\"isAlarm\":false,\"planTime\":\"2020-06-10 16:06:00\",\"equTime\":null,\"compensation\":0.00,\"position\":\"A2小区-通断时间面积法-A2楼-通断时间面积-二单元-206\",\"detailPosition\":\"\",\"inHousingName\":\"A2小区-通断时间面积法\",\"uniqueId\":352},{\"reason\":\"网络设备掉线\",\"chargeState\":\"未缴纳\",\"householder\":\"207\",\"readTime\":null,\"heatExchangeStationName\":\"A4站\",\"householdName\":\"207\",\"collector\":null,\"timeout\":444,\"stateName\":false,\"netEqu\":\"A002\",\"temperature\":null,\"heatingArea\":9898.00,\"humidity\":null,\"model\":\"888\",\"canReadMeter\":false,\"state\":1,\"floor\":2,\"communicateType\":2,\"signal\":null,\"batteryLevel\":null,\"factory\":\"test11\",\"stateMsg\":\"2020-06-11 13:57:00 :\",\"buildName\":\"A2楼-通断时间面积\",\"unitName\":\"二单元\",\"panel_stateCode\":null,\"isFault\":true,\"paneType\":\"通断时间\",\"netEquFactory\":\"瑞纳\",\"serialNo\":\"23232\",\"heatingState\":\"开通\",\"phoneNumber\":\"\",\"isAlarm\":false,\"planTime\":\"2020-06-11 13:57:00\",\"equTime\":null,\"compensation\":0.00,\"position\":\"A2小区-通断时间面积法-A2楼-通断时间面积-二单元-207\",\"detailPosition\":\"\",\"inHousingName\":\"A2小区-通断时间面积法\",\"uniqueId\":357},{\"reason\":\"网络设备掉线\",\"chargeState\":\"未缴纳\",\"householder\":\"101\",\"readTime\":\"2020-07-30 18:10:00\",\"heatExchangeStationName\":\"A4站\",\"householdName\":\"101\",\"collector\":null,\"timeout\":444,\"stateName\":false,\"netEqu\":\"A002\",\"temperature\":null,\"heatingArea\":12354.00,\"humidity\":null,\"model\":\"RU-TC-02\",\"canReadMeter\":false,\"state\":1,\"floor\":1,\"communicateType\":2,\"signal\":null,\"batteryLevel\":null,\"factory\":\"瑞纳\",\"stateMsg\":\"2020-07-30 18:10:00 :\",\"buildName\":\"A3楼-温度面积法\",\"unitName\":\"三单元\",\"panel_stateCode\":null,\"isFault\":true,\"paneType\":\"温度面积\",\"netEquFactory\":\"瑞纳\",\"serialNo\":\"34343\",\"heatingState\":\"开通\",\"phoneNumber\":\"\",\"isAlarm\":false,\"planTime\":\"2020-07-30 18:10:00\",\"equTime\":\"2020-07-30 18:10:00\",\"compensation\":0.00,\"position\":\"A3小区-温度面积法-A3楼-温度面积法-三单元-101\",\"detailPosition\":\"\",\"inHousingName\":\"A3小区-温度面积法\",\"uniqueId\":385},{\"reason\":null,\"chargeState\":\"未缴纳\",\"householder\":\"103\",\"readTime\":null,\"heatExchangeStationName\":\"A4站\",\"householdName\":\"103\",\"collector\":null,\"timeout\":\"5000\",\"stateName\":true,\"netEqu\":\"A001改\",\"temperature\":null,\"heatingArea\":12354.00,\"humidity\":null,\"model\":\"默认型号\",\"canReadMeter\":true,\"state\":1,\"floor\":1,\"communicateType\":2,\"signal\":null,\"batteryLevel\":null,\"factory\":\"百暖汇\",\"stateMsg\":\"2020-06-11 15:20:00 :\",\"buildName\":\"A3楼-温度面积法\",\"unitName\":\"三单元\",\"panel_stateCode\":null,\"isFault\":true,\"paneType\":\"测温\",\"netEquFactory\":\"瑞纳\",\"serialNo\":\"1222\",\"heatingState\":\"开通\",\"phoneNumber\":\"\",\"isAlarm\":false,\"planTime\":\"2020-06-11 15:20:00\",\"equTime\":null,\"compensation\":0.00,\"position\":\"A3小区-温度面积法-A3楼-温度面积法-三单元-103\",\"detailPosition\":\"\",\"inHousingName\":\"A3小区-温度面积法\",\"uniqueId\":363},{\"reason\":null,\"chargeState\":\"未缴纳\",\"householder\":\"客户2\",\"readTime\":null,\"heatExchangeStationName\":\"测试AI集中器\",\"householdName\":\"202\",\"collector\":null,\"timeout\":1000,\"stateName\":false,\"netEqu\":\"AI控制器1020\",\"temperature\":null,\"heatingArea\":120.00,\"humidity\":null,\"model\":\"百暖汇阀控\",\"canReadMeter\":true,\"state\":1,\"floor\":2,\"communicateType\":2,\"signal\":null,\"batteryLevel\":null,\"factory\":\"百暖汇\",\"stateMsg\":\"2022-08-17 10:23:50 :\",\"buildName\":\"1#\",\"unitName\":\"1单元\",\"panel_stateCode\":null,\"isFault\":true,\"paneType\":\"测温\",\"netEquFactory\":\"汇中\",\"serialNo\":\"1231\",\"heatingState\":\"开通\",\"phoneNumber\":\"\",\"isAlarm\":false,\"planTime\":\"2022-08-17 10:23:50\",\"equTime\":null,\"compensation\":2.00,\"position\":\"AI小区1-1#-1单元-202\",\"detailPosition\":\"\",\"inHousingName\":\"AI小区1\",\"uniqueId\":145479},{\"reason\":null,\"chargeState\":\"未缴纳\",\"householder\":\"VIP客户\",\"readTime\":null,\"heatExchangeStationName\":\"A4站\",\"householdName\":\"101\",\"collector\":null,\"timeout\":\"5000\",\"stateName\":true,\"netEqu\":\"A001改\",\"temperature\":null,\"heatingArea\":98745.00,\"humidity\":null,\"model\":\"RU-TC-02\",\"canReadMeter\":false,\"state\":3,\"floor\":1,\"communicateType\":2,\"signal\":null,\"batteryLevel\":null,\"factory\":\"瑞纳\",\"stateMsg\":\"2020-06-10 16:13:00 :/2020-06-10 16:13:00 :\",\"buildName\":\"A楼\",\"unitName\":\"A单元\",\"panel_stateCode\":null,\"isFault\":true,\"paneType\":\"温控\",\"netEquFactory\":\"瑞纳\",\"serialNo\":\"1131\",\"heatingState\":\"开通\",\"phoneNumber\":\"\",\"isAlarm\":true,\"planTime\":\"2020-06-10 16:13:00\",\"equTime\":null,\"compensation\":1.00,\"position\":\"A小区-热量表法-A楼-A单元-101\",\"detailPosition\":\"\",\"inHousingName\":\"A小区-热量表法\",\"uniqueId\":354},{\"reason\":null,\"chargeState\":\"未缴纳\",\"householder\":\"大客户\",\"readTime\":\"2020-09-10 08:00:00\",\"heatExchangeStationName\":\"A4站\",\"householdName\":\"202\",\"collector\":null,\"timeout\":\"5000\",\"stateName\":false,\"netEqu\":\"A001改\",\"temperature\":\"0.00\",\"heatingArea\":98745.00,\"humidity\":null,\"model\":\"RU-TC-02\",\"canReadMeter\":false,\"state\":1,\"floor\":2,\"communicateType\":2,\"signal\":null,\"batteryLevel\":null,\"factory\":\"瑞纳\",\"stateMsg\":\"2020-09-10 08:00:00 :\",\"buildName\":\"A楼\",\"unitName\":\"A单元\",\"panel_stateCode\":null,\"isFault\":true,\"paneType\":\"温控\",\"netEquFactory\":\"瑞纳\",\"serialNo\":\"061811\",\"heatingState\":\"开通\",\"phoneNumber\":\"\",\"isAlarm\":false,\"planTime\":\"2020-09-10 08:00:00\",\"equTime\":\"2020-09-10 08:00:00\",\"compensation\":1.00,\"position\":\"A小区-热量表法-A楼-A单元-202\",\"detailPosition\":\"\",\"inHousingName\":\"A小区-热量表法\",\"uniqueId\":391},{\"reason\":null,\"chargeState\":\"未缴纳\",\"householder\":\"301\",\"readTime\":null,\"heatExchangeStationName\":\"A4站\",\"householdName\":\"301\",\"collector\":null,\"timeout\":\"5000\",\"stateName\":true,\"netEqu\":\"A001改\",\"temperature\":null,\"heatingArea\":98745.00,\"humidity\":null,\"model\":\"RU-TC-02\",\"canReadMeter\":false,\"state\":1,\"floor\":3,\"communicateType\":2,\"signal\":null,\"batteryLevel\":null,\"factory\":\"瑞纳\",\"stateMsg\":\"2020-06-10 16:23:00 :\",\"buildName\":\"A楼\",\"unitName\":\"A单元\",\"panel_stateCode\":null,\"isFault\":true,\"paneType\":\"温控\",\"netEquFactory\":\"瑞纳\",\"serialNo\":\"HFM22\",\"heatingState\":\"开通\",\"phoneNumber\":\"\",\"isAlarm\":false,\"planTime\":\"2020-06-10 16:23:00\",\"equTime\":null,\"compensation\":1.00,\"position\":\"A小区-热量表法-A楼-A单元-301\",\"detailPosition\":\"\",\"inHousingName\":\"A小区-热量表法\",\"uniqueId\":356},{\"reason\":null,\"chargeState\":\"未缴纳\",\"householder\":\"401\",\"readTime\":null,\"heatExchangeStationName\":\"A4站\",\"householdName\":\"401\",\"collector\":null,\"timeout\":\"5000\",\"stateName\":true,\"netEqu\":\"A001改\",\"temperature\":null,\"heatingArea\":98745.00,\"humidity\":null,\"model\":\"RU-TC-02\",\"canReadMeter\":false,\"state\":1,\"floor\":4,\"communicateType\":2,\"signal\":null,\"batteryLevel\":null,\"factory\":\"瑞纳\",\"stateMsg\":\"2020-06-18 19:36:00 :\",\"buildName\":\"A楼\",\"unitName\":\"A单元\",\"panel_stateCode\":null,\"isFault\":true,\"paneType\":\"温控\",\"netEquFactory\":\"瑞纳\",\"serialNo\":\"1434343434\",\"heatingState\":\"开通\",\"phoneNumber\":\"\",\"isAlarm\":false,\"planTime\":\"2020-06-18 19:36:00\",\"equTime\":null,\"compensation\":1.00,\"position\":\"A小区-热量表法-A楼-A单元-401\",\"detailPosition\":\"\",\"inHousingName\":\"A小区-热量表法\",\"uniqueId\":393},{\"reason\":null,\"chargeState\":\"未缴纳\",\"householder\":\"过户0902-1\",\"readTime\":null,\"heatExchangeStationName\":\"wzj热力\",\"householdName\":\"101\",\"collector\":null,\"timeout\":1000,\"stateName\":false,\"netEqu\":\"W1\",\"temperature\":null,\"heatingArea\":100.00,\"humidity\":null,\"model\":\"888\",\"canReadMeter\":true,\"state\":1,\"floor\":1,\"communicateType\":2,\"signal\":null,\"batteryLevel\":null,\"factory\":\"test11\",\"stateMsg\":\"2022-09-15 18:20:37 :\",\"buildName\":\"1栋\",\"unitName\":\"1单元\",\"panel_stateCode\":null,\"isFault\":true,\"paneType\":\"测温\",\"netEquFactory\":\"test11\",\"serialNo\":\"W1\",\"heatingState\":\"关停\",\"phoneNumber\":\"13544669922\",\"isAlarm\":false,\"planTime\":\"2022-09-15 18:20:37\",\"equTime\":null,\"compensation\":0.00,\"position\":\"chz测试小区-1栋-1单元-101\",\"detailPosition\":\"\",\"inHousingName\":\"chz测试小区\",\"uniqueId\":145489},{\"reason\":null,\"chargeState\":\"未缴纳\",\"householder\":\"901kehu2\",\"readTime\":null,\"heatExchangeStationName\":\"23\",\"householdName\":\"11\",\"collector\":null,\"timeout\":1000,\"stateName\":false,\"netEqu\":\"4455\",\"temperature\":null,\"heatingArea\":254.00,\"humidity\":null,\"model\":\"百暖汇阀控\",\"canReadMeter\":true,\"state\":1,\"floor\":12,\"communicateType\":2,\"signal\":null,\"batteryLevel\":null,\"factory\":\"百暖汇\",\"stateMsg\":\"2022-05-07 14:30:58 :\",\"buildName\":\"2loudong\",\"unitName\":\"3\",\"panel_stateCode\":null,\"isFault\":true,\"paneType\":\"测温\",\"netEquFactory\":\"wl\",\"serialNo\":\"1\",\"heatingState\":\"开通\",\"phoneNumber\":\"13075587162\",\"isAlarm\":false,\"planTime\":\"2022-05-07 14:30:58\",\"equTime\":null,\"compensation\":0.00,\"position\":\"fewfew-2loudong-3-11\",\"detailPosition\":\"\",\"inHousingName\":\"fewfew\",\"uniqueId\":145463}],\"firstResults\":0}}\n";

        FiddlerRequest fiddlerRequest = new FiddlerRequest(sessionContent);
        assertEquals(fiddlerRequest.getRequestType(),"GET");
        assertEquals(fiddlerRequest.getRequestUrl(),"http://192.168.1.65/v4.0/meter/panelMonitor/findTemperaturePanelCurrentData?pageIndex=1&pageSize=20&sortName=&sortType=&treeId=001&treeLevel=1&communicateType=2&menuId=0525&save=false&type=0&uniqueIds=");

        Map<String,String> requestHeaders = new HashMap<>();
        requestHeaders.put("Host","192.168.1.65");
        requestHeaders.put("Connection","keep-alive");
        requestHeaders.put("Accept","application/json, text/plain, */*");
        requestHeaders.put("Authorization","Bearer 1a90ce59-6592-4ba5-a43e-1970a78d5425");
        requestHeaders.put("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36");
        requestHeaders.put("Referer","http://192.168.1.65/web-meter/");
        requestHeaders.put("Accept-Encoding","gzip, deflate");
        requestHeaders.put("Accept-Language","zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7,pl;q=0.6");
        requestHeaders.put("Cookie","loginToken=1a90ce59-6592-4ba5-a43e-1970a78d5425; refresh_token=300ed705-d4c0-4cdb-ba22-5e7f04163b2c; loginToken_msg=1a90ce59-6592-4ba5-a43e-1970a78d5425; refresh_token_msg=300ed705-d4c0-4cdb-ba22-5e7f04163b2c; sidebarStatus=1");

        assertEquals(requestHeaders,fiddlerRequest.getRequestHeaders());

        String restClientRequest = "###\n"+
                "GET http://192.168.1.65/v4.0/meter/panelMonitor/findTemperaturePanelCurrentData?pageIndex=1&pageSize=20&sortName=&sortType=&treeId=001&treeLevel=1&communicateType=2&menuId=0525&save=false&type=0&uniqueIds=\n" +
                "Host: 192.168.1.65\n" +
                "Connection: keep-alive\n" +
                "Accept: application/json, text/plain, */*\n" +
                "Authorization: Bearer 1a90ce59-6592-4ba5-a43e-1970a78d5425\n" +
                "User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36\n" +
                "Referer: http://192.168.1.65/web-meter/\n" +
                "Accept-Encoding: gzip, deflate\n" +
                "Accept-Language: zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7,pl;q=0.6\n" +
                "Cookie: loginToken=1a90ce59-6592-4ba5-a43e-1970a78d5425; refresh_token=300ed705-d4c0-4cdb-ba22-5e7f04163b2c; loginToken_msg=1a90ce59-6592-4ba5-a43e-1970a78d5425; refresh_token_msg=300ed705-d4c0-4cdb-ba22-5e7f04163b2c; sidebarStatus=1";
        assertEquals(restClientRequest,fiddlerRequest.convertToRestClientRequest());
    }

    @Test
    public void fiddlerRequest_postWithRequestBody() throws ParseException {
        String sessionContent =
                "POST http://192.168.1.65/v4.0/meter/communicationEqu/readPanel HTTP/1.1\n" +
                        "Host: 192.168.1.65\n" +
                        "Connection: keep-alive\n" +
                        "Content-Length: 604\n" +
                        "Accept: application/json, text/plain, */*\n" +
                        "Authorization: Bearer 1a90ce59-6592-4ba5-a43e-1970a78d5425\n" +
                        "User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36\n" +
                        "Content-Type: application/json;charset=UTF-8\n" +
                        "Origin: http://192.168.1.65\n" +
                        "Referer: http://192.168.1.65/web-meter/\n" +
                        "Accept-Encoding: gzip, deflate\n" +
                        "Accept-Language: zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7,pl;q=0.6\n" +
                        "Cookie: loginToken=1a90ce59-6592-4ba5-a43e-1970a78d5425; refresh_token=300ed705-d4c0-4cdb-ba22-5e7f04163b2c; loginToken_msg=1a90ce59-6592-4ba5-a43e-1970a78d5425; refresh_token_msg=300ed705-d4c0-4cdb-ba22-5e7f04163b2c; sidebarStatus=1\n" +
                        "\n" +
                        "{\"datas\":[{\"uniqueId\":1456,\"equNo\":\"04234742\",\"netEquNo\":\"77000001\",\"equType\":\"TemperaturePanel\"},{\"uniqueId\":1521,\"equNo\":\"123jrx\",\"netEquNo\":\"1028001\",\"equType\":\"TemperaturePanel\"},{\"uniqueId\":1382,\"equNo\":\"0819001\",\"netEquNo\":\"123400011\",\"equType\":\"TemperaturePanel\"},{\"uniqueId\":363,\"equNo\":\"1222\",\"netEquNo\":\"A001改\",\"equType\":\"TemperaturePanel\"},{\"uniqueId\":145479,\"equNo\":\"1231\",\"netEquNo\":\"AI控制器1020\",\"equType\":\"TemperaturePanel\"},{\"uniqueId\":145489,\"equNo\":\"W1\",\"netEquNo\":\"W1\",\"equType\":\"TemperaturePanel\"},{\"uniqueId\":145463,\"equNo\":\"1\",\"netEquNo\":\"4455\",\"equType\":\"TemperaturePanel\"}]}\n" +
                        "HTTP/1.1 200 OK\n" +
                        "Server: nginx\n" +
                        "Date: Mon, 26 Sep 2022 07:28:35 GMT\n" +
                        "Content-Type: application/json;charset=UTF-8\n" +
                        "Connection: keep-alive\n" +
                        "X-Content-Type-Options: nosniff\n" +
                        "X-XSS-Protection: 1; mode=block\n" +
                        "Cache-Control: no-cache, no-store, max-age=0, must-revalidate\n" +
                        "Pragma: no-cache\n" +
                        "Expires: 0\n" +
                        "Cache-Control: no-cache\n" +
                        "Access-Control-Allow-Origin: *\n" +
                        "Access-Control-Allow-Methods: PUT, DELETE, GET, POST, OPTIONS, PATCH\n" +
                        "Access-Control-Allow-Headers: DNT,X-Mx-ReqToken,Keep-Alive,User-Agent,X-Requested-With,If-Modified-Since,Cache-Control,Content-Type,Authorization\n" +
                        "X-Frame-Options: SAMEORIGIN\n" +
                        "Content-Length: 66\n" +
                        "\n" +
                        "{\"resultCode\":0,\"message\":\"操作成功\",\"data\":{\"taskId\":325674}}\n";
        FiddlerRequest fiddlerRequest = new FiddlerRequest(sessionContent);
        assertEquals(fiddlerRequest.getRequestType(),"POST");
        assertEquals(fiddlerRequest.getRequestUrl(),"http://192.168.1.65/v4.0/meter/communicationEqu/readPanel");

        Map<String,String> requestHeaders = new HashMap<>();
        requestHeaders.put("Host","192.168.1.65");
        requestHeaders.put("Connection","keep-alive");
        requestHeaders.put("Content-Length","604");
        requestHeaders.put("Accept","application/json, text/plain, */*");
        requestHeaders.put("Authorization","Bearer 1a90ce59-6592-4ba5-a43e-1970a78d5425");
        requestHeaders.put("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36");
        requestHeaders.put("Content-Type","application/json;charset=UTF-8");
        requestHeaders.put("Origin","http://192.168.1.65");
        requestHeaders.put("Referer","http://192.168.1.65/web-meter/");
        requestHeaders.put("Accept-Encoding","gzip, deflate");
        requestHeaders.put("Accept-Language","zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7,pl;q=0.6");
        requestHeaders.put("Cookie","loginToken=1a90ce59-6592-4ba5-a43e-1970a78d5425; refresh_token=300ed705-d4c0-4cdb-ba22-5e7f04163b2c; loginToken_msg=1a90ce59-6592-4ba5-a43e-1970a78d5425; refresh_token_msg=300ed705-d4c0-4cdb-ba22-5e7f04163b2c; sidebarStatus=1");

        assertEquals(requestHeaders,fiddlerRequest.getRequestHeaders());

        assertEquals("{\"datas\":[{\"uniqueId\":1456,\"equNo\":\"04234742\",\"netEquNo\":\"77000001\",\"equType\":\"TemperaturePanel\"},{\"uniqueId\":1521,\"equNo\":\"123jrx\",\"netEquNo\":\"1028001\",\"equType\":\"TemperaturePanel\"},{\"uniqueId\":1382,\"equNo\":\"0819001\",\"netEquNo\":\"123400011\",\"equType\":\"TemperaturePanel\"},{\"uniqueId\":363,\"equNo\":\"1222\",\"netEquNo\":\"A001改\",\"equType\":\"TemperaturePanel\"},{\"uniqueId\":145479,\"equNo\":\"1231\",\"netEquNo\":\"AI控制器1020\",\"equType\":\"TemperaturePanel\"},{\"uniqueId\":145489,\"equNo\":\"W1\",\"netEquNo\":\"W1\",\"equType\":\"TemperaturePanel\"},{\"uniqueId\":145463,\"equNo\":\"1\",\"netEquNo\":\"4455\",\"equType\":\"TemperaturePanel\"}]}",
                fiddlerRequest.getRequestBody()
        );
    }

    @Test
    public void test_convertToRestClientRequest_withSettings() throws ParseException {
        String sessionContent =
                "POST http://192.168.1.65/v4.0/meter/communicationEqu/readPanel HTTP/1.1\n" +
                        "Host: 192.168.1.65\n" +
                        "Connection: keep-alive\n" +
                        "Content-Length: 604\n" +
                        "Accept: application/json, text/plain, */*\n" +
                        "Authorization: Bearer 1a90ce59-6592-4ba5-a43e-1970a78d5425\n" +
                        "User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36\n" +
                        "Content-Type: application/json;charset=UTF-8\n" +
                        "Origin: http://192.168.1.65\n" +
                        "Referer: http://192.168.1.65/web-meter/\n" +
                        "Accept-Encoding: gzip, deflate\n" +
                        "Accept-Language: zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7,pl;q=0.6\n" +
                        "Cookie: loginToken=1a90ce59-6592-4ba5-a43e-1970a78d5425; refresh_token=300ed705-d4c0-4cdb-ba22-5e7f04163b2c; loginToken_msg=1a90ce59-6592-4ba5-a43e-1970a78d5425; refresh_token_msg=300ed705-d4c0-4cdb-ba22-5e7f04163b2c; sidebarStatus=1\n" +
                        "\n" +
                        "{\"datas\":[{\"uniqueId\":1456,\"equNo\":\"04234742\",\"netEquNo\":\"77000001\",\"equType\":\"TemperaturePanel\"},{\"uniqueId\":1521,\"equNo\":\"123jrx\",\"netEquNo\":\"1028001\",\"equType\":\"TemperaturePanel\"},{\"uniqueId\":1382,\"equNo\":\"0819001\",\"netEquNo\":\"123400011\",\"equType\":\"TemperaturePanel\"},{\"uniqueId\":363,\"equNo\":\"1222\",\"netEquNo\":\"A001改\",\"equType\":\"TemperaturePanel\"},{\"uniqueId\":145479,\"equNo\":\"1231\",\"netEquNo\":\"AI控制器1020\",\"equType\":\"TemperaturePanel\"},{\"uniqueId\":145489,\"equNo\":\"W1\",\"netEquNo\":\"W1\",\"equType\":\"TemperaturePanel\"},{\"uniqueId\":145463,\"equNo\":\"1\",\"netEquNo\":\"4455\",\"equType\":\"TemperaturePanel\"}]}\n" +
                        "HTTP/1.1 200 OK\n" +
                        "Server: nginx\n" +
                        "Date: Mon, 26 Sep 2022 07:28:35 GMT\n" +
                        "Content-Type: application/json;charset=UTF-8\n" +
                        "Connection: keep-alive\n" +
                        "X-Content-Type-Options: nosniff\n" +
                        "X-XSS-Protection: 1; mode=block\n" +
                        "Cache-Control: no-cache, no-store, max-age=0, must-revalidate\n" +
                        "Pragma: no-cache\n" +
                        "Expires: 0\n" +
                        "Cache-Control: no-cache\n" +
                        "Access-Control-Allow-Origin: *\n" +
                        "Access-Control-Allow-Methods: PUT, DELETE, GET, POST, OPTIONS, PATCH\n" +
                        "Access-Control-Allow-Headers: DNT,X-Mx-ReqToken,Keep-Alive,User-Agent,X-Requested-With,If-Modified-Since,Cache-Control,Content-Type,Authorization\n" +
                        "X-Frame-Options: SAMEORIGIN\n" +
                        "Content-Length: 66\n" +
                        "\n" +
                        "{\"resultCode\":0,\"message\":\"操作成功\",\"data\":{\"taskId\":325674}}\n";
        FiddlerRequest fiddlerRequest = new FiddlerRequest(sessionContent);
        Map<String,String> urlTargetList = new HashMap<>();
        urlTargetList.put("http://192.168.1.65/v4.0/meter","http://localhost:8090");
        List<String> headWhiteList = new ArrayList<>();
        headWhiteList.add("Host");
        headWhiteList.add("Authorization");
        headWhiteList.add("Content-Type");
        String content = fiddlerRequest.convertToRestClientRequest(new RequestConvertConfig(urlTargetList, headWhiteList));

        String restClientRequest = "###\n"+
                "POST http://localhost:8090/communicationEqu/readPanel\n" +
                "Host: 192.168.1.65\n" +
                "Authorization: Bearer 1a90ce59-6592-4ba5-a43e-1970a78d5425\n" +
                "Content-Type: application/json;charset=UTF-8\n" +
                "\n" +
                "{\"datas\":[{\"uniqueId\":1456,\"equNo\":\"04234742\",\"netEquNo\":\"77000001\",\"equType\":\"TemperaturePanel\"},{\"uniqueId\":1521,\"equNo\":\"123jrx\",\"netEquNo\":\"1028001\",\"equType\":\"TemperaturePanel\"},{\"uniqueId\":1382,\"equNo\":\"0819001\",\"netEquNo\":\"123400011\",\"equType\":\"TemperaturePanel\"},{\"uniqueId\":363,\"equNo\":\"1222\",\"netEquNo\":\"A001改\",\"equType\":\"TemperaturePanel\"},{\"uniqueId\":145479,\"equNo\":\"1231\",\"netEquNo\":\"AI控制器1020\",\"equType\":\"TemperaturePanel\"},{\"uniqueId\":145489,\"equNo\":\"W1\",\"netEquNo\":\"W1\",\"equType\":\"TemperaturePanel\"},{\"uniqueId\":145463,\"equNo\":\"1\",\"netEquNo\":\"4455\",\"equType\":\"TemperaturePanel\"}]}";
        assertEquals(restClientRequest,content);
    }
}