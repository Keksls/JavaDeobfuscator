/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aYm
 */
public final class aym_0
extends aXj {
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
        try {
            aym_0.c();
        }
        catch (Exception exception) {
            aVo.a().d("Probl\u00e8me lors de l'execution d'une commande de setRespawnPoint (client) " + exception);
        }
    }

    private static void c() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)331);
        aaw_22.c(pt);
    }
}

