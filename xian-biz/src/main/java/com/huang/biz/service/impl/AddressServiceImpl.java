package com.huang.biz.service.impl;

import com.huang.biz.service.AddressService;
import com.huang.dao.entity.Address;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Override
    public List<Address> getUserAllAddresses() {
        return null;
    }

    @Override
    public long insertAddress(Address address) {
        return 0;
    }

    @Override
    public long updateAddress(long userId, long addressId) {
        return 0;
    }

    @Override
    public long deleteAddress(long userId, long addressId) {
        return 0;
    }
}
