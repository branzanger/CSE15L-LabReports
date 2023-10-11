import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler {
	// The one bit of state on the server: a number that will be manipulated by
	// various requests.
	ArrayList<String> queryList = new ArrayList<>();

	public String handleRequest(URI url) {
		
		String output = "404 Not Found!";
		
		if (url.getPath().equals("/")) {
			StringBuilder sBuilder = new StringBuilder();
			for(String s: queryList) {
				sBuilder.append(s + "\n");
			}
			return sBuilder.toString();
		} 
		//Check if Path is /add
		//Check for valid query
		//add String query to queryList
		else if(url.getPath().equals("/add")) {
			String[] parameters = url.getQuery().split("=");
            //System.out.println("test" + parameters[0] + parameters[1]);
			if(!(parameters[0].equals("s"))){
				return "Invalid Query";
			}else {
				queryList.add(parameters[1]);
                return String.format("added \"%s\" successfully", parameters[1]);
			}
		}
		//Search method
		//Check for correct path
		//check for valid query
		else if(url.getPath().equals("/search")) {
			
			StringBuilder sBuild = new StringBuilder();
            sBuild.append("Search Results: \n" );
			for(String s : queryList) {
				if(s.contains(s)) {
					sBuild.append(s + "\n");
				}
			}
			return sBuild.toString();
		}
		
		
		return output;
	}
}

class SearchEngine {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
