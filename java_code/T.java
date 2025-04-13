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

public enum T implements ProtocolMessageEnum
{
    a(0),
    b(1),
    c(2),
    d(-1);

    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    private static final Internal.EnumLiteMap<T> h;
    private static final T[] i;
    private final int j;

    public final int getNumber() {
        if (this == d) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.j;
    }

    @Deprecated
    public static T a(int n) {
        return T.b(n);
    }

    public static T b(int n) {
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
        }
        return null;
    }

    public static Internal.EnumLiteMap<T> a() {
        return h;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)T.b().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return T.b();
    }

    public static final Descriptors.EnumDescriptor b() {
        return (Descriptors.EnumDescriptor)Q.a().getEnumTypes().get(0);
    }

    public static T a(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != T.b()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        if (enumValueDescriptor.getIndex() == -1) {
            return d;
        }
        return i[enumValueDescriptor.getIndex()];
    }

    private T(int n2) {
        this.j = n2;
    }

    static {
        h = new U();
        i = T.values();
    }
}

