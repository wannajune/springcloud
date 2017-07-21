package snc.as.computeService;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ComputeServiceApp 
{
    public static void main( String[] args )
    {
		new SpringApplicationBuilder(ComputeServiceApp.class).web(true).run(args);
    }
}
