package tw.com.wd.example.unittest;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.when;

public class StoreDriverMockTest {
	@Test
	public void testDriverWithMockReturnTrue() {
        DataStore mockStore = Mockito.mock(DataStore.class);
        when(mockStore.backup(anyString())).thenReturn(Boolean.TRUE);

        StoreDriver driver = new StoreDriver(mockStore);

        Assert.assertTrue(driver.putToStore("test"));
	}

    @Test
    public void testDriverWithMockReturnFalse() {
        DataStore mockStore = Mockito.mock(DataStore.class);
        when(mockStore.backup(anyString())).thenReturn(Boolean.FALSE);

        StoreDriver driver = new StoreDriver(mockStore);

        Assert.assertThat(driver.putToStore("test"), is(false));
    }

    @Test
    public void testDriverWithMockThrowException() {
        DataStore mockStore = Mockito.mock(DataStore.class);
        when(mockStore.backup(anyString())).thenThrow(new RuntimeException());

        Exception rtnException = null;
        try {
            StoreDriver driver = new StoreDriver(mockStore);
            driver.putToStore("test");
        } catch (Exception e) {
            rtnException = e;
        }

        Assert.assertNotNull(rtnException);
    }
}
