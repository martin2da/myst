package msashop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import msashop.domain.*;
import msashop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class InventoryIncresed extends AbstractEvent {

    private Long id;

    public InventoryIncresed(Inventory aggregate) {
        super(aggregate);
    }

    public InventoryIncresed() {
        super();
    }
}
//>>> DDD / Domain Event
