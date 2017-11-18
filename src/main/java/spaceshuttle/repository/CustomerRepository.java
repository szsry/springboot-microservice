package spaceshuttle.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import spaceshuttle.model.Customer;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    Customer findByFirstName(String firstName);

    List<Customer> findByLastName(String lastName);

    List<Customer> findByLastNameStartsWithIgnoreCase(String lastName);
}
