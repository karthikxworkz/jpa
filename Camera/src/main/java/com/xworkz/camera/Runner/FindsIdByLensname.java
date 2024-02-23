package com.xworkz.camera.Runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.camera.Entity.CameraEntity;

public class FindsIdByLensname {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			Query query = entityManager.createNamedQuery("findsidbylensname");
			query.setParameter("lensnameby", "EF-S 18-55mm f/4-5.6 IS STM");
			Object obj = query.getSingleResult();
			CameraEntity cameraEntity = (CameraEntity) obj;
			int id = (int) obj;
			System.out.println("This is class:" + id);
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
