package Shoetudio.spring.mvc.service;

import Shoetudio.spring.mvc.dao.ArtworkDAO;
import Shoetudio.spring.mvc.vo.Artwork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("awsrv")
public class ArtworkServiceImpl implements ArtworkService {

    @Autowired
    private ArtworkDAO awdao;

    @Override
    public boolean newArtwork(Artwork aw) {
        return false;
    }

    @Override
    public boolean modifyArtwork(Artwork aw) {
        return false;
    }

    @Override
    public boolean removeArtwork(String awno) {
        return false;
    }

    @Override
    public List<Artwork> readArtwork(String cp) {
        return null;
    }

    @Override
    public List<Artwork> readArtwork(String cp, String ftype, String fkey) {
        return null;
    }

    @Override
    public Artwork readOneArtwork(String awno) {
        return null;
    }

    @Override
    public int countArtwork() {
        return 0;
    }

    @Override
    public int countArtwork(String ftype, String fkey) {
        return 0;
    }

    @Override
    public boolean viewCountArtwork(String awno) {
        return false;
    }
}
