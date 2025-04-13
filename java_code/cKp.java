/*
 * Decompiled with CFR 0.152.
 */
class cKp
implements fzu {
    cKp() {
    }

    @Override
    public boolean run(fzs fzs2) {
        if (!cKl.g && ((fck_2)fzs2).x() == 3) {
            cKl.cancelAction();
            fta_0.getInstance().removeEventListener(frd_0.C, this, true);
        }
        return false;
    }
}

