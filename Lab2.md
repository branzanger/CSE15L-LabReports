## Lab Report 2

### Part 1

#### StringServer Code
```
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class StringHandler implements URLHandler {
	// The one bit of state on the server: a number that will be manipulated by
	// various requests.
	ArrayList<String> stringList = new ArrayList<>();

	public String handleRequest(URI url) {
		
		String output = "404 Not Found!";
		
		String path = url.getPath();
		
		switch (path) {
		case "/":
			output = buildText(stringList);
			break;
		case "/add-message":
			String[] query = url.getQuery().split("=");
			stringList.add(query[1]);
			output = buildText(stringList);
			break;
		default:
			output = "Invalid Path";
		}
		
		
		
		return output;
	}
	
	
	public String buildText(ArrayList<String> sList) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0;i < sList.size(); ++i) {
			sb.append((i+1) + ". " + sList.get(i) + "\n");
		}
		
		return sb.toString();
	}
	
}

class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);
    	  int port = Integer.parseInt("4000");

        Server.start(port, new StringHandler());
    }
}
```

![Hello](/LabReport2Assets/Hello.png)
* When calling the server the `URLHandler` method is called. In `URLHandler` we call the helper method `buildText` to help build the response.
* The argument to `URLHandler` is a `URL` class and the argument to `buildText` is the Arraylist of strings that have been added.
* The url class, path = "/add-message", stringList = {"Hello"}, and query = {"s", "Hello"} were all updated.



![Howareyou](LabReport2Assets/How-are-you.png)
* When calling the server the `URLHandler` method is called. In `URLHandler` we call the helper method `buildText` to help build the response.
* The argument to `URLHandler` is a `URL` class and the argument to `buildText` is the Arraylist of strings that have been added.
* The url class, path = "/add-message", stringList = {"Hello", "How are you"}, and query = {"s", "How are you"} were all updated.

### Part 2

* ```C:\Users\brand\.ssh\id_rsa``` \
  ![Private Key](/LabReport2Assets/Private-Key.png)
  Path to private key
* ```/home/linux/ieng6/cs15lfa23/cs15lfa23rb/.ssh``` \
  ![Public Key](/LabReport2Assets/Public-Key.png)
  Path to public key
* Logging in without password
  ![SSH no pwd](/LabReport2Assets/SSH.png)
  Screenshot of logging in without password


### Part 3
  I learned about basic servers and how to use ports and localhost to host them. Learning how to connect to servers was also very helpful and being able to log in without having to enter my password every time is very nice. I realized why VSCode should stay a text editor and should not be used as an IDE. I also learned how to use the ```scp``` command. The biggest thing I learned during these 2 weeks is how website urls are structured and about the different information contained in each url and how its parsed.
  
  

