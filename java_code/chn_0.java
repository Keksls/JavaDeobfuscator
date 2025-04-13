/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cHN
 */
class chn_0
implements fzp_0 {
    chn_0() {
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 2 && !string.isEmpty()) {
            String[] stringArray = string.split(" ");
            int n2 = Integer.parseInt(stringArray[0]);
            int n3 = Integer.parseInt(stringArray[1]);
            if (stringArray.length == 3) {
                long l = Long.parseLong(stringArray[2]);
                daX.b((short)144, n2, n3, l);
            } else if (stringArray.length == 2) {
                daX.b((short)243, n2, n3);
            }
        }
    }
}

