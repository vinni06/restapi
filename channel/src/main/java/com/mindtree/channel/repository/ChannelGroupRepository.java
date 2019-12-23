package com.mindtree.channel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.channel.entity.ChannelGroup;

@Repository
public interface ChannelGroupRepository extends JpaRepository<ChannelGroup, Integer> {

}
