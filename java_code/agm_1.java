/*
 * Decompiled with CFR 0.152.
 */
import java.sql.Connection;

/*
 * Renamed from aGM
 */
public abstract class agm_1
implements agq_1 {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    protected final agn_1 e;
    protected final long f;
    protected final String g;

    protected agm_1(agn_1 agn_12, String string, long l) {
        this.e = agn_12;
        this.f = l;
        this.g = string;
    }

    public abstract int a();

    @Override
    public Connection h() {
        return this.e.h();
    }

    @Override
    public void a(Connection connection) {
        this.e.a(connection);
    }
}

