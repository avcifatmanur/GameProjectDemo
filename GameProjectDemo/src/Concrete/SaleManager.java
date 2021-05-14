package Concrete;

import Entities.Campaign;
import Entities.Sale;

public class SaleManager{
	public void SaleGame(Sale sale) {
		System.out.println(sale.getUser().getName()+" isimli oyuncu "+
							String.valueOf(sale.getGame().getGameName())+" oyununu "+
							String.valueOf(sale.getGame().getUnitPrice())+" ₺ ye satın aldı.");	
	}
	public void CampaignSales(Campaign campaign,Sale sale)
    {
        System.out.println(sale.getGame().getGameName()+" oyununda "+
        					campaign.getCampaignName()+ " kampanyası ile % "+
        					campaign.getCampaignDisc()+" indirimi bulunmaktadır.");
    }

}
