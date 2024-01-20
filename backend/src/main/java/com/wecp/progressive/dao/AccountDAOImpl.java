package com.wecp.progressive.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import com.wecp.progressive.entity.Accounts;

public class AccountDAOImpl implements AccountDAO{
      private   List<Accounts> acc=new ArrayList<Accounts>();
   
    @Override
    public int addAccount(Accounts accounts) {
        // TODO Auto-generated method stub
        acc.add(accounts);
       return 1;
    
        //throw new UnsupportedOperationException("Unimplemented method 'addAccount'");
    }
     public void addCustomerToArrayList(Accounts accounts){
          acc.add(accounts);
     }
    @Override
    public Accounts getAccountById(int accountId) {
        // TODO Auto-generated method stub
        Accounts ac=null;
        for(Accounts a:acc){
            if(a.getAccount_id()==accountId){
                ac= a;
                
            }
            else{ try {
                throw new AccountNotFoundException();
            } catch (AccountNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }}
        }
        return ac;
        
        //throw new UnsupportedOperationException("Unimplemented method 'getAccountById'");
    }

    @Override
    public void updateAccount(Accounts accounts) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAccount'");
    }

    @Override
    public void deleteAccount(int accountId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAccount'");
    }

    @Override
    public List<Accounts> getAllAccounts() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllAccounts'");
    }

}
