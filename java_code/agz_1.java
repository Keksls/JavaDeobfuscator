/*
 * Decompiled with CFR 0.152.
 */
import java.sql.ResultSet;

/*
 * Renamed from aGZ
 */
public class agz_1
extends agr_1 {
    private ags_1 d;
    private short e;
    private boolean f;
    private int g;
    private agr_1 h;
    private agr_1 i;
    private long j;
    private long k;

    public agz_1(agn_1 agn_12, ResultSet resultSet) {
        super(agn_12, resultSet.getInt("oid"), resultSet.getString("typname"));
        this.d = agn_12.b(resultSet.getInt("typowner"));
        this.e = resultSet.getShort("typlen");
        this.j = resultSet.getLong("typelem");
        this.f = resultSet.getBoolean("typnotnull");
        this.k = resultSet.getLong("typbasetype");
        this.g = resultSet.getInt("typndims");
    }

    public void d() {
        this.h = this.a.d(this.j);
        this.i = this.a.d(this.k);
    }

    public ags_1 e() {
        return this.d;
    }

    public short f() {
        return this.e;
    }

    public agr_1 g() {
        return this.h;
    }

    public boolean i() {
        return this.f;
    }

    public agr_1 j() {
        return this.i;
    }

    public int k() {
        return this.g;
    }
}

