import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class JsonToMapTest {

    @Test
    public void shouldMapJsonStringToMap() throws Exception{
        URL JSON_SOURCE = ClassLoader.getSystemResource("example.json");
        Map<String,Object> result =
                new ObjectMapper().readValue(JSON_SOURCE, HashMap.class);

        assertThat(result.containsKey("glossary"), is(true));
    }

}
