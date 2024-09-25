package state.mn.us;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MaintenancePageController {

	@GetMapping({"/","/*/*", "/pages/*"})
	public String showHomePage() {
		System.out.println("GET!");
	    return "/maintenance.html";   
	   }
	@RequestMapping(method = RequestMethod.POST)
	public String postMapping() {
		System.out.println("POST!");
		return "/maintenance.html";
	}
	
	
}
