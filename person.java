package fall2020project;

import fall2020project.DateServer;
import fall2020project.EmailServer;

abstract class person {
	
		public static boolean added;
		public abstract void setDateServer(DateServer dateServ);
		public abstract void setEmailServer(EmailServer emailServer);
		public abstract void sendreminder(String email ,String su ,String body);
	}


