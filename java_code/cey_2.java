/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.list.array.TLongArrayList;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cEY
 */
public class cey_2 {
    public int a;
    public int b = -1;
    public boolean c;
    public boolean d;
    public boolean e;
    public String f;
    public final ArrayList<ceo_1> g = new ArrayList();
    public final TLongArrayList h = new TLongArrayList();
    public byte i;
    public boolean j;
    public cej_0 k;
    public int l;
    public byte m;
    public byte n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u = true;
    public int v;
    public int w;
    public int x = -1;
    public int y = -1;
    public int z = -1;
    public int A;

    public void a(@NotNull arf_1 arf_12) {
        int n;
        int n2;
        this.a = arf_12.c();
        this.b = arf_12.c();
        this.c = arf_12.l();
        this.d = arf_12.l();
        this.e = arf_12.l();
        this.f = arf_12.e();
        this.y = arf_12.c();
        this.z = arf_12.c();
        if (this.d) {
            this.i = arf_12.a();
            this.j = arf_12.l();
            n2 = arf_12.l() ? 1 : 0;
            if (n2 != 0) {
                this.k = ced_1.a(arf_12.a()).c();
                this.k.a(arf_12);
            }
        }
        if (this.e) {
            this.l = arf_12.c();
        }
        n2 = arf_12.c();
        this.g.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            this.g.add(cec_2.a(arf_12));
        }
        n = arf_12.c();
        this.h.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            this.h.add(arf_12.j());
        }
        if (!this.c) {
            this.m = arf_12.a();
            this.n = arf_12.a();
            this.o = arf_12.c();
            this.p = arf_12.c();
            this.q = arf_12.c();
            this.r = arf_12.c();
            this.s = arf_12.c();
            this.t = arf_12.c();
            this.u = arf_12.l();
            this.v = arf_12.c();
            this.w = arf_12.c();
            this.x = arf_12.c();
            this.A = arf_12.c();
        }
    }

    public void a(@NotNull gk_0 gk_02) {
        int n;
        gk_02.a(this.a);
        gk_02.a(this.b);
        gk_02.a(this.c);
        gk_02.a(this.d);
        gk_02.a(this.e);
        gk_02.a(this.f);
        gk_02.a(this.y);
        gk_02.a(this.z);
        if (this.d) {
            gk_02.a(this.i);
            gk_02.a(this.j);
            gk_02.a(this.k != null);
            if (this.k != null) {
                gk_02.a(this.k.d());
                this.k.a(gk_02);
            }
        }
        if (this.e) {
            gk_02.a(this.l);
        }
        gk_02.a(this.g.size());
        int n2 = this.g.size();
        for (n = 0; n < n2; ++n) {
            cec_2.a(gk_02, this.g.get(n));
        }
        gk_02.a(this.h.size());
        n2 = this.h.size();
        for (n = 0; n < n2; ++n) {
            gk_02.c(this.h.get(n));
        }
        if (!this.c) {
            gk_02.a(this.m);
            gk_02.a(this.n);
            gk_02.a(this.o);
            gk_02.a(this.p);
            gk_02.a(this.q);
            gk_02.a(this.r);
            gk_02.a(this.s);
            gk_02.a(this.t);
            gk_02.a(this.u);
            gk_02.a(this.v);
            gk_02.a(this.w);
            gk_02.a(this.x);
            gk_02.a(this.A);
        }
    }

    private void a(gk_0 gk_02, String string, String string2) {
        gk_02.a(string);
        gk_02.a(string2);
    }

    private void a(arf_1 arf_12, String string, String string2) {
        if (string.equals("id")) {
            this.a = Co.c(string2);
        } else if (string.equals("strataId")) {
            this.b = Co.c(string2);
        } else if (string.equals("parentContainer")) {
            this.c = Co.a(string2);
        } else if (string.equals("eventContainer")) {
            this.d = Co.a(string2);
        } else if (string.equals("audioMarkerContainer")) {
            this.e = Co.a(string2);
        } else if (string.equals("audioMarkerType")) {
            this.l = Co.c(string2);
        } else if (string.equals("eventType")) {
            this.i = Co.g(string2);
        } else if (string.equals("eventIsLocalized")) {
            this.j = Co.a(string2);
        } else if (string.equals("name")) {
            this.f = string2;
        } else if (string.equals("gain")) {
            this.y = Co.c(string2);
        } else if (string.equals("maxGain")) {
            this.z = Co.c(string2);
        } else if (string.equals("hasEventCriterion")) {
            boolean bl = Co.a(string2);
            if (bl) {
                this.k = ced_1.a(arf_12.a()).c();
                this.k.a(arf_12);
            }
        } else if (string.equals("criteriaSize")) {
            int n = Co.c(string2);
            this.g.ensureCapacity(n);
            for (int k = 0; k < n; ++k) {
                this.g.add(cec_2.a(arf_12));
            }
        } else if (string.equals("sourcesSize")) {
            int n = Co.c(string2);
            this.h.ensureCapacity(n);
            for (int k = 0; k < n; ++k) {
                this.h.add(arf_12.j());
            }
        } else if (string.equals("busId")) {
            this.m = Co.g(string2);
        } else if (string.equals("busType")) {
            this.n = Co.g(string2);
        } else if (string.equals("playType")) {
            this.o = Co.c(string2);
        } else if (string.equals("transition")) {
            this.p = Co.c(string2);
        } else if (string.equals("transitionMinDuration")) {
            this.s = this.q = Co.c(string2);
        } else if (string.equals("transitionMaxDuration")) {
            this.t = this.r = Co.c(string2);
        } else if (string.equals("transitionInMinDuration")) {
            this.q = Co.c(string2);
        } else if (string.equals("transitionInMaxDuration")) {
            this.r = Co.c(string2);
        } else if (string.equals("transitionOutMinDuration")) {
            this.s = Co.c(string2);
        } else if (string.equals("transitionOutMaxDuration")) {
            this.t = Co.c(string2);
        } else if (string.equals("transitionUseSameInOutValues")) {
            this.u = Co.a(string2);
        } else if (string.equals("loopMode")) {
            this.v = Co.c(string2);
        } else if (string.equals("loopDuration")) {
            this.w = Co.c(string2);
        } else if (string.equals("rollOffId")) {
            this.x = Co.c(string2);
        } else if (string.equals("initialDelay")) {
            this.A = Co.c(string2);
        }
    }

    public void b(arf_1 arf_12) {
        String string = arf_12.e();
        if (!string.equals("rsc")) {
            return;
        }
        arf_12.e();
        while (true) {
            String string2 = arf_12.e();
            String string3 = arf_12.e();
            if (string2.equals("/rsc")) {
                return;
            }
            this.a(arf_12, string2, string3);
        }
    }

    public void b(gk_0 gk_02) {
        int n;
        this.a(gk_02, "rsc", "");
        this.a(gk_02, "id", String.valueOf(this.a));
        this.a(gk_02, "strataId", String.valueOf(this.b));
        this.a(gk_02, "parentContainer", String.valueOf(this.c));
        this.a(gk_02, "eventContainer", String.valueOf(this.d));
        this.a(gk_02, "eventType", String.valueOf(this.i));
        this.a(gk_02, "eventIsLocalized", String.valueOf(this.j));
        this.a(gk_02, "audioMarkerContainer", String.valueOf(this.e));
        this.a(gk_02, "audioMarkerType", String.valueOf(this.l));
        this.a(gk_02, "name", this.f);
        this.a(gk_02, "gain", String.valueOf(this.y));
        this.a(gk_02, "maxGain", String.valueOf(this.z));
        this.a(gk_02, "hasEventCriterion", String.valueOf(this.k != null));
        if (this.k != null) {
            gk_02.a(this.k.d());
            this.k.a(gk_02);
        }
        this.a(gk_02, "criteriaSize", String.valueOf(this.g.size()));
        int n2 = this.g.size();
        for (n = 0; n < n2; ++n) {
            cec_2.a(gk_02, this.g.get(n));
        }
        this.a(gk_02, "sourcesSize", String.valueOf(this.h.size()));
        n2 = this.h.size();
        for (n = 0; n < n2; ++n) {
            gk_02.c(this.h.get(n));
        }
        if (!this.c) {
            this.a(gk_02, "busId", String.valueOf(this.m));
            this.a(gk_02, "busType", String.valueOf(this.n));
            this.a(gk_02, "playType", String.valueOf(this.o));
            this.a(gk_02, "transition", String.valueOf(this.p));
            this.a(gk_02, "transitionInMinDuration", String.valueOf(this.q));
            this.a(gk_02, "transitionInMaxDuration", String.valueOf(this.r));
            this.a(gk_02, "transitionOutMinDuration", String.valueOf(this.s));
            this.a(gk_02, "transitionOutMaxDuration", String.valueOf(this.t));
            this.a(gk_02, "transitionUseSameInOutValues", String.valueOf(this.u));
            this.a(gk_02, "loopMode", String.valueOf(this.v));
            this.a(gk_02, "loopDuration", String.valueOf(this.w));
            this.a(gk_02, "rollOffId", String.valueOf(this.x));
            this.a(gk_02, "initialDelay", String.valueOf(this.A));
        }
        this.a(gk_02, "/rsc", "");
    }

    public void a(cey_2 cey_22) {
        int n;
        cey_22.a = this.a;
        cey_22.b = this.b;
        cey_22.c = this.c;
        cey_22.d = this.d;
        cey_22.e = this.e;
        cey_22.l = this.l;
        cey_22.i = this.i;
        cey_22.j = this.j;
        cey_22.f = this.f;
        cey_22.k = this.k != null ? this.k.e() : null;
        int n2 = this.g.size();
        for (n = 0; n < n2; ++n) {
            cey_22.g.add(this.g.get(n).f());
        }
        n2 = this.h.size();
        for (n = 0; n < n2; ++n) {
            cey_22.h.add(this.h.get(n));
        }
        cey_22.m = this.m;
        cey_22.n = this.n;
        cey_22.o = this.o;
        cey_22.p = this.p;
        cey_22.q = this.q;
        cey_22.r = this.r;
        cey_22.s = this.s;
        cey_22.t = this.t;
        cey_22.u = this.u;
        cey_22.v = this.v;
        cey_22.w = this.w;
        cey_22.x = this.x;
        cey_22.y = this.y;
        cey_22.z = this.z;
        cey_22.A = this.A;
    }

    public String toString() {
        return this.f + " (id=" + this.a + ")";
    }
}

