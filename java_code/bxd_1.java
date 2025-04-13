/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bxd
 */
public class bxd_1 {
    private bxe_1 a = bxe_1.a;

    public boolean a() {
        return this.a != bxe_1.a;
    }

    public void b() {
        int n = (this.a.ordinal() + 1) % bxe_1.values().length;
        this.a = bxe_1.values()[n];
    }

    public void a(bxe_1 bxe_12) {
        this.a = bxe_12;
    }

    public bxe_1 c() {
        return this.a;
    }

    public void d() {
        this.a = bxe_1.a;
    }
}

