package ZXD_2018_4_10.dao;

import ZXD_2018_4_10.domain.User;

/*
2018年4月10日09:59:18
把xml中的数据查询出来后,封装到user对象中,然后返回
 */
public class UserDao{
    public  User find(){
        return  new User("然并卵","123456");
    }
}
