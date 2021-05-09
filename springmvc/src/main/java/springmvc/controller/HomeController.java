package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name", "govind singh");
		model.addAttribute("id", 101);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Akash");
		friends.add("rejoice");
		friends.add("atte");
		friends.add("rathi");
		
		model.addAttribute("f", friends);
		
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about controller");
		return "about";
	}

//	@RequestMapping("/services")
//	public String services() {
//		System.out.println("I am at your service");
//		return "services";
//	}

//	@RequestMapping("/help")
//	public String help() {
//		System.out.println("I am here to help you!!!");
//		return "help";
//	}
	
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help controller");
		
		//creating model and view object
		ModelAndView modelandview = new ModelAndView();
		
		//setting the data
		modelandview.addObject("name", "xyz");
		modelandview.addObject("rollnumber", 123);
		LocalDateTime now = LocalDateTime.now();
		modelandview.addObject("time", now);
		
		//marks
		List<Integer> list = new ArrayList<Integer>();
		list.add(345);
		list.add(565);
		list.add(6456);
		list.add(56456);
		modelandview.addObject("marks", list);
		
		//setting the view name
		modelandview.setViewName("help");
		
		return modelandview;
	}

}
