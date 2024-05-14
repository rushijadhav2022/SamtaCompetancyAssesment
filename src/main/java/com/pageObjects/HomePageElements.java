package com.pageObjects;

public interface HomePageElements {

	String chatHeading = "//span[contains(@class,'x1lliihq x1plvlek')]";
	String reciever = "//span[text()='Omkar Jadhav']";
	String messageTextBox = "//p[@class='xat24cr xdj266r']";
	String sentMessageText = "//div[@dir='auto']";
	String sentMessageSign = "//span[@class='html-span xdj266r x11i5rnm xat24cr x1mh8g0r xexx8yu x4uap5 x18d9i69 xkhd6sd x1hl2dhg x16tdsg8 x1vvkbs x1xf6ywa']/text()";
	String sentButton = "//div[@aria-label='Press Enter to send']";
	String imageIcon = "(//div[@class='xh8yej3']//div)[9]";
	String logOutButton = "//span[text()='Log Out']";
}
