/*
 * Decompiled with CFR 0.152.
 */
public class bEF
extends abn_1<bFZ> {
    public static final abm_1 a = new abm_1(new beg_0());

    public bFZ a() {
        bee_0 bee_02;
        try {
            bee_02 = (bee_0)a.borrowObject();
            bee_0.a(bee_02, a);
        }
        catch (Exception exception) {
            bee_0.q.error((Object)"Error extracting PvpSwitch of pool", (Throwable)exception);
            bee_02 = new bee_0();
        }
        return bee_02;
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

