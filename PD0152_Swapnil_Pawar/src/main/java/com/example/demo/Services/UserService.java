package com.example.demo.Services;

import com.example.demo.Entities.User;

public class UserService {

	public User getUser(String[] data) {
		String[] numbers = new String[data.length];
		String[] alphabets = new String[data.length];
		int n_index = 0;
		int a_index = 0;
		for(int i = 0; i < data.length; i++) {
			try { 
				Integer.parseInt(data[i]);
				numbers[n_index] = data[i];
				n_index++;
			}
			catch(Exception e) {
				alphabets[a_index] = data[i];
				a_index++;
			}
		}
		User u1 = new User(true, "Swapnil_Pawar_PD0152", "swapnilpawar965@gmail.com", "PD0152", numbers, alphabets);
		return u1;
	}
}

