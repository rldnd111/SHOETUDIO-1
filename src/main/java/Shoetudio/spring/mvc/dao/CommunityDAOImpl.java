package Shoetudio.spring.mvc.dao;

import Shoetudio.spring.mvc.vo.Community;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("cmdao")
public class CommunityDAOImpl implements CommunityDAO {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public int insertCommunity(Community cm) {
        return 0;
    }

    @Override
    public int updateCommunity(Community cm) {
        return 0;
    }

    @Override
    public int deleteCommunity(String cno) {
        return 0;
    }

    @Override
    public List<Community> selectCommunity(int cnum) {
        return null;
    }

    @Override
    public List<Community> findSelectCommunity(Map<String, Object> param) {
        return null;
    }

    @Override
    public Community selectOneCommunity(String cno) {
        return null;
    }

    @Override
    public int selectCountCommunity() {
        return 0;
    }

    @Override
    public int selectCountCommunity(Map<String, Object> param) {
        return 0;
    }

    @Override
    public int viewCountCommunity(String cno) {
        return 0;
    }
}
