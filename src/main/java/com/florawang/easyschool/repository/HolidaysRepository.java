package com.florawang.easyschool.repository;

import com.florawang.easyschool.model.Holiday;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
@Repository stereotype annotation is used to add a bean of this class
type to the Spring context and indicate that given Bean is used to perform
DB related operations and
* */
@Repository
public interface HolidaysRepository extends CrudRepository<Holiday, String> {

}
