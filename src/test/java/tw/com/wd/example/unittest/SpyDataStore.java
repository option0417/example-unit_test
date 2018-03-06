package tw.com.wd.example.unittest;

public class SpyDataStore implements DataStore{
    private boolean flag;
    @Override
    public boolean backup(String data) {
        flag = true;
        return false;
    }

    public boolean isOK() {
        return flag;
    }
}
