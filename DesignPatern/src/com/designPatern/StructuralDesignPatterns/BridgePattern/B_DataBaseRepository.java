package com.designPatern.StructuralDesignPatterns.BridgePattern;

import java.io.IOException;

public class B_DataBaseRepository implements B_StorageRepository {

	@Override
	public void store(B_BaseEntiy entiy) throws IOException {
//		EntityTransaction tx = getEntityManager().getTransaction();
//		try {
//			tx.begin();
//			getEntityManager().persist(entiy);
//			tx.commit();
//       } catch (Exception ex) {
//          if (tx.isActive()) {
//        	  tx.rollback();
//        	  }
//		}
	}
}
