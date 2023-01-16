package mall.infra;

import mall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="selectProducts", path="selectProducts")
public interface SelectProductRepository extends PagingAndSortingRepository<SelectProduct, Long> {

    

    
}
