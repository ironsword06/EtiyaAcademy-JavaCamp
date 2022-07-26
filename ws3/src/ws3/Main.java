package ws3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<User> users = new ArrayList<User>();
		NotificationService service1 = new SmsNotification();
		NotificationService service2 = new EmailNotification();
		User user1 = new User(0, " Ahmet","demir", service1);
		User user2 = new User(1, " mehmet","çetin", service2);
		User user3 = new User(2, " ACD","ACD", service2);
		
		UserManager userManager = new UserManager();
		userManager.register(user1);
		userManager.register(user2);
		userManager.register(user3);
		userManager.forgetPassword(user2);
		userManager.removeUser(user2);
		userManager.getUsers();
		
		System.out.println(users);

	}

}
