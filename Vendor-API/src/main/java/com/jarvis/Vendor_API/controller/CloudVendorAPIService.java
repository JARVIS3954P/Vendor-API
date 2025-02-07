package com.jarvis.Vendor_API.controller;

import com.jarvis.Vendor_API.model.CloudVendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    @Autowired
    CloudVendor cV;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        return cV;
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cV){
        this.cV =cV;
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cV){
        this.cV =cV;
        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId){
        this.cV =null;
        return "Cloud Vendor Deleted Successfully";
    }
}
