package hello;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface AccountsRepository extends CrudRepository<Accounts, Long> {

    public Accounts findByaccountNumber(long accountNumber);
}
