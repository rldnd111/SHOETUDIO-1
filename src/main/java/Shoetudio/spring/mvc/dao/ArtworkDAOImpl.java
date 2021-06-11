package Shoetudio.spring.mvc.dao;

import Shoetudio.spring.mvc.vo.Artwork;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("awdao")
public class ArtworkDAOImpl implements ArtworkDAO {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public int insertArtwork(Artwork aw) {
        return 0;
    }

    @Override
    public int updateArtwork(Artwork aw) {
        return 0;
    }

    @Override
    public int deleteArtwork(String awno) {
        return 0;
    }

    @Override
    public List<Artwork> selectArtwork(int snum) {
        return null;
    }

    @Override
    public List<Artwork> findSelectArtwork(Map<String, Object> param) {
        return null;
    }

    @Override
    public Artwork selectOneArtwork(String awno) {
        return null;
    }

    @Override
    public int selectCountArtwork() {
        return 0;
    }

    @Override
    public int selectCountArtwork(Map<String, Object> param) {
        return 0;
    }

    @Override
    public int viewCountArtwork(String awno) {
        return 0;
    }
}
