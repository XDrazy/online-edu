package com.entity.view;

import com.entity.WodebijiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 我的笔记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2025-4-16 15:46:15
 */
@TableName("wodebiji")
public class WodebijiView  extends WodebijiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WodebijiView(){
	}
 
 	public WodebijiView(WodebijiEntity wodebijiEntity){
 	try {
			BeanUtils.copyProperties(this, wodebijiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
