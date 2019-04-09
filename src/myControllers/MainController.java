package myControllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MainAPI")
public class MainController {
	
	@GetMapping("/getAll")
	public ResponseEntity<String> getAll() {
		 return new ResponseEntity<String>("Hello", HttpStatus.OK);
	}
	
	@GetMapping("/getHello")
	public String getHello() {
		 return "Hello";
	}
}
