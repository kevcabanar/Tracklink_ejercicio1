package tracklink_rest.tracklink.Controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MultiplicationsController {
	@GetMapping("/api/multiplications")
	public String hello(
			@RequestParam(value = "x", defaultValue = "0") float valorX ,
			@RequestParam(value = "y", defaultValue = "1") float valorY) {
	float suma =valorX *valorY;
	return String.format("La Multiplicacion es %s!",suma );
	}
}
