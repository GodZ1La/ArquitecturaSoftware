package uia.com.api.neo4j_inventario.repository;

import org.springframework.data.repository.CrudRepository;
import uia.com.api.neo4j_inventario.model.Item;

import java.util.List;

public interface ItemRepository extends CrudRepository<Item, Long>{
    List<Item> findByName(String name);
}
