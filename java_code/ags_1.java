/*
 * Decompiled with CFR 0.152.
 */
import java.sql.Connection;

/*
 * Renamed from aGS
 */
public abstract class ags_1
implements agq_1 {
    protected final agn_1 a;
    protected final String b;
    protected final long c;

    protected ags_1(agn_1 agn_12, String string, long l) {
        this.a = agn_12;
        this.c = l;
        this.b = string;
    }

    public String a() {
        return this.b;
    }

    public long b() {
        return this.c;
    }

    @Override
    public Connection h() {
        return this.a.h();
    }

    @Override
    public void a(Connection connection) {
        this.a.a(connection);
    }
}

