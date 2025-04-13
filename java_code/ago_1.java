/*
 * Decompiled with CFR 0.152.
 */
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aGO
 */
public abstract class ago_1
implements agq_1 {
    protected final agn_1 a;
    protected final String b;
    protected final long c;
    private final List<agp_1> d = new ArrayList<agp_1>();

    protected ago_1(agn_1 agn_12, long l, String string) {
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

    public void a(agp_1 agp_12) {
        if (!this.d.contains(agp_12)) {
            this.d.add(agp_12);
        }
    }

    public List<agp_1> d() {
        return this.d;
    }

    public agp_1 a(String string) {
        for (agp_1 agp_12 : this.d) {
            if (!agp_12.a.equals(string)) continue;
            return agp_12;
        }
        return null;
    }

    public agp_1 a(long l) {
        for (agp_1 agp_12 : this.d) {
            if (agp_12.c != l) continue;
            return agp_12;
        }
        return null;
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

