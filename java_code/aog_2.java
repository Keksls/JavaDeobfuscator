/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aoG
 */
public class aog_2
extends aoq_1 {
    private final apc_2 a;
    private final aoq_1 b;
    private final aoq_1 c;
    private boolean d = false;

    public aog_2(apc_2 apc_22, aoq_1 aoq_12, aoq_1 aoq_13) {
        this.a = apc_22;
        this.b = aoq_12;
        this.c = aoq_13;
    }

    @Override
    public double b(Object object, Object object2, Object object3, Object object4) {
        if (this.a.b(object, object2, object3, object4)) {
            return (double)(this.d ? -1 : 1) * (this.b.a() ? (double)this.b.a(object, object2, object3, object4) : this.b.b(object, object2, object3, object4));
        }
        return (double)(this.d ? -1 : 1) * (this.c.a() ? (double)this.c.a(object, object2, object3, object4) : this.c.b(object, object2, object3, object4));
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        if (!this.a()) {
            throw new UnsupportedOperationException("Cant't get integer value of a double");
        }
        if (this.a.b(object, object2, object3, object4)) {
            return (long)(this.d ? -1 : 1) * this.b.a(object, object2, object3, object4);
        }
        return (long)(this.d ? -1 : 1) * this.c.a(object, object2, object3, object4);
    }

    @Override
    public boolean a() {
        return this.b.a() && this.c.a();
    }

    @Override
    public void s_() {
        this.d = !this.d;
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public Enum c() {
        return aoc_1.h;
    }

    @Override
    public aov_1 t_() {
        return this.b.t_();
    }
}

