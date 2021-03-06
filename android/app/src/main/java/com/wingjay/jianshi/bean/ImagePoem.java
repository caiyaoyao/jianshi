package com.wingjay.jianshi.bean;

import com.google.gson.annotations.SerializedName;

/**
 * Image with three-line poem in home page.
 */
public class ImagePoem {

  @SerializedName("image")
  private String imageUrl;

  // poem must include three part text, and splited by -.
  // such as: XXX-AAAA-BB
  @SerializedName("poem")
  private String poem;

  @SerializedName("next_fetch_time")
  private long nextFetchTime;

  public String getImageUrl() {
    return imageUrl;
  }

  public String getPoem() {
    return poem;
  }

  public long getNextFetchTimeSec() {
    return nextFetchTime;
  }
}
