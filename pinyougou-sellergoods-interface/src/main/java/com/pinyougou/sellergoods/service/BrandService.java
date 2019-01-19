package com.pinyougou.sellergoods.service;

import com.pinyougou.grouppojo.PageResult;
import com.pinyougou.pojo.TbBrand;

import java.util.List;

public interface BrandService {

    public List<TbBrand> findAll();

    public PageResult findpage(int pageNum, int pageSize);

    public void add(TbBrand tbBrand);

    public void update(TbBrand tbBrand);

    public TbBrand findOne(Long id);

    public void delete(Long[] ids);

    public PageResult findPage(TbBrand tbBrand,int pageNum, int pageSize);
}
