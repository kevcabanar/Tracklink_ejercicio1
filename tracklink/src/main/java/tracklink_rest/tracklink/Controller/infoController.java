package tracklink_rest.tracklink.Controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class infoController {

	@GetMapping("/api/info")
	public String info() {
		
		  InetAddress ip;
	        String hostname;
	        try {
	            ip = InetAddress.getLocalHost();
	            hostname = ip.getHostName();
	            return String.format("El host actual es %s!",hostname);
	 
	        } catch (UnknownHostException e) {
	        	return String.format("No hay host Actualmente ");
	        }
		
	}
}
