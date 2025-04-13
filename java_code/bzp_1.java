/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bzP
 */
abstract class bzp_1<T extends bzp_1>
extends bzu_1<T> {
    protected final List<bzr_1> a = new ArrayList<bzr_1>();

    bzp_1() {
    }

    abstract eyz_0 a();

    abstract bmv_1 e();

    @Override
    public boolean b() {
        return !this.a.isEmpty();
    }

    @Override
    public void c() {
        if (this.a.isEmpty()) {
            return;
        }
        bzr_1 bzr_12 = this.a.remove(this.a.size() - 1);
        switch (bzr_12.a) {
            case a: {
                this.a(() -> cZI.a().a(bzr_12.d));
                return;
            }
            case b: 
            case c: {
                this.a(() -> cZI.a().a(bzr_12.b, bzr_12.d));
            }
        }
    }

    @Override
    public void d() {
        while (!this.a.isEmpty()) {
            this.c();
        }
    }

    abstract Set<Long> f();

    @Nullable
    exk_2 a(long l) {
        for (int k = this.a.size() - 1; k >= 0; --k) {
            exk_2 exk_22 = this.a.get(k).b();
            if (exk_22 == null || exk_22.a() != l) continue;
            return exk_22;
        }
        return null;
    }

    abstract int g();

    public abstract Optional<exh_2> a(exk_2 var1, @NotNull exh_2 var2);

    protected void a(@NotNull exk_2 exk_22, @NotNull exh_2 exh_22, Optional<Cm<exk_2, exh_2>> optional) {
        bzr_1 bzr_12 = optional.isPresent() ? new bzr_1(bzs_2.b, optional.get().a(), exk_22, optional.get().b()) : new bzr_1(bzs_2.a, null, exk_22, exh_22);
        this.a.add(bzr_12);
    }

    public abstract Optional<exh_2> a(@NotNull exh_2 var1);

    abstract boolean a(@NotNull eyz_0 var1);

    void b(@NotNull exk_2 exk_22) {
        for (int k = this.a.size() - 1; k >= 0; --k) {
            bzr_1 bzr_12 = this.a.get(k);
            if (bzr_12.c == null || bzr_12.c.a() != exk_22.a()) continue;
            if (bzr_12.a == bzs_2.a) {
                this.a.remove(k);
                continue;
            }
            if (bzr_12.a != bzs_2.b) continue;
            this.a.set(k, new bzr_1(bzs_2.c, bzr_12.b, null, bzr_12.d));
        }
        this.a(exk_22);
    }

    @Override
    abstract void a(@NotNull exk_2 var1);
}

