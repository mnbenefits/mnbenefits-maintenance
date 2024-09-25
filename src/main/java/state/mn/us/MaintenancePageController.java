package state.mn.us;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MaintenancePageController {

	@GetMapping({"/","/*/*", "/pages/*"})
	public String showHomePage() {
	    return "/maintenance.html";   
	   }
	
	
}
