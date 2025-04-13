/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bCW
 */
public class bcw_1
extends abn_1<bFZ> {
    public static final abm_1 a = new abm_1(new bcx_1());

    public bFZ a() {
        bcv_1 bcv_12;
        try {
            bcv_12 = (bcv_1)a.borrowObject();
            bcv_1.a(bcv_12, a);
        }
        catch (Exception exception) {
            bcv_1.q.error((Object)"Erreur lors de l'extraction d'une CharacterStatue du pool", (Throwable)exception);
            bcv_12 = new bcv_1();
        }
        return bcv_12;
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

