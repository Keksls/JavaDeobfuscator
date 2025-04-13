/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bzV
 */
public class bzv_1
extends bzu_1<bzv_1> {
    private final bmr_1 a;
    private final fiO b;
    private final fiO c;
    private final int d;
    private final List<bzx_2> e = new ArrayList<bzx_2>();
    private final Runnable f;

    public bzv_1(bmr_1 bmr_12, int n, @NotNull Runnable runnable) {
        this.a = bmr_12;
        this.b = bmr_12 == null ? new fiO() : bmr_12.dw().b(n);
        this.c = this.b.a();
        this.d = n;
        this.f = runnable;
    }

    fiO a() {
        return this.b;
    }

    @Override
    public boolean b() {
        return !this.e.isEmpty() && this.c.c(this.b);
    }

    @Override
    public void c() {
        if (this.e.isEmpty()) {
            return;
        }
        bzx_2 bzx_22 = this.e.remove(this.e.size() - 1);
        switch (bzx_22.a) {
            case a: {
                if (bzx_22.d == null) {
                    return;
                }
                this.a(() -> cZI.a().a(bzx_22.d));
                break;
            }
            case b: {
                this.a(() -> cZI.a().a(bzx_22.c));
                return;
            }
            case c: 
            case d: {
                this.a(() -> cZI.a().a(bzx_22.b, bzx_22.c));
            }
        }
    }

    @Override
    public void d() {
        if (this.e.isEmpty()) {
            return;
        }
        this.b.a(this.c);
        this.e.clear();
        cZI.a().y();
        this.a.b_(true);
    }

    @Override
    public void a(bzv_1 bzv_12) {
        this.e.clear();
        this.e.addAll(bzv_12.e);
    }

    public boolean a(@NotNull bpl_0 bpl_02, @NotNull bpr_0 bpr_02) {
        @Nullable bpl_0 bpl_03 = bpr_02.b();
        boolean bl = new fiL().a(this.a.a_(), bpl_02.w(), this.d, bpr_02.c());
        if (!bl) {
            aUh.a("build.error.spell.add", new Object[]{bae.h().a(3, (long)bpl_02.w(), new Object[0])});
            return false;
        }
        if (this.i()) {
            bzx_2 bzx_22 = bpl_03 != null ? new bzx_2(bzy_1.c, bpl_03, bpr_02) : new bzx_2(bzy_1.b, bpl_02, bpr_02);
            this.e.add(bzx_22);
            this.f.run();
        }
        return true;
    }

    public boolean a(@NotNull bpr_0 bpr_02) {
        boolean bl = new fiL().b(this.a.a_(), bpr_02.b().w(), this.d);
        if (!bl) {
            aUh.a("build.error.spell.remove", new Object[]{bae.h().a(3, (long)bpr_02.b().w(), new Object[0])});
            return false;
        }
        if (this.i()) {
            bzx_2 bzx_22 = new bzx_2(bzy_1.d, bpr_02.b(), bpr_02);
            this.e.add(bzx_22);
            this.f.run();
        }
        return true;
    }

    public boolean a(@NotNull fiO fiO2) {
        fiO fiO3 = new fiO(this.b.d(), this.b.f());
        boolean bl = new fiL().a(this.a.a_(), fiO2, this.d);
        if (!bl) {
            aUh.a("build.error.spell.full.deck", new Object[0]);
            return false;
        }
        if (this.i()) {
            bzx_2 bzx_22 = new bzx_2(bzy_1.a, null, null);
            bzx_22.d = fiO3;
            this.e.add(bzx_22);
            this.f.run();
        }
        return bl;
    }
}

