package team.kda.akali.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
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

    @Value("${personal.name}")
    private String name;

    @GetMapping("/personal")
    public String echoConfig(){
        return "My name is " + name;
    }

}