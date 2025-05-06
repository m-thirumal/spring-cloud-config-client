/**
 * 
 */
package in.thirumal.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * 
 */
@Component  // or @Configuration
@RefreshScope
public class Property {

	@Value("${client.common.property}")
    private String applicationProperty;
	
	@Value("${client.name}")
    private String name;

    public String getApplicationProperty() {
        return applicationProperty;
    }

    public void setApplicationProperty(String applicationProperty) {
        this.applicationProperty = applicationProperty;
    }

	public String getName() {
		return name;
	}
}
