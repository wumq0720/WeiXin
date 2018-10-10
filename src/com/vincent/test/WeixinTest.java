package com.vincent.test;

import com.vincent.po.AccessToken;
import com.vincent.util.WeixinUtil;

public class WeixinTest {
	public static void main(String[] args) {
		try {
			AccessToken token = WeixinUtil.getAccessToken();
			System.out.println("票据：" + token.getToken());
			System.out.println("有效时间：" + token.getExpiresIn());

			String path = "D:\\timg.jpg";
			String mediaId = WeixinUtil.upload(path, token.getToken(), "thumb");
			System.out.println(mediaId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
