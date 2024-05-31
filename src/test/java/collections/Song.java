package collections;

public class Song
{
	String name;
	String singer;
	String type;
	String movie;
	String writer;
	

	public Song() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Song(String name, String singer, String type, String movie, String writer) {
		super();
		this.name = name;
		this.singer = singer;
		this.type = type;
		this.movie = movie;
		this.writer = writer;
	}



	public Song(String name,String singer,String type,String movie,String writer) {
    super();
    this.name=name;
    this.singer= singer;
    this.type=type;
    this.movie=movie;
    this.writer=writer;
	}
	
	@Override
	public String toString() {
		return "Song [name=" + name + ", singer=" + singer + ", type=" + type + ", movie=" + movie + ", writer="
				+ writer + ",]";
	}
	public boolean equals(Object o)
	{
		Song s=(Song)o;
		if(this.name==s.name&&this.singer==s.singer&&this.type==s.type&&this.movie==movie&&this.writter==writter) {
			return true;
		}
		return false;
		}
	
		
				
			
		
	
		
	}
	

}
