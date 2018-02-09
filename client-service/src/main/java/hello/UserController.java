package hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import feign.Feign;
import feign.Logger;
import feign.Client;
import feign.codec.Decoder;
import feign.codec.Encoder;
// import feign.ribbon.RibbonClient;

import hello.UserClient;

@RestController
class UserController {

    @Autowired
    private UserClient userClient;

    // @Autowired
	// public UserController(
	// 		Decoder decoder, Encoder encoder, Client client) {
    //     this.userClient = Feign.builder()
    //         .client(RibbonClient.create())
    //         .encoder(encoder)
    //         .decoder(decoder)
    //         .target(UserClient.class, "http://hello-service");

    //     // .requestInterceptor(new BasicAuthRequestInterceptor("user", "user"))
    // }

    @RequestMapping("/getall-hi")
	public List<String> getAllGreetings() {
		List<String> greetings = userClient.getGreetings();
		return greetings;
	}

}