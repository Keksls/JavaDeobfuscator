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
 * Renamed from cR
 */
public enum cr_2 implements ProtocolMessageEnum
{
    a(0),
    b(1),
    c(-1);

    public static final int d = 0;
    public static final int e = 1;
    private static final Internal.EnumLiteMap<cr_2> f;
    private static final cr_2[] g;
    private final int h;

    public final int getNumber() {
        if (this == c) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.h;
    }

    @Deprecated
    public static cr_2 a(int n) {
        return cr_2.b(n);
    }

    public static cr_2 b(int n) {
        switch (n) {
            case 0: {
                return a;
            }
            case 1: {
                return b;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<cr_2> a() {
        return f;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)cr_2.b().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return cr_2.b();
    }

    public static final Descriptors.EnumDescriptor b() {
        return (Descriptors.EnumDescriptor)ak_2.a().getEnumTypes().get(0);
    }

    public static cr_2 a(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != cr_2.b()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        if (enumValueDescriptor.getIndex() == -1) {
            return c;
        }
        return g[enumValueDescriptor.getIndex()];
    }

    private cr_2(int n2) {
        this.h = n2;
    }

    static {
        f = new cs_2();
        g = cr_2.values();
    }
}

