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
 * Renamed from Ay
 */
public enum ay_0 implements ProtocolMessageEnum
{
    a(1),
    b(2);

    public static final int c = 1;
    public static final int d = 2;
    private static final Internal.EnumLiteMap<ay_0> e;
    private static final ay_0[] f;
    private final int g;

    public final int getNumber() {
        return this.g;
    }

    @Deprecated
    public static ay_0 a(int n) {
        return ay_0.b(n);
    }

    public static ay_0 b(int n) {
        switch (n) {
            case 1: {
                return a;
            }
            case 2: {
                return b;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<ay_0> a() {
        return e;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)ay_0.b().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return ay_0.b();
    }

    public static final Descriptors.EnumDescriptor b() {
        return (Descriptors.EnumDescriptor)aw_0.a().getEnumTypes().get(0);
    }

    public static ay_0 a(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != ay_0.b()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f[enumValueDescriptor.getIndex()];
    }

    private ay_0(int n2) {
        this.g = n2;
    }

    static {
        e = new az_0();
        f = ay_0.values();
    }
}

