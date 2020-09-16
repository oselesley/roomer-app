package com.decagon.roomerapp.services.serviceimpl;

import com.decagon.roomerapp.dtos.TransactionDto;
import com.decagon.roomerapp.models.Transaction;
import com.decagon.roomerapp.services.TransactionService;

import java.util.List;

public class TransactionServiceImpl implements TransactionService {
    @Override
    public Transaction createTransaction(Transaction transaction) {
        return null;
    }

    @Override
    public TransactionDto getTransactionById(Long id) {
        return null;
    }

    @Override
    public TransactionDto getTransactionByUserId(Long UserId) {
        return null;
    }

    @Override
    public TransactionDto cancelTransaction(Long id) {
        return null;
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return null;
    }
}
