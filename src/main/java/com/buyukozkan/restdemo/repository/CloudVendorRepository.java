package com.buyukozkan.restdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buyukozkan.restdemo.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {

    
}
