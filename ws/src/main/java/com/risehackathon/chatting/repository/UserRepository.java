package com.risehackathon.chatting.repository;

import com.risehackathon.chatting.model.UserDetails;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserDetails,String>{

}
