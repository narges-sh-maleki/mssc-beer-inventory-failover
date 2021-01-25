package guru.springframework.msscbeerinventoryfailoverservice.service;

import guru.sfg.common.BeerInventoryDto;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.UUID;

@Service
public class InventoryFailOverServiceImpl implements InventoryFailOverService {
    @Override
    public BeerInventoryDto getBeerInventory() {
        return BeerInventoryDto.builder()
                .createdDate(OffsetDateTime.now())
                .lastModifiedDate(OffsetDateTime.now())
                .id(UUID.randomUUID())
                .quantityOnHand(999)
                .build();
    }
}
