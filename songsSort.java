import java.util.*;
import java.io.*;

public class songsSort {
	
	ArrayList<Song> songsList = new ArrayList<Song>();
	
	public static void main(String[] args)  {
		new songsSort().go();
	}
	
	class ArtystaCompare implements Comparator<Song> {
		public int compare(Song p1, Song p2) {
			return p1.getArtist().compareTo(p2.getArtist());
		}
	}
	
	public void go() {
		getSongs();
		Collections.sort(songsList); //alphabetically by title
		System.out.println(songsList);
		
		ArtystaCompare comparator = new ArtystaCompare(); // alphabetically by the artist
		Collections.sort(songsList, comparator);
		System.out.println(songsList);
		
		HashSet<Song> songSet = new HashSet<Song>(); //without repeats
		songSet.addAll(songsList);
		System.out.println(songSet);
	}
	
	void getSongs() {
		try{
			File myFile = new File("SongList.txt");
			FileReader readerF = new FileReader(myFile);
			BufferedReader reader = new BufferedReader(readerF);
			String strings = null;
			while ((strings = reader.readLine()) != null) {
				addSong(strings);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	void addSong(String stringCheck) {
		String[] elements = stringCheck.split("/");
		Song nextSong = new Song(elements[0], elements[1], elements[2], elements[3]);
		songsList.add(nextSong);
	}
		
}