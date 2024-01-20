package com.wecp.progressive.dao;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.dto.CustomerAccountInfo;
import com.wecp.progressive.entity.Customers;

public class CustomerDAOImpl implements CustomerDAO{
  ArrayList<Customers> custList=new ArrayList<>();
    @Override
    public int addCustomer(Customers customers) {
        // TODO Auto-generated method stub
        custList.add(customers);
        return 1;
       // throw new UnsupportedOperationException("Unimplemented method 'addCustomer'");
    }

    @Override
    public Customers getCustomerById(int customerId)  {
        // TODO Auto-generated method stub
        boolean found=false;
        Customers cfound=null;
        for(Customers c:custList){
            if(c.getCustomer_id()==customerId){
                cfound=c;
                found=true;
                break;
            }
        }
        if(found){
            return cfound;
        }
        else{
            throw new UnsupportedOperationException("record not found ");
    
        }
        }

    @Override
    public void updateCustomer(Customers customers) {
        // TODO Auto-generated method stub
        for(int i=0; i<custList.size();i++){
            Customers p =custList.get(i);
            if(customers.getCustomer_id()==p.getCustomer_id()){
                custList.set(i, customers);
            }
        }
        throw new UnsupportedOperationException("Unimplemented method 'updateCustomer'");
    }

    @Override
    public void deleteCustomer(int customerId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteCustomer'");
    }

    @Override
    public List<Customers> getAllCustomers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllCustomers'");
    }

    @Override
    public CustomerAccountInfo getCustomerAccountInfo(int customerId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCustomerAccountInfo'");
    }

}
