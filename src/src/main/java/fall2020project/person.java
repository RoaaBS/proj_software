package fall2020project;

import fall2020project.DateServer;
import fall2020project.EmailServer;

abstract class person {
	
		public static boolean added;
	
		public  void setDateServer(DateServer dateServ) {}
		public  void setEmailServer(EmailServer emailServer) {}
		public void sendreminder(String email ,String su ,String body) {}
	}


