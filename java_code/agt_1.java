/*
 * Decompiled with CFR 0.152.
 */
import java.sql.ResultSet;

/*
 * Renamed from aGT
 */
public class agt_1
extends agk_1 {
    private final agp_1 d;
    private final agr_1 e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final short i;
    private final int j;

    public agt_1(agn_1 agn_12, ResultSet resultSet) {
        super(agn_12, resultSet.getShort("attnum"), resultSet.getString("attname"));
        this.d = agn_12.a(resultSet.getLong("attrelid"));
        this.e = agn_12.d(resultSet.getLong("atttypid"));
        this.f = resultSet.getBoolean("attisdropped");
        this.g = resultSet.getBoolean("atthasdef");
        this.h = resultSet.getBoolean("attnotnull");
        this.i = resultSet.getShort("attnum");
        this.j = resultSet.getInt("atttypmod");
        if (this.d != null) {
            this.d.a(this);
        }
    }

    public agp_1 i() {
        return this.d;
    }

    @Override
    public agr_1 b() {
        return this.e;
    }

    @Override
    public boolean e() {
        return this.f;
    }

    @Override
    public boolean d() {
        return this.g;
    }

    @Override
    public boolean c() {
        return this.h;
    }

    @Override
    public short f() {
        return this.i;
    }

    public int j() {
        return this.j;
    }
}

