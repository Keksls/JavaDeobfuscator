/*
 * Decompiled with CFR 0.152.
 */
abstract class cSU
extends cSS
implements afy_0 {
    cSU() {
    }

    @Override
    public void o() {
        if (!this.c()) {
            return;
        }
        bFZ bFZ2 = (bFZ)this.l;
        bmr_1 bmr_12 = azu_0.j().k();
        biI biI2 = bmr_12.bv();
        if (!bFZ2.aB_() && bFZ2.c(biI2.ap()) || bFZ2.aB_() && biI2.ap().b(bFZ2.G(), bFZ2.H(), (int)bFZ2.I())) {
            this.a();
        } else {
            apl_1 apl_12 = dei.a(biI2, bFZ2);
            if (apl_12.b()) {
                biI2.b(this);
                bmr_12.a(apl_12, true);
            } else {
                b.warn((Object)("Impossible de trouver un chemin jusqu'a l'element interactif " + this.l));
            }
        }
    }

    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        afe_02.c(this);
        this.a();
    }

    protected abstract void a();
}

