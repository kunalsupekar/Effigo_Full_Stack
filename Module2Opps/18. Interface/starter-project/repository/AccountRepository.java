package repository;

import java.util.HashMap;
import java.util.Map;

import pojo.Account;
import pojo.Checking;

public class AccountRepository {

    private Map<String, Account> datastore = new HashMap<>();

    

     public void createAccount(Account account) {
        this.datastore.put( account.getId(),account.clonee());
    }

    public Account retrieveAccount(String id) {
        return this.datastore.get(id).clonee();
    }

    public void updateAccount(Account account) {
            this.datastore.put(account.getId(), account.clonee());
    }

    public void deleteAccount(String id) {
        this.datastore.remove(id);
    }
   

}

