/*
 * Decompiled with CFR 0.152.
 */
import java.sql.Connection;

/*
 * Renamed from aGL
 */
public abstract class agl_1
implements agq_1 {
    protected final agn_1 a;
    protected final long b;
    protected boolean c;

    protected agl_1(agn_1 agn_12, long l) {
        this.a = agn_12;
        this.b = l;
        this.c = false;
    }

    public long a() {
        return this.b;
    }

    public abstract agk_1 b();

    public boolean c() {
        return this.c;
    }

    public void a(boolean bl) {
        this.c = bl;
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

