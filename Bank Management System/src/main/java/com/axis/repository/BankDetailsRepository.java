package com.axis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.model.BankDetails;


@Repository

public interface BankDetailsRepository extends JpaRepository<BankDetails, Long> {


}
