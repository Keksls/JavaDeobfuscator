/*
 * Decompiled with CFR 0.152.
 */
import java.sql.Connection;

/*
 * Renamed from aGK
 */
public abstract class agk_1
implements agq_1 {
    protected final agn_1 a;
    protected final String b;
    protected final long c;
    private agl_1 d;

    protected agk_1(agn_1 agn_12, long l, String string) {
        this.a = agn_12;
        this.b = string;
        this.c = l;
    }

    public String a() {
        return this.b;
    }

    public abstract agr_1 b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract short f();

    public agl_1 g() {
        return this.d;
    }

    public void a(agl_1 agl_12) {
        this.d = agl_12;
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

