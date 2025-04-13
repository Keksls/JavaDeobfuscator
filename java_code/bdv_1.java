/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bdV
 */
public class bdv_1
implements agw_0 {
    private static final bdv_1 a = new bdv_1();

    public static bdv_1 a() {
        return a;
    }

    @Override
    public String m_() {
        return bae.h().a("contentLoader.console", new Object[0]);
    }

    public void a(YK yK) {
        aVo.a().a(aVr.a());
        fis_1.a().a("adminConsole", aVr.a());
        aVo.a().a(new aVq());
        if (anr_0.m == null) {
            throw new RuntimeException("Impossible de trouver la d\u00e9finition des commandes de console.");
        }
        aVn.d().a(anr_0.m);
        aVn.d().a(anr_0.n);
        yK.b(this);
    }
}

