package uia.com.api.neo4j_inventario.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.ArrayList;
import java.util.List;

@Node("Item")
public class Item {
    @Id
    @Autowired
    private Long id;

    @Relationship("items")
    private List<Item> items = new ArrayList<>();

    @Property("name")
    private String name;

    @Property("partida")
    private String partida;

    @Property("subpartida")
    private String subpartida;

    @Property("categoria")
    private String categoria;

    @Property("descripcion")
    private String descripcion;

    @Relationship("proveedor")
    private Proveedor proveedor;
}
