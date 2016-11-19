package com.xiaolu.cart.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import com.xiaolu.cart.bean.CartItemBean;

public interface CartServiceRMI extends Remote{
	
	public List<CartItemBean> queryMemberCartItems(Long memberId)  throws RemoteException;
	
}
