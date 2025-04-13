/*
 * Decompiled with CFR 0.152.
 */
public class eCS
implements eCR {
    private final int a;
    private final long b;

    public eCS(int n, long l) {
        this.a = n;
        this.b = l;
    }

    @Override
    public void a(eCF eCF2) {
        eCF2.a(this.a).b(this.b);
    }
}

