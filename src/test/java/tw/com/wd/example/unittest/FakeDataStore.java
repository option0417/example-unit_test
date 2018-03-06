package tw.com.wd.example.unittest;

import java.io.File;
import java.io.FileOutputStream;

public class FakeDataStore implements DataStore {
    private String filename = "tmp";

    @Override
    public boolean backup(String data) {
        File tmpFile = new File(filename);
        if (tmpFile.exists()) {
            tmpFile.delete();
        }

        try {
            FileOutputStream fos = new FileOutputStream(tmpFile);
            fos.write(data.getBytes("UTF8"));
            fos.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
