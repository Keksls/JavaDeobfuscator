/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from Wu
 */
public interface wu_0
extends Comparable<wu_0> {
    public String toString();

    public boolean c();

    public String s();

    public boolean b(@NotNull wu_0 var1);

    public boolean c(@NotNull wu_0 var1);

    public boolean d(@NotNull wu_0 var1);

    public boolean e(@NotNull wu_0 var1);

    public int f(@NotNull wu_0 var1);

    public ww_0 g(wu_0 var1);

    public wu_0 a(wu_0 var1, wx_0 var2);

    public wu_0 a(wu_0 var1, wx_0 var2, boolean var3);

    public long h();

    public Date i();

    public long f();

    public long g();

    public int j();

    public int k();

    public int l();

    public int m();

    public int n();

    public int o();

    public int p();

    public void a();

    @NotNull
    default public wu_0 j(int n) {
        return this.a(TimeUnit.MINUTES, n);
    }

    @NotNull
    default public wu_0 k(int n) {
        return this.b(TimeUnit.MINUTES, n);
    }

    @NotNull
    default public wu_0 l(int n) {
        return this.a(TimeUnit.DAYS, n);
    }

    @NotNull
    default public wu_0 m(int n) {
        return this.b(TimeUnit.DAYS, n);
    }

    @NotNull
    public wu_0 a(@NotNull TimeUnit var1, int var2);

    @NotNull
    public wu_0 b(@NotNull TimeUnit var1, int var2);

    @NotNull
    default public wu_0 t() {
        return this.l(1);
    }

    @NotNull
    default public wu_0 u() {
        return this.m(1);
    }

    public wu_0 r();

    @Override
    default public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.f((wu_0)object);
    }
}

