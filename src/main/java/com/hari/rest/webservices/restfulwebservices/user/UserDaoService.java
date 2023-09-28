package com.hari.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;


@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	
	public static int usersCount = 0;
	
	static {
		users.add(new User(++usersCount,"Hari",LocalDate.now().minusYears(31)));
		users.add(new User(++usersCount,"Carl",LocalDate.now().minusYears(29)));
		users.add(new User(++usersCount,"Adam",LocalDate.now().minusYears(25)));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user){
		user.setId(++usersCount);
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		java.util.function.Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	
	public void deleteById(int id) {
		java.util.function.Predicate<? super User> predicate = user -> user.getId().equals(id);
		users.removeIf(predicate);
	}
}
  