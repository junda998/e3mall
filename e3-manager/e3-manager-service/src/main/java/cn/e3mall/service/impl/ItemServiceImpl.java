package cn.e3mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.pojo.TbItemExample;
import cn.e3mall.pojo.TbItemExample.Criteria;
import cn.e3mall.service.ItemService;

/**
 * 商品查询
 * @author Administrator
 *
 */

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private TbItemMapper  tbItemMapper;
	@Override
	public TbItem getItemById(Long itemId) {
		System.out.println("============C===================="+itemId);
		//根据主键查询
//		TbItem item = tbItemMapper.selectByPrimaryKey(id);
		TbItemExample example = new TbItemExample();
		Criteria critria = example.createCriteria();
		//设置查询条件
		critria.andIdEqualTo(itemId);
		System.out.println("============D====================");
		List<TbItem> listItem = tbItemMapper.selectByExample(example);
		System.out.println("============E===================="+listItem.size());
		if(!listItem.isEmpty()){
			return listItem.get(0);
		}
		return null;
	}

}
