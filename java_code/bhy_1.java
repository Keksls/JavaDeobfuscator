/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bHy
 */
public class bhy_1
implements ajh_1 {
    private final ajf_1 a;

    public bhy_1(ajf_1 ajf_12) {
        this.a = ajf_12;
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals("isEnabled")) {
            return false;
        }
        return this.a.b(string);
    }

    public ajf_1 a() {
        return this.a;
    }
}

