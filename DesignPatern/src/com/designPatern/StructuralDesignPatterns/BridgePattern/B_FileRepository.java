package com.designPatern.StructuralDesignPatterns.BridgePattern;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class B_FileRepository implements B_StorageRepository {

	@Override
	public void store(B_BaseEntiy entiy) throws IOException {
		FileOutputStream fos = new FileOutputStream("bride.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(entiy);
		oos.close();
	}

}
