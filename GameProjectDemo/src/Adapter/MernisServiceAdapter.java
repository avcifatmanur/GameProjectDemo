package Adapter;

import java.rmi.RemoteException;

import Abstract.UserCheckService;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService{

	@Override
	public boolean CheckIfRealPerson(User user) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();    
	    boolean result = false;
	    
		try 
		{
			result = kpsPublicSoapProxy.TCKimlikNoDogrula
					(
					Long.parseLong(user.getNationalityId()) , 
					user.getUserFirstName().toUpperCase(), 
					user.getUserLastName().toUpperCase(), 
					user.getYearOfBirth()
			);
		} 
		catch (RemoteException e) 
		{
			e.printStackTrace();
		}

		return result;
	}

}
