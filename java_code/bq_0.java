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
 * Renamed from BQ
 */
public enum bq_0 implements ProtocolMessageEnum
{
    a(1),
    b(2),
    c(3),
    d(4),
    e(5);

    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static final int i = 4;
    public static final int j = 5;
    private static final Internal.EnumLiteMap<bq_0> k;
    private static final bq_0[] l;
    private final int m;

    public final int getNumber() {
        return this.m;
    }

    @Deprecated
    public static bq_0 a(int n) {
        return bq_0.b(n);
    }

    public static bq_0 b(int n) {
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
        }
        return null;
    }

    public static Internal.EnumLiteMap<bq_0> a() {
        return k;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)bq_0.b().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return bq_0.b();
    }

    public static final Descriptors.EnumDescriptor b() {
        return (Descriptors.EnumDescriptor)AO.a().getEnumTypes().get(1);
    }

    public static bq_0 a(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != bq_0.b()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return l[enumValueDescriptor.getIndex()];
    }

    private bq_0(int n2) {
        this.m = n2;
    }

    static {
        k = new br_0();
        l = bq_0.values();
    }
}

