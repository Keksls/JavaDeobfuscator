/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public abstract class eZR {
    public static final byte a = 0;
    public static final byte b = 1;
    public static final byte c = 2;

    public static eZR a(byte by) {
        switch (by) {
            case 0: {
                return new ezq_0();
            }
            case 1: {
                return new ezt_0();
            }
            case 2: {
                return new ezu_0();
            }
        }
        return null;
    }

    public abstract byte e();

    public abstract void a(abx_2 var1);

    public abstract void a(ByteBuffer var1);
}

