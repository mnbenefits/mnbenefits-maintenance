package state.mn.us;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class MaintenancePageController {
	
	@GetMapping({"/pages/healthcareRenewalUpload"})
	public String showHealthCareUploadMaintenancePage() {
		System.out.println("GET HC!");
	    return "/hcmaintenance.html";   
	   }

	@GetMapping({"/", "/pages/*", "/home", "/error"})
	public String showMaintenancePage(@RequestParam(required=false) Map<String,String> qparams) {
		System.out.println("GET!");
	    qparams.forEach((a,b) -> {
	        System.out.println(String.format("%s -> %s",a,b));
	    });
	    return "/maintenance.html";   
	   }
	

	@PostMapping(value={"/","/*/*", "/pages/*"}  )
	public String postMapping(@RequestParam(required=false) Map<String,String> qparams) {
		System.out.println("POST!");
	    qparams.forEach((a,b) -> {
	        System.out.println(String.format("%s -> %s",a,b));
	    });
		return "/maintenance.html";
	}
	

	@GetMapping(value = "/images/{fileName}",  produces = MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody
	public ResponseEntity<byte[]> getImage(HttpServletRequest request, @PathVariable String fileName) throws IOException {
        // Get the image from your storage (e.g., file system, database)
        File imageFile = new File("src/main/resources/static/images/" + fileName);
        byte[] imageBytes = Files.readAllBytes(imageFile.toPath());

        // Set the content type based on the image format
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_PNG); 

        return new ResponseEntity<>(imageBytes, headers, HttpStatus.OK);
	}
	
	
	@GetMapping(value = "/documents/{fileName}",  produces = MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody
	public ResponseEntity<byte[]> getDocuments(HttpServletRequest request, @PathVariable String fileName) throws IOException {
        // Get the image from your storage (e.g., file system, database)
        File imageFile = new File("src/main/resources/static/documents/" + fileName);
        byte[] imageBytes = Files.readAllBytes(imageFile.toPath());

        // Set the content type based on the image format
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF); 

        return new ResponseEntity<>(imageBytes, headers, HttpStatus.OK);
	}
	
	
}
