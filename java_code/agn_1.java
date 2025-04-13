/*
 * Decompiled with CFR 0.152.
 */
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aGN
 */
public abstract class agn_1
implements agq_1 {
    protected Connection a;
    protected final List<agp_1> b = new ArrayList<agp_1>();
    protected final List<ags_1> c = new ArrayList<ags_1>();
    protected final List<ago_1> d = new ArrayList<ago_1>();
    protected final List<agr_1> e = new ArrayList<agr_1>();
    protected final List<agk_1> f = new ArrayList<agk_1>();
    protected final List<agl_1> g = new ArrayList<agl_1>();
    protected final List<agm_1> h = new ArrayList<agm_1>();

    protected agn_1(Connection connection) {
        this.a = connection;
    }

    public boolean a(agp_1 agp_12) {
        return this.b.add(agp_12);
    }

    public boolean b(agp_1 agp_12) {
        return this.b.remove(agp_12);
    }

    public agp_1 a(long l) {
        for (agp_1 agp_12 : this.b) {
            if (agp_12.b() != l) continue;
            return agp_12;
        }
        return null;
    }

    public boolean a(ags_1 ags_12) {
        return this.c.add(ags_12);
    }

    public boolean b(ags_1 ags_12) {
        return this.c.remove(ags_12);
    }

    public ags_1 b(long l) {
        for (ags_1 ags_12 : this.c) {
            if (ags_12.b() != l) continue;
            return ags_12;
        }
        return null;
    }

    public boolean a(ago_1 ago_12) {
        return this.d.add(ago_12);
    }

    public boolean b(ago_1 ago_12) {
        return this.d.remove(ago_12);
    }

    public ago_1 c(long l) {
        for (ago_1 ago_12 : this.d) {
            if (ago_12.c() != l) continue;
            return ago_12;
        }
        return null;
    }

    public ago_1 a(String string) {
        for (ago_1 ago_12 : this.d) {
            if (!ago_12.b().equals(string)) continue;
            return ago_12;
        }
        return null;
    }

    public List<ago_1> a() {
        return this.d;
    }

    public boolean a(agr_1 agr_12) {
        return this.e.add(agr_12);
    }

    public boolean b(agr_1 agr_12) {
        return this.e.remove(agr_12);
    }

    public agr_1 d(long l) {
        for (agr_1 agr_12 : this.e) {
            if (agr_12.c() != l) continue;
            return agr_12;
        }
        return null;
    }

    public boolean a(agk_1 agk_12) {
        return this.f.add(agk_12);
    }

    public boolean b(agk_1 agk_12) {
        return this.f.remove(agk_12);
    }

    public boolean a(agl_1 agl_12) {
        return this.g.add(agl_12);
    }

    public boolean b(agl_1 agl_12) {
        return this.g.remove(agl_12);
    }

    public boolean a(agm_1 agm_12) {
        return this.h.add(agm_12);
    }

    public boolean b(agm_1 agm_12) {
        return this.h.remove(agm_12);
    }

    @Override
    public Connection h() {
        return this.a;
    }

    @Override
    public void a(Connection connection) {
        this.a = connection;
    }
}

