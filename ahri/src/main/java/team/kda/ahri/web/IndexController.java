package team.kda.ahri.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈〉
 *
 * @author hxy
 * @create 2020/11/11
 */
@RestController
@RefreshScope
public class IndexController {

    @Value("${spring.application.name}")
    private String appName;

    @Value("${personal.name}")
    private String name;



    @GetMapping("/echo/{word}")
    public String echo(@PathVariable String word){
        return "Hello " + word + ", This is " + appName;
    }

    @GetMapping("/personal")
    public String echoConfig(){
        return "My name is " + name;
    }

}