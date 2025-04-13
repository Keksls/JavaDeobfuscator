/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eBQ
 */
public class ebq_0 {
    private long a;
    private int b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private short g;
    private final Set<Integer> h = new HashSet<Integer>();

    protected void a() {
        ++this.b;
    }

    protected void a(boolean bl) {
        if (bl) {
            ++this.c;
        } else {
            ++this.d;
        }
    }

    protected void b() {
        ++this.e;
    }

    public long a(long l) {
        long l2 = this.a + l;
        if (ecu_0.c(l2) >= 200) {
            this.a = ecu_0.a((short)200);
            return this.a;
        }
        return this.a += l;
    }

    public boolean a(int n) {
        return this.h.add(n);
    }

    protected boolean b(int n) {
        return this.h.contains(n);
    }

    public short c() {
        return ecu_0.c(this.a);
    }

    public static ebq_0 a(@NotNull dp_2 dp_22, @Nullable dl_1 dl_12) {
        ebq_0 ebq_02 = new ebq_0();
        ebq_02.a = dp_22.c();
        ds_2 ds_22 = dp_22.e();
        ebq_02.b = ds_22.b() ? ds_22.c() : 0;
        ebq_02.d = ds_22.d() ? ds_22.e() : 0;
        ebq_02.c = ds_22.f() ? ds_22.g() : 0;
        int n = ebq_02.e = ds_22.h() ? ds_22.i() : 0;
        if (dl_12 != null) {
            ebq_02.f = dl_12.c();
            ebq_02.g = (short)(dl_12.d() ? dl_12.e() : 0);
        } else {
            ebq_02.f = false;
            ebq_02.g = 0;
        }
        for (dr_1 dr_12 : dp_22.g()) {
            ebq_02.h.add(dr_12.c());
        }
        return ebq_02;
    }

    public static ebq_0 a(@NotNull gf_2 gf_22) {
        ebq_0 ebq_02 = new ebq_0();
        ebq_02.a = ecu_0.a((short)gf_22.c());
        ebq_02.b = 0;
        ebq_02.d = 0;
        ebq_02.c = 0;
        ebq_02.e = 0;
        ebq_02.f = false;
        ebq_02.g = 0;
        for (dr_1 dr_12 : gf_22.d()) {
            ebq_02.h.add(dr_12.c());
        }
        return ebq_02;
    }

    protected List<dr_1> d() {
        ArrayList<dr_1> arrayList = new ArrayList<dr_1>();
        for (int n : this.h) {
            arrayList.add(dr_1.e().a(n).f());
        }
        return arrayList;
    }

    public dp_2 e() {
        du_1 du_12 = ds_2.k();
        if (this.b > 0) {
            du_12.a(this.b);
        }
        if (this.d > 0) {
            du_12.b(this.d);
        }
        if (this.c > 0) {
            du_12.c(this.c);
        }
        if (this.e > 0) {
            du_12.d(this.e);
        }
        return dp_2.k().a(du_12.l()).a(this.a).a(this.d()).l();
    }

    protected dl_1 f() {
        dn_2 dn_22 = dl_1.g().a(this.f);
        if (this.g > 0) {
            dn_22.a(this.g);
        }
        return dn_22.h();
    }

    public gf_2 g() {
        return gf_2.h().c(this.c()).a(this.d()).i();
    }

    public long h() {
        return this.a;
    }

    public int i() {
        return this.b;
    }

    public int j() {
        return this.c;
    }

    public int k() {
        return this.d;
    }

    public int l() {
        return this.e;
    }

    public boolean m() {
        return this.f;
    }

    public short n() {
        return this.g;
    }

    public Set<Integer> o() {
        return this.h;
    }

    public void b(long l) {
        this.a = l;
    }

    public void c(int n) {
        this.b = n;
    }

    public void d(int n) {
        this.c = n;
    }

    public void e(int n) {
        this.d = n;
    }

    public void f(int n) {
        this.e = n;
    }

    public void b(boolean bl) {
        this.f = bl;
    }

    public void a(short s2) {
        this.g = s2;
    }
}

