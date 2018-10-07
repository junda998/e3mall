package cn.e3mall.controller;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;

/**
 * 商品管理Controller
 * @author Administrator
 *
 */

@Controller
public class ItemController {
	org.slf4j.Logger logger = LoggerFactory.getLogger(ItemController.class);
	@Autowired
	private ItemService itemService;
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem getItemById(@PathVariable Long itemId){
		TbItem   tbItem = itemService.getItemById(itemId);
		return tbItem;
	}
}
