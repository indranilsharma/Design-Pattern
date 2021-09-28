package com.designPatern.StructuralDesignPatterns.BridgePattern;

import java.io.IOException;

public class B_StudentRepository extends B_BaseRepository {

	private B_StorageRepository repository;

	public B_StudentRepository(B_StorageRepository repository) {
		this.repository = repository;
	}

	@Override
	public B_StorageRepository getRepository() {
		return repository;
	}

	public B_Student save(B_Student student) throws IOException {
		if (student == null || student.getName() == null) {
			return null;
		}
		student.setId(1l);
		repository.store(student);
		return student;
	}

	public static void main(String[] args) throws IOException {
		B_StudentRepository fileRepositroy = new B_StudentRepository (new B_FileRepository());
	     fileRepositroy.save(new B_Student());
	 
	     // code to store in DataBase 
	     B_StudentRepository dbRepositroy = new B_StudentRepository(new B_DataBaseRepository());
	     dbRepositroy.save(new B_Student());
	}

	@Override
	public void save(B_BaseEntiy entiy) {
		// TODO Auto-generated method stub
		
	}

}
