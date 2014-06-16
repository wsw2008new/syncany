/*
 * Syncany, www.syncany.org
 * Copyright (C) 2011-2014 Philipp C. Heckel <philipp.heckel@gmail.com> 
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
package org.syncany.operations.log;

import java.util.Date;
import java.util.List;

import org.syncany.operations.OperationOptions;

public class LogOperationOptions implements OperationOptions {
	private Date date;
	private LogOutputFormat format;
	private List<String> paths;		
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<String> getPaths() {
		return paths;
	}
	
	public void setPaths(List<String> paths) {
		this.paths = paths;
	}

	public LogOutputFormat getFormat() {
		return format;
	}

	public void setFormat(LogOutputFormat format) {
		this.format = format;
	}
}