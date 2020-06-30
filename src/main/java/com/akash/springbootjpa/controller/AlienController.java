package com.akash.springbootjpa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.akash.springbootjpa.dao.AlienRepo;
import com.akash.springbootjpa.model.Alien;

@Controller
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien)
	{
		repo.save(alien);
		return "home.jsp";
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam() int aid)
	{
		ModelAndView mv = new ModelAndView("showAlien.jsp");
		Alien alien = repo.findById(aid).orElse(new Alien());
		mv.addObject(alien);
		return mv;
	}
	
	@RequestMapping("/updateAlienName")
	public String updateAlienName(@RequestParam() int aid, @RequestParam() String aname)
	{
		Alien alien = repo.findById(aid).orElse(new Alien());
		alien.setAname(aname);
		repo.save(alien);
		return "home.jsp";
	}
	
	@RequestMapping("/updateAlienTech")
	public String updateAlienTech(@RequestParam() int aid, @RequestParam() String tech)
	{
		Alien alien = repo.findById(aid).orElse(new Alien());
		alien.setTech(tech);
		repo.save(alien);
		return "home.jsp";
	}
	
	@RequestMapping("/deleteAlien")
	public String deleteAlien(@RequestParam() int aid)
	{
		Alien alien = repo.findById(aid).orElse(new Alien());
		repo.delete(alien);
		return "home.jsp";
	}
	
	@RequestMapping("/viewAllAliens")
	public ModelAndView viewAllAliens()
	{
		ModelAndView mv = new ModelAndView("showAllAlien.jsp");
		Iterable<Alien> itAliens = repo.findAll();
		ArrayList<Alien> aliens = new ArrayList<Alien>();
		for(Alien a : itAliens)
		{
			aliens.add(a);
		}
		mv.addObject("listOfAliens", aliens);
		return mv;
	}
	
	//Rest API format URL - http://localhost:9999/aliens
	@RequestMapping(path="/aliens" , produces={"application/xml"})
	@ResponseBody	//Only returing data not a view
	public List<Alien> getAliens()
	{
		return repo.findAll();
	}
	
	//Rest API format URL - http://localhost:9999/aliens/102
	@RequestMapping("/alien/102")
	@ResponseBody	//Only returing data not a view
	public String getAlien102()
	{
		return repo.findById(102).toString();
	}
	
	//Rest API format URL - http://localhost:9999/aliens/anyid
	@RequestMapping("/alien/{aid}")
	@ResponseBody	//Only returing data not a view
	public Optional<Alien> getAlienByAid(@PathVariable("aid") int aid)
	{
		return repo.findById(aid);
	}
}
