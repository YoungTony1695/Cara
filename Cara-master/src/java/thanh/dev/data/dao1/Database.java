package thanh.dev.data.dao1;

import thanh.dev.data.impl1.CategoryImpl;
import thanh.dev.data.impl1.OrderImpl;
import thanh.dev.data.impl1.OrderItemImpl;
import thanh.dev.data.impl1.ProductImpl;
import thanh.dev.data.impl1.UserImpl;

public class Database extends DatabaseDao {

    
    @Override
    public CategoryDao getCategoryDao() {
        // TODO Auto-generated method stub
        return new CategoryImpl();
    }
    @Override
    public OrderItemDao getOrderItemDao() {
        // TODO Auto-generated method stub
        return new OrderItemImpl();
    }
    @Override
    public OrderDao getOrderDao() {
        // TODO Auto-generated method stub
        return new OrderImpl();
    }
    @Override
    public UserDao getUserDao() {
        // TODO Auto-generated method stub
        return new UserImpl();
    }
	@Override
	public ProductDao getProductDao() {
		// TODO Auto-generated method stub
		return new ProductImpl();
	}

}
