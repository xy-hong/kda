package team.kda.ahri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
public class AhriApplication {

    public static void main(String[] args) {
        SpringApplication.run(AhriApplication.class, args);
    }

}
