package com.monocept;

import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Async {
	
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Async");
		JButton helloButton = new JButton("Hello");
		JButton printButton = new JButton("Print");
		JButton printAsyncButton = new JButton("printAsync");
		
		helloButton.setBounds(100,100,100,50);
		printButton.setBounds(200,100,100,50);
		printAsyncButton.setBounds(300,100,100,50);
		
		myFrame.add(helloButton);
		myFrame.add(printButton);
		myFrame.add(printAsyncButton);
		myFrame.setSize(500,300);
		myFrame.setLayout(null);
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		helloButton.addActionListener((e) -> System.out.println("Hello"));
		
		printButton.addActionListener((e) -> {
			while(true) {
				System.out.println(java.time.LocalTime.now());
			}
		});
		
		printAsyncButton.addActionListener((e) -> {
			Thread t = new Thread(()->{
				while(true) {
					System.out.println(java.time.LocalTime.now());
				}
			});
			t.start();
		});
	}
}
