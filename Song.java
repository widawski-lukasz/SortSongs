class Song implements Comparable<Song> {

	String title;
	String artist;
	String points;
	String bpm;
	
	public boolean equals(Object song) {
		Song p = (Song) song;
		return getTitle().equals(p.getTitle()); //to compare, using of override meth equals() from String 
	}
	
	public int hashCode() {
		return title.hashCode(); // in the same way as above
	}
	
	public int compareTo(Song p) {
		return title.compareTo(p.getTitle()); 
	}
	
	Song(String t, String a, String o, String b) {
		title = t;
		artist = a;
		points = o;
		bpm = b;
	}
	
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public String getPoints() {
		return points;
	}
	public String getBpm() {
		return bpm;
	}
	
	
	public String toString() {
		return title;
	}
}