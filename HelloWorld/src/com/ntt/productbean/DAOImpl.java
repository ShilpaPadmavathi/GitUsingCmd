package com.ntt.productbean;

public class DAOImpl implements DAO{

	@Override
	public Customer customerDetails(Customer c) {
		c.setCustId(1221);
		c.setCustName("Shilpa");
		c.setCustMob(8500986);
		return c;
	}

	@Override
	public Product productDetails(Product p) {
		p.setProdId(8597);
		p.setProdName("Kinley");
		p.setDiscount(10);
		return p;
	}

}
