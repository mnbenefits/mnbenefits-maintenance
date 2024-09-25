package state.mn.us;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MaintenancePageController {

	@GetMapping({"/","/*/*", "/pages/*"})
	public String showHomePage() {
		System.out.println("GET!");
	    return "/maintenance.html";   
	   }
	@PostMapping({"/","/*/*", "/pages/*"})
	public String postMapping() {
		System.out.println("POST!");
		return "/maintenance.html";
	}
	
	
}
