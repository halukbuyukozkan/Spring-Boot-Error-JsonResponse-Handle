package com.buyukozkan.restdemo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.buyukozkan.restdemo.exception.CloudVendorNotFoundException;
import com.buyukozkan.restdemo.model.CloudVendor;
import com.buyukozkan.restdemo.repository.CloudVendorRepository;
import com.buyukozkan.restdemo.service.CloudVendorService;

@Service
public class CloudVendorServiceImpl implements CloudVendorService{

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    CloudVendorRepository cloudVendorRepository;

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        // More logic can be added here.
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Success";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        if(cloudVendorRepository.findById(cloudVendorId).isEmpty())
            throw new CloudVendorNotFoundException("Requested cloud vendor does not exist", null);
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
    
}
