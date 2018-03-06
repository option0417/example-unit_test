package tw.com.wd.example.unittest;

public class DummyDataStore implements DataStore {
    @Override
    public boolean backup(String data) {
        throw new UnsupportedOperationException();
    }
}
