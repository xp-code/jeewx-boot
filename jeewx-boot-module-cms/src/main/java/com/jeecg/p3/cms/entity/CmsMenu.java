package com.jeecg.p3.cms.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.jeecgframework.p3.core.utils.persistence.Entity;

/**
 * 描述：</b>栏目管理<br>
 * @author junfeng.zhou
 * @since：2018年09月25日 17时51分57秒 星期二 
 * @version:1.0
 */
public class CmsMenu implements Entity<String> {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 站点ID
	 */
	private String mainId;
	/**
	 * 是否显示0不显示，1显示
	 */
	private Integer isShow;
	// update-begin--Author:gj_duzy Date:20181114 for：新增栏目背景颜色属性
	/**
	 * 栏目背景颜色
	 */
	private String colorBckColor;	
	// update-end--Author:gj_duzy Date:20181114 for：新增栏目背景颜色属性
	
	/**
	 * 栏目链接地址（H5）
	 */
	private String htmlLink;
	public String getMainId() {
		return mainId;
	}
	public void setMainId(String mainId) {
		this.mainId = mainId;
	}
	public Integer getIsShow() {
		return isShow;
	}
	public void setIsShow(Integer isShow) {
		this.isShow = isShow;
	}
	public String getHtmlLink() {
		return htmlLink;
	}
	public void setHtmlLink(String htmlLink) {
		this.htmlLink = htmlLink;
	}
	public String getColorBckColor() {
		return colorBckColor;
	}
	public void setColorBckColor(String colorBckColor) {
		this.colorBckColor = colorBckColor;
	}
	
}
