import static org.junit.Assert.*;
import org.junit.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;

public class TestDocSearch {
	@Test 
	public void testIndex() throws URISyntaxException, IOException {
    Handler h = new Handler("./technical/");
    URI rootPath = new URI("https://localhost/");
    assertEquals("There are 1 total files to search.", h.handleRequest(rootPath));
	}
	// @Test 
	// public void testSearch() throws URISyntaxException, IOException {
    // Handler h = new Handler("./technical");
    // URI rootPath = new URI("http://localhost/search?q=base%20pair");
    // String expect = "Found 3 paths:\n./technical/plos/journal.pbio.0020190.txt\n./technical/plos/journal.pbio.0020190.txt\n./technical/plos/journal.pbio.0020223.txt";
    // assertEquals(expect, h.handleRequest(rootPath));
	//}
}

