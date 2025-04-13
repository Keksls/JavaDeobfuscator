/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  gnu.trove.procedure.TByteObjectProcedure
 */
import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.procedure.TByteObjectProcedure;

/*
 * Renamed from ccU
 */
class ccu_2
implements TByteObjectProcedure<byte[]> {
    private final int b;
    private final TShortObjectHashMap<short[]> c;
    private final cct_2 d;
    static final /* synthetic */ boolean a;

    ccu_2(int n, TShortObjectHashMap<short[]> tShortObjectHashMap, int n2) {
        this.b = n;
        this.c = tShortObjectHashMap;
        this.d = new cct_2(n2);
    }

    public cct_2 a() {
        return this.d;
    }

    public boolean a(byte by, byte[] byArray) {
        if (by == 0) {
            return true;
        }
        short s2 = this.a(by);
        short[] sArray = new short[byArray.length];
        for (int k = 0; k < byArray.length; ++k) {
            sArray[k] = this.a(byArray[k]);
        }
        if (!a && this.c.contains(s2)) {
            throw new AssertionError();
        }
        this.c.put(s2, (Object)sArray);
        this.d.a(s2, sArray);
        return true;
    }

    private short a(short s2) {
        if (s2 == 0) {
            return 0;
        }
        return s2 > 0 ? (short)(s2 + this.b) : (short)(s2 - this.b);
    }

    public /* synthetic */ boolean execute(byte by, Object object) {
        return this.a(by, (byte[])object);
    }

    static {
        a = !ccr_2.class.desiredAssertionStatus();
    }
}

