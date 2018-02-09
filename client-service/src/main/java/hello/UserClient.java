package hello;

import java.util.Arrays;
import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Component;

// import feign.RequestLine;

@FeignClient(name = "hello-service", fallback = UserClientFallback.class)
public interface UserClient {
    // @RequestLine("GET /hi_getall")
    // List<String> getGreetings();

    @RequestMapping(method = RequestMethod.GET, value = "/hi_getall", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    List<String> getGreetings();
}

@Component
class UserClientFallback implements UserClient {
    @Override
    public List<String> getGreetings() {
        return Arrays.asList("Hello", "tryGetGreetingsElse");
    }
}