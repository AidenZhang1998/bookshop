package zut.cs.network.bookshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 首页控制器
 */

@Controller
public class HomeController {

	/**
	 * 系统首页
	 *
	 */
	@GetMapping(value = { "/", "/index" })
	public String index() {
		return "home/index";
	}

	/**
	 * 商品列表页
	 */
	@GetMapping(value = { "/goods" })
	public String goods() {
		return "site/goods";
	}

	/**
	 * 用户列表页
	 *
	 */
	@GetMapping(value = { "/users" })
	public String users() {
		return "site/users";

	}
}
