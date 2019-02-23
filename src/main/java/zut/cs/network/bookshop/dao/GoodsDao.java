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

//返回所有商品
    Page<Goods> findByPage(Goods goods);
  //根据前台的分类和名称筛选商品
    List<Goods> findById(Long id);
    //根据id查找商品
    void create(Goods goods);
  //新增一条商品记录
    void update(Goods goods);
  //修改商品记录
    void delete(Long id);
  //根据id删除商品
}
