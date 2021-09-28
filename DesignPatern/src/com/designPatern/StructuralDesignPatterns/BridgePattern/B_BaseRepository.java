package com.designPatern.StructuralDesignPatterns.BridgePattern;

public abstract class B_BaseRepository {
	public abstract void save(B_BaseEntiy entiy);
    public abstract B_StorageRepository getRepository();
}
