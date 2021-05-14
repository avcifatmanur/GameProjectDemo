package Entities;

public class Campaign extends Entity{
	private int campaignId;
	private String campaignName;
	private double campaignDisc;
	
	public Campaign(String campaignName) {
		super(campaignName);
	}
	
	public Campaign(int campaignId, String campaignName, double campaignDisc) {
		super(campaignName);
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.campaignDisc = campaignDisc;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		super.setName(campaignName);
	}

	public double getCampaignDisc() {
		return campaignDisc;
	}

	public void setCampaignDisc(double campaignDisc) {
		this.campaignDisc = campaignDisc;
	}
}
