package zut.cs.network.bookshop.entity;

import java.io.Serializable;

/**
 * 商品表
 */
public class Goods implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id; //商品编号
    private String name; //商品标题
    private String price; //商品价格
    private String image; //商品图片
    private String classification; //商品分类
    private int count;//商品数量
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

   
}
