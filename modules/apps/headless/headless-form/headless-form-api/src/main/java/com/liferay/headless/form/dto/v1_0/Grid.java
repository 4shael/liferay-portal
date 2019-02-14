/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.headless.form.dto.v1_0;

import java.util.function.Supplier;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@XmlRootElement(name = "Grid")
public class Grid {

	public Columns[] getColumns() {
		return _columns;
	}

	public Long getId() {
		return _id;
	}

	public Rows[] getRows() {
		return _rows;
	}

	public void setColumns(Columns[] columns) {
		_columns = columns;
	}

	public void setColumns(Supplier<Columns[]> columnsSupplier) {
		_columns = columnsSupplier.get();
	}

	public void setId(Long id) {
		_id = id;
	}

	public void setId(Supplier<Long> idSupplier) {
		_id = idSupplier.get();
	}

	public void setRows(Rows[] rows) {
		_rows = rows;
	}

	public void setRows(Supplier<Rows[]> rowsSupplier) {
		_rows = rowsSupplier.get();
	}

	private Columns[] _columns;
	private Long _id;
	private Rows[] _rows;

}