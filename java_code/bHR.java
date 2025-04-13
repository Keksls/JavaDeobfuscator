/*
 * Decompiled with CFR 0.152.
 */
public class bHR
implements ajh_1,
eAM,
exs_1 {
    public static final String a = "isRefItem";
    public static final String b = "backgroundStyle";
    public static final String d = "isQuestItem";
    private static final String[] e = new String[]{"isRefItem", "backgroundStyle", "isQuestItem"};
    private final exk_2 f;

    public bHR(exk_2 exk_22) {
        this.f = exk_22;
    }

    @Override
    public String[] d() {
        return e;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return true;
        }
        if (string.equals(b)) {
            exk_2 exk_22 = (exk_2)fis_1.a().d("itemDetail", "inventoryDialog");
            if (exk_22 != null && this.f.aT_() == exk_22.aT_()) {
                return bhx_0.b.a();
            }
            return bhx_0.d.a();
        }
        if (string.equals("isActive")) {
            return false;
        }
        if (string.equals(d)) {
            return true;
        }
        return this.f.b(string);
    }

    public exk_2 a() {
        return this.f;
    }

    public int b() {
        return this.f.aT_();
    }

    public short c() {
        return this.f.c();
    }

    @Override
    public exk_2 h() {
        return this.a();
    }

    @Override
    public eAN p() {
        return eAN.c;
    }

    @Override
    public Object q() {
        return this.b();
    }

    @Override
    public String r() {
        return this.f.N();
    }
}

