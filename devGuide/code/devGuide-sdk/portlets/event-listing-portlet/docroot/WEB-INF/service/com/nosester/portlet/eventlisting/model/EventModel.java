/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nosester.portlet.eventlisting.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Event service. Represents a row in the &quot;Event_Event&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.nosester.portlet.eventlisting.model.impl.EventModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.nosester.portlet.eventlisting.model.impl.EventImpl}.
 * </p>
 *
 * @author jbloggs
 * @see Event
 * @see com.nosester.portlet.eventlisting.model.impl.EventImpl
 * @see com.nosester.portlet.eventlisting.model.impl.EventModelImpl
 * @generated
 */
public interface EventModel extends BaseModel<Event> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a event model instance should use the {@link Event} interface instead.
	 */

	/**
	 * Returns the primary key of this event.
	 *
	 * @return the primary key of this event
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this event.
	 *
	 * @param primaryKey the primary key of this event
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the event ID of this event.
	 *
	 * @return the event ID of this event
	 */
	public long getEventId();

	/**
	 * Sets the event ID of this event.
	 *
	 * @param eventId the event ID of this event
	 */
	public void setEventId(long eventId);

	/**
	 * Returns the company ID of this event.
	 *
	 * @return the company ID of this event
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this event.
	 *
	 * @param companyId the company ID of this event
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this event.
	 *
	 * @return the group ID of this event
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this event.
	 *
	 * @param groupId the group ID of this event
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this event.
	 *
	 * @return the user ID of this event
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this event.
	 *
	 * @param userId the user ID of this event
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this event.
	 *
	 * @return the user uuid of this event
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this event.
	 *
	 * @param userUuid the user uuid of this event
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create date of this event.
	 *
	 * @return the create date of this event
	 */
	public long getCreateDate();

	/**
	 * Sets the create date of this event.
	 *
	 * @param createDate the create date of this event
	 */
	public void setCreateDate(long createDate);

	/**
	 * Returns the modified date of this event.
	 *
	 * @return the modified date of this event
	 */
	public long getModifiedDate();

	/**
	 * Sets the modified date of this event.
	 *
	 * @param modifiedDate the modified date of this event
	 */
	public void setModifiedDate(long modifiedDate);

	/**
	 * Returns the name of this event.
	 *
	 * @return the name of this event
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this event.
	 *
	 * @param name the name of this event
	 */
	public void setName(String name);

	/**
	 * Returns the description of this event.
	 *
	 * @return the description of this event
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this event.
	 *
	 * @param description the description of this event
	 */
	public void setDescription(String description);

	/**
	 * Returns the date of this event.
	 *
	 * @return the date of this event
	 */
	public Date getDate();

	/**
	 * Sets the date of this event.
	 *
	 * @param date the date of this event
	 */
	public void setDate(Date date);

	/**
	 * Returns the location ID of this event.
	 *
	 * @return the location ID of this event
	 */
	public long getLocationId();

	/**
	 * Sets the location ID of this event.
	 *
	 * @param locationId the location ID of this event
	 */
	public void setLocationId(long locationId);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(Event event);

	public int hashCode();

	public CacheModel<Event> toCacheModel();

	public Event toEscapedModel();

	public String toString();

	public String toXmlString();
}