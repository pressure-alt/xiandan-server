package com.huang.biz.service;

import com.huang.dao.entity.Address;

import java.util.List;

public interface AddressService {
    List<Address> getUserAllAddresses();
    long insertAddress(Address address);
    long updateAddress(long userId,long addressId);
    long deleteAddress(long userId,long addressId);
}
