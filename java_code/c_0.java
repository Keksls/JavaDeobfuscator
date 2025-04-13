/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Internal$EnumLite
 */
import com.google.protobuf.Internal;

/*
 * Renamed from C
 */
public enum c_0 implements Internal.EnumLite
{
    a(3),
    b(4),
    c(0);

    private final int d;

    private c_0(int n2) {
        this.d = n2;
    }

    @Deprecated
    public static c_0 a(int n) {
        return c_0.b(n);
    }

    public static c_0 b(int n) {
        switch (n) {
            case 3: {
                return a;
            }
            case 4: {
                return b;
            }
            case 0: {
                return c;
            }
        }
        return null;
    }

    public int getNumber() {
        return this.d;
    }
}

