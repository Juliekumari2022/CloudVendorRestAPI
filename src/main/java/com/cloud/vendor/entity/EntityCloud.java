package com.cloud.vendor.entity;

public class EntityCloud {
	private String vendorId;
	private String vendorName;
	private String vendorAddress;
	private long vendorPhone;
	public EntityCloud() {

	}
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorAddress() {
		return vendorAddress;
	}
	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}
	public long getVendorPhone() {
		return vendorPhone;
	}
	public void setVendorPhone(long vendorPhone) {
		this.vendorPhone = vendorPhone;
	}
	public EntityCloud(String vendorId, String vendorName, String vendorAddress, long vendorPhone) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
		this.vendorPhone = vendorPhone;
	}
	

}
