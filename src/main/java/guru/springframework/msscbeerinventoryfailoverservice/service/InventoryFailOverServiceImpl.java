package guru.springframework.msscbeerinventoryfailoverservice.service;

import guru.sfg.common.InventoryFailOverDto;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.UUID;

@Service
public class InventoryFailOverServiceImpl implements InventoryFailOverService {
    @Override
    public InventoryFailOverDto getBeerInventory(UUID beerId) {
        return InventoryFailOverDto.builder()
                .createdDate(OffsetDateTime.now())
                .lastModifiedDate(OffsetDateTime.now())
                .Id(UUID.randomUUID())
                //.quantityOnHand(999)
                .build();
    }
}
