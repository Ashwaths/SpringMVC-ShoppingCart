package org.plan.shoppingcart.dao.dao;

import org.plan.shoppingcart.entity.Product;
import org.plan.shoppingcart.model.PaginationResult;
import org.plan.shoppingcart.model.ProductInfo;

public interface ProductDAO {
 
    
    
    public Product findProduct(String code);
    
    public ProductInfo findProductInfo(String code) ;
  
    
    public PaginationResult<ProductInfo> queryProducts(int page,
                       int maxResult, int maxNavigationPage  );
    
    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult,
                       int maxNavigationPage, String likeName);
 
    public void save(ProductInfo productInfo);
    
}
