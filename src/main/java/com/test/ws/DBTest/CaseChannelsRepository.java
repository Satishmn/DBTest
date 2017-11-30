package com.test.ws.DBTest;


import org.springframework.data.repository.CrudRepository;

import com.test.ws.DBTest.CaseChannels;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CaseChannelsRepository extends CrudRepository<CaseChannels, Long> {

}