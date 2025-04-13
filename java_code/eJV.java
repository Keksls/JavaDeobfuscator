/*
 * Decompiled with CFR 0.152.
 */
public abstract class eJV
extends Enum<eJV> {
    public static final /* enum */ eJV a = new eJW(0);
    public static final /* enum */ eJV b = new eJX(1);
    public static final /* enum */ eJV c = new eJY(2);
    private final int d;
    private static final /* synthetic */ eJV[] e;

    public static eJV[] values() {
        return (eJV[])e.clone();
    }

    public static eJV valueOf(String string) {
        return Enum.valueOf(eJV.class, string);
    }

    eJV(int n2) {
        this.d = n2;
    }

    public abstract eJZ a(aff_1 var1);

    public static eJV a(int n) {
        eJV[] eJVArray = eJV.values();
        for (int k = 0; k < eJVArray.length; ++k) {
            eJV eJV2 = eJVArray[k];
            if (eJV2.d != n) continue;
            return eJV2;
        }
        return a;
    }

    static {
        e = new eJV[]{a, b, c};
    }
}

