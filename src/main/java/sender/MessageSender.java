package sender;

import user.User;

import java.util.Date;

public class MessageSender {
    public boolean send(String text, User user, String country) {
        if (country.equals(user.getCountry())) {
            Date currentDate = new Date();
            if (currentDate.getTime() - user.getDate().getTime() <= 3600000) {
                return true;
            }
        }
        return false;
    }
}
