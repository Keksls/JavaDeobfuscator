/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bAC
 */
public class bac_1
extends abn_1<bFZ> {
    public static final abm_1 a = new abm_1(new bad_1());

    public bFZ a() {
        baa_1 baa_12;
        try {
            baa_12 = (baa_1)a.borrowObject();
            baa_1.a(baa_12, a);
        }
        catch (Exception exception) {
            baa_1.q.error((Object)"Erreur lors de l'extraction d'une GuildMachine du pool", (Throwable)exception);
            baa_12 = new baa_1();
        }
        return baa_12;
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

