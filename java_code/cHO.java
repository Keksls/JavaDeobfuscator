/*
 * Decompiled with CFR 0.152.
 */
class cHO
implements fzp_0 {
    cHO() {
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 2 && !string.isEmpty()) {
            try {
                int n2 = Integer.parseInt(string);
                daX.a((short)150, daX.a.g().c().c(), n2, flt_0.b.a());
            }
            catch (NumberFormatException numberFormatException) {
                chl_0.g.error((Object)"Error with hidden mute duration", (Throwable)numberFormatException);
            }
        }
    }
}

