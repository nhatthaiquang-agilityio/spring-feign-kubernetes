package hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class UserController {

    @Autowired
    private UserClient userClient;

    @RequestMapping("/getall-hi")
	public List<String> getAllGreetings() {
		List<String> greetings = userClient.getGreetings();
		return greetings;
	}
}