/*
 * Decompiled with CFR 0.152.
 */
public class bDp
extends abn_1<bFZ> {
    public static final abm_1 a = new abm_1(new bdq_0());

    public bFZ a() {
        bDn bDn2;
        try {
            bDn2 = (bDn)a.borrowObject();
            bDn.a(bDn2, a);
        }
        catch (Exception exception) {
            bDn.q.error((Object)"Erreur lors de l'extraction d'une GuildMachine du pool", (Throwable)exception);
            bDn2 = new bDn();
        }
        return bDn2;
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

