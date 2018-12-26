package com.morethanair;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.google.gson.Gson;
import com.morethanair.domain.ResponseData;
import com.morethanair.service.RestCallService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestCallTestApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testRestCall() {
		String url = "http://175.193.202.133:8099/api/rest/busRouteInfo/getStaionByRoute.jsonp?busRouteId=234000879&callback=jQuery213043342270517165793_1545529667702&_=1545529667703";
	  
		try {
	    ResponseData dataJson= new Gson().fromJson(RestCallService.getJsonResponse(url), ResponseData.class);
	    dataJson.getOutStationByRoute().getMsgBody().getDetail().forEach(i -> {
	    	System.out.println("!!!"+i);
	    });
	    } catch(Exception e) {
	    	e.printStackTrace();
	    }
	}
}

