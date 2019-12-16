package edu.PCD.PodcastCollector;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
public class AppTest {
    private final MainApp main=new MainApp();
    @Test
    public void testMain() {
        assertNotNull( main.toString(),"app should have a greeting");
    }
}
