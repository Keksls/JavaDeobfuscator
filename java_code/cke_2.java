/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cKE
 */
public class cke_2
implements ajh_1 {
    public static final String a = "turn";
    private int b;

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals("timelineElementType")) {
            return 2;
        }
        if (string.equals(a)) {
            return this.b;
        }
        return null;
    }

    public int a() {
        return this.b;
    }

    public void a(int n) {
        this.b = n;
        fis_1.a().a((ajf_1)this, a);
    }
}

