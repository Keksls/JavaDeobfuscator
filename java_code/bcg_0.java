/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bcg
 */
public final class bcg_0
extends bak_0 {
    private byte e;
    private byte[] f;
    private byte[] g;
    private long h;
    private vw_0 i;

    public bcg_0(int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4);
    }

    @Override
    protected void r() {
        blx_1 blx_12;
        bvx_2 bvx_22 = (bvx_2)this.b();
        Object t = euw_2.a.d(this.h);
        blx_1 blx_13 = bmf_2.a().c(this.h);
        if (blx_13 == null) {
            if (t == null) {
                a.error((Object)("Impossible d'ajouter le joueur " + this.h + " au combat " + bvx_22.c() + " : ce fighter n'existe pas"));
                return;
            }
            bmf_2.a().a((blx_1)t);
            blx_12 = (blx_1)t;
        } else {
            blx_12 = blx_13;
        }
        if (blx_12 == azu_0.j().k()) {
            return;
        }
        if (this.i != null) {
            blx_12.a(this.i);
        }
        bvx_22.b(blx_12, this.e, false);
        this.a(blx_12, this.g, this.f);
        biI biI2 = blx_12.bv();
        biI2.c(blx_12.Y());
        cuy_0.a(bvx_22, blx_12);
        aPc.f().a(blx_12, bvx_22.c());
        if (biI2.k("AnimApparition")) {
            biI2.a(new bch_0(this, biI2, blx_12));
            bwa_0.b(blx_12);
            biI2.e("AnimApparition");
        } else {
            bwa_0.b(blx_12);
            biI2.c(blx_12.F());
            biI2.c(blx_12.Y());
        }
    }

    private void a(blx_1 blx_12, byte[] byArray, byte[] byArray2) {
        if (blx_12 == null) {
            return;
        }
        blx_12.a((bvx_2)this.b(), byArray, byArray2);
    }

    @Override
    protected void l() {
    }

    public void a(byte by) {
        this.e = by;
    }

    public void a(byte[] byArray) {
        this.f = byArray;
    }

    public void b(byte[] byArray) {
        this.g = byArray;
    }

    public void d(long l) {
        this.h = l;
    }

    public void a(vw_0 vw_02) {
        this.i = vw_02;
    }
}

