package uia.com.api.neo4j_inventario.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

@Node("Proveedor")
public class Proveedor {
    @Id
    @Autowired
    private Long id;

    @Property("name")
    private String name;

    @Property("status")
    private String status;

    @Property("clase")
    private String clase;

    private @Relationship Item item;
}
