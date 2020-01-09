/**
 * 
 */
package net.talaatharb.helpdesk.dto;

import java.util.Date;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonView;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author mharb
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class AbstractDtoV1 {
	
	/**
	 * Creation date
	 */
	@JsonView(Views.Detail.class)
	private Date createdAt = new Date();

	/**
	 * Creation user
	 */
	@JsonView(Views.Detail.class)
	private String createdBy = "";

	/**
	 * ID of the Entity
	 */
	@JsonView(Views.Basic.class)
	private UUID id;

	/**
	 * Name of the Entity
	 */
	@JsonView(Views.Basic.class)
	private String name;

	/**
	 * Last update date
	 */
	@JsonView(Views.Detail.class)
	private Date updatedAt = new Date();

	/**
	 * Last update user
	 */
	@JsonView(Views.Detail.class)
	private String updatedBy = "";
}
