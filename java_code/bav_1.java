/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bAV
 */
public class bav_1
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new baw_2());

    public bFZ a() {
        bat_2 bat_22;
        try {
            bat_22 = (bat_2)a.borrowObject();
            bat_2.a(bat_22, a);
        }
        catch (Exception exception) {
            bat_2.q.error((Object)("Erreur lors de l'extraction d'un " + bat_2.class.getName() + " du pool"), (Throwable)exception);
            bat_22 = new bat_2();
        }
        return bat_22;
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

