/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ciE
 */
final class cie_1
extends civ_2
implements chc_1<cth_2, bvw_2> {
    private static final Logger a = Logger.getLogger(cie_1.class);

    cie_1() {
    }

    @Override
    public boolean a(cth_2 cth_22) {
        byte by = cth_22.b();
        emq_1 emq_12 = emq_1.a(by);
        if (emq_12 == null) {
            a.error((Object)("ID d'erreur de cr\u00e9ation de combat inconnue : " + by));
            return false;
        }
        a.info((Object)("Erreur de creation de combat " + emq_12));
        this.b(emq_12);
        this.a(emq_12);
        return false;
    }

    @Override
    public void a(bvw_2 bvw_22) {
    }

    @Override
    public int a() {
        return 12687;
    }

    @Override
    public void a(int n) {
    }
}

