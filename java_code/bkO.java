/*
 * Decompiled with CFR 0.152.
 */
public class bkO
implements Uo,
ajh_1 {
    public static final String a = "size";
    public static final String b = "inventory";
    public static final String d = "editable";
    private final bat_2 e;

    public bkO(bat_2 bat_22) {
        this.e = bat_22;
        this.e.a(this);
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.e.Z().h();
        }
        if (string.equals(b)) {
            bHe bHe2 = this.e.Z();
            Object[] objectArray = new Object[bHe2.g().k()];
            exk_2[] exk_2Array = (exk_2[])bHe2.g().a(new exk_2[bHe2.g().k()]);
            bhz_1 bhz_12 = new bhz_1();
            int n = exk_2Array.length;
            for (int k = 0; k < n; ++k) {
                objectArray[k] = exk_2Array[k] == null ? bhz_12 : exk_2Array[k];
            }
            return objectArray;
        }
        if (string.equals(d)) {
            bgf_1 bgf_12 = this.e.aH_();
            return bgf_12.m() == azu_0.j().k().a_() || cSW.a(bgf_12.m());
        }
        return null;
    }

    public bat_2 a() {
        return this.e;
    }

    @Override
    public void a(Uk uk) {
        fis_1.a().a((ajf_1)this, b);
    }
}

