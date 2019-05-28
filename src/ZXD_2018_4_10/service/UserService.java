package ZXD_2018_4_10.service;

import ZXD_2018_4_10.dao.UserDao;
import ZXD_2018_4_10.domain.User;

/*
2018年4月10日10:11:53
Service层依赖dao层
 */
public class UserService {
    private UserDao userdao =new UserDao();
    //service的查询需要使用dao来完成
    public User find(){
        return userdao.find();
    }
}
