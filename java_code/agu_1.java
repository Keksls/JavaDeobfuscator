/*
 * Decompiled with CFR 0.152.
 */
import java.sql.ResultSet;

/*
 * Renamed from aGU
 */
public class agu_1
extends agl_1 {
    private agk_1 d = null;
    private final String e;
    private final String f;

    public agu_1(agn_1 agn_12, ResultSet resultSet) {
        super(agn_12, resultSet.getLong("oid"));
        agp_1 agp_12 = agn_12.a(resultSet.getLong("adrelid"));
        if (agp_12 != null) {
            this.d = agp_12.a(resultSet.getShort("adnum"));
            if (this.d != null) {
                this.d.a(this);
            }
        }
        this.e = resultSet.getString("adbin");
        this.f = resultSet.getString("adsrc");
    }

    @Override
    public agk_1 b() {
        return this.d;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.f;
    }
}

