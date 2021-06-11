package Shoetudio.spring.mvc.dao;

import Shoetudio.spring.mvc.vo.Artist;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("adao")
public class ArtistDAOImpl implements ArtistDAO {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public int insertArtist(Artist a) {
        return 0;
    }

    @Override
    public int selectOneArtid(String auid) {
        return 0;
    }

    @Override
    public int selectLogin(Artist a) {
        return 0;
    }
}
