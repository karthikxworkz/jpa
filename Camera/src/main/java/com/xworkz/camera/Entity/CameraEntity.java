package com.xworkz.camera.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
//byname
@NamedQuery(name = "findscompanynamebyname", query = "SELECT entity.name FROM CameraEntity entity WHERE entity.name=:nameby")
@NamedQuery(name = "findspricebyname", query = "SELECT  entity.price FROM CameraEntity entity WHERE entity.name=:nameby")
@NamedQuery(name = "findsidbyname", query = "SELECT  entity.id FROM CameraEntity entity WHERE entity.name=:nameby")
@NamedQuery(name = "findscompanynameandpricebyname", query = "SELECT entity.companyname,entity.price FROM CameraEntity entity WHERE entity.name=:nameby")
@NamedQuery(name="findslensnamebyname",query="SELECT entity.lensname FROM CameraEntity entity WHERE entity.name=:nameby")
//byid
@NamedQuery(name="findsnamebyid",query="SELECT entity.name FROM CameraEntity entity WHERE entity.id=:idby")
@NamedQuery(name="findscompanynamebyid",query="SELECT entity.companyname FROM CameraEntity entity WHERE entity.id=:idby")
@NamedQuery(name="findspricebyid",query="SELECT entity.price FROM CameraEntity entity WHERE entity.id=:idby")
@NamedQuery(name="findslensnamebyid",query="SELECT entity.lensname FROM CameraEntity entity WHERE entity.id=:idby")
@NamedQuery(name = "findsnameandpricebyid", query = "SELECT entity.name,entity.price FROM CameraEntity entity WHERE entity.id=:idby")
//byprice
@NamedQuery(name="findsnamebyprice",query="SELECT entity.name FROM CameraEntity entity WHERE entity.price=:priceby")
@NamedQuery(name="findsidbyprice",query="SELECT entity.id FROM CameraEntity entity WHERE entity.price=:priceby")
@NamedQuery(name="findscompanynamebyprice",query="SELECT entity.companyname FROM CameraEntity entity WHERE entity.price=:priceby")
@NamedQuery(name="findslensnamebyprice",query="SELECT entity.companyname FROM CameraEntity entity WHERE entity.price=:priceby")
@NamedQuery(name = "findsnameandidbyprice", query = "SELECT entity.name,entity.id FROM CameraEntity entity WHERE entity.price=:priceby")
//bycompanyname
@NamedQuery(name = "findsnamebycompanyname", query = "SELECT entity.name FROM CameraEntity entity WHERE entity.companyname=:companynameby")
@NamedQuery(name = "findslensnamebycompanyname", query = "SELECT entity.lensname FROM CameraEntity entity WHERE entity.companyname=:companynameby")
@NamedQuery(name = "findspricebycompanyname", query = "SELECT  entity.price FROM CameraEntity entity WHERE entity.companyname=:companynameby")
@NamedQuery(name = "findsidbycompanyname", query = "SELECT  entity.id FROM CameraEntity entity WHERE entity.companyname=:companynameby")
@NamedQuery(name = "findsnameandpricebycompanyname", query = "SELECT entity.name,entity.price FROM CameraEntity entity WHERE entity.companyname=:companynameby")
//bylensname
@NamedQuery(name = "findsnamebylensname", query = "SELECT entity.name FROM CameraEntity entity WHERE entity.lensname=:lensnameby")
@NamedQuery(name = "findscompanynamebylensname", query = "SELECT entity.companyname FROM CameraEntity entity WHERE entity.lensname=:lensnameby")
@NamedQuery(name = "findspricebylensname", query = "SELECT entity.price FROM CameraEntity entity WHERE entity.lensname=:lensnameby")
@NamedQuery(name = "findsidbylensname", query = "SELECT entity.id FROM CameraEntity entity WHERE entity.lensname=:lensnameby")
@NamedQuery(name = "findsnameandpricebylensname", query = "SELECT entity.name,entity.price FROM CameraEntity entity WHERE entity.lensname=:lensnameby")


public class CameraEntity {
	@Id
	@Column(name = "camera_id")
	private int id;
	@Column(name = "camera_name")
	private String name;
	@Column(name = "camera_price")
	private int price;
	@Column(name = "camera_lensname")
	private String lensname;
	@Column(name = "camera_companyname")
	private String companyname;

}
