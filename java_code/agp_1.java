/*
 * Decompiled with CFR 0.152.
 */
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aGP
 */
public abstract class agp_1
implements agq_1 {
    protected final String a;
    protected final agn_1 b;
    protected final long c;
    private final List<agk_1> d = new ArrayList<agk_1>();
    private final List<agm_1> e = new ArrayList<agm_1>();

    protected agp_1(agn_1 agn_12, long l, String string) {
        this.b = agn_12;
        this.a = string;
        this.c = l;
    }

    public String a() {
        return this.a;
    }

    public long b() {
        return this.c;
    }

    public void a(agk_1 agk_12) {
        if (!this.d.contains(agk_12)) {
            this.d.add(agk_12);
        }
    }

    public List<agk_1> c() {
        return this.d;
    }

    public agk_1 a(int n) {
        for (agk_1 agk_12 : this.d) {
            if (agk_12.f() != n) continue;
            return agk_12;
        }
        return null;
    }

    public boolean a(agm_1 agm_12) {
        return this.e.add(agm_12);
    }

    public boolean b(agm_1 agm_12) {
        return this.e.remove(agm_12);
    }

    public List<agm_1> d() {
        return this.e;
    }

    @Override
    public Connection h() {
        return this.b.h();
    }

    @Override
    public void a(Connection connection) {
        this.b.a(connection);
    }
}

