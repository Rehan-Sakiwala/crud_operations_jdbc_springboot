package com.example.jdbcDemo;

import com.example.jdbcDemo.dao.UserDao;
import com.example.jdbcDemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class JdbcDemoApplication implements CommandLineRunner {
	@Autowired
	private UserDao userDao;

	public static void main(String[] args) {

		SpringApplication.run(JdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//----------------------Insertion Code------------------
//		User user1 = new User();
//		user1.setName("Tony");
//		user1.setEmail("Tont.stark@gmail.com");
//		user1.setGender("Male");
//		user1.setCity("Newyork");
//
//		User user2 = new User("Steve","Steve@yahoo.com","Male","America");
//		boolean status = userDao.insertUser(user2);
//		if(status ){
//			System.out.println("User inserted successfully.");
//		}
//		else{
//			System.out.println("Error adding user.");
//		}



		//--------------------Updation Code 1------------------------------
//		User user4 = new User("Rogers","Steve@yahoo.com","Male","America");
//		boolean status = userDao.updateUser(user4);
//		if(status){
//			System.out.println("User updated successfully.");
//		}
//		else{
//			System.out.println("Error updating user.");
//		}



		//-------------------Updation Code 2------------------------------

//		User user4 = userDao.getUserByEmail("Tont.stark@gmail.com");
//		user4.setCity("Pune");
//
//		boolean status = userDao.updateUser(user4);
//		if(status){
//			System.out.println("User updated successfully.");
//		}
//		else{
//			System.out.println("Error updating user.");
//		}



		//---------------------Deletion by email---------------------------
//		String email = "Steve@yahoo.com";
//		boolean status = userDao.deleteUserByEmail(email);
//		if(status){
//			System.out.println("User deleted successfully.");
//		}
//		else{
//			System.out.println("Deletion failed.");
//		}



		//-------------------Select 1 user by Email---------------------------
//		User user = userDao.getUserByEmail("rehan.sak@gmail.in");
//		System.out.println("Name : "+user.getName()+" Gender : "+user.getGender());
//		System.out.println("Email : "+user.getEmail()+" City : "+user.getCity());



		//------------------Select All users---------------------------------
//		List<User> list= userDao.getAllUsers();
//		for(User user : list){
//			System.out.println("Name : "+user.getName()+" Gender : "+user.getGender());
//			System.out.println("Email : "+user.getEmail()+" City : "+user.getCity());
//			System.out.println("=================================================");
//		}
	}
}
