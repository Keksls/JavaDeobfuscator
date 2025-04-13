/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bPC
 */
public class bpc_0
implements ajh_1 {
    public static final String a = "state";
    public static final String b = "value";
    private final short d;
    private int e;

    public bpc_0(short s2, int n) {
        this.d = s2;
        this.e = n;
    }

    public void a(int n) {
        this.e = n;
        fis_1.a().a((ajf_1)this, b);
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return fih_0.a().a(this.d);
        }
        if (string.equals(b)) {
            StringBuilder stringBuilder = new StringBuilder();
            if (this.e >= 0) {
                stringBuilder.append("+");
            }
            stringBuilder.append(this.e).append("%");
            return stringBuilder.toString();
        }
        return null;
    }
}

