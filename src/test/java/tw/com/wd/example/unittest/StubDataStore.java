package tw.com.wd.example.unittest;

public class StubDataStore implements DataStore {
    @Override
    public boolean backup(String data) {
        return true;
    }
}
