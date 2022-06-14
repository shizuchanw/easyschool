package com.florawang.easyschool.repository;

import com.florawang.easyschool.model.EasyClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EasyClassRepository extends JpaRepository<EasyClass, Integer> {

}
