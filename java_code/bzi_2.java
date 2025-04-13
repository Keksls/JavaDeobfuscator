/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bzI
 */
public class bzi_2
extends bzu_1<bzi_2> {
    private final bmr_1 a;
    private final ezx_2 b;
    private final ezx_2 c;
    private final List<bzj_1> d = new ArrayList<bzj_1>();
    private final Runnable e;

    public bzi_2(bmr_1 bmr_12, int n, @NotNull Runnable runnable) {
        this.a = bmr_12;
        this.b = bmr_12 == null ? new ezu_1() : bmr_12.dA().a(n);
        this.c = this.b.f();
        this.e = runnable;
    }

    ezx_2 a() {
        return this.b;
    }

    @Override
    public boolean b() {
        return !this.d.isEmpty() && this.c.c(this.b);
    }

    @Override
    public void c() {
        if (this.d.isEmpty()) {
            return;
        }
        bzj_1 bzj_12 = this.d.remove(this.d.size() - 1);
        if (bzj_12.c == null) {
            this.a(() -> cZI.a().a(bzj_12.a, -bzj_12.b));
        } else {
            this.a(() -> cZI.a().a(bzj_12.c));
        }
    }

    @Override
    public void d() {
        if (this.d.isEmpty()) {
            return;
        }
        this.b.d(this.c);
        this.d.clear();
        cZI.a().z();
        this.a.b(this.a.cK(), true);
    }

    @Override
    public void a(bzi_2 bzi_22) {
        this.d.clear();
        this.d.addAll(bzi_22.d);
    }

    public void a(@NotNull bkx_2 bkx_22, int n) {
        this.b.b(bkx_22.a(), (short)n);
        if (this.i()) {
            this.d.add(new bzj_1(bkx_22, n));
            this.e.run();
        }
    }

    @Override
    public void a(@NotNull ezx_2 ezx_22) {
        ezx_2 ezx_23 = this.b.f();
        ezx_22.b(this.b);
        if (this.i()) {
            bzj_1 bzj_12 = new bzj_1(null, 0);
            bzj_12.c = ezx_23;
            this.d.add(bzj_12);
            this.e.run();
        }
    }
}

