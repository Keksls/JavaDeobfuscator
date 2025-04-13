/*
 * Decompiled with CFR 0.152.
 */
class cHM
implements fzp_0 {
    cHM() {
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 2 && !string.isEmpty()) {
            daX.b((short)139, string);
        }
    }
}

