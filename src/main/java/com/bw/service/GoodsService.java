package com.bw.service;

import com.bw.entity.Goods;
import com.github.pagehelper.PageInfo;

public interface GoodsService {

	PageInfo<Goods> list(Integer pageSize, Integer pageNum);

}
