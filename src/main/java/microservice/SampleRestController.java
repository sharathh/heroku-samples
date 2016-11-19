package microservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

	@RequestMapping("/ms")
	public String echo() {
		return "Sample Rest Service";
	}
}
