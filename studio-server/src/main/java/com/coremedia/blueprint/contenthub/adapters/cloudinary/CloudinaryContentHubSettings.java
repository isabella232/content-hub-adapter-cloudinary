package com.coremedia.blueprint.contenthub.adapters.cloudinary;


/**
 * Interface that marks the settings that are needed for a connection to CLoudinary
 */
interface CloudinaryContentHubSettings {

  /**
   * @return the name
   */
  String getDisplayName();

  //--------------------# Cloudinary settings #--------------------//

  /**
   * @return name of Cloudinary cloud
   */
  String getCloudName();

  /**
   * @return apiKey
   */
  String getApiKey();

  /**
   * @return apiSecret
   */
  String getApiSecret();

}