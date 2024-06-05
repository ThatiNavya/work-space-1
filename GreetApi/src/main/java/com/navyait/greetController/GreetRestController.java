package com.navyait.greetController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.navyait.greetClient.WelcomeApiClient;

@RestController
public class GreetRestController {

	@Autowired
	private Environment env;

	@Autowired
	private WelcomeApiClient welcomeApiClient;

	@GetMapping("/greet")
	public String greetMsg() {

		String port = env.getProperty("server.port");
		String greetMsg = " Good Morning";
		String welcomeMsg = welcomeApiClient.invokeWelcomeApi() + port;
		return greetMsg + welcomeMsg;
	}
}
