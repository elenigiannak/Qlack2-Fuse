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
package com.eurodyn.qlack2.fuse.simm.impl.model;
// Generated by Hibernate Tools 3.2.4.GA

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * SimHomepageActivity generated by hbm2java
 */
@Entity
@Table(name="sim_homepage_activity"
)
public class SimHomepageActivity  implements java.io.Serializable {


     private String id;
     private SimHomepageActivity parentHpageActvtId;
     private String homepageId;
     private long createdOn;
     private String createdByUserId;
     private Byte status;
     private String title;
     private String description;
     private String link;
     private String categoryId;
     private String categoryIcon;
     private Set<SimHomepageActivityBin> simHomepageActivityBins = new HashSet<SimHomepageActivityBin>(0);
     private Set<SimHomepageActivity> simHomepageActivities = new HashSet<SimHomepageActivity>(0);

    public SimHomepageActivity() {
    }


    public SimHomepageActivity(String homepageId, long createdOn) {
        this.homepageId = homepageId;
        this.createdOn = createdOn;
    }
    public SimHomepageActivity(SimHomepageActivity parentHpageActvtId, String homepageId, long createdOn, String createdByUserId, Byte status, String title, String description, String link, String categoryId, String categoryIcon, Set<SimHomepageActivityBin> simHomepageActivityBins, Set<SimHomepageActivity> simHomepageActivities) {
       this.parentHpageActvtId = parentHpageActvtId;
       this.homepageId = homepageId;
       this.createdOn = createdOn;
       this.createdByUserId = createdByUserId;
       this.status = status;
       this.title = title;
       this.description = description;
       this.link = link;
       this.categoryId = categoryId;
       this.categoryIcon = categoryIcon;
       this.simHomepageActivityBins = simHomepageActivityBins;
       this.simHomepageActivities = simHomepageActivities;
    }

		@Id
		public String getId() {
		if (this.id == null) {
             this.id = java.util.UUID.randomUUID().toString();
         }

		 return this.id;
		}

    public void setId(String id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="parent_hpage_actvt_id")
		public SimHomepageActivity getParentHpageActvtId() {
			return this.parentHpageActvtId;
		}

    public void setParentHpageActvtId(SimHomepageActivity parentHpageActvtId) {
        this.parentHpageActvtId = parentHpageActvtId;
    }

    @Column(name="homepage_id", nullable=false, length=36)
		public String getHomepageId() {
			return this.homepageId;
		}

    public void setHomepageId(String homepageId) {
        this.homepageId = homepageId;
    }

    @Column(name="created_on", nullable=false)
		public long getCreatedOn() {
			return this.createdOn;
		}

    public void setCreatedOn(long createdOn) {
        this.createdOn = createdOn;
    }

    @Column(name="created_by_user_id", length=36)
		public String getCreatedByUserId() {
			return this.createdByUserId;
		}

    public void setCreatedByUserId(String createdByUserId) {
        this.createdByUserId = createdByUserId;
    }

    @Column(name="status")
		public Byte getStatus() {
			return this.status;
		}

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Column(name="title", length=2048)
		public String getTitle() {
			return this.title;
		}

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name="description", length=65535)
		public String getDescription() {
			return this.description;
		}

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name="link", length=1024)
		public String getLink() {
			return this.link;
		}

    public void setLink(String link) {
        this.link = link;
    }

    @Column(name="category_id", length=36)
		public String getCategoryId() {
			return this.categoryId;
		}

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    @Column(name="category_icon", length=512)
		public String getCategoryIcon() {
			return this.categoryIcon;
		}

    public void setCategoryIcon(String categoryIcon) {
        this.categoryIcon = categoryIcon;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="activityId")
		public Set<SimHomepageActivityBin> getSimHomepageActivityBins() {
			return this.simHomepageActivityBins;
		}

    public void setSimHomepageActivityBins(Set<SimHomepageActivityBin> simHomepageActivityBins) {
        this.simHomepageActivityBins = simHomepageActivityBins;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="parentHpageActvtId")
		public Set<SimHomepageActivity> getSimHomepageActivities() {
			return this.simHomepageActivities;
		}

    public void setSimHomepageActivities(Set<SimHomepageActivity> simHomepageActivities) {
        this.simHomepageActivities = simHomepageActivities;
    }




}


