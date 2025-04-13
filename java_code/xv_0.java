/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Xv
 */
public abstract class xv_0 {
    public boolean a(String string, long l) {
        if (string == null) {
            return false;
        }
        String string2 = string.trim();
        if (string2.length() == 0) {
            return false;
        }
        for (xg_0 xg_02 : xg_0.values()) {
            if (!xg_02.a(string2)) continue;
            return this.a(xg_02.ordinal(), l);
        }
        return false;
    }

    protected abstract boolean a(int var1, long var2);
}

