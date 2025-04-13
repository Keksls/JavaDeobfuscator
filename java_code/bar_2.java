/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bAR
 */
public class bar_2
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bas_1());

    public bFZ a() {
        ban_1 ban_12;
        try {
            ban_12 = (ban_1)a.borrowObject();
            ban_1.a(ban_12, a);
        }
        catch (Exception exception) {
            ban_1.s.error((Object)"Erreur lors de l'extraction d'un Chest du pool", (Throwable)exception);
            ban_12 = new ban_1();
        }
        return ban_12;
    }

    @Override
    public /* synthetic */ abo_1 b() {
        return this.a();
    }

    @Override
    public /* synthetic */ Object makeObject() {
        return this.a();
    }
}

