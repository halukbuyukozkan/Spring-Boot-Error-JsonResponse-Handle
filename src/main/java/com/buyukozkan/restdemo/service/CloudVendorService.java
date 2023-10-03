package com.buyukozkan.restdemo.service;


import java.util.List;

import com.buyukozkan.restdemo.model.CloudVendor;

// This service interface is used to define the methods that will be used in the service implementation class.
public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);
    public CloudVendor getCloudVendor(String cloudVendorId);
    public List<CloudVendor> getAllCloudVendors();

}
