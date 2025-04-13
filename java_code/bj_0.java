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
 * Renamed from BJ
 */
public enum bj_0 implements ProtocolMessageEnum
{
    a(1),
    b(2),
    c(3),
    d(4);

    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 3;
    public static final int h = 4;
    private static final Internal.EnumLiteMap<bj_0> i;
    private static final bj_0[] j;
    private final int k;

    public final int getNumber() {
        return this.k;
    }

    @Deprecated
    public static bj_0 a(int n) {
        return bj_0.b(n);
    }

    public static bj_0 b(int n) {
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
        }
        return null;
    }

    public static Internal.EnumLiteMap<bj_0> a() {
        return i;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)bj_0.b().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return bj_0.b();
    }

    public static final Descriptors.EnumDescriptor b() {
        return (Descriptors.EnumDescriptor)AO.a().getEnumTypes().get(0);
    }

    public static bj_0 a(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != bj_0.b()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return j[enumValueDescriptor.getIndex()];
    }

    private bj_0(int n2) {
        this.k = n2;
    }

    static {
        i = new BK();
        j = bj_0.values();
    }
}

