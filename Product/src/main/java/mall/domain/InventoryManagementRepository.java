package mall.domain;

import mall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="inventoryManagements", path="inventoryManagements")
public interface InventoryManagementRepository extends PagingAndSortingRepository<InventoryManagement, Long>{

}
