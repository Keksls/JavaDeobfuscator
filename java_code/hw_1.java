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
 * Renamed from hw
 */
public enum hw_1 implements ProtocolMessageEnum
{
    a(1),
    b(2),
    c(3);

    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    private static final Internal.EnumLiteMap<hw_1> g;
    private static final hw_1[] h;
    private final int i;

    public final int getNumber() {
        return this.i;
    }

    @Deprecated
    public static hw_1 a(int n) {
        return hw_1.b(n);
    }

    public static hw_1 b(int n) {
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
        }
        return null;
    }

    public static Internal.EnumLiteMap<hw_1> a() {
        return g;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)hw_1.b().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return hw_1.b();
    }

    public static final Descriptors.EnumDescriptor b() {
        return (Descriptors.EnumDescriptor)hl_0.a().getEnumTypes().get(0);
    }

    public static hw_1 a(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != hw_1.b()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return h[enumValueDescriptor.getIndex()];
    }

    private hw_1(int n2) {
        this.i = n2;
    }

    static {
        g = new hx_1();
        h = hw_1.values();
    }
}

