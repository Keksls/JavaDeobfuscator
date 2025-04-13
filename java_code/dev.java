/*
 * Decompiled with CFR 0.152.
 */
class dev
implements fzu {
    final /* synthetic */ fqj a;
    final /* synthetic */ fvE b;

    dev(fqj fqj2, fvE fvE2) {
        this.a = fqj2;
        this.b = fvE2;
    }

    @Override
    public boolean run(fzs fzs2) {
        if (fzs2.f() == frd_0.C) {
            this.a.removeTweensOfType(fjp_2.class);
        }
        this.b.removeEventListener(frd_0.C, this, false);
        return false;
    }
}

