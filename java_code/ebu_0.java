/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from eBU
 */
public class ebu_0
implements ece_0 {
    private static final Logger h = Logger.getLogger(ebu_0.class);
    protected final Map<Integer, ebq_0> a = new HashMap<Integer, ebq_0>();
    protected final List<ebv_0> b = new ArrayList<ebv_0>();
    protected boolean c;
    protected final Map<ebx_0, ebz_0> d = new EnumMap<ebx_0, ebz_0>(ebx_0.class);
    protected final Map<Integer, Integer> e = new HashMap<Integer, Integer>();
    protected boolean f;
    protected boolean g;

    @Override
    @NotNull
    public ebw_0 a(@NotNull ect_0 ect_02) {
        if (this.a.containsKey(ect_02.a())) {
            return ebw_0.f;
        }
        this.a.put(ect_02.a(), new ebq_0());
        this.b(ect_02);
        return ebw_0.a;
    }

    protected void b(@NotNull ect_0 ect_02) {
        for (ebv_0 ebv_02 : this.b) {
            try {
                ebv_02.a(ect_02);
            }
            catch (Exception exception) {
                h.error((Object)String.format("Error occured for following class of craftListener : %s during call of onCraftLearned with following args : %s", ebv_02.getClass(), ect_02));
            }
        }
    }

    @Override
    @NotNull
    public ebw_0 c(@NotNull ect_0 ect_02) {
        ebq_0 ebq_02 = this.a.remove(ect_02.a());
        if (ebq_02 == null) {
            return ebw_0.c;
        }
        return ebw_0.a;
    }

    @Override
    @NotNull
    public ebw_0 a(int n, int n2) {
        ebq_0 ebq_02 = this.a.get(n);
        if (ebq_02 == null) {
            return ebw_0.g;
        }
        boolean bl = ebq_02.a(n2);
        if (!bl) {
            return ebw_0.a;
        }
        this.b(n, n2);
        return ebw_0.a;
    }

    protected void b(int n, int n2) {
        for (ebv_0 ebv_02 : this.b) {
            try {
                ebv_02.a(n, n2);
            }
            catch (Exception exception) {
                h.error((Object)String.format("Error occured for following class of craftListener : %s during call of onRecipeLearned with following args : %s, %s", ebv_02.getClass(), n, n2));
            }
        }
    }

    @Override
    @NotNull
    public Set<Integer> a(int n) {
        ebq_0 ebq_02 = this.a.get(n);
        if (ebq_02 == null) {
            return Collections.emptySet();
        }
        return ebq_02.o();
    }

    @Override
    public long a(int n, long l) {
        long l2;
        if (n == 0) {
            return 0L;
        }
        if (this.f(n) >= 200) {
            return this.i(n);
        }
        ebq_0 ebq_02 = this.a.get(n);
        if (ebq_02 == null) {
            h.error((Object)("Tentative d'ajout d'XP \u00e0 un m\u00e9tier inconnu " + n), (Throwable)new IllegalArgumentException());
            return 0L;
        }
        long l3 = ebq_02.h();
        if (l3 != (l2 = ebq_02.a(l))) {
            this.b(n, l);
        }
        return l2;
    }

    protected void b(int n, long l) {
        for (ebv_0 ebv_02 : this.b) {
            try {
                ebv_02.a(n, l);
            }
            catch (Exception exception) {
                h.error((Object)String.format("Error occured for following class of craftListener : %s during call of onCraftXpGained with following args : %s, %s", ebv_02.getClass(), n, l));
            }
        }
    }

    @Override
    public void b(int n) {
        if (n == 0) {
            return;
        }
        this.a.get(n).a();
        this.d(n);
    }

    @Override
    public void a(int n, boolean bl) {
        if (n == 0) {
            return;
        }
        this.a.get(n).a(bl);
        this.d(n);
    }

    @Override
    public void c(int n) {
        if (n == 0) {
            return;
        }
        this.a.get(n).b();
        this.d(n);
    }

    @Override
    public void d(int n) {
        for (ebv_0 ebv_02 : this.b) {
            try {
                ebv_02.a(n);
            }
            catch (Exception exception) {
                h.error((Object)String.format("Error occured for following class of craftListener : %s during call of notifyCraftSuccess with following args : %s", ebv_02.getClass(), n));
            }
        }
    }

    @Override
    public boolean e(int n) {
        if (n == 0) {
            return true;
        }
        return this.a.containsKey(n);
    }

    @Override
    public short f(int n) {
        ebq_0 ebq_02 = this.a.get(n);
        return ebq_02 != null ? ecu_0.c(ebq_02.h()) : (short)0;
    }

    @Override
    public double c(int n, long l) {
        ebq_0 ebq_02 = this.a.get(n);
        return ebq_02 != null ? ecu_0.d(l) : 0.0;
    }

    @Override
    public double g(int n) {
        ebq_0 ebq_02 = this.a.get(n);
        return ebq_02 != null ? ecu_0.d(ebq_02.h()) : 0.0;
    }

    @Override
    public long h(int n) {
        ebq_0 ebq_02 = this.a.get(n);
        return ebq_02 != null ? ecu_0.a(ebq_02.h()) : 0L;
    }

    @Override
    public long i(int n) {
        ebq_0 ebq_02 = this.a.get(n);
        return ebq_02 != null ? ebq_02.h() : 0L;
    }

    @Override
    public int j(int n) {
        ebq_0 ebq_02 = this.a.get(n);
        return ebq_02 != null ? ebq_02.i() : 0;
    }

    @Override
    public int k(int n) {
        ebq_0 ebq_02 = this.a.get(n);
        return ebq_02 != null ? ebq_02.j() : 0;
    }

    @Override
    public int l(int n) {
        ebq_0 ebq_02 = this.a.get(n);
        return ebq_02 != null ? ebq_02.k() : 0;
    }

    @Override
    public int m(int n) {
        ebq_0 ebq_02 = this.a.get(n);
        return ebq_02 != null ? ebq_02.l() : 0;
    }

    @Override
    public short n(int n) {
        ebq_0 ebq_02 = this.a.get(n);
        return ebq_02 != null ? ebq_02.n() : (short)0;
    }

    @Override
    public boolean o(int n) {
        ebq_0 ebq_02 = this.a.get(n);
        return ebq_02 != null && ebq_02.m();
    }

    @Override
    public boolean a() {
        return this.c;
    }

    @Override
    public void a(boolean bl) {
        this.c = bl;
    }

    @Override
    public void b(int n, boolean bl) {
        ebq_0 ebq_02 = this.a.get(n);
        if (ebq_02 == null) {
            return;
        }
        ebq_02.b(bl);
    }

    @Override
    public void c(int n, int n2) {
        ebq_0 ebq_02 = this.a.get(n);
        if (ebq_02 == null) {
            return;
        }
        ebq_02.a((short)n2);
    }

    @Override
    public @Unmodifiable @NotNull Set<Integer> b() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    @Override
    public boolean d(int n, int n2) {
        ebq_0 ebq_02 = this.a.get(n);
        return ebq_02 != null && ebq_02.b(n2);
    }

    protected boolean p(int n) {
        return n >= 0 && n <= 2000000000;
    }

    protected boolean a(@NotNull ebz_0 ebz_02) {
        return this.p(ebz_02.d()) && this.p(ebz_02.c());
    }

    @Override
    public @Unmodifiable @NotNull Map<ebx_0, ebz_0> c() {
        return Collections.unmodifiableMap(this.d);
    }

    @Override
    public boolean a(ebx_0 ebx_02, @Nullable ebz_0 ebz_02) {
        @Nullable ebz_0 ebz_03 = this.d.get((Object)ebx_02);
        if (Objects.equals(ebz_03, ebz_02)) {
            return false;
        }
        if (ebz_02 != null) {
            if (!this.a(ebz_02)) {
                return false;
            }
            this.d.put(ebx_02, ebz_02);
        } else {
            this.d.remove((Object)ebx_02);
        }
        return true;
    }

    @Override
    public void a(Map<ebx_0, ebz_0> map) {
        this.d.clear();
        this.d.putAll(map);
    }

    @Override
    public @Unmodifiable @NotNull Map<Integer, Integer> d() {
        return Collections.unmodifiableMap(this.e);
    }

    @Override
    public boolean a(int n, @Nullable Integer n2) {
        if (!ecg_0.a().a(n)) {
            return false;
        }
        @Nullable Integer n3 = this.e.get(n);
        if (Objects.equals(n3, n2)) {
            return false;
        }
        if (n2 != null) {
            if (!this.p(n2)) {
                return false;
            }
            this.e.put(n, n2);
        } else {
            this.e.remove(n);
        }
        return true;
    }

    @Override
    public void b(@NotNull Map<Integer, Integer> map) {
        this.e.clear();
        map.forEach((n, n2) -> {
            if (!this.p((int)n2) || !ecg_0.a().a((int)n)) {
                return;
            }
            this.e.put((Integer)n, (Integer)n2);
        });
    }

    @Override
    public boolean e() {
        return this.f;
    }

    @Override
    public boolean b(boolean bl) {
        if (this.f == bl) {
            return false;
        }
        this.f = bl;
        return true;
    }

    @Override
    public boolean f() {
        return this.g;
    }

    @Override
    public boolean c(boolean bl) {
        if (this.g == bl) {
            return false;
        }
        this.g = bl;
        return true;
    }

    @Override
    public int a(@NotNull eco_0 eco_02, boolean bl) {
        if (bl && !this.f) {
            return 0;
        }
        if (this.e.containsKey(eco_02.e())) {
            return this.e.get(eco_02.e());
        }
        ebx_0 ebx_02 = eco_02.g();
        ebz_0 ebz_02 = ebx_02.a(this.d, this.g).c();
        if (ebz_02 == null) {
            return 0;
        }
        return ebz_02.a(eco_02);
    }

    @Override
    public void a(@NotNull ebv_0 ebv_02) {
        if (!this.b.contains(ebv_02)) {
            this.b.add(ebv_02);
        }
    }

    @Override
    public void b(@NotNull ebv_0 ebv_02) {
        this.b.remove(ebv_02);
    }

    @Override
    public void a(@NotNull dc_1 dc_12, boolean bl) {
        boolean bl2 = dc_12.e();
        this.c = bl2 && dc_12.f().c();
        acw_1 acw_12 = new acw_1(dc_12.b());
        this.a.clear();
        for (Map.Entry<Integer, dp_2> entry : dc_12.d().entrySet()) {
            this.a.put(entry.getKey(), ebq_0.a(entry.getValue(), bl2 ? dc_12.f().a(entry.getKey(), null) : null));
            acw_12.f(entry.getKey());
        }
        ecn_0.a.a((ect_0 ect_02) -> {
            if (!acw_12.d(ect_02.a())) {
                this.a.put(ect_02.a(), ebu_0.d(ect_02));
            }
        });
        if (dc_12.h()) {
            this.a(dc_12.i(), bl);
        }
    }

    @Override
    public void a(@NotNull gj_2 gj_22, boolean bl) {
        this.a.clear();
        acw_1 acw_12 = new acw_1(gj_22.b());
        for (Map.Entry<Integer, gf_2> entry : gj_22.d().entrySet()) {
            this.a.put(entry.getKey(), ebq_0.a(entry.getValue()));
            acw_12.f(entry.getKey());
        }
        ecn_0.a.a((ect_0 ect_02) -> {
            if (!acw_12.d(ect_02.a())) {
                this.a.put(ect_02.a(), ebu_0.d(ect_02));
            }
        });
        if (gj_22.e()) {
            this.a(gj_22.f(), bl);
        }
    }

    @Override
    public void a(@NotNull dw_1 dw_12, boolean bl) {
        this.d.clear();
        for (Map.Entry<Integer, dv_2> entry : dw_12.d().entrySet()) {
            ebx_0 ebx_02 = ebx_0.b(entry.getKey().shortValue());
            if (ebx_02 == null) continue;
            dv_2 dv_22 = entry.getValue();
            ebz_0 ebz_02 = new ebz_0(dv_22.c(), dv_22.e());
            if (bl && !this.a(ebz_02)) continue;
            this.d.put(ebx_02, ebz_02);
        }
        if (bl) {
            this.b(dw_12.g());
        } else {
            this.e.clear();
            this.e.putAll(dw_12.g());
        }
        this.f = dw_12.i();
        this.g = dw_12.k();
    }

    @Override
    @NotNull
    public dc_1 g() {
        de_2 de_22 = dc_1.l();
        dk_1 dk_12 = di_1.h().a(this.c);
        for (Map.Entry<Integer, ebq_0> entry : this.a.entrySet()) {
            ebq_0 ebq_02 = entry.getValue();
            de_22.b(entry.getKey(), ebq_02.e());
            dk_12.b(entry.getKey(), ebq_02.f());
        }
        de_22.a(dk_12.i());
        de_22.a(this.k());
        return de_22.m();
    }

    @Override
    @NotNull
    public di_1 h() {
        dk_1 dk_12 = di_1.h().a(this.c);
        for (Map.Entry<Integer, ebq_0> entry : this.a.entrySet()) {
            ebq_0 ebq_02 = entry.getValue();
            dk_12.b(entry.getKey(), ebq_02.f());
        }
        return dk_12.i();
    }

    @Override
    @NotNull
    public fz_2 i() {
        return fz_2.i().a(this.j()).a(this.h()).j();
    }

    @Override
    @NotNull
    public gj_2 j() {
        gl_2 gl_22 = gj_2.i();
        for (Map.Entry<Integer, ebq_0> entry : this.a.entrySet()) {
            ebq_0 ebq_02 = entry.getValue();
            gl_22.b(entry.getKey(), ebq_02.g());
        }
        gl_22.a(this.k());
        return gl_22.j();
    }

    @Override
    @NotNull
    public dw_1 k() {
        dy_1 dy_12 = dw_1.m();
        for (Map.Entry<ebx_0, ebz_0> entry : this.d.entrySet()) {
            ebz_0 ebz_02 = entry.getValue();
            dy_12.b((int)entry.getKey().b(), dv_2.g().a(ebz_02.c()).b(ebz_02.d()).h());
        }
        dy_12.b(this.e);
        dy_12.a(this.f);
        dy_12.b(this.g);
        return dy_12.n();
    }

    @Override
    @NotNull
    public Map<Integer, Short> l() {
        HashMap<Integer, Short> hashMap = new HashMap<Integer, Short>();
        for (Map.Entry<Integer, ebq_0> entry : this.a.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().c());
        }
        return hashMap;
    }

    @NotNull
    public static ebq_0 d(@NotNull ect_0 ect_02) {
        if (ect_02.e()) {
            return ecn_0.a.b(ect_02.a());
        }
        return new ebq_0();
    }

    public Map<Integer, ebq_0> m() {
        return this.a;
    }
}

