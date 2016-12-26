package com.kosta136th.marketPrice;

<<<<<<< HEAD

import javax.inject.Inject;


=======
>>>>>>> 3f0c07590edbe5089b813dcf39679cd651a0e980
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
<<<<<<< HEAD
=======

>>>>>>> 3f0c07590edbe5089b813dcf39679cd651a0e980
public class MarketPriceServiceImpl implements MarketPriceService{

	@Inject
	MarketPriceDAO dao;
	
	@Override
	public void rateSave(MarketPriceSave marketPrice) throws Exception {

		dao.rateSave(marketPrice);
		
	}

	@Override
	public List<MarketPriceChart> chart(String money_type) throws Exception {
		
		return dao.chart(money_type);
		
	}
	
	@Override
	public List<MarketPrice> coinRateList(String sorting_type, String money_type) throws Exception {
		
		return dao.coinRateList(sorting_type, money_type);

	}

<<<<<<< HEAD
=======
	@Override
	public List<MarketPrice> oneChart(OneChart oneChart) throws Exception {
		
		return dao.oneChart(oneChart);
		
	}

>>>>>>> 3f0c07590edbe5089b813dcf39679cd651a0e980
}
