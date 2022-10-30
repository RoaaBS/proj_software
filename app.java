package fall2020project;
import fall2020project.DateServer;
abstract class app {
	
	
	public abstract void setEmailServer(EmailServer emailServer);
	public abstract void sendreminder(String email ,String su ,String body);
	public abstract void setDateServer(DateServer dateServer);
}
