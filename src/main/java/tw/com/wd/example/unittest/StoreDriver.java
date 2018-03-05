package tw.com.wd.example.unittest;

public class StoreDriver {
	private DataStore dataStore;
	
	public StoreDriver(DataStore dataStore) {
		super();
		this.dataStore = dataStore;
	}
	
	public void putToStore(String textData) {
		this.dataStore.backup(textData);
	}
}
