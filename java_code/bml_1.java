/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bml
 */
public class bml_1
extends blt_1 {
    private final epa_1 a;

    public bml_1(double d2, epa_1 epa_12) {
        super(d2);
        this.a = epa_12;
    }

    @Override
    protected int a() {
        return this.a.a();
    }

    @Override
    protected void c(int n) {
        super.c(n);
        this.a.c(n);
    }

    @Override
    protected void b(int n) {
        super.c(n - this.a.a());
        this.a.b(n);
    }
}

