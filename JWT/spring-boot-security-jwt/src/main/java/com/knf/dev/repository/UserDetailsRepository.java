package com.knf.dev.repository;

import com.knf.dev.models.DetailsUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepository extends JpaRepository<DetailsUser,Integer> {



}
