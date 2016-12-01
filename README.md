# Arduino-internet-control
Simple code to control your Arduino from the internet without an Ethernet shield or WiFi modules
The index.html is our simple form with two radio buttons(ON & OFF) , the form submition will be handled by the program.php which will generate the state.txt file and write a value of 1 or 0 for the 2 states.
We use processing to read the value of the text file and add write them to the serial com. 
Please test if your board can receive data with no problems before testing whole project.
I faced some issues when trying to access the url in processing when using a proxy connection 

www.homeautogroup.co.ke
