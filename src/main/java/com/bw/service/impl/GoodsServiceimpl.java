package com.bw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.dao.GoodsMapper;
import com.bw.entity.Goods;
import com.bw.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class GoodsServiceimpl implements GoodsService {
	//依赖注入
	@Autowired
	private GoodsMapper goodsmapper;

	@Override
	public PageInfo<Goods> list(Integer pageSize, Integer pageNum) {
		// TODO Auto-generated method stub
	//启动分页
	PageHelper.startPage(pageNum, pageSize);
	//查询
	List<Goods>list=goodsmapper.list();
	//返回controller
	return new PageInfo<Goods>(list);
	}
}
