package ws3;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class UserManager {

	private List<User>users = new ArrayList<User>();
	
	
	public void register(User user) {
	System.out.println(user.getNotificationService().message()+"Kayıt gerçekleşti");
	users.add(user);
}
public void forgetPassword(User user) {
	System.out.println(user.getFirstName()+ user.getNotificationService().message()+"Şifre Yenileme Gönderilidi");
	
}
public List<User> getUsers() {
	for(int i=0; i<users.size();i++) {
		System.out.println("Kullanıcı"+ users.get(i).getFirstName()+""+users.get(i).getNotificationService().message()
				+ "ile bilgilendirildi");
	}
		
	return null;
}
public void removeUser(User user) {
	users.remove(user);
	System.out.println("Kullanici silindi: "+ user.getFirstName());
}

}
