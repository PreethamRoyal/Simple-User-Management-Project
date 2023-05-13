package net.javaguides.UserManagemnt.repository;

import net.javaguides.UserManagemnt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
