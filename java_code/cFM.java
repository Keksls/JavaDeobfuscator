/*
 * Decompiled with CFR 0.152.
 */
class cFM
implements fzp_0 {
    cFM() {
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        ese_1 ese_12 = cwd_0.d().c();
        if (n == 8) {
            cfl_0.deleteBuilding(ese_12.b());
            azu_0.j().b(cwd_0.d());
        }
    }
}

