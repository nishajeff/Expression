
public class User {
	private String name;
	private int id;
	private String email;
	private Address a;
	public User(){
		name="";
		id=0;
		email="";
		a=null;
	}

	public Address getA() {
		return a;
	}

	public void setA(Address a) {
		this.a = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String toString(){
		return "Your name: "+name+"<br>Your id= "+id+"<br>Your email: "+email+"<br>Address:"+a;
	}
}
