package library;

public class Book implements Print{
	private int page;
	private String cover;
	private String author;
	private String name;
	private int graduation;
	
	Book(String author,String name,String cover,int page,int graduation){
		this.author=author;
		this.name=name;
		this.cover=cover;
		this.page=page;
		this.graduation=graduation;
	}
	
	public void setAuthor(String author){
		this.author=author;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setCover(String cover){
		this.cover=cover;
	}
	
	public void setPage(int page){
		this.page=page;
	}
	
	public void setGraduation(int graduation){
		this.graduation=graduation;
	}
	
	public String qetAuthor(){
		return author;
	}
	
	public String qetName(){
		return name;
	}
	public String qetCover(){
		return cover;
	}
	public int qetPage(){
		return page;
	}
	public int qetGraduation(){
		return graduation;
	}
	@Override
	public void prints() {
		System.out.println("book fo author"+ author+"name book"+ name+"cover"+ cover+"book for "+ page+"page"+"graduation"+ graduation);
		
	}
}
