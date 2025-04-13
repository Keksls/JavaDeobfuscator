/*
 * Decompiled with CFR 0.152.
 */
import java.sql.ResultSet;

/*
 * Renamed from aHa
 */
public class aha_2
extends ags_1 {
    private boolean d;
    private boolean e;
    private boolean f;

    public aha_2(agn_1 agn_12, ResultSet resultSet) {
        super(agn_12, resultSet.getString("usename"), resultSet.getInt("usesysid"));
        this.d = resultSet.getBoolean("usecreatedb");
        this.e = resultSet.getBoolean("usesuper");
        this.f = resultSet.getBoolean("usecatupd");
    }

    public boolean c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }

    public boolean e() {
        return this.f;
    }
}

