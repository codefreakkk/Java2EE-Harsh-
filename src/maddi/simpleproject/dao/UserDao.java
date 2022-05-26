package maddi.simpleproject.dao;

import maddi.simpleproject.entites.User;

public class UserDao {
    public int saveInDb() {
        return 1;
    }

    public void displayUserData(User user) {
        System.out.println("Your name is " + user.getName());
        System.out.println("Your roll is " + user.getRollNo());
        System.out.println("Your age is " + user.getAge());
    }

}
