package guru.springframework.msscjacksonexamples.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Created by Donald F. Coffin on 07/11/2019 at 18:39
 */
public class BaseTest {
    BeerDto getDto() {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("BeerName")
                .beerStyle("Ale")
                .upc(123123123123L)
                .price(new BigDecimal("12.99"))
                .createdDate(OffsetDateTime.now())
                .lastUpdatedDate(OffsetDateTime.now())
                .build();
    }
}
