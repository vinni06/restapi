package com.mindtree.channel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.channel.entity.Shows;

@Repository
public interface ShowRepository extends JpaRepository<Shows, Integer> {

}
