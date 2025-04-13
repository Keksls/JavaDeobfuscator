/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntIntHashMap;
import org.apache.log4j.Logger;

public final class bYf {
    private static Logger c = Logger.getLogger((String)"InteractiveDialogScripts");
    public static final bYf a = new bYf();
    private static final String d = "interactiveDialogs/";
    private final TIntIntHashMap e = new TIntIntHashMap();
    private final cav_2 f = new cav_2(-1L);

    private bYf() {
    }

    public void a() {
        amj_1 amj_12 = aml_1.a().b(this.f.d());
        if (amj_12 != null) {
            amj_12.f(true);
            amj_12.a(0.0f, 0.2f);
        }
        this.f.a(-1L);
    }

    public String a(String string) {
        assert (aks_1.a().e() != null);
        return String.format("%s%s%s", d, string, aks_1.a().c());
    }

    public void b(String string) {
        this.c(string);
    }

    private void c(String string) {
        String string2 = this.a(string);
        boolean bl = gi_0.d(aks_1.a().e() + string2);
        if (bl) {
            aks_1.a().a(string2, this.f);
        }
    }
}

