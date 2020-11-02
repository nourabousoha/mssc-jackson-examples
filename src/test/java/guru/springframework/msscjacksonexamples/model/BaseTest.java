package guru.springframework.msscjacksonexamples.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class BaseTest {
    public  BeerDto getDto()
    {
        return BeerDto.builder().beerName("Special")
                                .beerStyle("Golden")
                                .price(BigDecimal.valueOf(13.25))
                                .upc(1233455666L)
                                .createdDate(OffsetDateTime.now())
                                .lastUpdatedDate(OffsetDateTime.now())
                                .build();

    }}
