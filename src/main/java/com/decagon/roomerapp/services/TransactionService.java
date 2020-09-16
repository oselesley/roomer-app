package com.decagon.roomerapp.services;

import com.decagon.roomerapp.dtos.TransactionDto;
import com.decagon.roomerapp.models.Transaction;

import java.util.List;

public interface TransactionService {
    Transaction createTransaction(Transaction transaction);
    TransactionDto getTransactionById (Long id);
    TransactionDto getTransactionByUserId(Long UserId);
    TransactionDto cancelTransaction(Long id);
    List<Transaction> getAllTransactions();
}
