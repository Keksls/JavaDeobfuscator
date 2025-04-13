/*
 * Decompiled with CFR 0.152.
 */
class dim
extends did_0 {
    final /* synthetic */ akx_2 a;
    final /* synthetic */ aka_2 b;
    final /* synthetic */ dil c;

    dim(dil dil2, akx_2 akx_22, String string, akr_2[] akr_2Array, akx_2 akx_23, aka_2 aka_22) {
        this.c = dil2;
        this.a = akx_23;
        this.b = aka_22;
        super(akx_22, string, akr_2Array);
    }

    @Override
    public boolean run(fzs fzs2) {
        boolean bl = super.run(fzs2);
        this.a.a(this.b);
        return bl;
    }

    @Override
    public boolean a() {
        boolean bl = super.a();
        this.a.a(this.b);
        return bl;
    }
}

