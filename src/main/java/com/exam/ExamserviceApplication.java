package com.exam;

import com.exam.models.Role;
import com.exam.models.User;
import com.exam.service.UserService;
import com.exam.service.impl.UserServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamserviceApplication implements CommandLineRunner {

	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ExamserviceApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting code");

		User user = new User();

		user.setFirstName("Vo");
		user.setLastName("Khang");
		user.setUsername("DiabloNoir");
		user.setPassword("123456");
		user.setEmail("khang@gmail.com");
		user.setProfile("khang.png");

		Role role1 = new Role();
		role1.setRoleId(44L);
		role1.setRoleName("ADMIN");

		Set<Role> roleSet = new HashSet<>();
		roleSet.add(role1);

		User user1 = this.userService.createUser(user, roleSet);
		System.out.println(user1.getUsername());
	}
}
