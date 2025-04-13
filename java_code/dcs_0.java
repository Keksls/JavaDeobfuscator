/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dcS
 */
public class dcs_0
implements ajh_1 {
    public static final String a = "item";
    public static final String b = "text";
    private final bjw_1 d;
    private final String e;

    public dcs_0(int n, String string) {
        this.d = (bjw_1)eyo_1.g().d(n);
        this.e = string;
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.d;
        }
        if (string.equals(b)) {
            return this.e;
        }
        return null;
    }
}

