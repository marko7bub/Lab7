package twitter;

import user.User;

import java.util.Date;

public class MyTwitterUser implements User {
    private TwitterUser twitterUser;

    public MyTwitterUser(TwitterUser twitterUser) {
        this.twitterUser = twitterUser;
    }

    public String getEmail() {
        return twitterUser.getUserMail();
    }

    public String getCountry() {
        return twitterUser.getCountry();
    }

    public Date getDate() {
        return twitterUser.getLastActiveTime();
    }
}
