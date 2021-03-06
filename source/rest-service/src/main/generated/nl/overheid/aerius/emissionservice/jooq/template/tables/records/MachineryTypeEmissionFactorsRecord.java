/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables.records;


import nl.overheid.aerius.emissionservice.jooq.template.tables.MachineryTypeEmissionFactors;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * De emissiefactoren per werktuig, brandstof en emissiestof.
 * Emissie factor is hier in g/kWh.
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/02-tables/machinery_types.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MachineryTypeEmissionFactorsRecord extends UpdatableRecordImpl<MachineryTypeEmissionFactorsRecord> implements Record4<Integer, Integer, Integer, Float> {

    private static final long serialVersionUID = -448226220;

    /**
     * Setter for <code>template.machinery_type_emission_factors.machinery_type_id</code>.
     */
    public void setMachineryTypeId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>template.machinery_type_emission_factors.machinery_type_id</code>.
     */
    public Integer getMachineryTypeId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>template.machinery_type_emission_factors.machinery_fuel_type_id</code>.
     */
    public void setMachineryFuelTypeId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>template.machinery_type_emission_factors.machinery_fuel_type_id</code>.
     */
    public Integer getMachineryFuelTypeId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>template.machinery_type_emission_factors.substance_id</code>.
     */
    public void setSubstanceId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>template.machinery_type_emission_factors.substance_id</code>.
     */
    public Integer getSubstanceId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>template.machinery_type_emission_factors.emission_factor</code>.
     */
    public void setEmissionFactor(Float value) {
        set(3, value);
    }

    /**
     * Getter for <code>template.machinery_type_emission_factors.emission_factor</code>.
     */
    public Float getEmissionFactor() {
        return (Float) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<Integer, Integer, Integer> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Integer, Integer, Float> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, Integer, Integer, Float> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return MachineryTypeEmissionFactors.MACHINERY_TYPE_EMISSION_FACTORS.MACHINERY_TYPE_ID;
    }

    @Override
    public Field<Integer> field2() {
        return MachineryTypeEmissionFactors.MACHINERY_TYPE_EMISSION_FACTORS.MACHINERY_FUEL_TYPE_ID;
    }

    @Override
    public Field<Integer> field3() {
        return MachineryTypeEmissionFactors.MACHINERY_TYPE_EMISSION_FACTORS.SUBSTANCE_ID;
    }

    @Override
    public Field<Float> field4() {
        return MachineryTypeEmissionFactors.MACHINERY_TYPE_EMISSION_FACTORS.EMISSION_FACTOR;
    }

    @Override
    public Integer component1() {
        return getMachineryTypeId();
    }

    @Override
    public Integer component2() {
        return getMachineryFuelTypeId();
    }

    @Override
    public Integer component3() {
        return getSubstanceId();
    }

    @Override
    public Float component4() {
        return getEmissionFactor();
    }

    @Override
    public Integer value1() {
        return getMachineryTypeId();
    }

    @Override
    public Integer value2() {
        return getMachineryFuelTypeId();
    }

    @Override
    public Integer value3() {
        return getSubstanceId();
    }

    @Override
    public Float value4() {
        return getEmissionFactor();
    }

    @Override
    public MachineryTypeEmissionFactorsRecord value1(Integer value) {
        setMachineryTypeId(value);
        return this;
    }

    @Override
    public MachineryTypeEmissionFactorsRecord value2(Integer value) {
        setMachineryFuelTypeId(value);
        return this;
    }

    @Override
    public MachineryTypeEmissionFactorsRecord value3(Integer value) {
        setSubstanceId(value);
        return this;
    }

    @Override
    public MachineryTypeEmissionFactorsRecord value4(Float value) {
        setEmissionFactor(value);
        return this;
    }

    @Override
    public MachineryTypeEmissionFactorsRecord values(Integer value1, Integer value2, Integer value3, Float value4) {
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
     * Create a detached MachineryTypeEmissionFactorsRecord
     */
    public MachineryTypeEmissionFactorsRecord() {
        super(MachineryTypeEmissionFactors.MACHINERY_TYPE_EMISSION_FACTORS);
    }

    /**
     * Create a detached, initialised MachineryTypeEmissionFactorsRecord
     */
    public MachineryTypeEmissionFactorsRecord(Integer machineryTypeId, Integer machineryFuelTypeId, Integer substanceId, Float emissionFactor) {
        super(MachineryTypeEmissionFactors.MACHINERY_TYPE_EMISSION_FACTORS);

        set(0, machineryTypeId);
        set(1, machineryFuelTypeId);
        set(2, substanceId);
        set(3, emissionFactor);
    }
}
