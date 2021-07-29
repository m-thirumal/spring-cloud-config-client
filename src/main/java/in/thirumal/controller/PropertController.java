/**
 * 
 */
package in.thirumal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Thirumal
 *
 */
@RestController
public class PropertController {
	
	@GetMapping("/")
	public Property getProperty() {
		return new Property();
	}

}
