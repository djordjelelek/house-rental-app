package house_rental.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/landlord")
public class LandlordController {
	@PostMapping(value = "/create")
	public void create() {
		System.out.println("sdasfsdf");
	}

	@GetMapping(value = "/get")
	public void get() {
		
	}
}
