package List.ArrayList;

import java.util.ArrayList;

public class UserTest {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ArrayList<User> users= new ArrayList<User>();
		users.add(new User(1, "RAM"));
		users.add(new User(2, "SHYAM"));
		users.add(new User(3, "PRAKASH"));

		for (User user : users) {
			
			System.out.println(users);
			
		}
		
	}
	
	
}
