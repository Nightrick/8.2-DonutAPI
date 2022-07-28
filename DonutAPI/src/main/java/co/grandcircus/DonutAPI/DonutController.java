package co.grandcircus.DonutAPI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DonutController {
	
	@RequestMapping("/")
	public String homePage() {
		return "home";
	}

}
