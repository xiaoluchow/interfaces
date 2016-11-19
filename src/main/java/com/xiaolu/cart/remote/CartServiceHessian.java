package com.xiaolu.cart.remote;

import java.util.List;

import com.xiaolu.cart.bean.CartItemBean;

public interface CartServiceHessian {
	
	public List<CartItemBean> queryMemberCartItems(Long memberId);
	
}
