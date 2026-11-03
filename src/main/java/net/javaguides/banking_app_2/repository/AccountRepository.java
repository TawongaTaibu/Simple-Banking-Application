package net.javaguides.banking_app_2.repository;

import net.javaguides.banking_app_2.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
