package com.myfirst.demoproject.Users;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoServices {

	private static List<Users> users = new ArrayList<>();
	private static int userCount =3;

	static
	{
		users.add(new Users(1,"arpit",new Date()));
		users.add(new Users(2,"amit",new Date()));
		users.add(new Users(3,"ankit",new Date()));	
	}

	public List<Users> findAll()
	{
		return users;
	}

	public Users save(Users user)
	{
		if(user.getId()==null)
		{

			user.setId(++userCount);
		}
		users.add(user);
		return user;
	}

	public Users findOne(int id)
	{
		for(Users user :users)
		{
			if(user.getId()==id)
			{
				return user;
			}
		}
		return null;
	}
}

