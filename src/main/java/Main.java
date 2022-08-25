
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Main {
    @RequestMapping("/")
    String home() {
        return "teamo F and D";
    }
    
    @RequestMapping("/prueba")
    String home2() {
        return "Hello World - v4!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }
}
