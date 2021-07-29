package in.thirumal.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@RefreshScope
public class Property {

	@Value("${client.common.property}")
	private String applicationProperty;

	public String getApplicationProperty() {
		return applicationProperty;
	}

	public void setApplicationProperty(String applicationProperty) {
		this.applicationProperty = applicationProperty;
	}
	
	
}
