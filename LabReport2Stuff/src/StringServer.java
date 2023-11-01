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
//        if(args.length == 0){
//            System.out.println("Missing port number! Try any number between 1024 to 49151");
//            return;
//        }

        //int port = Integer.parseInt(args[0]);
    	int port = Integer.parseInt("4000");

        Server.start(port, new StringHandler());
    }
}