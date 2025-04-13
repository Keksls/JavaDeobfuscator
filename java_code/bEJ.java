/*
 * Decompiled with CFR 0.152.
 */
public class bEJ
extends abn_1<bFZ> {
    public static final abm_1 a = new abm_1(new bek_0());

    public bFZ a() {
        beh_0 beh_02;
        try {
            beh_02 = (beh_0)a.borrowObject();
            beh_0.a(beh_02, a);
        }
        catch (Exception exception) {
            beh_0.q.error((Object)"Error extracting PvpExtraction of pool", (Throwable)exception);
            beh_02 = new beh_0();
        }
        return beh_02;
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

