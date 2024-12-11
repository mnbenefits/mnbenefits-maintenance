package state.mn.us;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MaintenancePageController {
	
	@GetMapping({"/pages/healthcareRenewalUpload"})
	public String showHealthCareUploadMaintenancePage() {
	    return "/hcmaintenance.html";   
	   }

	@GetMapping({"/", "/pages/*", "/home", "/error"})
	public String showMaintenancePage(@RequestParam(required=false) Map<String,String> qparams) {
		
	    return "/maintenance.html";   
	   }
		
}
