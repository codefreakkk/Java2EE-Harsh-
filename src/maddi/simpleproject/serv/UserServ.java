package maddi.simpleproject.serv;

import maddi.simpleproject.dao.UserDao;
import maddi.simpleproject.entites.User;

public class UserServ {
    public void DisplayData() {
        User o = new User("name", 19, 83);
        UserDao obj = new UserDao();
        obj.displayUserData(o);
    }

    public static void main(String[] args) {
        UserServ obj = new UserServ();
        obj.DisplayData();
    }

}
