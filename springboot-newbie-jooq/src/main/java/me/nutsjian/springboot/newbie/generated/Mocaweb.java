/*
 * This file is generated by jOOQ.
*/
package me.nutsjian.springboot.newbie.generated;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import me.nutsjian.springboot.newbie.generated.tables.DsHuatuo;
import me.nutsjian.springboot.newbie.generated.tables.DsHuatuoCopy1;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Mocaweb extends SchemaImpl {

    private static final long serialVersionUID = 1966230684;

    /**
     * The reference instance of <code>mocaweb</code>
     */
    public static final Mocaweb MOCAWEB = new Mocaweb();

    /**
     * The table <code>mocaweb.ds_huatuo</code>.
     */
    public final DsHuatuo DS_HUATUO = me.nutsjian.springboot.newbie.generated.tables.DsHuatuo.DS_HUATUO;

    /**
     * The table <code>mocaweb.ds_huatuo_copy1</code>.
     */
    public final DsHuatuoCopy1 DS_HUATUO_COPY1 = me.nutsjian.springboot.newbie.generated.tables.DsHuatuoCopy1.DS_HUATUO_COPY1;

    /**
     * No further instances allowed
     */
    private Mocaweb() {
        super("mocaweb", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            DsHuatuo.DS_HUATUO,
            DsHuatuoCopy1.DS_HUATUO_COPY1);
    }
}