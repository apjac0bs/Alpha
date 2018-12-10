package product;
/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

public enum ItemType { //  Create an enum called ItemType that will store the following information
  AUDIO("AU"), VISUAL("VI"), AUDIO_MOBILE("AM"), VISUAL_MOBILE("VM");

  String code; // enables the abbreviated outputs

  ItemType(String code) {
    this.code = code;
  }


  public String getCode() {
    return code;
  }
}