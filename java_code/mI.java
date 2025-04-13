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

public enum mI implements ProtocolMessageEnum
{
    a(0),
    b(1),
    c(2),
    d(3);

    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    private static final Internal.EnumLiteMap<mI> i;
    private static final mI[] j;
    private final int k;

    public final int getNumber() {
        return this.k;
    }

    @Deprecated
    public static mI a(int n) {
        return mI.b(n);
    }

    public static mI b(int n) {
        switch (n) {
            case 0: {
                return a;
            }
            case 1: {
                return b;
            }
            case 2: {
                return c;
            }
            case 3: {
                return d;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<mI> a() {
        return i;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)mI.b().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return mI.b();
    }

    public static final Descriptors.EnumDescriptor b() {
        return (Descriptors.EnumDescriptor)mC.a().getEnumTypes().get(0);
    }

    public static mI a(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != mI.b()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return j[enumValueDescriptor.getIndex()];
    }

    private mI(int n2) {
        this.k = n2;
    }

    static {
        i = new mJ();
        j = mI.values();
    }
}

