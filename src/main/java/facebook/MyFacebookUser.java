package facebook;

import user.User;

import java.util.Date;

public class MyFacebookUser implements User {
    private FacebookUser facebookUser;

    public MyFacebookUser(FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }

    public String getEmail() {
        return this.facebookUser.getEmail();
    }

    public String getCountry() {
        return this.facebookUser.getUserCountry();
    }

    public Date getDate() {
        return this.facebookUser.getUserActiveTime();
    }
}
