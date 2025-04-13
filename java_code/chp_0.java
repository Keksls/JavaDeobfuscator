/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cHP
 */
class chp_0
implements fzp_0 {
    chp_0() {
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 2 && !string.isEmpty()) {
            cel_2 cel_22 = daX.a.g().c();
            daX.a((short)152, cel_22.c(), cel_22.b(), string);
        }
    }
}

