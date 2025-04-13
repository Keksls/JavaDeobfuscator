/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from avo
 */
public class avo_2 {
    public static final avo_2 a = new avo_2();
    private avm_2 b;
    private avn_2 c;

    public void a(avm_2 avm_22, avn_2 avn_22) {
        this.b = avm_22;
        this.c = avn_22;
    }

    public avk_2 a() {
        if (this.b != null) {
            return this.b.b();
        }
        return null;
    }

    public void a(avk_2 avk_22) {
        if (this.c != null) {
            this.c.a(avk_22);
        }
    }

    public void b(avk_2 avk_22) {
        if (this.c != null) {
            this.c.b(avk_22);
        }
    }
}

