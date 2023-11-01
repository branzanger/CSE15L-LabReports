import java.net.URI;

class DoubleHandler implements URLHandler {
    String template = "Doubling %d produces %d.";

    public String handleRequest(URI url) {
        if (url.getPath().equals("/double")) {
            String[] params = url.getQuery().split("=");
            if (params[0].equals("num")) {
                int num = Integer.parseInt(params[1]);
                int doubl = num + 2;
                return String.format(template, num, doubl);
            }
        }
        return "404 Not Found!";
    }
}