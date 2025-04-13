/*
 * Decompiled with CFR 0.152.
 */
import java.sql.Connection;

/*
 * Renamed from aGR
 */
public abstract class agr_1
implements agq_1 {
    protected final agn_1 a;
    protected final String b;
    protected final long c;

    protected agr_1(agn_1 agn_12, long l, String string) {
        this.a = agn_12;
        this.b = string;
        this.c = l;
    }

    public agn_1 a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public long c() {
        return this.c;
    }

    @Override
    public Connection h() {
        return null;
    }

    @Override
    public void a(Connection connection) {
    }
}

