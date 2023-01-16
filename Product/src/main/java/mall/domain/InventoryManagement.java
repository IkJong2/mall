package mall.domain;

import mall.domain.InventoryDecreased;
import mall.domain.InventoryIncreased;
import mall.ProductApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="InventoryManagement_table")
@Data

public class InventoryManagement  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){


        InventoryDecreased inventoryDecreased = new InventoryDecreased(this);
        inventoryDecreased.publishAfterCommit();



        InventoryIncreased inventoryIncreased = new InventoryIncreased(this);
        inventoryIncreased.publishAfterCommit();

    }

    public static InventoryManagementRepository repository(){
        InventoryManagementRepository inventoryManagementRepository = ProductApplication.applicationContext.getBean(InventoryManagementRepository.class);
        return inventoryManagementRepository;
    }




    public static void inventoryModified(DeliveryStarted deliveryStarted){

        /** Example 1:  new item 
        InventoryManagement inventoryManagement = new InventoryManagement();
        repository().save(inventoryManagement);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryStarted.get???()).ifPresent(inventoryManagement->{
            
            inventoryManagement // do something
            repository().save(inventoryManagement);


         });
        */

        
    }
    public static void inventoryModified(DeliveryCanceled deliveryCanceled){

        /** Example 1:  new item 
        InventoryManagement inventoryManagement = new InventoryManagement();
        repository().save(inventoryManagement);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCanceled.get???()).ifPresent(inventoryManagement->{
            
            inventoryManagement // do something
            repository().save(inventoryManagement);


         });
        */

        
    }


}
