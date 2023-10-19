import static org.junit.Assert.*;
import org.junit.*;
import java.net.URI;


public class HandlerTests {
    @Test
    public void handleRequest1() throws Exception {
        DoubleHandler h = new DoubleHandler();
        String url = "http://localhost:8080/double?num=1";
        URI input = new URI(url);
        String expected = "Doubling 1 produces 2.";
        assertEquals(expected, h.handleRequest(input));
    }

    @Test
    public void handleRequest2() throws Exception {
        DoubleHandler h = new DoubleHandler();
        String url = "http://localhost:8080/double?num=2";
        URI input = new URI(url);
        String expected = "Doubling 2 produces 4.";
        assertEquals(expected, h.handleRequest(input));
    }
}