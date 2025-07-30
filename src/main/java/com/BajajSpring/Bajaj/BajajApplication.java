	package com.BajajSpring.Bajaj;

	//import com.BajajSpring.Bajaj.Service.WebhookService;
	import com.BajajSpring.Bajaj.service.WebhookService;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.CommandLineRunner;
	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.http.HttpEntity;
	import org.springframework.http.HttpHeaders;
	import org.springframework.http.MediaType;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.client.RestTemplate;

	import java.util.HashMap;
	import java.util.Map;
	//implements CommandLineRunner
	@SpringBootApplication
	public class BajajApplication  implements CommandLineRunner{
		@Autowired
		private WebhookService webhookService;
		public static void main(String[] args) {
			SpringApplication.run(BajajApplication.class, args);
		}


		@Override

		public void run(String... args) {
			webhookService.execute();
	}}
