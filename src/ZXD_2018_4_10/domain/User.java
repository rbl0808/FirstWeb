package ZXD_2018_4_10.domain;
/*
2018年4月10日09:58:21
把数据库中查询出的结果保存到这里
 */
public class User {
    private String username;
    private String password;
    public void User(){

    }
    public User(String username,String password){
        this.username = username;
        this.password = password;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
