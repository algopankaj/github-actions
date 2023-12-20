package com.example.demo6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo6Application {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome from pankaj side";
	}
	public static void main(String[] args) {
		SpringApplication.run(Demo6Application.class, args);

	}

}

//echo "# github-actions" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/algopankaj/github-actions.git
//git push -u origin main
