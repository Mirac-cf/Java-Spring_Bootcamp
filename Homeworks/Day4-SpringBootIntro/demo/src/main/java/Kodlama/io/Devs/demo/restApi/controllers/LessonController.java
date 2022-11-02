package Kodlama.io.Devs.demo.restApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.demo.business.abstracts.LessonService;
import Kodlama.io.Devs.demo.entities.Lessons;

@RestController
@RequestMapping("/api/lessons")
public class LessonController {
	
	private LessonService lessonService;
	
	
	@Autowired
	public LessonController(LessonService lessonService) {
		this.lessonService = lessonService;
	}
	
	@GetMapping("/get/{id}")
	public Lessons getbyid(@PathVariable int id) {
		return lessonService.getbyid(id);
	}
	
	@GetMapping("/getall")
	public List<Lessons> getAll(){
		return lessonService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Lessons lessons) {
		lessonService.add(lessons);
	}
	
	@GetMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		lessonService.delete(id);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Lessons lessons) {
		lessonService.update(lessons);
	}
	
	
	
	
	
	
	
}
