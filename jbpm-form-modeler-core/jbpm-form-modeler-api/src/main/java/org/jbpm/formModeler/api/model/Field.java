/**
 * Copyright (C) 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jbpm.formModeler.api.model;

import org.jbpm.formModeler.api.model.wrappers.I18nSet;

import java.util.*;

/**
 * Definition of a Form Field.
 */
public class Field implements Comparable<Field> {
    private Long id;

    private I18nSet title;

    private I18nSet label;

    private I18nSet errorMessage;

    private String fieldName;

    private Boolean fieldRequired;

    private Boolean disabled;

    private Boolean readonly;

    private String size;

    private String formula;

    private Boolean groupWithPrevious;

    private String pattern;

    private Long maxlength;

    private String styleclass;

    private String cssStyle;

    private String height;

    private Long tabindex;

    private String accesskey;

    private String rangeFormula;

    private String labelCSSStyle;
    private String labelCSSClass;

    private String htmlContainer;
    private Boolean isHTML;
    private Boolean hideContent;
    private String defaultValueFormula;

    private I18nSet htmlContent;

    private FieldType fieldType;

    private String bindingStr;

    private int position;

    private Form form;

    public Field() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getFieldRequired() {
        return fieldRequired;
    }

    public void setFieldRequired(Boolean fieldRequired) {
        this.fieldRequired = fieldRequired;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Boolean getDisabled() {
        return this.disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }


    public Boolean getReadonly() {
        return this.readonly;
    }

    public void setReadonly(Boolean readonly) {
        this.readonly = readonly;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Boolean getGroupWithPrevious() {
        return groupWithPrevious;
    }

    public void setGroupWithPrevious(Boolean groupWithPrevious) {
        this.groupWithPrevious = groupWithPrevious;
    }

    public Long getMaxlength() {
        return this.maxlength;
    }

    public void setMaxlength(Long maxlength) {
        this.maxlength = maxlength;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getCssStyle() {
        return cssStyle;
    }

    public void setCssStyle(String cssStyle) {
        this.cssStyle = cssStyle;
    }

    public String getStyleclass() {
        return this.styleclass;
    }

    public void setStyleclass(String styleclass) {
        this.styleclass = styleclass;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public Long getTabindex() {
        return this.tabindex;
    }

    public void setTabindex(Long tabindex) {
        this.tabindex = tabindex;
    }

    public String getAccesskey() {
        return this.accesskey;
    }

    public void setAccesskey(String accesskey) {
        this.accesskey = accesskey;
    }

    public FieldType getFieldType() {
        return this.fieldType;
    }

    public void setFieldType(FieldType fieldType) {
        this.fieldType = fieldType;
    }

    public String getRangeFormula() {
        return rangeFormula;
    }

    public void setRangeFormula(String rangeFormula) {
        this.rangeFormula = rangeFormula;
    }

    public String getHtmlContainer() {
        return htmlContainer;
    }

    public void setHtmlContainer(String htmlContainer) {
        this.htmlContainer = htmlContainer;
    }

    public Boolean getIsHTML() {
        return isHTML;
    }

    public void setIsHTML(Boolean HTML) {
        isHTML = HTML;
    }

    public Boolean getHideContent() {
        return hideContent;
    }

    public void setHideContent(Boolean hideContent) {
        this.hideContent = hideContent;
    }

    public String getDefaultValueFormula() {
        return defaultValueFormula;
    }

    public void setDefaultValueFormula(String defaultValueFormula) {
        this.defaultValueFormula = defaultValueFormula;
    }

    public String toString() {
        return getId().toString();
    }

    public boolean equals(Object other) {
        if (!(other instanceof Field)) return false;
        Field castOther = (Field) other;
        return this.getId().equals(castOther.getId());
    }

    public int hashCode() {
        return getId().hashCode();
    }

    public I18nSet getTitle() {
        return title;
    }

    public void setTitle(I18nSet title) {
        this.title = title;
    }

    public I18nSet getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(I18nSet errorMessage) {
        this.errorMessage = errorMessage;
    }

    public I18nSet getLabel() {
        return label;
    }

    public void setLabel(I18nSet label) {
        this.label = label;
    }

    public String getFieldPattern() {
        if ((getPattern() == null || "".equals(getPattern())) && getFieldType() != null)
            return getFieldType().getPattern();
        else
            return getPattern();
    }

    public String getFieldFormula() {
        if ((getFormula() == null || "".equals(getFormula())) && getFieldType() != null)
            return getFieldType().getFormula();
        else
            return getFormula();
    }

    public String getFieldRangeFormula() {
        if ((getRangeFormula() == null || "".equals(getRangeFormula())) && getFieldType() != null)
            return getFieldType().getRangeFormula();
        else
            return getRangeFormula();
    }

    public void putAll(Field field) {
        this.setAccesskey(field.getAccesskey());
        this.setCssStyle(field.getCssStyle());
        this.setDisabled(field.getDisabled());
        this.setTitle(field.getTitle());
        this.setLabel(field.getLabel());
        this.setErrorMessage(field.getErrorMessage());
        this.setFieldName(field.getFieldName());
        this.setFieldType(field.getFieldType());
        this.setFieldRequired(field.getFieldRequired());
        this.setFormula(field.getFormula());
        this.setGroupWithPrevious(field.getGroupWithPrevious());
        this.setHeight(field.getHeight());
        this.setLabelCSSClass(field.getLabelCSSClass());
        this.setLabelCSSStyle(field.getLabelCSSStyle());
        this.setReadonly(field.getReadonly());
        this.setSize(field.getSize());
        this.setRangeFormula(field.getRangeFormula());
        this.setPattern(field.getPattern());
        this.setMaxlength(field.getMaxlength());
        this.setStyleclass(field.getStyleclass());
        this.setTabindex(field.getTabindex());
        this.setHtmlContainer(field.getHtmlContainer());
        this.setIsHTML(field.getIsHTML());
        this.setHideContent(field.getHideContent());
        this.setDefaultValueFormula(field.getDefaultValueFormula());

    }

    public String getLabelCSSStyle() {
        return labelCSSStyle;
    }

    public void setLabelCSSStyle(String labelCSSStyle) {
        this.labelCSSStyle = labelCSSStyle;
    }

    public String getLabelCSSClass() {
        return labelCSSClass;
    }

    public void setLabelCSSClass(String labelCSSClass) {
        this.labelCSSClass = labelCSSClass;
    }

    public I18nSet getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(I18nSet htmlContent) {
        this.htmlContent = htmlContent;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getBindingStr() {
        return bindingStr;
    }

    public void setBindingStr(String bindingStr) {
        this.bindingStr = bindingStr;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    public Set getPropertyNames() {
        Set names = new TreeSet();

        names.add("fieldName");
        names.add("fieldRequired");
        names.add("groupWithPrevious");
        names.add("height");
        names.add("labelCSSClass");
        names.add("labelCSSStyle");
        names.add("label");
        names.add("title");
        names.add("errorMessage");
        names.add("disabled");
        names.add("readonly");
        names.add("size");
        names.add("formula");
        names.add("rangeFormula");
        names.add("pattern");
        names.add("maxlength");
        names.add("styleclass");
        names.add("cssStyle");
        names.add("tabindex");
        names.add("accesskey");
        names.add("htmlContainer");
        names.add("isHTML");
        names.add("hideContent");
        names.add("defaultValueFormula");
        names.add("htmlContent");
        names.add("bindingStr");

        return names;
    }

    public Map asMap() {
        Map value = new HashMap();

        value.put("fieldName", getFieldName());
        value.put("fieldRequired", getFieldRequired());
        value.put("groupWithPrevious", getGroupWithPrevious());
        value.put("height", getHeight());
        value.put("labelCSSClass", getLabelCSSClass());
        value.put("labelCSSStyle", getLabelCSSStyle());
        value.put("label", getLabel());
        value.put("errorMessage", getErrorMessage());
        value.put("title", getTitle());
        value.put("disabled", getDisabled());
        value.put("readonly", getReadonly());
        value.put("size", getSize());
        value.put("formula", getFormula());
        value.put("rangeFormula", getRangeFormula());
        value.put("pattern", getPattern());
        value.put("maxlength", getMaxlength());
        value.put("styleclass", getStyleclass());
        value.put("cssStyle", getCssStyle());
        value.put("tabindex", getTabindex());
        value.put("accesskey", getAccesskey());
        value.put("htmlContainer", getHtmlContainer());
        value.put("isHTML", getIsHTML());
        value.put("hideContent", getHideContent());
        value.put("defaultValueFormula", getDefaultValueFormula());
        value.put("htmlContent", getHtmlContent());
        value.put("bindingStr", getBindingStr());
        return value;
    }

    public int compareTo(Field o) {
        return new Integer(getPosition()).compareTo(o.getPosition());
    }

    public static class Comparator implements java.util.Comparator {
        public int compare(Object o1, Object o2) {
            Field f1 = (Field) o1;
            Field f2 = (Field) o2;
            int pos1 = f1.getPosition();
            int pos2 = f2.getPosition();
            if (pos1 != pos2)
                return f1.getPosition() - f2.getPosition();
            else
                return (int) (f1.getId().longValue() - f2.getId().longValue());
        }
    }
}
