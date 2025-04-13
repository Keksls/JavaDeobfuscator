/*
 * Decompiled with CFR 0.152.
 */
public class aWf
extends aXj {
    private final short a;

    public aWf(short s2) {
        this.a = s2;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        long l = awd_0.c();
        try {
            bhd_1 bhd_12 = bhe_0.a().a(this.a);
            if (bhd_12 == null) {
                aVo.a().d("L'id " + this.a + " ne correspond \u00e0 aucun set.");
            } else {
                for (bjw_1 bjw_12 : bhd_12) {
                    boolean bl = true;
                    exk_2 exk_22 = new exk_2(-1L);
                    exk_22.b(bjw_12);
                    exk_22.a((short)1);
                    Pt pt = new Pt();
                    pt.a((byte)3);
                    pt.a((short)389);
                    pt.a(l);
                    pt.a(bjw_12.n());
                    pt.b((short)1);
                    pt.a(false);
                    aaw_22.c(pt);
                }
                fis_1.a().a((ajf_1)azu_0.j().k(), "bags");
            }
        }
        catch (Exception exception) {
            aVo.a().d("Probl\u00e8me pour l'ajout d'un set dans le sac courant : " + exception);
        }
    }
}

