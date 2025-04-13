/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bqD
implements ajh_1 {
    public static final String a = "items";
    public static final String b = "capacity";
    public static final String d = "title";
    public static final String e = "color";
    public static final String f = "isReadOnly";
    public static final String[] g = new String[]{"items", "capacity", "title", "color", "isReadOnly"};
    public static final int h = 100;
    private eAU i;
    private String j;
    private String k;
    private azj_2 l;
    private boolean m;
    private String n;

    @Override
    public String[] d() {
        return g;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (a.equals(string)) {
            return this.j() ? this.i.a() : null;
        }
        if (b.equals(string)) {
            return this.j() ? this.i.a().size() : 0;
        }
        if (d.equals(string)) {
            return bae.h().a("account.chest.title", this.k);
        }
        if (e.equals(string)) {
            return this.l;
        }
        if (f.equals(string)) {
            return this.m;
        }
        return null;
    }

    private boolean j() {
        return this.i != null;
    }

    public void a(String string) {
        this.k = string;
    }

    public void a(azj_2 azj_22) {
        this.l = azj_22;
    }

    public void c(String string) {
        this.j = string;
    }

    public void a(eAU eAU2) {
        this.i = eAU2;
    }

    public void a(boolean bl) {
        this.m = bl;
    }

    public String a() {
        return this.k;
    }

    public azj_2 b() {
        return this.l;
    }

    public String c() {
        return this.j;
    }

    public boolean e() {
        return this.m;
    }

    public boolean a(long l) {
        return this.i.a(l);
    }

    public boolean a(@NotNull exk_2 exk_22, int n) {
        if (this.i == null || !this.i.a(exk_22, n)) {
            return false;
        }
        this.d(exk_22);
        fis_1.a().a((ajf_1)this, a);
        return true;
    }

    public boolean b(@NotNull exk_2 exk_22, int n) {
        if (this.i == null || !this.i.b(exk_22, n)) {
            return false;
        }
        this.d(exk_22);
        fis_1.a().a((ajf_1)this, a);
        return true;
    }

    public boolean b(long l) {
        if (this.i == null || !this.i.b(l)) {
            return false;
        }
        fis_1.a().a((ajf_1)this, a);
        return true;
    }

    public boolean a(long l, short s2) {
        if (this.i == null || !this.i.a(l, s2)) {
            return false;
        }
        fis_1.a().a((ajf_1)this, a);
        return true;
    }

    public void e(String string) {
        this.n = string;
    }

    public void f() {
        if (!this.j()) {
            return;
        }
        String string = this.n == null ? "" : Cz.o(this.n);
        for (exk_2 exk_22 : this.i.a()) {
            if (exk_22 == null) continue;
            exk_22.b(!string.isEmpty() && !Cz.o(exk_22.N()).contains(string));
        }
        fis_1.a().a((ajf_1)this, a);
    }

    private void d(@NotNull exk_2 exk_22) {
        if (!Cz.f(this.n)) {
            exk_22.b(!Cz.o(exk_22.N()).contains(Cz.o(this.n)));
        }
    }

    public Optional<exk_2> a(@NotNull exk_2 exk_23) {
        return this.i.a().stream().filter(Objects::nonNull).filter(exk_23::a).filter(exk_22 -> exk_22.aR_() - exk_22.e() > 0).findFirst();
    }

    public boolean b(@NotNull exk_2 exk_23) {
        List<exk_2> list = this.i.a();
        int n = exk_23.aT_();
        return list.stream().anyMatch(exk_22 -> exk_22 != null && exk_22.aT_() == n);
    }

    public Integer[] c(exk_2 exk_23) {
        return (Integer[])this.i.a().stream().filter(Objects::nonNull).filter(exk_23::a).filter(exk_22 -> exk_22.aR_() - exk_22.e() > 0).map(exk_22 -> this.i.c(exk_22.a())).toArray(Integer[]::new);
    }

    public int c(long l) {
        return this.i.c(l);
    }

    public Optional<exk_2> a(int n) {
        return this.i.b(n);
    }

    public boolean g() {
        return this.i.a().stream().anyMatch(Objects::isNull);
    }

    public int h() {
        int n = (int)Arrays.stream(this.i.a().stream().filter(Objects::nonNull).toArray()).count();
        return 100 - n;
    }

    public boolean i() {
        return this.i.a().isEmpty();
    }

    public boolean a(long l, long l2) {
        boolean bl = this.i.a(l, l2);
        if (bl) {
            fis_1.a().a((ajf_1)this, a);
        }
        return bl;
    }
}

