/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bEf
 */
public class bef_0
extends abn_1<bFZ> {
    public static final abm_1 a = new abm_1(new bEg());

    public bFZ a() {
        bEd bEd2;
        try {
            bEd2 = (bEd)a.borrowObject();
            bEd.a(bEd2, a);
        }
        catch (Exception exception) {
            bEd.q.error((Object)"Erreur lors de l'extraction d'une Mailbox du pool", (Throwable)exception);
            bEd2 = new bEd();
        }
        return bEd2;
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

