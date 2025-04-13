/*
 * Decompiled with CFR 0.152.
 */
class cVd
extends fdt_1 {
    final /* synthetic */ cVc a;

    cVd(cVc cVc2) {
        this.a = cVc2;
    }

    @Override
    public boolean run(fzs fzs2) {
        if (fzs2.e() == null || !(fzs2.e() instanceof fvE)) {
            return true;
        }
        fvE fvE2 = (fvE)fzs2.e();
        if (fvE2 == fta_0.getInstance() || fvE2 != null && fvE2.isNonBlocking()) {
            return true;
        }
        if (fvE2 != null && fvE2.isChildOf("chatWindow")) {
            return false;
        }
        azu_0.j().b(this.a);
        return false;
    }
}

