package zut.cs.network.bookshop.dao;

import java.util.List;




import org.apache.ibatis.annotations.Mapper;

import com.github.pagehelper.Page;

import zut.cs.network.bookshop.entity.Message;

/**
 * 对用户的操作
 *
 */
@Mapper
public interface MessageDao {
	List<Message> AllUser();
	void DeleteUser(Long ids);
	Page<Message> findByPage(Message message);
}
