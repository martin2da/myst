package msashop.domain;

import java.util.*;
import lombok.*;
import msashop.domain.*;
import msashop.infra.AbstractEvent;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private Long oderid;
    private String customerid;
    private String address;
    private String status;
}
