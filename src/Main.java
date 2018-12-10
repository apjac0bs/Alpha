/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

import dev.*;
import java.util.*;
import java.util.concurrent.*;
import product.*;

// Main Driving Class for the project

public class Main {

  public static void main(String[] args) throws InterruptedException {

    // Simple banner to display current step
    System.out.println("########### Step 2 - Item Type Test ###########\n");

    // Iteration and printing of the enum product.ItemType using Lambda expression
    EnumSet.allOf(ItemType.class)
        .forEach(type -> System.out.println("Code: " + type.getCode() + " -> " + type));

    // Simple banner to display current step
    System.out.println("\n########### Step 3 ###########\n");
    ArrayList<String> devicesArrayList = new ArrayList<>();
    devicesArrayList.add("DVD");
    devicesArrayList.add("CD");
    devicesArrayList.add("Blu-ray");
    devicesArrayList.add("4K");
    devicesArrayList.add("3D");

    // Display the dev.Device information using the toString method - default constructor
    System.out.println(new Device() + "\n");

    // simple foreach to iterate through the devicesArrayList
    for (String aDevicesArrayList : devicesArrayList) {
      // Add random timeout to get unique time
      TimeUnit.SECONDS.sleep(new Random().nextInt(3) + 1);
      // Display the dev.Device information using the toString method
      System.out.println(new Device(aDevicesArrayList).toString() + "\n");
    }

    // Making sure the name parameter was not modified
    System.out.println(new Device());

  }
}