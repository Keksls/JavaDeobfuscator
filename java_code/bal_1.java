/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bAL
 */
public class bal_1
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bam_1());

    public bFZ a() {
        bak_1 bak_12;
        try {
            bak_12 = (bak_1)a.borrowObject();
            bak_1.a(bak_12, a);
        }
        catch (Exception exception) {
            bak_1.r.error((Object)"Erreur lors de l'extraction d'un Board du pool", (Throwable)exception);
            bak_12 = new bak_1();
        }
        return bak_12;
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

