package com.cloud.vendor.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.vendor.entity.EntityCloud;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
	
	EntityCloud entity;

@GetMapping("{vendorId}")
public EntityCloud getVendorDetails(String vendorId)
{
	return entity;
}

@GetMapping()
public EntityCloud getVendorDetails(EntityCloud entity)
{
	return entity;
}
/*
 * @GetMapping() public EntityCloud getVendorDetails(@RequestBody EntityCloud
 * entity) { return entity; }
 */
@PostMapping()
	public String CreateVendorDetails(@RequestBody EntityCloud entity)
	
	{
		this.entity=entity;
		return "vendor details created successfully";
	}
@PutMapping("{vendorId}")
public String updateVendorDetails(@RequestBody EntityCloud entity)

{
	this.entity=entity;
	return "vendor details udfnlkjflpdated successfully";
}
@DeleteMapping("{vendorId}")
public String deleteVendorDetails(@RequestBody EntityCloud entity)
{
	this.entity=null;
	return "vendor details deleted successfully";
}
}
