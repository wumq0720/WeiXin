package com.vincent.test;

import com.vincent.po.AccessToken;
import com.vincent.util.WeixinUtil;

import net.sf.json.JSONObject;

public class WeixinTest {
	public static void main(String[] args) {
		try {
			AccessToken token = WeixinUtil.getAccessToken();
			System.out.println("票据：" + token.getToken());
			System.out.println("有效时间：" + token.getExpiresIn());

			// String path = "D:\\timg.jpg";
			// String mediaId = WeixinUtil.upload(path, token.getToken(),
			// "thumb");
			// System.out.println(mediaId);

			// String menu =
			// JSONObject.fromObject(WeixinUtil.initMenu()).toString();
			// System.out.println(menu);
			// int result = WeixinUtil.createMenu(token.getToken(), menu);
			// if (result == 0) {
			// System.out.println("菜单创建成功!");
			// } else {
			// System.out.println("菜单创建失败，错误码：" + result);
			// }

			JSONObject jsonObject = WeixinUtil.queryMenu(token.getToken());
			System.out.println(jsonObject);

			// int result = WeixinUtil.deleteMenu(token.getToken());
			// if (result == 0) {
			// System.out.println("菜单删除成功!");
			// } else {
			// System.out.println("菜单删除失败，错误码：" + result);
			// }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
