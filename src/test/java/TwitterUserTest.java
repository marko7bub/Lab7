
import twitter.MyTwitterUser;
import twitter.TwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;


class TwitterUserTest {
    Date currentTime = new Date();
    TwitterUser tw1 = new TwitterUser("bubniak@ucu.edu.ua", "Ukraine", currentTime);
    MyTwitterUser mtw1 = new MyTwitterUser(tw1);

    @org.junit.jupiter.api.Test
    void testEmail() {
        assertEquals(mtw1.getEmail(), "bubniak@ucu.edu.ua");
    }

    @org.junit.jupiter.api.Test
    void testCountry() {
        assertEquals(mtw1.getCountry(), "Ukraine");
    }
}
