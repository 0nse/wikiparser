/*
 * Copyright (C) 2015 mruster
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.renepickhardt.imessages.wikiparser.dataTypes;

/**
 *
 * @author mruster
 */
public abstract class AbstractWikiElement extends AbstractWikiObject {

	protected String title;
	protected User contributor;
	protected String timestamp;
	protected String comment;

	/**
	 * <p>
	 * This constructor ensures that there is always an existing contributor
	 * {@code User} object.
	 * <p>
	 */
	public AbstractWikiElement() {
		this.contributor = new User();
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public User getUser() {
		return contributor;
	}

	public void setUser(User user) {
		this.contributor = user;
	}

	public void setUserName(String name) {
		this.contributor.setName(name);
	}

	public void setUserId(String id) {
		this.contributor.setId(id);
	}
}
