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
 * Renamed from aG
 */
public enum ag_1 implements ProtocolMessageEnum
{
    a(0),
    b(1),
    c(2),
    d(3),
    e(4),
    f(5),
    g(-1);

    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 3;
    public static final int l = 4;
    public static final int m = 5;
    private static final Internal.EnumLiteMap<ag_1> n;
    private static final ag_1[] o;
    private final int p;

    public final int getNumber() {
        if (this == g) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.p;
    }

    @Deprecated
    public static ag_1 a(int n) {
        return ag_1.b(n);
    }

    public static ag_1 b(int n) {
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
            case 4: {
                return e;
            }
            case 5: {
                return f;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<ag_1> a() {
        return n;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)ag_1.b().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return ag_1.b();
    }

    public static final Descriptors.EnumDescriptor b() {
        return (Descriptors.EnumDescriptor)ad_1.a().getEnumTypes().get(0);
    }

    public static ag_1 a(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != ag_1.b()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        if (enumValueDescriptor.getIndex() == -1) {
            return g;
        }
        return o[enumValueDescriptor.getIndex()];
    }

    private ag_1(int n2) {
        this.p = n2;
    }

    static {
        n = new ah_1();
        o = ag_1.values();
    }
}

