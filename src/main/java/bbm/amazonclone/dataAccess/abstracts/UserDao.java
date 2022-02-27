package bbm.amazonclone.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import bbm.amazonclone.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
