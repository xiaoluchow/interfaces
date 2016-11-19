package com.xiaolu.cart.service;

import java.util.List;

import com.xiaolu.cart.bean.CartItemBean;

public interface CartService {
	
	void add(List<Long> cartItemIdList);
	
	void delete(List<Long> cartItemIdList);
	
	List<CartItemBean> getMemberCartItems(Long memberId);
}
