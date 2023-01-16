package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class InventoryIncreased extends AbstractEvent {

    private Long id;

    public InventoryIncreased(InventoryManagement aggregate){
        super(aggregate);
    }
    public InventoryIncreased(){
        super();
    }
}
