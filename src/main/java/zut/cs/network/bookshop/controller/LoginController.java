package zut.cs.network.bookshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import zut.cs.network.bookshop.entity.Result;
import zut.cs.network.bookshop.entity.User;
import zut.cs.network.bookshop.service.UserService;

/**
 * 登录控制器
 *
 */

@Controller
public class LoginController {
  @Autowired
  private UserService userService;
  @RequestMapping("/login")
  @ResponseBody
  public Result login(@RequestParam("username") String username, @RequestParam("password") String password) {
      System.out.println("username:" + username + ", password:" + password);
      User user = userService.FindByName(username);
      if (user != null) {
          if (user.getPassword().equals(password)) {
              ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
              attributes.getRequest().getSession().setAttribute("user", user); //将登陆用户信息存入到session域对象中
              return new Result(true, user.getUsername());
          }
      }
      return new Result(false, "登录失败");
  }
  @GetMapping("/login")
  public String login() {
      return "home/login";
  }
  @RequestMapping("/logout")
  public String logout() {
      ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
      attributes.getRequest().getSession().removeAttribute("user");
      return "home/login";
  }
}
