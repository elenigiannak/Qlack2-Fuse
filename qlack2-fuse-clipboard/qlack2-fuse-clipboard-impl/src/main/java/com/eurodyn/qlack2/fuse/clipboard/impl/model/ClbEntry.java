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
package com.eurodyn.qlack2.fuse.clipboard.impl.model;
// Generated by Hibernate Tools 3.2.4.GA

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ClbEntry generated by hbm2java
 */
@Entity
@Table(name="clb_entry"
)
public class ClbEntry  implements java.io.Serializable {


     private String id;
     private String ownerId;
     private String objectId;
     private String title;
     private String description;
     private String typeId;
     private long createdOn;
     private Set<ClbMetadata> clbMetadatas = new HashSet<ClbMetadata>(0);

    public ClbEntry() {
    }


    public ClbEntry(String ownerId, String objectId, long createdOn) {
        this.ownerId = ownerId;
        this.objectId = objectId;
        this.createdOn = createdOn;
    }
    public ClbEntry(String ownerId, String objectId, String title, String description, String typeId, long createdOn, Set<ClbMetadata> clbMetadatas) {
       this.ownerId = ownerId;
       this.objectId = objectId;
       this.title = title;
       this.description = description;
       this.typeId = typeId;
       this.createdOn = createdOn;
       this.clbMetadatas = clbMetadatas;
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

    @Column(name="owner_id", nullable=false, length=36)
		public String getOwnerId() {
			return this.ownerId;
		}

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    @Column(name="object_id", nullable=false, length=36)
		public String getObjectId() {
			return this.objectId;
		}

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    @Column(name="title", length=128)
		public String getTitle() {
			return this.title;
		}

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name="description", length=1024)
		public String getDescription() {
			return this.description;
		}

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name="type_id", length=36)
		public String getTypeId() {
			return this.typeId;
		}

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    @Column(name="created_on", nullable=false)
		public long getCreatedOn() {
			return this.createdOn;
		}

    public void setCreatedOn(long createdOn) {
        this.createdOn = createdOn;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="clbContentId")
		public Set<ClbMetadata> getClbMetadatas() {
			return this.clbMetadatas;
		}

    public void setClbMetadatas(Set<ClbMetadata> clbMetadatas) {
        this.clbMetadatas = clbMetadatas;
    }




}


