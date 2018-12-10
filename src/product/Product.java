package product;
/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

import java.util.*; // Need to import the Java Utilities to use builtin Date method



// Create an abstract type called Product that will implement the Item interface
public abstract class Product implements Item {

  // Declaration of class variables
  private static int serialNumber;
  private static Date manufacturedOn;
  private static String name;
  private static int currentProductionNumber; // Add an integer class variable called currentProductionNumber

  // Implementation of Interface methods

  
  @Override
  public String getName() { // Add a constructor that will take in the name of the product and set this to the field variable name
    return name;
  }

  @Override
  public Date getManufactureDate() {
    manufacturedOn = new java.util.Date();
    return manufacturedOn;
  }

  @Override
  public void setName(String name) { // Add a constructor that will take in the name of the product and set this to the field variable name
    Product.name = name;
  }

  @Override
  public int getSerialNumber() { //  assign a serial number from the currentProductionNumber
    serialNumber = ++currentProductionNumber; // The currentProductionNumbershould be incremented in readiness for the next instance
    return serialNumber;
  }

  @Override
  public void setProductionNumber(int pn) {
  }

  // Default Constructor
  public Product() {
    name = DEFAULTNAME;
    serialNumber = getSerialNumber();
    manufacturedOn = getManufactureDate();
  }

  // Constructor with product name parameter of the String type

  public Product(String name) {
    Product.name = name;
    serialNumber = getSerialNumber();
    manufacturedOn = getManufactureDate();
  }

  public String toString() { // Add a toString method that will return the following:
    return "Manufacturer   : " + Product.MANUFACTURER +
        "\nSerial Number  : " + Product.serialNumber +
        "\nDate           : " + Product.manufacturedOn +
        "\nName           : " + Product.name;
  }

}
