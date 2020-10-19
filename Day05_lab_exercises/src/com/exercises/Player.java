package com.exercises;

import java.util.Scanner;

import com.main.PlayerMain;

public class Player {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Player Name:");
		String name = scan.next();
		System.out.println("Enter the Player Age:");
		int age = scan.nextInt();
		PlayerMain player = new PlayerMain();
		try {
			System.out.println(player.validate(name,age));
			
		} catch(Exception e) {
			System.out.println(e);
	}
		
		
		
	}

}
