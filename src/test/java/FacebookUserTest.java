import facebook.FacebookUser;
import facebook.MyFacebookUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;


class FacebookUserTest {
    Date currentTime = new Date();
    FacebookUser fb1 = new FacebookUser("bubniak@ucu.edu.ua", "Ukraine", currentTime);
    MyFacebookUser mfb1 = new MyFacebookUser(fb1);

    @org.junit.jupiter.api.Test
    void testEmail() {
        assertEquals(mfb1.getEmail(), "bubniak@ucu.edu.ua");
    }

    @org.junit.jupiter.api.Test
    void testCountry() {
        assertEquals(mfb1.getCountry(), "Ukraine");
    }
}
