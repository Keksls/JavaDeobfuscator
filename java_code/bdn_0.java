/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bDN
 */
public class bdn_0
extends abn_1<bFZ> {
    public static final abm_1 a = new abm_1(new bDO());
    private final fjv b;

    public bdn_0(fjv fjv2) {
        this.b = fjv2;
    }

    public bFZ a() {
        bDL bDL2;
        try {
            bDL2 = (bDL)a.borrowObject();
            bDL.a(bDL2, a);
        }
        catch (Exception exception) {
            bDL.s.error((Object)"Erreur lors de l'extraction du pool", (Throwable)exception);
            bDL2 = new bDL();
        }
        bDL2.q = this.b;
        return bDL2;
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

