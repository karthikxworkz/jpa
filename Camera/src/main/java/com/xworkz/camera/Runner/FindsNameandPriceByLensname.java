package com.xworkz.camera.Runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class FindsNameandPriceByLensname {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			Query query = entityManager.createNamedQuery("findsnameandpricebylensname");
			query.setParameter("lensnameby", "EF-S 18-55mm f/4-5.6 IS STM");

			Object[] object = (Object[]) query.getSingleResult();
			String name = (String) object[0];
			int price = (int) object[1];

			entityTransaction.commit();
			System.out.println("This is class======");
		} catch (PersistenceException e) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		} finally {
			entityManagerFactory.close();
			entityManager.close();
		}
	}
}
