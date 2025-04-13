/*
 * Decompiled with CFR 0.152.
 */
public class aWg
extends aXj {
    private final int a;
    private final short b;

    public aWg(int n, short s2) {
        this.a = n;
        this.b = s2;
    }

    @Override
    public boolean a() {
        return this.b > 0;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        Object var3_3 = null;
        try {
            Object var4_4 = null;
            Object r2 = eyo_1.g().d(this.a);
            if (r2 != null) {
                Pt pt = new Pt();
                pt.a((byte)3);
                pt.a((short)37);
                pt.a(this.a);
                pt.b(this.b);
                aaw_22.c(pt);
            } else {
                aVo.a().d("ReferenceItem d'Id " + this.a + " non trouv\u00e9e. Peut-\u00eatre un probl\u00e8me d'export ?");
            }
        }
        catch (Exception exception) {
            aVo.a().d("Probl\u00e8me pour la suppression d'un item : " + exception);
        }
    }
}

