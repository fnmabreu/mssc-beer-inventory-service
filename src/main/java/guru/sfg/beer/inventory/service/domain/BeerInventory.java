package guru.sfg.beer.inventory.service.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;
import java.util.UUID;

/**
 * Created by fabreu on 21/11/2021
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
public class BeerInventory extends BaseEntity {

    @Type(type="org.hibernate.type.UUIDCharType")
    @Column(length = 36, columnDefinition = "varchar(36)", updatable = false, nullable = false )
    private UUID beerId;

    private String upc;
    private Integer quantityOnHand = 0;

    @Builder
    public BeerInventory(UUID id, Long version, Timestamp createdDate, Timestamp lastModifiedDate, UUID beerId,
                         String upc, Integer quantityOnHand) {
        super(id, version, createdDate, lastModifiedDate);
        this.beerId = beerId;
        this.upc = upc;
        this.quantityOnHand = quantityOnHand;
    }
}
