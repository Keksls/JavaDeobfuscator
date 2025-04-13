/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from agK
 */
public class agk_0<APS extends ajb_1, CPS extends ajb_1>
implements ajh_1 {
    private static final Logger d = Logger.getLogger(agk_0.class);
    private static final boolean e = false;
    public static final int a = 25;
    public static final int b = 5;
    private ajb_1 f;
    private APS g;
    private CPS h;
    private final Map<Long, CPS> i = new HashMap<Long, CPS>();
    private final List<agr_0> j = new ArrayList<agr_0>();

    public ajb_1 a(ags_0 ags_02) {
        switch (ags_02) {
            case a: {
                return this.f;
            }
            case b: {
                return this.g;
            }
            case c: {
                return this.h;
            }
            case d: {
                throw new IllegalArgumentException("Getting hero preferences without specifying the targeted hero is not consistent");
            }
        }
        return null;
    }

    public agp_0 a(String string) {
        return agq_0.a(string);
    }

    public void a(agp_0 agp_02, boolean bl) {
        Object w = agp_02.c(this);
        String string = agp_02.b();
        if (w == null) {
            this.a(agp_02, (Object)bl);
            return;
        }
        w.b(string, bl);
        ajg_1.a().a((ajf_1)this, string);
    }

    public void a(agp_0 agp_02, double d2) {
        Object w = agp_02.c(this);
        String string = agp_02.b();
        if (w == null) {
            this.a(agp_02, (Object)d2);
            return;
        }
        w.a(string, d2);
        ajg_1.a().a((ajf_1)this, string);
    }

    public void a(agp_0 agp_02, float f2) {
        Object w = agp_02.c(this);
        String string = agp_02.b();
        if (w == null) {
            this.a(agp_02, (Object)Float.valueOf(f2));
            return;
        }
        w.a(string, f2);
        ajg_1.a().a((ajf_1)this, string);
    }

    public void a(agp_0 agp_02, int n) {
        Object w = agp_02.c(this);
        String string = agp_02.b();
        if (w == null) {
            this.a(agp_02, (Object)n);
            return;
        }
        w.a(string, n);
        ajg_1.a().a((ajf_1)this, string);
    }

    public void a(agp_0 agp_02, long l) {
        Object w = agp_02.c(this);
        String string = agp_02.b();
        if (w == null) {
            this.a(agp_02, (Object)l);
            return;
        }
        w.a(string, l);
        ajg_1.a().a((ajf_1)this, string);
    }

    public void a(agp_0 agp_02, String string) {
        Object w = agp_02.c(this);
        String string2 = agp_02.b();
        if (w == null) {
            this.a(agp_02, (Object)string);
            return;
        }
        w.d(string2, string);
        ajg_1.a().a((ajf_1)this, string2);
    }

    public void b(agp_0 agp_02, boolean bl) {
        Object w = agp_02.c(this);
        String string = agp_02.b();
        if (w == null) {
            this.a(agp_02, (Object)bl);
            return;
        }
        w.c(string, bl);
        ajg_1.a().a((ajf_1)this, string);
    }

    public void b(agp_0 agp_02, double d2) {
        Object w = agp_02.c(this);
        String string = agp_02.b();
        if (w == null) {
            this.a(agp_02, (Object)d2);
            return;
        }
        w.b(string, d2);
        ajg_1.a().a((ajf_1)this, string);
    }

    public void b(agp_0 agp_02, float f2) {
        Object w = agp_02.c(this);
        String string = agp_02.b();
        if (w == null) {
            this.a(agp_02, (Object)Float.valueOf(f2));
            return;
        }
        w.b(string, f2);
        ajg_1.a().a((ajf_1)this, string);
    }

    public void b(agp_0 agp_02, int n) {
        Object w = agp_02.c(this);
        String string = agp_02.b();
        if (w == null) {
            this.a(agp_02, (Object)n);
            return;
        }
        w.b(string, n);
        ajg_1.a().a((ajf_1)this, string);
    }

    public void b(agp_0 agp_02, long l) {
        Object w = agp_02.c(this);
        String string = agp_02.b();
        if (w == null) {
            this.a(agp_02, (Object)l);
            return;
        }
        w.b(string, l);
        ajg_1.a().a((ajf_1)this, string);
    }

    public void b(agp_0 agp_02, String string) {
        Object w = agp_02.c(this);
        String string2 = agp_02.b();
        if (w == null) {
            this.a(agp_02, (Object)string);
            return;
        }
        w.e(string2, string);
        ajg_1.a().a((ajf_1)this, string2);
    }

    private void a(agp_0 agp_02, Object object) {
        d.error((Object)String.format("[PREFS] Unable to set preference related to following key : %s with following value : %s in this context, preferenceStore associated isn't initialized", agp_02, object), (Throwable)new IllegalStateException(String.format("Unable to set following preference : %s with following value : %s", agp_02, object)));
    }

    public boolean a(agp_0 agp_02) {
        Object r2 = agp_02.b(this);
        String string = agp_02.b();
        if (r2 == null) {
            this.m(agp_02);
            return false;
        }
        return r2.n(string);
    }

    public double b(agp_0 agp_02) {
        Object r2 = agp_02.b(this);
        String string = agp_02.b();
        if (r2 == null) {
            this.m(agp_02);
            return 0.0;
        }
        return r2.o(string);
    }

    public float c(agp_0 agp_02) {
        Object r2 = agp_02.b(this);
        String string = agp_02.b();
        if (r2 == null) {
            this.m(agp_02);
            return 0.0f;
        }
        return r2.p(string);
    }

    public int d(agp_0 agp_02) {
        Object r2 = agp_02.b(this);
        String string = agp_02.b();
        if (r2 == null) {
            this.m(agp_02);
            return 0;
        }
        return r2.q(string);
    }

    public long e(agp_0 agp_02) {
        Object r2 = agp_02.b(this);
        String string = agp_02.b();
        if (r2 == null) {
            this.m(agp_02);
            return 0L;
        }
        return r2.r(string);
    }

    public String f(agp_0 agp_02) {
        Object r2 = agp_02.b(this);
        String string = agp_02.b();
        if (r2 == null) {
            this.m(agp_02);
            return null;
        }
        return r2.s(string);
    }

    public boolean g(agp_0 agp_02) {
        Object r2 = agp_02.b(this);
        String string = agp_02.b();
        if (r2 == null) {
            this.m(agp_02);
            return false;
        }
        return r2.t(string);
    }

    public double h(agp_0 agp_02) {
        Object r2 = agp_02.b(this);
        String string = agp_02.b();
        if (r2 == null) {
            this.m(agp_02);
            return 0.0;
        }
        return r2.u(string);
    }

    public float i(agp_0 agp_02) {
        Object r2 = agp_02.b(this);
        String string = agp_02.b();
        if (r2 == null) {
            this.m(agp_02);
            return 0.0f;
        }
        return r2.v(string);
    }

    public int j(agp_0 agp_02) {
        Object r2 = agp_02.b(this);
        String string = agp_02.b();
        if (r2 == null) {
            this.m(agp_02);
            return 0;
        }
        return r2.w(string);
    }

    public long k(agp_0 agp_02) {
        Object r2 = agp_02.b(this);
        String string = agp_02.b();
        if (r2 == null) {
            this.m(agp_02);
            return 0L;
        }
        return r2.x(string);
    }

    public String l(agp_0 agp_02) {
        Object r2 = agp_02.b(this);
        String string = agp_02.b();
        if (r2 == null) {
            this.m(agp_02);
            return null;
        }
        return r2.y(string);
    }

    private void m(agp_0 agp_02) {
    }

    protected void a() {
    }

    protected void b() {
    }

    protected void a(long l) {
    }

    protected void c() {
        this.b((agp_0)agq_0.a, Oy.g().b().getLanguage());
        this.b((agp_0)ago_0.a, 1.0f);
        this.b((agp_0)ago_0.b, 1.0f);
        this.b((agp_0)ago_0.c, 1.0f);
        this.b((agp_0)ago_0.d, false);
        this.b((agp_0)ago_0.e, false);
        this.b((agp_0)ago_0.f, false);
        this.b((agp_0)ago_0.g, false);
        this.b((agp_0)agq_0.c, 0);
        this.b((agp_0)agq_0.e, false);
    }

    @Override
    public Object b(String string) {
        if (string.equals(agq_0.a.b())) {
            return this.f(agq_0.a);
        }
        if (string.equals(ago_0.a.b())) {
            return Float.valueOf(this.c(ago_0.a));
        }
        if (string.equals(ago_0.b.b())) {
            return Float.valueOf(this.c(ago_0.b));
        }
        if (string.equals(ago_0.c.b())) {
            return Float.valueOf(this.c(ago_0.c));
        }
        if (string.equals(ago_0.d.b())) {
            return this.a(ago_0.d);
        }
        if (string.equals(ago_0.e.b())) {
            return this.a(ago_0.e);
        }
        if (string.equals(ago_0.f.b())) {
            return this.a(ago_0.f);
        }
        if (string.equals(ago_0.g.b())) {
            return this.a(ago_0.g);
        }
        if (string.equals(agq_0.c.b())) {
            return Float.valueOf(this.c(agq_0.c) + 5.0f);
        }
        if (string.equals(agq_0.e.b())) {
            return this.a(agq_0.e);
        }
        return null;
    }

    @Override
    public String[] d() {
        agq_0[] agq_0Array = agq_0.values();
        ago_0[] ago_0Array = ago_0.values();
        String[] stringArray = new String[agq_0Array.length + ago_0Array.length];
        int n = 0;
        for (agq_0 enum_ : agq_0Array) {
            stringArray[n] = enum_.b();
            ++n;
        }
        for (Enum enum_ : ago_0Array) {
            stringArray[n] = ((ago_0)enum_).b();
            ++n;
        }
        return stringArray;
    }

    public void c(String string) {
        ajg_1.a().a((ajf_1)this, string);
    }

    public void e() {
        if (this.f != null) {
            this.f.m();
        }
        if (this.g != null) {
            ((ajb_1)this.g).m();
        }
        if (this.h != null) {
            ((ajb_1)this.h).m();
        }
    }

    public CPS b(long l) {
        return (CPS)((ajb_1)this.i.get(l));
    }

    public CPS f() {
        return this.h;
    }

    public APS g() {
        return this.g;
    }

    public ajb_1 h() {
        return this.f;
    }

    public void a(ajb_1 ajb_12) {
        ajb_1 ajb_13 = this.f;
        this.f = ajb_12;
        if (this.f != null) {
            this.c();
        }
        this.a(ags_0.a, ajb_13, ajb_12);
    }

    public void b(APS APS) {
        APS APS2 = this.g;
        this.g = APS;
        if (this.g != null) {
            this.a();
        }
        this.a(ags_0.b, (ajb_1)APS2, (ajb_1)APS);
    }

    public void c(CPS CPS) {
        CPS CPS2 = this.h;
        this.h = CPS;
        if (this.h != null) {
            this.b();
        }
        this.a(ags_0.c, (ajb_1)CPS2, (ajb_1)CPS);
    }

    public void a(long l, CPS CPS) {
        ajb_1 ajb_12 = (ajb_1)this.i.get(l);
        this.i.put(l, CPS);
        if (CPS != null) {
            this.a(l);
        }
        this.a(ags_0.d, ajb_12, (ajb_1)CPS);
    }

    public void i() {
        for (long l : this.i.keySet()) {
            this.a(l, null);
        }
    }

    private void a(ags_0 ags_02, ajb_1 ajb_12, ajb_1 ajb_13) {
        for (agr_0 agr_02 : this.j) {
            agr_02.a(ags_02, ajb_12, ajb_13);
        }
    }

    public void a(agr_0 agr_02) {
        this.j.add(agr_02);
    }

    public void b(agr_0 agr_02) {
        this.j.remove(agr_02);
    }
}

