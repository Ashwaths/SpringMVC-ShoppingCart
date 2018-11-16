package org.plan.shoppingcart.dao.dao;

import java.util.List;

import org.plan.shoppingcart.model.CartInfo;
import org.plan.shoppingcart.model.OrderDetailInfo;
import org.plan.shoppingcart.model.OrderInfo;
import org.plan.shoppingcart.model.PaginationResult;

public interface OrderDAO {
	
  public void saveOrder(CartInfo cartInfo);
  
  public PaginationResult<OrderInfo> listOrderInfo(int page,int maxResult, int maxNavigationPage);
  
  public OrderInfo getOrderInfo(String orderId);
  
  public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
  
}