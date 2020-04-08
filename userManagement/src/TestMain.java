public class TestMain{
    public static void main(String[] args) {
        User[] users=new User[5];
        UserDao userDao=new UserDaoForArray(users);
        Application application=new Application(userDao);
        application.registe();
        application.login();
    }
}