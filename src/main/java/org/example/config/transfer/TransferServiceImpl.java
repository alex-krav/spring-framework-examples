package org.example.config.transfer;

public class TransferServiceImpl implements TransferService {

    private AccountRepository accountRepository;

    public TransferServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public String toString() {
        return super.toString() + " + " + accountRepository;
    }
}
