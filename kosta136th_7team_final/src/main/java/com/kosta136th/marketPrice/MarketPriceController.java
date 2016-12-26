package com.kosta136th.marketPrice;

<<<<<<< HEAD

=======
>>>>>>> 3f0c07590edbe5089b813dcf39679cd651a0e980
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MarketPriceController {

	// 시세 뷰 경로
	@RequestMapping(value = "/marketPrice", method = RequestMethod.GET)
    public String marketPrice(Model model) {
    	
    	//home.jsp VIEW를 호출한다.
        return "sub/marketPrice/marketPrice";	
        
    }
}
