/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bCZ
 */
public class bcz_2
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bda_1());

    public bFZ a() {
        bcy_1 bcy_12;
        try {
            bcy_12 = (bcy_1)a.borrowObject();
            bcy_1.a(bcy_12, a);
        }
        catch (Exception exception) {
            bbe_2.s.error((Object)("Error extracting " + bbe_2.class.getName() + " of pool"), (Throwable)exception);
            bcy_12 = new bcy_1();
        }
        return bcy_12;
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

