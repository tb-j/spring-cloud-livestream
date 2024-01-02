package pl.tbj.springcloudgateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudGatewayApplication {
//	@Autowired
//	private RestTemplate restTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudGatewayApplication.class, args);
	}

//	@Bean
//	public RestTemplate getRestTemplate() {
//		return new RestTemplate();
//	}
}
