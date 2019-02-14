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
@XmlRootElement(name = "Fields")
public class Fields {

	public Boolean getAutocomplete() {
		return _autocomplete;
	}

	public String getDataSourceType() {
		return _dataSourceType;
	}

	public String getDataType() {
		return _dataType;
	}

	public String getDisplayStyle() {
		return _displayStyle;
	}

	public Grid getGrid() {
		return _grid;
	}

	public Boolean getHasFormRules() {
		return _hasFormRules;
	}

	public Long getId() {
		return _id;
	}

	public Boolean getImmutable() {
		return _immutable;
	}

	public Boolean getInline() {
		return _inline;
	}

	public String getInputControl() {
		return _inputControl;
	}

	public String getLabel() {
		return _label;
	}

	public Boolean getLocalizable() {
		return _localizable;
	}

	public Boolean getMultiple() {
		return _multiple;
	}

	public String getName() {
		return _name;
	}

	public Options getOptions() {
		return _options;
	}

	public String getPlaceholder() {
		return _placeholder;
	}

	public String getPredefinedValue() {
		return _predefinedValue;
	}

	public Boolean getReadOnly() {
		return _readOnly;
	}

	public Boolean getRepeatable() {
		return _repeatable;
	}

	public Boolean getRequired() {
		return _required;
	}

	public Boolean getShowAsSwitcher() {
		return _showAsSwitcher;
	}

	public Boolean getShowLabel() {
		return _showLabel;
	}

	public String getStyle() {
		return _style;
	}

	public String getText() {
		return _text;
	}

	public String getTooltip() {
		return _tooltip;
	}

	public Validation getValidation() {
		return _validation;
	}

	public void setAutocomplete(Boolean autocomplete) {
		_autocomplete = autocomplete;
	}

	public void setAutocomplete(Supplier<Boolean> autocompleteSupplier) {
		_autocomplete = autocompleteSupplier.get();
	}

	public void setDataSourceType(String dataSourceType) {
		_dataSourceType = dataSourceType;
	}

	public void setDataSourceType(Supplier<String> dataSourceTypeSupplier) {
		_dataSourceType = dataSourceTypeSupplier.get();
	}

	public void setDataType(String dataType) {
		_dataType = dataType;
	}

	public void setDataType(Supplier<String> dataTypeSupplier) {
		_dataType = dataTypeSupplier.get();
	}

	public void setDisplayStyle(String displayStyle) {
		_displayStyle = displayStyle;
	}

	public void setDisplayStyle(Supplier<String> displayStyleSupplier) {
		_displayStyle = displayStyleSupplier.get();
	}

	public void setGrid(Grid grid) {
		_grid = grid;
	}

	public void setGrid(Supplier<Grid> gridSupplier) {
		_grid = gridSupplier.get();
	}

	public void setHasFormRules(Boolean hasFormRules) {
		_hasFormRules = hasFormRules;
	}

	public void setHasFormRules(Supplier<Boolean> hasFormRulesSupplier) {
		_hasFormRules = hasFormRulesSupplier.get();
	}

	public void setId(Long id) {
		_id = id;
	}

	public void setId(Supplier<Long> idSupplier) {
		_id = idSupplier.get();
	}

	public void setImmutable(Boolean immutable) {
		_immutable = immutable;
	}

	public void setImmutable(Supplier<Boolean> immutableSupplier) {
		_immutable = immutableSupplier.get();
	}

	public void setInline(Boolean inline) {
		_inline = inline;
	}

	public void setInline(Supplier<Boolean> inlineSupplier) {
		_inline = inlineSupplier.get();
	}

	public void setInputControl(String inputControl) {
		_inputControl = inputControl;
	}

	public void setInputControl(Supplier<String> inputControlSupplier) {
		_inputControl = inputControlSupplier.get();
	}

	public void setLabel(String label) {
		_label = label;
	}

