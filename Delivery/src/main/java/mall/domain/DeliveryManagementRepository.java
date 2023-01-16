package mall.domain;

import mall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="deliveryManagements", path="deliveryManagements")
public interface DeliveryManagementRepository extends PagingAndSortingRepository<DeliveryManagement, Long>{

}
