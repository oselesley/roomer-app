package com.decagon.roomerapp.repositories;

import com.decagon.roomerapp.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
