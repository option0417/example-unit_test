package tw.com.wd.example.unittest;

/**
 * Hello world!
 *
 */
public interface DataStore {
    /**
     * Backup text-data to store.
     * @param data
     * @return
     */
    public boolean backup(String data);
}
