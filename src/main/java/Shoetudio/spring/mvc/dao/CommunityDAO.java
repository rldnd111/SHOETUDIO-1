package Shoetudio.spring.mvc.dao;

import Shoetudio.spring.mvc.vo.Artwork;
import Shoetudio.spring.mvc.vo.Community;

import java.util.List;
import java.util.Map;

public interface CommunityDAO {

    int insertCommunity(Community cm);
    int updateCommunity(Community cm);
    int deleteCommunity(String cno);

    List<Community> selectCommunity(int cnum);
    List<Community> findSelectCommunity(Map<String, Object> param);
    Community selectOneCommunity(String cno);

    int selectCountCommunity();
    int selectCountCommunity(Map<String, Object> param);
    int viewCountCommunity(String cno);

}
