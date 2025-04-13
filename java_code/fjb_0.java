/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 */
import gnu.trove.map.hash.TByteObjectHashMap;

/*
 * Renamed from fjb
 */
public enum fjb_0 {
    a(1, 0.05f, 0.05f, 0.7f);

    private static final TByteObjectHashMap<fjb_0> f;
    public final byte b;
    public final float c;
    public final float d;
    public final float e;

    private fjb_0(int n2, float f2, float f3, float f4) {
        this.b = (byte)n2;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public static fjb_0 a(byte by) {
        return (fjb_0)((Object)f.get(by));
    }

    static {
        f = new TByteObjectHashMap();
        for (fjb_0 fjb_02 : fjb_0.values()) {
            f.put(fjb_02.b, (Object)fjb_02);
        }
    }
}

