package com.wecp.progressive.service;

import java.sql.SQLException;

import java.util.*;

import com.wecp.progressive.dao.AccountDAO;
import com.wecp.progressive.entity.Accounts;



public class AccountServiceImpl implements AccountService {
    private static List<Accounts> al;
    private AccountDAO accDao;
    public AccountServiceImpl(AccountDAO accDao) {
        this.accDao = accDao;
    }

    @Override
    public List<Accounts> getAllAccounts() throws SQLException {
        // TODO Auto-generated method stub
        return al;
        //throw new UnsupportedOperationException("Unimplemented method 'getAllAccounts'");
    }

    @Override
    public List<Accounts> getAccountsByUser(int userId) throws SQLException {
        // TODO Auto-generated method stub
        return al;
        //throw new UnsupportedOperationException("Unimplemented method 'getAccountsByUser'");
    }

    @Override
    public Accounts getAccountById(int accountId) throws SQLException {
        // TODO Auto-generated method stub
        return null;
        //throw new UnsupportedOperationException("Unimplemented method 'getAccountById'");
    }

    @Override
    public int addAccount(Accounts accounts) throws SQLException {
        // TODO Auto-generated method stub
        al.add(accounts);
        return 1;
        //throw new UnsupportedOperationException("Unimplemented method 'addAccount'");
    }

    @Override
    public void updateAccount(Accounts accounts) throws SQLException {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'updateAccount'");
    }

    @Override
    public void deleteAccount(int accountId) throws SQLException {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'deleteAccount'");
    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
        // TODO Auto-generated method stub
       return null;
       // throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsSortedByBalance'");
    }

    @Override
    public List<Accounts> getAllAccountsFromArrayList() {
        // TODO Auto-generated method stub
        return null;
        //throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsFromArrayList'");
    }

    @Override
    public List<Accounts> addAccountToArrayList(Accounts accounts) {
        // TODO Auto-generated method stub
        al.add(accounts);
        return al;
        //throw new UnsupportedOperationException("Unimplemented method 'addAccountToArrayList'");
    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalanceFromArrayList() {
        // TODO Auto-generated method stub
        List<Accounts> sortedList=al;
        Collections.sort(sortedList);
        return sortedList;
       // throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsSortedByBalanceFromArrayList'");
    }

    @Override
    public void emptyArrayList() {
        // TODO Auto-generated method stub
       al=new ArrayList<>();
        //throw new UnsupportedOperationException("Unimplemented method 'emptyArrayList'");
    }
   
}