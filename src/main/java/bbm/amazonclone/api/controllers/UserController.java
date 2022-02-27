package bbm.amazonclone.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bbm.amazonclone.business.abstracts.UserService;
import bbm.amazonclone.core.utilities.results.DataResult;
import bbm.amazonclone.core.utilities.results.Result;
import bbm.amazonclone.entities.concretes.User;

@RestController
@RequestMapping("/Amazonclone/user")
@CrossOrigin
public class UserController {
	
	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<User>> userGetAll(){
		return this.userService.getAll();
	}
	
	@PostMapping("/add") 
	public Result userAdd(@RequestBody User user) {
		return this.userService.add(user);
	}

}
