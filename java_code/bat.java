/*
 * Decompiled with CFR 0.152.
 */
public class bat
extends bak_0 {
    final aej_2 e;

    public bat(int n, int n2, int n3, int n4, aej_2 aej_22) {
        super(n, n2, n3, n4);
        this.e = aej_22;
    }

    @Override
    protected void r() {
        blx_1 blx_12 = this.a(this.f());
        if (blx_12 == null) {
            return;
        }
        blx_12.bv().bZ();
        apl_1 apl_12 = blx_12.bv().bb();
        if (apl_12 != null && apl_12.b() && apl_12.a() > 0) {
            blx_12.bv().b(new bau_0(this));
        } else {
            blx_12.a(this.e);
        }
    }

    @Override
    protected void l() {
        blx_1 blx_12 = this.a(this.f());
        blx_1 blx_13 = this.a(this.h());
        bbI.a(blx_12, blx_13);
    }
}

