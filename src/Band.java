import java.util.ArrayList;
import java.util.List;

/**
 * Representation of a band with some attributes and a get and set
 * @author Santiago Ramirez Cano (santiago.ramirezc26@gmail.com)
 * */
public class Band {
    /**
     * Some attributes of a band
     * */
    public String name;
    public int numberMembers;
    public List<String> songs = new ArrayList<>() ;

    /**
     * Description: Return the list of songs of the band
     * @return array of songs
     */
    public List<String> getSongs() {
        return songs;
    }

    /**
     * Description: Add the name of the song's band
     * @param name the name of the song
     * */
    public void setSongs(String name) {
        songs.add(name);
    }
}
