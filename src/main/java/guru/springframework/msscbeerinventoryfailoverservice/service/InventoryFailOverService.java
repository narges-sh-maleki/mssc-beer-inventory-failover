package guru.springframework.msscbeerinventoryfailoverservice.service;

import guru.sfg.common.BeerInventoryDto;

import java.util.UUID;

public interface InventoryFailOverService {
    BeerInventoryDto getBeerInventory();
}
