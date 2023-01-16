package mall.infra;
import mall.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class InventoryManagementHateoasProcessor implements RepresentationModelProcessor<EntityModel<InventoryManagement>>  {

    @Override
    public EntityModel<InventoryManagement> process(EntityModel<InventoryManagement> model) {

        
        return model;
    }
    
}
