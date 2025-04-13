/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Descriptors$EnumDescriptor
 *  com.google.protobuf.Descriptors$EnumValueDescriptor
 *  com.google.protobuf.Internal$EnumLiteMap
 *  com.google.protobuf.ProtocolMessageEnum
 */
import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/*
 * Renamed from ft
 */
public enum ft_1 implements ProtocolMessageEnum
{
    a(1),
    b(2),
    c(3),
    d(4),
    e(5),
    f(6),
    g(7),
    h(8),
    i(9),
    j(10),
    k(11),
    l(12),
    m(13),
    n(14),
    o(15);

    public static final int p = 1;
    public static final int q = 2;
    public static final int r = 3;
    public static final int s = 4;
    public static final int t = 5;
    public static final int u = 6;
    public static final int v = 7;
    public static final int w = 8;
    public static final int x = 9;
    public static final int y = 10;
    public static final int z = 11;
    public static final int A = 12;
    public static final int B = 13;
    public static final int C = 14;
    public static final int D = 15;
    private static final Internal.EnumLiteMap<ft_1> E;
    private static final ft_1[] F;
    private final int G;

    public final int getNumber() {
        return this.G;
    }

    @Deprecated
    public static ft_1 a(int n) {
        return ft_1.b(n);
    }

    public static ft_1 b(int n) {
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
            case 4: {
                return d;
            }
            case 5: {
                return e;
            }
            case 6: {
                return f;
            }
            case 7: {
                return g;
            }
            case 8: {
                return h;
            }
            case 9: {
                return i;
            }
            case 10: {
                return j;
            }
            case 11: {
                return k;
            }
            case 12: {
                return l;
            }
            case 13: {
                return m;
            }
            case 14: {
                return ft_1.n;
            }
            case 15: {
                return o;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<ft_1> a() {
        return E;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)ft_1.b().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return ft_1.b();
    }

    public static final Descriptors.EnumDescriptor b() {
        return (Descriptors.EnumDescriptor)fr_1.a().getEnumTypes().get(0);
    }

    public static ft_1 a(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != ft_1.b()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return F[enumValueDescriptor.getIndex()];
    }

    private ft_1(int n2) {
        this.G = n2;
    }

    static {
        E = new fu_2();
        F = ft_1.values();
    }
}

