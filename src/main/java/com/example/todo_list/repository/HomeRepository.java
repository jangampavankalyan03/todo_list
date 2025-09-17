package com.example.todo_list.repository;

import com.example.todo_list.model.Lists;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends JpaRepository<Lists,Integer> {

}
