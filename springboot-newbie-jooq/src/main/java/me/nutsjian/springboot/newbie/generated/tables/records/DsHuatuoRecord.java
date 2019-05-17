/*
 * This file is generated by jOOQ.
*/
package me.nutsjian.springboot.newbie.generated.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import me.nutsjian.springboot.newbie.generated.tables.DsHuatuo;

import org.jooq.Field;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DsHuatuoRecord extends TableRecordImpl<DsHuatuoRecord> implements Record16<Integer, String, String, String, String, String, String, String, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal> {

    private static final long serialVersionUID = -667626230;

    /**
     * Setter for <code>mocaweb.ds_huatuo.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mocaweb.ds_huatuo.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mocaweb.ds_huatuo.metadata_id</code>.
     */
    public void setMetadataId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mocaweb.ds_huatuo.metadata_id</code>.
     */
    public String getMetadataId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mocaweb.ds_huatuo.report_id</code>.
     */
    public void setReportId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mocaweb.ds_huatuo.report_id</code>.
     */
    public String getReportId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mocaweb.ds_huatuo.some_id</code>.
     */
    public void setSomeId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mocaweb.ds_huatuo.some_id</code>.
     */
    public String getSomeId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mocaweb.ds_huatuo.created_date</code>.
     */
    public void setCreatedDate(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mocaweb.ds_huatuo.created_date</code>.
     */
    public String getCreatedDate() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mocaweb.ds_huatuo.name</code>.
     */
    public void setName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mocaweb.ds_huatuo.name</code>.
     */
    public String getName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mocaweb.ds_huatuo.level</code>.
     */
    public void setLevel(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mocaweb.ds_huatuo.level</code>.
     */
    public String getLevel() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mocaweb.ds_huatuo.year</code>.
     */
    public void setYear(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mocaweb.ds_huatuo.year</code>.
     */
    public String getYear() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mocaweb.ds_huatuo.month</code>.
     */
    public void setMonth(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mocaweb.ds_huatuo.month</code>.
     */
    public String getMonth() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mocaweb.ds_huatuo.neat_weight</code>.
     */
    public void setNeatWeight(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>mocaweb.ds_huatuo.neat_weight</code>.
     */
    public BigDecimal getNeatWeight() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>mocaweb.ds_huatuo.store_in_amount</code>.
     */
    public void setStoreInAmount(BigDecimal value) {
        set(10, value);
    }

    /**
     * Getter for <code>mocaweb.ds_huatuo.store_in_amount</code>.
     */
    public BigDecimal getStoreInAmount() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>mocaweb.ds_huatuo.rcrz</code>.
     */
    public void setRcrz(BigDecimal value) {
        set(11, value);
    }

    /**
     * Getter for <code>mocaweb.ds_huatuo.rcrz</code>.
     */
    public BigDecimal getRcrz() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>mocaweb.ds_huatuo.jsdj</code>.
     */
    public void setJsdj(BigDecimal value) {
        set(12, value);
    }

    /**
     * Getter for <code>mocaweb.ds_huatuo.jsdj</code>.
     */
    public BigDecimal getJsdj() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>mocaweb.ds_huatuo.pjsf</code>.
     */
    public void setPjsf(BigDecimal value) {
        set(13, value);
    }

    /**
     * Getter for <code>mocaweb.ds_huatuo.pjsf</code>.
     */
    public BigDecimal getPjsf() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>mocaweb.ds_huatuo.pjhf</code>.
     */
    public void setPjhf(BigDecimal value) {
        set(14, value);
    }

    /**
     * Getter for <code>mocaweb.ds_huatuo.pjhf</code>.
     */
    public BigDecimal getPjhf() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>mocaweb.ds_huatuo.cc</code>.
     */
    public void setCc(BigDecimal value) {
        set(15, value);
    }

    /**
     * Getter for <code>mocaweb.ds_huatuo.cc</code>.
     */
    public BigDecimal getCc() {
        return (BigDecimal) get(15);
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, String, String, String, String, String, String, String, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, String, String, String, String, String, String, String, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return DsHuatuo.DS_HUATUO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DsHuatuo.DS_HUATUO.METADATA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DsHuatuo.DS_HUATUO.REPORT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return DsHuatuo.DS_HUATUO.SOME_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return DsHuatuo.DS_HUATUO.CREATED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return DsHuatuo.DS_HUATUO.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return DsHuatuo.DS_HUATUO.LEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return DsHuatuo.DS_HUATUO.YEAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return DsHuatuo.DS_HUATUO.MONTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return DsHuatuo.DS_HUATUO.NEAT_WEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field11() {
        return DsHuatuo.DS_HUATUO.STORE_IN_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field12() {
        return DsHuatuo.DS_HUATUO.RCRZ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field13() {
        return DsHuatuo.DS_HUATUO.JSDJ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field14() {
        return DsHuatuo.DS_HUATUO.PJSF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field15() {
        return DsHuatuo.DS_HUATUO.PJHF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field16() {
        return DsHuatuo.DS_HUATUO.CC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getMetadataId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getReportId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSomeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCreatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component10() {
        return getNeatWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component11() {
        return getStoreInAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component12() {
        return getRcrz();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component13() {
        return getJsdj();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component14() {
        return getPjsf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component15() {
        return getPjhf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component16() {
        return getCc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getMetadataId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getReportId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSomeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCreatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getNeatWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value11() {
        return getStoreInAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value12() {
        return getRcrz();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value13() {
        return getJsdj();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value14() {
        return getPjsf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value15() {
        return getPjhf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value16() {
        return getCc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DsHuatuoRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DsHuatuoRecord value2(String value) {
        setMetadataId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DsHuatuoRecord value3(String value) {
        setReportId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DsHuatuoRecord value4(String value) {
        setSomeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DsHuatuoRecord value5(String value) {
        setCreatedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DsHuatuoRecord value6(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DsHuatuoRecord value7(String value) {
        setLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DsHuatuoRecord value8(String value) {
        setYear(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DsHuatuoRecord value9(String value) {
        setMonth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DsHuatuoRecord value10(BigDecimal value) {
        setNeatWeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DsHuatuoRecord value11(BigDecimal value) {
        setStoreInAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DsHuatuoRecord value12(BigDecimal value) {
        setRcrz(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DsHuatuoRecord value13(BigDecimal value) {
        setJsdj(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DsHuatuoRecord value14(BigDecimal value) {
        setPjsf(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DsHuatuoRecord value15(BigDecimal value) {
        setPjhf(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DsHuatuoRecord value16(BigDecimal value) {
        setCc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DsHuatuoRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, BigDecimal value10, BigDecimal value11, BigDecimal value12, BigDecimal value13, BigDecimal value14, BigDecimal value15, BigDecimal value16) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DsHuatuoRecord
     */
    public DsHuatuoRecord() {
        super(DsHuatuo.DS_HUATUO);
    }

    /**
     * Create a detached, initialised DsHuatuoRecord
     */
    public DsHuatuoRecord(Integer id, String metadataId, String reportId, String someId, String createdDate, String name, String level, String year, String month, BigDecimal neatWeight, BigDecimal storeInAmount, BigDecimal rcrz, BigDecimal jsdj, BigDecimal pjsf, BigDecimal pjhf, BigDecimal cc) {
        super(DsHuatuo.DS_HUATUO);

        set(0, id);
        set(1, metadataId);
        set(2, reportId);
        set(3, someId);
        set(4, createdDate);
        set(5, name);
        set(6, level);
        set(7, year);
        set(8, month);
        set(9, neatWeight);
        set(10, storeInAmount);
        set(11, rcrz);
        set(12, jsdj);
        set(13, pjsf);
        set(14, pjhf);
        set(15, cc);
    }
}