	public void setLabel(Supplier<String> labelSupplier) {
		_label = labelSupplier.get();
	}

	public void setLocalizable(Boolean localizable) {
		_localizable = localizable;
	}

	public void setLocalizable(Supplier<Boolean> localizableSupplier) {
		_localizable = localizableSupplier.get();
	}

	public void setMultiple(Boolean multiple) {
		_multiple = multiple;
	}

	public void setMultiple(Supplier<Boolean> multipleSupplier) {
		_multiple = multipleSupplier.get();
	}

	public void setName(String name) {
		_name = name;
	}

	public void setName(Supplier<String> nameSupplier) {
		_name = nameSupplier.get();
	}

	public void setOptions(Options options) {
		_options = options;
	}

	public void setOptions(Supplier<Options> optionsSupplier) {
		_options = optionsSupplier.get();
	}

	public void setPlaceholder(String placeholder) {
		_placeholder = placeholder;
	}

	public void setPlaceholder(Supplier<String> placeholderSupplier) {
		_placeholder = placeholderSupplier.get();
	}

	public void setPredefinedValue(String predefinedValue) {
		_predefinedValue = predefinedValue;
	}

	public void setPredefinedValue(Supplier<String> predefinedValueSupplier) {
		_predefinedValue = predefinedValueSupplier.get();
	}

	public void setReadOnly(Boolean readOnly) {
		_readOnly = readOnly;
	}

	public void setReadOnly(Supplier<Boolean> readOnlySupplier) {
		_readOnly = readOnlySupplier.get();
	}

	public void setRepeatable(Boolean repeatable) {
		_repeatable = repeatable;
	}

	public void setRepeatable(Supplier<Boolean> repeatableSupplier) {
		_repeatable = repeatableSupplier.get();
	}

	public void setRequired(Boolean required) {
		_required = required;
	}

	public void setRequired(Supplier<Boolean> requiredSupplier) {
		_required = requiredSupplier.get();
	}

	public void setShowAsSwitcher(Boolean showAsSwitcher) {
		_showAsSwitcher = showAsSwitcher;
	}

	public void setShowAsSwitcher(Supplier<Boolean> showAsSwitcherSupplier) {
		_showAsSwitcher = showAsSwitcherSupplier.get();
	}

	public void setShowLabel(Boolean showLabel) {
		_showLabel = showLabel;
	}

	public void setShowLabel(Supplier<Boolean> showLabelSupplier) {
		_showLabel = showLabelSupplier.get();
	}

	public void setStyle(String style) {
		_style = style;
	}

	public void setStyle(Supplier<String> styleSupplier) {
		_style = styleSupplier.get();
	}

	public void setText(String text) {
		_text = text;
	}

	public void setText(Supplier<String> textSupplier) {
		_text = textSupplier.get();
	}

	public void setTooltip(String tooltip) {
		_tooltip = tooltip;
	}

	public void setTooltip(Supplier<String> tooltipSupplier) {
		_tooltip = tooltipSupplier.get();
	}

	public void setValidation(Supplier<Validation> validationSupplier) {
		_validation = validationSupplier.get();
	}

	public void setValidation(Validation validation) {
		_validation = validation;
	}

	private Boolean _autocomplete;
	private String _dataSourceType;
	private String _dataType;
	private String _displayStyle;
	private Grid _grid;
	private Boolean _hasFormRules;
	private Long _id;
	private Boolean _immutable;
	private Boolean _inline;
	private String _inputControl;
	private String _label;
	private Boolean _localizable;
	private Boolean _multiple;
	private String _name;
	private Options _options;
	private String _placeholder;
	private String _predefinedValue;
	private Boolean _readOnly;
	private Boolean _repeatable;
	private Boolean _required;
	private Boolean _showAsSwitcher;
	private Boolean _showLabel;
	private String _style;
	private String _text;
	private String _tooltip;
	private Validation _validation;

}