
public class UserDaoForArray implements UserDao {
    private User[] data;
    private static int count = 0;

    public UserDaoForArray() {

    }

    public UserDaoForArray(User[] data) {
        this.data = data;
    }

    @Override
    public boolean addUser(User user) {
        data[count] = user;
        count++;
        if (count < data.length) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public User getUser(String userName, String password) {
        int i;
        for (i = 0; i < count; i++) {
            if (data[i].getUserName().equals(userName) && data[i].getPassword().equals(password)) {
                break;
            } else if (i == count - 1) {
                System.out.println("无此用户或密码输入错误!");
                return new User(new String("***"), new String("***")); // 没有该用户或密码输入错误返回空就会抛出空指针异常，这里返回一个非一般用户
            }
        }
        return data[i];
    }

    public User[] getData() {
        return data;
    }

    public void setData(User[] data) {
        this.data = data;
    }
}