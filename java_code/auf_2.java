/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.common.nio.Buffers
 */
import com.jogamp.common.nio.Buffers;
import java.nio.ShortBuffer;

/*
 * Renamed from auf
 */
public final class auf_2 {
    public static final auf_2 a = new auf_2(new short[]{0, 1, 2, 3});
    public static final auf_2 b;
    private ShortBuffer c;
    private final int d;

    public auf_2(short[] sArray) {
        this.d = sArray.length;
        this.c = Buffers.newDirectShortBuffer((int)(this.d * 2));
        this.c().put(sArray);
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.d;
    }

    public ShortBuffer c() {
        this.c.rewind();
        return this.c;
    }

    public void d() {
        this.c = null;
    }

    static {
        short[] sArray = new short[Short.MAX_VALUE];
        for (int n = 0; n < sArray.length; n = (int)((short)(n + 1))) {
            sArray[n] = n;
        }
        b = new auf_2(sArray);
    }
}

