package com.xoriant.vaccination.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xoriant.vaccination.entiry.Consumer;

@Repository
public interface ConsumerRepository extends JpaRepository<Consumer, Long> {

}
