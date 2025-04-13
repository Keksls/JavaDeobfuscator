/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eOp
 */
public class eop_2
implements adv_1 {
    private final abs_1 a;
    private eol_2 b;
    private final adi_2 c;
    private Long d;
    private long e;

    public eop_2(abs_1 abs_12, adi_2 adi_22) {
        this.a = abs_12;
        this.c = adi_22;
    }

    public void a(long l, int n) {
        this.f();
        this.d = this.c.a(this, l, n, 1L);
        this.e = this.a.s() + l;
    }

    private void f() {
        if (this.d != null) {
            this.c.a(this.d);
        }
        this.d = null;
    }

    public boolean a() {
        return this.d != null;
    }

    public void c() {
        this.f();
    }

    public int d() {
        return Math.max(0, (int)(this.e() / 1000L));
    }

    public long e() {
        return this.e - this.a.s();
    }

    public void a(eol_2 eol_22) {
        this.b = eol_22;
    }

    @Override
    public boolean a(@Nullable adt_1 adt_12) {
        if (!(adt_12 instanceof adh_2)) {
            return true;
        }
        eol_2 eol_22 = this.b.a();
        if (eol_22 == null) {
            this.c.a(this);
            return true;
        }
        return this.a((adh_2)adt_12, eol_22);
    }

    private boolean a(@NotNull adh_2 adh_22, eol_2 eol_22) {
        if (this.d != null && this.d.longValue() == adh_22.b()) {
            this.d = null;
            eol_22.a(adh_22.c());
        }
        return false;
    }

    @Override
    public final long a_() {
        return 1L;
    }

    @Override
    public final void a(long l) {
    }
}

