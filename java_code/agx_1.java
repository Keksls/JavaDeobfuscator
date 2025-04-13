/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from aGX
 */
public class agx_1
extends agn_1 {
    protected static final Logger i = Logger.getLogger(agx_1.class);
    private static final String j = "SELECT * FROM pg_user;";
    private static final String k = "SELECT oid,* FROM pg_namespace;";
    private static final String l = "SELECT oid,* FROM pg_type;";
    private static final String m = "SELECT oid,* FROM pg_class;";
    private static final String n = "SELECT * FROM pg_attribute;";
    private static final String o = "SELECT oid,* FROM pg_attrdef;";
    private static final String p = "SELECT oid,* FROM pg_constraint;";

    public agx_1(Connection connection) {
        super(connection);
        Statement statement = connection.createStatement();
        i.info((Object)"Liste des utilisateurs ... ");
        ResultSet resultSet = statement.executeQuery(j);
        while (resultSet.next()) {
            this.a(new aha_2(this, resultSet));
        }
        i.info((Object)"termin\u00e9");
        i.info((Object)"Liste des namespaces ... ");
        resultSet = statement.executeQuery(k);
        while (resultSet.next()) {
            this.a(new agy_1(this, resultSet));
        }
        i.info((Object)"termin\u00e9");
        i.info((Object)"Liste des types ... ");
        resultSet = statement.executeQuery(l);
        ArrayList<Object> arrayList = new ArrayList<Object>();
        while (resultSet.next()) {
            agz_1 agz_12 = new agz_1(this, resultSet);
            this.a(agz_12);
            arrayList.add(agz_12);
        }
        for (agz_1 agz_13 : arrayList) {
            agz_13.d();
        }
        i.info((Object)"termin\u00e9");
        i.info((Object)"Liste des classes ... ");
        resultSet = statement.executeQuery(m);
        while (resultSet.next()) {
            this.a(new agv_1(this, resultSet));
        }
        i.info((Object)"termin\u00e9");
        i.info((Object)"Liste des attributs ... ");
        resultSet = statement.executeQuery(n);
        while (resultSet.next()) {
            this.a(new agt_1(this, resultSet));
        }
        i.info((Object)"termin\u00e9");
        i.info((Object)"Liste des valeurs par d\u00e9faut ... ");
        resultSet = statement.executeQuery(o);
        while (resultSet.next()) {
            this.a(new agu_1((agn_1)this, resultSet));
        }
        i.info((Object)"termin\u00e9");
        i.info((Object)"Liste des contraintes ... ");
        resultSet = statement.executeQuery(p);
        while (resultSet.next()) {
            this.a(new agw_1(this, resultSet));
        }
        i.info((Object)"termin\u00e9");
    }
}

