package uia.com.api.neo4j_inventario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import uia.com.api.neo4j_inventario.service.ItemService;

public class ItemController {
    private ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping
    public ResponseEntity<ItemDTO> save (@RequestBody ItemDTO itemDTO){
        ItemDTO response = ItemService.save(ItemDTO);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
