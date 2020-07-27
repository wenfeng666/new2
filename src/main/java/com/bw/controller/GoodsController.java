package com.bw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bw.entity.Goods;
import com.bw.service.GoodsService;
import com.github.pagehelper.PageInfo;

@Controller
public class GoodsController {

	@Autowired
	private GoodsService goodsservice;

	@RequestMapping("list")
	//展示方法
	public String list(Model m, @RequestParam(defaultValue = "1") Integer pageNum,
			@RequestParam(defaultValue = "10") Integer pageSize) {
		//分页
		PageInfo<Goods> info = goodsservice.list(pageSize, pageNum);
		m.addAttribute("info", info);
		//返回list页面
		return "list";
	}

}
