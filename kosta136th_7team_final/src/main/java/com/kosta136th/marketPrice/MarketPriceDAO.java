package com.kosta136th.marketPrice;

import java.util.List;

public interface MarketPriceDAO {

	public void rateSave(MarketPriceSave marketPrice) throws Exception;
	
	public List<MarketPriceChart> chart(String money_type) throws Exception;

<<<<<<< HEAD
	public List<MarketPrice> coinRateList() throws Exception;
=======
	public List<MarketPrice> coinRateList(String sorting_type, String money_type) throws Exception;

	public List<MarketPrice> oneChart(OneChart oneChart) throws Exception;
>>>>>>> 3f0c07590edbe5089b813dcf39679cd651a0e980

}
