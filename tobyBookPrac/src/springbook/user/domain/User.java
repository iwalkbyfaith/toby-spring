package springbook.user.domain;

public class User {
	
	String id;
	String password;
	String name;
	
	public String getId(){
		return id;
	}
	
	public String getPassword(){
		return password;
	}
	
	public String getName(){
		return name;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public void setName(String name){
		this.name = name;
	}
}
