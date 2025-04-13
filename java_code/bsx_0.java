/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bSx
 */
public enum bsx_0 {
    a("ICEGIFT"),
    b("ICEITEMGIFT"),
    c("VIRTUALSUBSCRIPTIONLEVEL"),
    d("ACCOUNTSTATUS"),
    e("OGRINE"),
    f("OGRINETOKEN"),
    g("GAMEACTION"),
    h("KARD"),
    i("");

    private final String j;

    private bsx_0(String string2) {
        this.j = string2;
    }

    public String a() {
        return this.j;
    }

    public static bsx_0 a(String string) {
        for (bsx_0 bsx_02 : bsx_0.values()) {
            if (!bsx_02.j.equals(string)) continue;
            return bsx_02;
        }
        return i;
    }
}

