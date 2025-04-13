/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yS
 */
public abstract class ys_1
implements gs_0 {
    public static ys_1 c(ByteBuffer byteBuffer) {
        ux_1 ux_12;
        byte by = byteBuffer.get();
        switch (by) {
            case 0: {
                ux_12 = new ux_1();
                break;
            }
            default: {
                return null;
            }
        }
        if (!ux_12.b(byteBuffer)) {
            return null;
        }
        return ux_12;
    }

    public static ys_1 b(ByteBuffer byteBuffer, int n) {
        ux_1 ux_12;
        byte by = byteBuffer.get();
        switch (by) {
            case 0: {
                ux_12 = new ux_1();
                break;
            }
            default: {
                return null;
            }
        }
        if (!ux_12.a(byteBuffer, n)) {
            return null;
        }
        return ux_12;
    }

    public abstract byte a();

    public abstract void a(StringBuilder var1, String var2);
}

