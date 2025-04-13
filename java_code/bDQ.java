/*
 * Decompiled with CFR 0.152.
 */
public class bDQ
extends abn_1<bFZ> {
    public static final abm_1 a = new abm_1(new bDR());

    public bFZ a() {
        bdp_0 bdp_02;
        try {
            bdp_02 = (bdp_0)a.borrowObject();
            bdp_0.a(bdp_02, a);
        }
        catch (Exception exception) {
            bdp_0.q.error((Object)"Error extracting InfiniteWaveEntrance of pool", (Throwable)exception);
            bdp_02 = new bdp_0();
        }
        return bdp_02;
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

