package zut.cs.network.bookshop.dao;


import com.github.pagehelper.Page;

import zut.cs.network.bookshop.entity.Goods;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
对商品的操作
 */
@Mapper
public interface GoodsDao {

 List<Goods> findAll() ;


    Page<Goods> findByPage(Goods goods);

    List<Goods> findById(Long id);

    void create(Goods goods);

    void update(Goods goods);

    void delete(Long id);
}
