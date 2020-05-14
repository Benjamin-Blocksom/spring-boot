package online.basicbuddy.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Jello Whirled: Spring Boot Flavor. Now rocking secure authentication";
	}

}