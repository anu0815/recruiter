package com.letsgettin.sahiudhyog.reposiotry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.letsgettin.sahiudhyog.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{

	List<Users> findByName(String text);

	List<Users> findByEmail(String email);

	

	//List<String> search(String keyword);

	@Query(value="select name from search where name like %:keyword%",nativeQuery=true)
	public List<String> search(@Param("keyword") String keyword);
}



	


	
