import Adapter.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.SaleManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Sale;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		User user=new User(1,"Fatma Nur","GÜNEY","11111111",1996,"abc");
		UserManager userManagement=new UserManager(new MernisServiceAdapter());
		userManagement.add(user);
		
		Game game = new Game(1,"Need For Speed",100);
		GameManager gameManager=new GameManager();
		gameManager.add(game);
		
		Campaign campaign = new Campaign(1,"Yüzde Elli",50);
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.update(campaign);
		
		Sale sales = new Sale(1,game,user);
		SaleManager salesManager = new SaleManager();
        salesManager.SaleGame(sales);
        salesManager.CampaignSales(campaign, sales);
        

	}

}
