package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class InventoryDecreased extends AbstractEvent {

    private Long id;

    public InventoryDecreased(InventoryManagement aggregate){
        super(aggregate);
    }
    public InventoryDecreased(){
        super();
    }
}
