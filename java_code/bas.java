/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;
import java.util.Set;

public final class bas
implements adv_1 {
    private long a = this.hashCode();
    private int b;
    private final Set<bar_0> c = new HashSet<bar_0>();
    private final Set<aku_1> d = new HashSet<aku_1>();
    private static final int e = 125;

    public bas() {
    }

    public bas(int n) {
        this.b = n;
    }

    public void a(bwh_0 bwh_02) {
        this.c.clear();
        this.d.clear();
        this.b = bwh_02 == null ? -1 : bwh_02.c();
    }

    public void a(bar_0 bar_02) {
        if (this.b == -1) {
            return;
        }
        this.c.add(bar_02);
    }

    public void b(bar_0 bar_02) {
        this.c.remove(bar_02);
    }

    public void a(aku_1 aku_12) {
        if (this.b == -1) {
            return;
        }
        this.d.add(aku_12);
        adi_2.a().a(this, 125L, 0, 1L);
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (this.b == -1) {
            return false;
        }
        if (this.d.isEmpty()) {
            return false;
        }
        if (!this.c.isEmpty()) {
            adi_2.a().a(this, 125L, 0, 1L);
            return false;
        }
        this.d.forEach(aku_12 -> baa_0.a().a(this.b, (aku_1)aku_12));
        baa_0.a().a(this.b);
        this.d.clear();
        return false;
    }

    @Override
    public long a_() {
        return this.a;
    }

    @Override
    public void a(long l) {
        this.a = l;
    }
}

