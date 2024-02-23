package com.xworkz.camera.Runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.camera.Entity.CameraEntity;

public class FindsCompanyNameByName {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			Query query = entityManager.createNamedQuery("findscompanynamebyname");
			query.setParameter("nameby", "Sony Alpha a6000");
			Object obj = query.getSingleResult();
			CameraEntity cameraEntity = (CameraEntity) obj;
			String companyname = (String) obj;
			System.out.println("This is class:" + companyname);
			entityTransaction.commit();

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
