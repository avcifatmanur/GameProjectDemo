package Concrete;
import Abstract.UserCheckService;
import Entities.User;

public class UserManager extends BaseManager{
	private UserCheckService userCheckService;

	public UserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}
	public void add(User user) {
		System.out.println("-----------KİMLİK DOĞRULAMA-----------");
        if (userCheckService.CheckIfRealPerson(user))
        {
        	super.add(user);
        }
        else {
        	System.out.println("Girilen bilgiler hatalı!");
        }
	}
	
	

}
