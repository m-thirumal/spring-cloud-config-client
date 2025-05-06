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
	
	private final Property property;

    public PropertController(Property property) {
        this.property = property;
    }
	
	@GetMapping("/")
	public String getProperty() {
		return property.getApplicationProperty();
	}
	
	
	@GetMapping("/name")
	public String getName() {
		return property.getName();
	}

}
