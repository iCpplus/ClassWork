import java.util.Scanner;

public class Application {
    private UserDao userDao;

    public Application(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void registe() {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("******注册用户******");
            User user = new User();
            String userName;
            String password;
            String confirm;
            System.out.print("请输入用户名:");
            userName = sc.next();
            System.out.print("请输入密码:");
            password = sc.next();
            System.out.print("请重新输入密码:");
            confirm = sc.next();
            if (password.equals(confirm)) {
                user.setUserName(userName);
                user.setPassword(password);
                userDao.addUser(user);
                System.out.println(userName + "注册成功!");
                flag = false;
            } else {
                System.out.println("两次密码输入不相符，请重新输入:");
                flag = true;
            }
        } while (flag);
        
    }

    public void login() {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("******登录******");
            String userName;
            String password;
            System.out.print("请输入用户名:");
            userName = sc.next();
            System.out.print("请输入密码:");
            password = sc.next();
            if (userName.equals(userDao.getUser(userName, password).getUserName())
                    && password.equals(userDao.getUser(userName, password).getPassword())) {
                System.out.println(userName + "已登录");
                flag = false;
            } else {
                System.out.println("请重新登录!");
                flag = true;
            }
        } while (flag);
     
    }
}