import facebook.FacebookUser;
import facebook.MyFacebookUser;
import sender.MessageSender;
import twitter.MyTwitterUser;
import twitter.TwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;


class MessageSenderTest {
    Date currentTime = new Date();
    FacebookUser fb1 = new FacebookUser("bubniak@ucu.edu.ua", "Ukraine", currentTime);
    MyFacebookUser mfb1 = new MyFacebookUser(fb1);
    TwitterUser tw1 = new TwitterUser("bubniak@ucu.edu.ua", "Ukraine", currentTime);
    MyTwitterUser mtw1 = new MyTwitterUser(tw1);

    @org.junit.jupiter.api.Test
    void testFacebookSend() {
        MessageSender messageSender = new MessageSender();
        assertTrue(messageSender.send("Hello!", mfb1, "Ukraine"));
    }

    @org.junit.jupiter.api.Test
    void testTwitterSend() {
        MessageSender messageSender = new MessageSender();
        assertTrue(messageSender.send("Hello!", mtw1, "Ukraine"));
    }
}
