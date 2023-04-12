package uia.com.api.neo4j_inventario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Validator;

@Service
public class ItemService {
    ItemRepository repository;
    Validator validator;

    @Autowired
    public ItemService(ItemRepository repository, Validator validator) {
        this.repository = repository;
        this.validator = validator;
    }
    public ItemDTO save(ItemDTO item){
        return saveInformation(item);
    }
}
