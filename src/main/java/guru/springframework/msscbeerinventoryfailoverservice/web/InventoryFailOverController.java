package guru.springframework.msscbeerinventoryfailoverservice.web;

import guru.sfg.common.BeerInventoryDto;
import guru.springframework.msscbeerinventoryfailoverservice.service.InventoryFailOverService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class InventoryFailOverController {
    private final InventoryFailOverService inventoryFailOverService;

    @GetMapping("/inventory-failover")
    public List<BeerInventoryDto> getBeerInventory(){
        return Arrays.asList(inventoryFailOverService.getBeerInventory());
    }
}
