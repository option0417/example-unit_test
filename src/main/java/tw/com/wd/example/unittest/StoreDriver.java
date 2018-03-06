package tw.com.wd.example.unittest;

public class StoreDriver {
	private DataStore dataStore;
	
	public StoreDriver(DataStore dataStore) {
		super();
		this.dataStore = dataStore;
	}
	
	public boolean putToStore(String textData) {
		return this.dataStore.backup(textData);
	}

	public boolean isStoreExist() {
	    return this.dataStore != null;
    }
}
