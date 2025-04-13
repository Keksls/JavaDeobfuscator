/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Internal$EnumLite
 */
import com.google.protobuf.Internal;

/*
 * Renamed from au
 */
public enum au_2 implements Internal.EnumLite
{
    a(1),
    b(2),
    c(3),
    d(0);

    private final int e;

    private au_2(int n2) {
        this.e = n2;
    }

    @Deprecated
    public static au_2 a(int n) {
        return au_2.b(n);
    }

    public static au_2 b(int n) {
        switch (n) {
            case 1: {
                return a;
            }
            case 2: {
                return b;
            }
            case 3: {
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

