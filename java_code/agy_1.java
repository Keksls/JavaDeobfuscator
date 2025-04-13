/*
 * Decompiled with CFR 0.152.
 */
import java.sql.ResultSet;

/*
 * Renamed from aGY
 */
public class agy_1
extends ago_1 {
    private final ags_1 d;

    public agy_1(agn_1 agn_12, ResultSet resultSet) {
        super(agn_12, resultSet.getInt("oid"), resultSet.getString("nspname"));
        this.d = agn_12.b(resultSet.getInt("nspowner"));
    }

    public ags_1 e() {
        return this.d;
    }
}

