package state.mn.us;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class MaintenancePageController {

	@GetMapping({"/", "/pages/*"})
	public String showMaintenancePage() {
		System.out.println("GET!");
	    return "/maintenance.html";   
	   }
	
//	@RequestMapping(value={"/","/*/*", "/pages/*"} , method = RequestMethod.POST)
//	public String postMapping() {
//		System.out.println("POST!");
//		return "/maintenance.html";
//	}
	
	@PostMapping(value={"/","/*/*", "/pages/*"}  )
	public String postMapping() {
		System.out.println("POST!");
		return "/maintenance.html";
	}
	

	
	@GetMapping(value = "/images/{fileName}",  produces = MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody
	public ResponseEntity<byte[]> getImage(HttpServletRequest request, @PathVariable String fileName) throws IOException {
		String rpath = request.getContextPath();
		System.out.println("====== getImage for " + fileName);
		System.out.println("rpath = " + rpath);
        // Get the image from your storage (e.g., file system, database)
        File imageFile = new File("src/main/resources/static/images/" + fileName);
        System.out.println("====== File exists = " + imageFile.exists());
        byte[] imageBytes = Files.readAllBytes(imageFile.toPath());

        // Set the content type based on the image format
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_PNG); 

        return new ResponseEntity<>(imageBytes, headers, HttpStatus.OK);
	}
	
	@GetMapping(value = "/documents/{fileName}",  produces = MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody
	public ResponseEntity<byte[]> getDocuments(HttpServletRequest request, @PathVariable String fileName) throws IOException {
		String rpath = request.getContextPath();
		System.out.println("====== getDocuments for " + fileName);
		System.out.println("rpath = " + rpath);
        // Get the image from your storage (e.g., file system, database)
        File imageFile = new File("src/main/resources/static/documents/" + fileName);
        System.out.println("====== File exists = " + imageFile.exists());
        byte[] imageBytes = Files.readAllBytes(imageFile.toPath());

        // Set the content type based on the image format
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF); 

        return new ResponseEntity<>(imageBytes, headers, HttpStatus.OK);
	}
	
	
}
