package guru.springframework.msscbeerinventoryfailoverservice.service;

import guru.sfg.common.InventoryFailOverDto;

import java.util.UUID;

public interface InventoryFailOverService {
    InventoryFailOverDto getBeerInventory(UUID beerId);
}
