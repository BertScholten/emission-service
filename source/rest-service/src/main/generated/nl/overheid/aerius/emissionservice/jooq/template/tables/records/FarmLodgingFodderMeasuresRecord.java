/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables.records;


import nl.overheid.aerius.emissionservice.jooq.template.tables.FarmLodgingFodderMeasures;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Voer- en managementmaatregelen; zie http://wetten.overheid.nl/BWBR0013629/geldigheidsdatum_11-06-2015#Bijlage2 
 * en http://www.infomil.nl/onderwerpen/landbouw-tuinbouw/ammoniak/rav/pas-maatregelen/alle-pas-maatregelen/ 
 * Dit zijn maatregelen die zorgen voor minder emissies en toegepast kunnen 
 * worden op een stalsysteem (farm_lodging_type).
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/02-tables/farms.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FarmLodgingFodderMeasuresRecord extends UpdatableRecordImpl<FarmLodgingFodderMeasuresRecord> implements Record4<Integer, String, String, String> {

    private static final long serialVersionUID = -1277650839;

    /**
     * Setter for <code>template.farm_lodging_fodder_measures.farm_lodging_fodder_measure_id</code>.
     */
    public void setFarmLodgingFodderMeasureId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>template.farm_lodging_fodder_measures.farm_lodging_fodder_measure_id</code>.
     */
    public Integer getFarmLodgingFodderMeasureId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>template.farm_lodging_fodder_measures.code</code>.
     */
    public void setCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>template.farm_lodging_fodder_measures.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>template.farm_lodging_fodder_measures.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>template.farm_lodging_fodder_measures.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>template.farm_lodging_fodder_measures.description</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>template.farm_lodging_fodder_measures.description</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return FarmLodgingFodderMeasures.FARM_LODGING_FODDER_MEASURES.FARM_LODGING_FODDER_MEASURE_ID;
    }

    @Override
    public Field<String> field2() {
        return FarmLodgingFodderMeasures.FARM_LODGING_FODDER_MEASURES.CODE;
    }

    @Override
    public Field<String> field3() {
        return FarmLodgingFodderMeasures.FARM_LODGING_FODDER_MEASURES.NAME;
    }

    @Override
    public Field<String> field4() {
        return FarmLodgingFodderMeasures.FARM_LODGING_FODDER_MEASURES.DESCRIPTION;
    }

    @Override
    public Integer component1() {
        return getFarmLodgingFodderMeasureId();
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
    public Integer value1() {
        return getFarmLodgingFodderMeasureId();
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
    public FarmLodgingFodderMeasuresRecord value1(Integer value) {
        setFarmLodgingFodderMeasureId(value);
        return this;
    }

    @Override
    public FarmLodgingFodderMeasuresRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public FarmLodgingFodderMeasuresRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public FarmLodgingFodderMeasuresRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public FarmLodgingFodderMeasuresRecord values(Integer value1, String value2, String value3, String value4) {
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
     * Create a detached FarmLodgingFodderMeasuresRecord
     */
    public FarmLodgingFodderMeasuresRecord() {
        super(FarmLodgingFodderMeasures.FARM_LODGING_FODDER_MEASURES);
    }

    /**
     * Create a detached, initialised FarmLodgingFodderMeasuresRecord
     */
    public FarmLodgingFodderMeasuresRecord(Integer farmLodgingFodderMeasureId, String code, String name, String description) {
        super(FarmLodgingFodderMeasures.FARM_LODGING_FODDER_MEASURES);

        set(0, farmLodgingFodderMeasureId);
        set(1, code);
        set(2, name);
        set(3, description);
    }
}