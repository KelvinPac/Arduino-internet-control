

import processing.serial.*; 

/*
 
A simple Processing script for enabling or disabling the LED on an Arduino using a web interface and serial communication.
Author: Kelvin-M
Created: 19th of January 2016
 
http://homeautoroup.co.ke
 
*/
 
 
 Serial port;
 String state="";
 String on ="ON";
 String of = "OF";

 PFont font;
 public void setup()  {
	 // This part must be altered to fit your local settings. Arduino board is connected to, at 9600 baud
   port = new Serial(this, "COM1" ,9600);
   
   font = loadFont("OldEnglishTextMT-200.vlw");
   textFont(font, 200);
 
   
 
}
 public void draw() {
   
   
 background(0xff2196F3);
  String onoroff[] = loadStrings("http://192.168.84.1/arduino2/state.txt"); // Insert the location of your .txt file
  print(onoroff[0]);  // Prints whatever is in the file ("1" or "0")
 
  if (onoroff[0].equals("1") == true) {
    println(" - TELLING ARDUINO TO TURN LED ON");
   // text("hello");
    port.write('H'); // Send "H" over serial to set LED to HIGH
   
    text(on, 70, 175);
 
  } else {
 
    println(" - TELLING ARDUINO TO TURN LED OFF");
    port.write('L');  // Send "L" over serial to set LED to LOW
    text(of, 70, 175);
 }
 
  delay(1000); // Set your desired interval here, in milliseconds
 }
  
