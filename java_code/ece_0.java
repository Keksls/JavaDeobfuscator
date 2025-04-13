/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from eCe
 */
public interface ece_0
extends ecf_0 {
    @NotNull
    public ebw_0 a(@NotNull ect_0 var1);

    @NotNull
    public ebw_0 c(@NotNull ect_0 var1);

    @NotNull
    public ebw_0 a(int var1, int var2);

    @NotNull
    public Set<Integer> a(int var1);

    @NotNull
    default public Set<eco_0> e_(int n) {
        ect_0 ect_02 = ecn_0.a.a(n);
        if (ect_02 == null) {
            return Collections.emptySet();
        }
        Set<Integer> set = this.a(n);
        return set.stream().map(ect_02::a).filter(Objects::nonNull).collect(Collectors.toSet());
    }

    @NotNull
    default public Set<eco_0> bk_() {
        HashSet<eco_0> hashSet = new HashSet<eco_0>();
        for (int n : this.b()) {
            hashSet.addAll(this.e_(n));
        }
        return hashSet;
    }

    default public long a(int n, long l, long l2) {
        long l3 = (long)((float)l * fls_0.a.b(l2));
        return this.a(n, l3);
    }

    public long a(int var1, long var2);

    public void b(int var1);

    public void a(int var1, boolean var2);

    public void c(int var1);

    public void d(int var1);

    public boolean e(int var1);

    public short f(int var1);

    public double c(int var1, long var2);

    public double g(int var1);

    public long h(int var1);

    public long i(int var1);

    public int j(int var1);

    public int k(int var1);

    public int l(int var1);

    public int m(int var1);

    public short n(int var1);

    public boolean o(int var1);

    public boolean a();

    public void a(boolean var1);

    public void b(int var1, boolean var2);

    public void c(int var1, int var2);

    public @Unmodifiable @NotNull Set<Integer> b();

    public boolean d(int var1, int var2);

    default public boolean a(eco_0 eco_02) {
        return this.d(eco_02.p(), eco_02.e());
    }

    public @Unmodifiable @NotNull Map<ebx_0, ebz_0> c();

    public boolean a(ebx_0 var1, @Nullable ebz_0 var2);

    public void a(Map<ebx_0, ebz_0> var1);

    public @Unmodifiable @NotNull Map<Integer, Integer> d();

    public boolean a(int var1, @Nullable Integer var2);

    public void b(@NotNull Map<Integer, Integer> var1);

    public boolean e();

    public boolean b(boolean var1);

    public boolean f();

    public boolean c(boolean var1);

    public int a(@NotNull eco_0 var1, boolean var2);

    default public void a(@NotNull dc_1 dc_12) {
        this.a(dc_12, true);
    }

    public void a(@NotNull dc_1 var1, boolean var2);

    default public void a(@NotNull gj_2 gj_22) {
        this.a(gj_22, true);
    }

    public void a(@NotNull gj_2 var1, boolean var2);

    default public void a(@NotNull dw_1 dw_12) {
        this.a(dw_12, true);
    }

    public void a(@NotNull dw_1 var1, boolean var2);

    @NotNull
    public dc_1 g();

    @NotNull
    public di_1 h();

    @NotNull
    public fz_2 i();

    @NotNull
    public gj_2 j();

    @NotNull
    public dw_1 k();

    @NotNull
    public Map<Integer, Short> l();
}

