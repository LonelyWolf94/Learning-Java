import java.util.ArrayList;

public class User{
	private String name;
	private String password;
	
	public User(String name, String password){
		this.name = name;
		this.password = password;
	}
	
	@Override
	public String toString(){
		return "" + this.name;
	}
	
	public String getName(){
		return name;
	}
	
	public String getPassword(){
		return password;
	}
}

