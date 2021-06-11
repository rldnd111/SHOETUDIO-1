package Shoetudio.spring.mvc.service;

import Shoetudio.spring.mvc.dao.UserDAO;
import Shoetudio.spring.mvc.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service("usrv")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO udao;

    @Override
    public String newUser(User u) {
        return null;
    }

    @Override
    public String findZipcode(String dong) {
        return null;
    }

    @Override
    public String checkUserid(String uid) {
        return null;
    }

    @Override
    public boolean checkLogin(User u, HttpSession sess) {
        return false;
    }
}
