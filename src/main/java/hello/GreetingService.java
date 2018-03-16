package hello;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String greet() {
        return "Hello Review App 3 on stage.review.app3 branch";
    }
}
