package Shoetudio.spring.mvc.service;

import Shoetudio.spring.mvc.vo.Artwork;

import java.util.List;

public interface ArtworkService {

    boolean newArtwork(Artwork aw);
    boolean modifyArtwork(Artwork aw);
    boolean removeArtwork(String awno);

    List<Artwork> readArtwork(String cp);
    List<Artwork> readArtwork(String cp, String ftype, String fkey);
    Artwork readOneArtwork(String awno);

    int countArtwork();
    int countArtwork(String ftype, String fkey);
    boolean viewCountArtwork(String awno);
}
