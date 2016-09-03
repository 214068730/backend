package droid_backend.repository;

import droid_backend.domain.customer.Customer;
import org.springframework.data.repository.CrudRepository;


/**
 * Created by Siraaj on 08/03/2016.
 */




public interface CustomerRepository  extends CrudRepository<Customer,Long>  {
}
