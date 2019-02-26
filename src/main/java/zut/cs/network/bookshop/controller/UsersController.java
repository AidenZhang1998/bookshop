package zut.cs.network.bookshop.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import zut.cs.network.bookshop.entity.Message;
import zut.cs.network.bookshop.entity.PageBean;
import zut.cs.network.bookshop.service.MessageService;

/**
用户操作控制器
 */
@RestController
@RequestMapping("/users")
public class UsersController {
@Autowired
private MessageService messageService;
/**
 * 分页查询     
 */
@RequestMapping("/findByConPage")
public PageBean findByConPage(Message message,
                              @RequestParam(value = "pageCode", required = false) int pageCode,
                              @RequestParam(value = "pageSize", required = false) int pageSize) {
    return messageService.findByPage(message, pageCode, pageSize);
}

}
