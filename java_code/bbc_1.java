/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bBC
 */
public class bbc_1
extends abn_1<bFZ> {
    public static final abm_1 a = new abm_1(new bbd_1());

    public bFZ a() {
        bbb_1 bbb_12;
        try {
            bbb_12 = (bbb_1)a.borrowObject();
            bbb_1.a(bbb_12, a);
        }
        catch (Exception exception) {
            bbb_1.r.error((Object)"Erreur lors de l'extraction d'une CraftTable du pool", (Throwable)exception);
            bbb_12 = new bbb_1();
        }
        return bbb_12;
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

