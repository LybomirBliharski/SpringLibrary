package com.softserve.dao.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.dao.OrderDAO;
import com.softserve.entity.Customer;
import com.softserve.entity.Order;

@Repository
@Transactional
public class OrderDAOImpl extends GenericDAOImpl<Order, Integer> implements OrderDAO {
	
	@PersistenceContext(type = PersistenceContextType.EXTENDED)
	private EntityManager entityManager;

	protected OrderDAOImpl() {
		super(Order.class);
	}

	@Override
	public List<Order> findAllOrdersByCustomer(Customer customer) {
		return entityManager.createQuery("SELECT o FROM Order o where o.customer = ?1", Order.class)
				.setParameter(1, entityManager.find(Customer.class, customer.getId()))
				.getResultList();
	}

	@Override
	public int howManyTimeWasBookTakes(String bookname) {
		Query query = entityManager.createNativeQuery(
				"SELECT count(*) FROM orders join exempliars on orders.exempliar_id = exempliars.id  "
						+ "join books on exempliars.book_id=books.id "
						+ "where books.name=?1 and returningDate is not null");
		query.setParameter(1, bookname);
		BigInteger count = (BigInteger) query.getSingleResult();
		return count.intValue();
	}

	@Override
	public int howManyTimeWasBookTakesByExempliars(int id) {
		// TODO Auto-generated method stub
		Query query = entityManager
				.createNativeQuery("SELECT count(*) FROM orders join exempliars on orders.exempliar_id = exempliars.id "
						+ "where exempliars.id = ?1 and returningDate is not null;");
		query.setParameter(1, id);
		BigInteger count = (BigInteger) query.getSingleResult();
		return count.intValue();
	}

	@Override
	public int averageReadingTimeByExempliar(int id) {
		// TODO Auto-generated method stub
		Query query = entityManager.createNativeQuery("SELECT sum(DATEDIFF(returningDate,takingDate))/count(*) FROM orders "
				+ "join exempliars on orders.exempliar_id = exempliars.id where exempliars.id = ?1 and returningDate is not null;");
		query.setParameter(1, id);
		BigDecimal count = (BigDecimal) query.getSingleResult();
		return count.intValue();
	}

	@Override
	public int averageReadingTimeByBook(String name) {
		// TODO Auto-generated method stub
		Query query = entityManager.createNativeQuery("SELECT sum(DATEDIFF(returningDate,takingDate))/count(*) "
				+ "FROM testlibrary.orders  join exempliars on orders.exempliar_id = exempliars.id  "
				+ "join books on exempliars.book_id=books.id where books.name=?1 and returningDate is not null");
		query.setParameter(1, name);
		BigDecimal count = (BigDecimal) query.getSingleResult();
		return count.intValue();
	}

	@Override
	public Order findById(Integer id) {

		Query query = entityManager
				.createNativeQuery(
						"Select * from orders" + " join exempliars on exempliars.id = orders.exempliar_id"
								+ " join customers on customers.id = orders.customer_id" + " where orders.id = 1",
						Order.class);

		// String s = query.getSingleResult().toString();

		return (Order) query.getSingleResult();

	}

}
