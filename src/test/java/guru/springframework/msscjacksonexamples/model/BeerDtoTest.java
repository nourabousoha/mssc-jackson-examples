package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
@JsonTest
class BeerDtoTest extends BaseTest {
    @Autowired
    ObjectMapper objectMapper;
    @Test
    public void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto=getDto();
        String jsonString = objectMapper.writeValueAsString(beerDto);
        System.out.println(jsonString);
    }

    @Test
    void testDeserializeDto() throws IOException {
        String jsonString ="{\"id\":null,\"beerName\":\"Special\",\"beerStyle\":\"Golden\",\"upc\":1233455666,\"price\":13.25,\"createdDate\":\"2020-11-02T10:25:43.2912066+01:00\",\"lastUpdatedDate\":\"2020-11-02T10:25:43.2912066+01:00\"}";
        BeerDto beerDto =objectMapper.readValue(jsonString,BeerDto.class);
        System.out.println(beerDto);
    }
}