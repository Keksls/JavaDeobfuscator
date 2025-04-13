/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bAF
 */
public class baf_1
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bag_0());

    public bFZ a() {
        try {
            bae_1 bae_12 = (bae_1)a.borrowObject();
            bae_1.a(bae_12, a);
            return bae_12;
        }
        catch (Exception exception) {
            bae_1.q.error((Object)"Create client object from pool", (Throwable)exception);
            return new bae_1();
        }
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

