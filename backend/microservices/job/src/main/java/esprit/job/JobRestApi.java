package esprit.job;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mic2/job")
public class JobRestApi {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello im microservice 2";
    }
}
