package droid_backend.client;

import droid_backend.domain.address.AddressVO;
import droid_backend.domain.customer.Customer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Siraaj on 08/31/2016.
 */
@RestController
@RequestMapping(value="/")
public class LandingPage {
    @RequestMapping(method = RequestMethod.GET)
    public Customer getCustomer(){
        AddressVO addressVO = new AddressVO.AddressBuilder()
                .streetName("Sparrow")
                .suburb("Rpcklands")
                .postalCode("7798")
                .build();
        Customer customer = new Customer.CustomerBuild()
                .custCode(10L)
               .custName("Shireen")
                .address(addressVO)
                .build();
        return customer;
    }
}
