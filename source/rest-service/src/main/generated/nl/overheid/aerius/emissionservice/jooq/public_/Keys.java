/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.public_;


import nl.overheid.aerius.emissionservice.jooq.public_.tables.Constants;
import nl.overheid.aerius.emissionservice.jooq.public_.tables.Datasets;
import nl.overheid.aerius.emissionservice.jooq.public_.tables.I18nDatasets;
import nl.overheid.aerius.emissionservice.jooq.public_.tables.Substances;
import nl.overheid.aerius.emissionservice.jooq.public_.tables.records.ConstantsRecord;
import nl.overheid.aerius.emissionservice.jooq.public_.tables.records.DatasetsRecord;
import nl.overheid.aerius.emissionservice.jooq.public_.tables.records.I18nDatasetsRecord;
import nl.overheid.aerius.emissionservice.jooq.public_.tables.records.SubstancesRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ConstantsRecord> CONSTANTS_PKEY = UniqueKeys0.CONSTANTS_PKEY;
    public static final UniqueKey<DatasetsRecord> DATASETS_PKEY = UniqueKeys0.DATASETS_PKEY;
    public static final UniqueKey<DatasetsRecord> DATASETS_NAME_KEY = UniqueKeys0.DATASETS_NAME_KEY;
    public static final UniqueKey<I18nDatasetsRecord> I18N_DATASETS_PKEY = UniqueKeys0.I18N_DATASETS_PKEY;
    public static final UniqueKey<SubstancesRecord> SUBSTANCES_PKEY = UniqueKeys0.SUBSTANCES_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<I18nDatasetsRecord, DatasetsRecord> I18N_DATASETS__I18N_DATASETS = ForeignKeys0.I18N_DATASETS__I18N_DATASETS;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<ConstantsRecord> CONSTANTS_PKEY = Internal.createUniqueKey(Constants.CONSTANTS, "constants_pkey", new TableField[] { Constants.CONSTANTS.KEY }, true);
        public static final UniqueKey<DatasetsRecord> DATASETS_PKEY = Internal.createUniqueKey(Datasets.DATASETS, "datasets_pkey", new TableField[] { Datasets.DATASETS.CODE }, true);
        public static final UniqueKey<DatasetsRecord> DATASETS_NAME_KEY = Internal.createUniqueKey(Datasets.DATASETS, "datasets_name_key", new TableField[] { Datasets.DATASETS.NAME }, true);
        public static final UniqueKey<I18nDatasetsRecord> I18N_DATASETS_PKEY = Internal.createUniqueKey(I18nDatasets.I18N_DATASETS, "i18n_datasets_pkey", new TableField[] { I18nDatasets.I18N_DATASETS.CODE, I18nDatasets.I18N_DATASETS.LANGUAGE_CODE }, true);
        public static final UniqueKey<SubstancesRecord> SUBSTANCES_PKEY = Internal.createUniqueKey(Substances.SUBSTANCES, "substances_pkey", new TableField[] { Substances.SUBSTANCES.SUBSTANCE_ID }, true);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<I18nDatasetsRecord, DatasetsRecord> I18N_DATASETS__I18N_DATASETS = Internal.createForeignKey(Keys.DATASETS_PKEY, I18nDatasets.I18N_DATASETS, "i18n_datasets", new TableField[] { I18nDatasets.I18N_DATASETS.CODE }, true);
    }
}
