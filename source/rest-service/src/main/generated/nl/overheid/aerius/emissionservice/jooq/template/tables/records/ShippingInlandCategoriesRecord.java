/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables.records;


import nl.overheid.aerius.emissionservice.jooq.template.tables.ShippingInlandCategories;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * De categories van verschillende soorten binnenvaart-schepen.
 * In de naam wordt ook de tonnages aangegeven. De naam wordt verder gebruikt 
 * als identificatie van de categorie voor een gebruiker.
 * 
 * Standaard kenmerken voor een specifieke scheepstype kunnen via sector verkregen 
 * worden.
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/02-tables/shipping_inland.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ShippingInlandCategoriesRecord extends UpdatableRecordImpl<ShippingInlandCategoriesRecord> implements Record4<Short, String, String, String> {

    private static final long serialVersionUID = -918677102;

    /**
     * Setter for <code>template.shipping_inland_categories.shipping_inland_category_id</code>.
     */
    public void setShippingInlandCategoryId(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>template.shipping_inland_categories.shipping_inland_category_id</code>.
     */
    public Short getShippingInlandCategoryId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>template.shipping_inland_categories.code</code>.
     */
    public void setCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>template.shipping_inland_categories.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>template.shipping_inland_categories.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>template.shipping_inland_categories.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>template.shipping_inland_categories.description</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>template.shipping_inland_categories.description</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Short> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Short, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Short, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Short> field1() {
        return ShippingInlandCategories.SHIPPING_INLAND_CATEGORIES.SHIPPING_INLAND_CATEGORY_ID;
    }

    @Override
    public Field<String> field2() {
        return ShippingInlandCategories.SHIPPING_INLAND_CATEGORIES.CODE;
    }

    @Override
    public Field<String> field3() {
        return ShippingInlandCategories.SHIPPING_INLAND_CATEGORIES.NAME;
    }

    @Override
    public Field<String> field4() {
        return ShippingInlandCategories.SHIPPING_INLAND_CATEGORIES.DESCRIPTION;
    }

    @Override
    public Short component1() {
        return getShippingInlandCategoryId();
    }

    @Override
    public String component2() {
        return getCode();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String component4() {
        return getDescription();
    }

    @Override
    public Short value1() {
        return getShippingInlandCategoryId();
    }

    @Override
    public String value2() {
        return getCode();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public String value4() {
        return getDescription();
    }

    @Override
    public ShippingInlandCategoriesRecord value1(Short value) {
        setShippingInlandCategoryId(value);
        return this;
    }

    @Override
    public ShippingInlandCategoriesRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public ShippingInlandCategoriesRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public ShippingInlandCategoriesRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public ShippingInlandCategoriesRecord values(Short value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ShippingInlandCategoriesRecord
     */
    public ShippingInlandCategoriesRecord() {
        super(ShippingInlandCategories.SHIPPING_INLAND_CATEGORIES);
    }

    /**
     * Create a detached, initialised ShippingInlandCategoriesRecord
     */
    public ShippingInlandCategoriesRecord(Short shippingInlandCategoryId, String code, String name, String description) {
        super(ShippingInlandCategories.SHIPPING_INLAND_CATEGORIES);

        set(0, shippingInlandCategoryId);
        set(1, code);
        set(2, name);
        set(3, description);
    }
}