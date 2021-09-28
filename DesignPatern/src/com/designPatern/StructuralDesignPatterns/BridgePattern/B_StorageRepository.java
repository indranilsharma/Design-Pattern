package com.designPatern.StructuralDesignPatterns.BridgePattern;

import java.io.IOException;

interface B_StorageRepository {
	public void store(B_BaseEntiy entiy) throws IOException;
}
