package guru.springframework.msscbeerinventoryfailoverservice.web;

import guru.sfg.common.InventoryFailOverDto;
import guru.springframework.msscbeerinventoryfailoverservice.service.InventoryFailOverService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class InventoryFailOverController {
    private final InventoryFailOverService inventoryFailOverService;

    @GetMapping("api/v1/beer/{beerId}/inventory")
    public InventoryFailOverDto getBeerInventory(@PathVariable UUID beerId){
        return inventoryFailOverService.getBeerInventory(beerId);
    }
}
