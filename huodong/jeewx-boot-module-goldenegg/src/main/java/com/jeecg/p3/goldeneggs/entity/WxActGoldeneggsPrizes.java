package com.jeecg.p3.goldeneggs.entity;

import org.jeecgframework.p3.core.utils.persistence.Entity;

/**
 * 描述：</b>WxActGoldeneggsPrizes:奖品表<br>
 * @author junfeng.zhou
 * @since：2016年06月07日 18时00分27秒 星期二 
 * @version:1.0
 */
public class WxActGoldeneggsPrizes implements Entity<String> {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 奖品等级
	 */
	private String awardsName;
	public String getAwardsName() {
		return awardsName;
	}
	public void setAwardsName(String awardsName) {
		this.awardsName = awardsName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
