/**
 * 
 */
package net.talaatharb.helpdesk.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * AbstractModel entity
 * 
 * @author mharb
 *
 */
@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
public class AbstractModel {

	/**
	 * Creation date
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_AT", nullable = false, updatable = false)
	@CreatedDate
	private Date createdAt = new Date();

	/**
	 * Creation user
	 */
	@Column(name = "CREATED_BY", updatable = false)
	@CreatedBy
	private String createdBy = "";

	/**
	 * ID of the Entity
	 */
	@Id
	private UUID id;

	/**
	 * Name of the Entity
	 */
	@Column(name = "NAME", unique = true)
	private String name;

	/**
	 * Last update date
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_AT", nullable = false)
	@LastModifiedDate
	private Date updatedAt = new Date();

	/**
	 * Last update user
	 */
	@Column(name = "UPDATED_BY", nullable = false)
	@LastModifiedBy
	private String updatedBy = "";
}
