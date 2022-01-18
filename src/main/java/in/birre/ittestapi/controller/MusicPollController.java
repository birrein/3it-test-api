package in.birre.ittestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.birre.ittestapi.dao.MusicPollRepository;
import in.birre.ittestapi.model.MusicPoll;

@RestController
public class MusicPollController {
	@Autowired
	private MusicPollRepository repository;

	@PostMapping("/insertPoll")
	public String insertPoll(@RequestBody MusicPoll poll) {
		repository.save(poll);
		return "Encuesta guardada.";
	}

	@GetMapping("/getAllPolls")
	public List<MusicPoll> getAllPolls() {
		System.out.println(repository.findAll().toString());
		return repository.findAll();
	}

	@GetMapping("/getPollsByEmail/{email}")
	public List<MusicPoll> getEmployeesByDept(@PathVariable String email) {
		return repository.findByEmail(email);
	}

}
