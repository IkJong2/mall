package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Canceled extends AbstractEvent {

    private Long id;
    private String productName;
    private Long customerId;
    private Integer qty;
    private String status;
    private String address;

    public Canceled(Order aggregate){
        super(aggregate);
    }
    public Canceled(){
        super();
    }
}
