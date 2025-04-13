/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Internal$EnumLite
 */
import com.google.protobuf.Internal;

public enum K implements Internal.EnumLite
{
    a(2),
    b(3),
    c(4),
    d(0);

    private final int e;

    private K(int n2) {
        this.e = n2;
    }

    @Deprecated
    public static K a(int n) {
        return K.b(n);
    }

    public static K b(int n) {
        switch (n) {
            case 2: {
                return a;
            }
            case 3: {
                return b;
            }
            case 4: {
                return c;
            }
            case 0: {
                return d;
            }
        }
        return null;
    }

    public int getNumber() {
        return this.e;
    }
}

