/*
 * Decompiled with CFR 0.152.
 */
public class bbk
extends ban {
    private final int f;
    private final boolean g;

    public bbk(int n, int n2, int n3, int n4, int n5, boolean bl) {
        super(n, n2, n3, n4);
        this.f = n5;
        this.g = bl;
    }

    @Override
    protected long o() {
        if (this.n() == null) {
            a.error((Object)"[SPEAK] On d\u00e9clenche une action de combat alors qu'il n'y a plus de combat");
            return 0L;
        }
        long l = this.f();
        blx_1 blx_12 = this.n().e(l);
        String string = blx_12.dp();
        String string2 = bae.h().a(47, (long)this.f, new Object[0]);
        aUm aUm2 = new aUm(string, l, string2);
        aUm2.a(aup_0.b);
        aul_0.a().a(aUm2);
        return this.g ? 750L : 0L;
    }
}

