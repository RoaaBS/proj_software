package fall2020project;

public class Data {

	public String password;
	public String email;


	public Data()
	{
		
	}
	public Data(Data r)
	{
		this.password=r.password;
		this.email=r.email;
	}				
	public int checkemail(String string) {
		if(string.equals("roaa.sabbarini@gmail.com")) {
			return 1;
		}
		
		return 0;
	}

	public int checkpass(String string) {
		
		if(string.equals("123")) {
			return 1;
		}
		return 0;
	}
		
	}

	

	


