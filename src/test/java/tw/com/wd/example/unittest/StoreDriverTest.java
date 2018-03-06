package tw.com.wd.example.unittest;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public class StoreDriverTest {
	@Test
	public void testDriverWithDummy() {
		StoreDriver driver = new StoreDriver(new DummyDataStore());

        Assert.assertTrue(driver.isStoreExist());
	}
	

	@Test
	public void testDriverWithStub() {
        StoreDriver driver = new StoreDriver(new StubDataStore());

        Assert.assertTrue(driver.putToStore("test"));
	}
	
	
	@Test
	public void testDriverWithSpy() {
        SpyDataStore spyDataStore = new SpyDataStore();

        StoreDriver driver = new StoreDriver(spyDataStore);
        driver.putToStore("test");

        Assert.assertTrue(spyDataStore.isOK());
	}
	
	@Test
	public void testDriverWithFake() {
        StoreDriver driver = new StoreDriver(new FakeDataStore());
        driver.putToStore("test");

        File tmpFile = new File("tmp");

        Assert.assertTrue(tmpFile.exists());
	}
}
