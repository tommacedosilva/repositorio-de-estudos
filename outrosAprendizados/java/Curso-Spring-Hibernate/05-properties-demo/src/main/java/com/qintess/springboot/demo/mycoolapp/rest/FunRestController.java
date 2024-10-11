package com.qintess.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	// injetar properties para: coach.name, team.name, player.name
	
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	@Value("${player.name}")
	private String playerName;
	
	// expor novo endpoint para "teaminfo"
	
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Coach: " + coachName + ", Team name: " + teamName + ", Player Name: " + playerName;
	}
	
	// expor "/" que retorna "Hello World"
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on server is " + LocalDateTime.now();
	}
	
	// expor um novo endpoint para "workout"
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

}
