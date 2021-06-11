package Shoetudio.spring.mvc.service;

import Shoetudio.spring.mvc.dao.CommunityDAO;
import Shoetudio.spring.mvc.vo.Community;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommunityServiceImpl implements CommunityService {

    @Autowired
    private CommunityDAO cdao;

    @Override
    public boolean newCommunity(Community c) {
        return false;
    }

    @Override
    public boolean modifyCommunity(Community c) {
        return false;
    }

    @Override
    public boolean removeCommunity(String cno) {
        return false;
    }

    @Override
    public List<Community> readCommunity(String cp) {
        return null;
    }

    @Override
    public List<Community> readCommunity(String cp, String ftype, String fkey) {
        return null;
    }

    @Override
    public Community readOneCommunity(String cno) {
        return null;
    }

    @Override
    public int countCommunity() {
        return 0;
    }

    @Override
    public int countCommunity(String ftype, String fkey) {
        return 0;
    }

    @Override
    public boolean viewCountCommunity(String cno) {
        return false;
    }
}
