package fall2020project;

import java.util.logging.Logger;



public class Data {

	public String password;
	public String email;
	boolean logged;
    Logger logger
            = Logger.getLogger(Data.class.getName());

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
	 public boolean isLogged() {
	        return logged;
	    }

	  

	    public void logOut() {
	            logged=false;
	    }

	    public void setLogged(boolean logged) {
	        this.logged = logged;
	    }
			
		}
	

	

	


