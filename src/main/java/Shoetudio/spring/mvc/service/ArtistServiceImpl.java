package Shoetudio.spring.mvc.service;

import Shoetudio.spring.mvc.dao.ArtistDAO;
import Shoetudio.spring.mvc.vo.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service("asrv")
public class ArtistServiceImpl implements ArtistService {

    @Autowired
    private ArtistDAO adao;

    @Override
    public String newArtist(Artist a) {
        return null;
    }

    @Override
    public String checkAuid(String aid) {
        return null;
    }

    @Override
    public boolean checkLogin(Artist a, HttpSession sess) {
        return false;
    }
}
