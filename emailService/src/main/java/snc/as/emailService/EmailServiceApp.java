package snc.as.emailService;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableDiscoveryClient
@SpringBootApplication
public class EmailServiceApp {
	
    public static void main( String[] args )
    {
		new SpringApplicationBuilder(EmailServiceApp.class).web(true).run(args);
    }

}
