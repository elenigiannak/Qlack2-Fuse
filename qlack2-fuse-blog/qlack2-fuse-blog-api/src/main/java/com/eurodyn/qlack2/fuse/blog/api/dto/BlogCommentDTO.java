/*
* Copyright 2014 EUROPEAN DYNAMICS SA <info@eurodyn.com>
*
* Licensed under the EUPL, Version 1.1 only (the "License").
* You may not use this work except in compliance with the Licence.
* You may obtain a copy of the Licence at:
* https://joinup.ec.europa.eu/software/page/eupl/licence-eupl
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the Licence is distributed on an "AS IS" basis,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the Licence for the specific language governing permissions and
* limitations under the Licence.
*/
package com.eurodyn.qlack2.fuse.blog.api.dto;

import java.util.Date;
import java.util.List;

/**
 * Data Transfer object for Comment.
 * @author European Dynamics SA.
 */
public class BlogCommentDTO extends BlogBaseDTO {

  private static final long serialVersionUID = 7016699070798604818L;
  private String userId;
  private String body;
  private Date dtCommented;
  private String postId;
  private String postName;
  private List<BlogTrackbackDTO> trackbackUrls;

  /**
   * @return the body
   */
  public String getBody() {
    return body;
  }

  /**
   * @param body the body to set
   */
  public void setBody(String body) {
    this.body = body;
  }

  /**
   * @return the dtCommented
   */
  public Date getDtCommented() {
    return dtCommented;
  }

  /**
   * @param dtCommented the dtCommented to set
   */
  public void setDtCommented(Date dtCommented) {
    this.dtCommented = dtCommented;
  }

  /**
   * @return the postId
   */
  public String getPostId() {
    return postId;
  }

  /**
   * @param postId the postId to set
   */
  public void setPostId(String postId) {
    this.postId = postId;
  }

  /**
   * @return the userId
   */
  public String getUserId() {
    return userId;
  }

  /**
   * @param userId the userId to set
   */
  public void setUserId(String userId) {
    this.userId = userId;
  }

    /**
     * @return the trackbackUrls
     */
    public List<BlogTrackbackDTO> getTrackbackUrls() {
        return trackbackUrls;
    }

    /**
     * @param trackbackUrls the trackbackUrls to set
     */
    public void setTrackbackUrls(List<BlogTrackbackDTO> trackbackUrls) {
        this.trackbackUrls = trackbackUrls;
    }

    /**
     * @return the postName
     */
    public String getPostName() {
        return postName;
    }

    /**
     * @param postName the postName to set
     */
    public void setPostName(String postName) {
        this.postName = postName;
    }


}