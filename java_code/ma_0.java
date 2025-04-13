/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FileDescriptor
 *  com.google.protobuf.Descriptors$FileDescriptor$InternalDescriptorAssigner
 *  com.google.protobuf.ExtensionRegistry
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 */
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

/*
 * Renamed from ma
 */
public final class ma_0 {
    static final Descriptors.Descriptor a;
    static final GeneratedMessageV3.FieldAccessorTable b;
    static final Descriptors.Descriptor c;
    static final GeneratedMessageV3.FieldAccessorTable d;
    static Descriptors.FileDescriptor e;

    private ma_0() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        ma_0.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return e;
    }

    static {
        String[] stringArray = new String[]{"\n\u000bchest.proto\u001a\nitem.proto\"+\n\u0005Chest\u0012\"\n\fcompartments\u0018\u0001 \u0003(\u000b2\f.Compartment\"\u00ca\u0001\n\u000bCompartment\u0012\u0015\n\rcompartmentId\u0018\u0001 \u0002(\t\u0012\u0011\n\taccountId\u0018\u0002 \u0001(\u0003\u0012\f\n\u0004name\u0018\u0003 \u0001(\t\u0012\r\n\u0005color\u0018\u0004 \u0001(\t\u0012\r\n\u0005index\u0018\u0005 \u0001(\u0005\u0012\u0014\n\ffreeCapacity\u0018\u0006 \u0001(\u0005\u0012\u0010\n\bcapacity\u0018\u0007 \u0001(\u0005\u0012\u0012\n\nisReadonly\u0018\b \u0001(\b\u0012)\n\u0005items\u0018\t \u0001(\u000b2\u001a.ProtoItemWithPositionListB5\n$com.ankama.wakfu.protocol.item.chestB\rProtobufChest"};
        mb_0 mb_02 = new mb_0();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[]{kM.a()}, (Descriptors.FileDescriptor.InternalDescriptorAssigner)mb_02);
        a = (Descriptors.Descriptor)ma_0.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"Compartments"});
        c = (Descriptors.Descriptor)ma_0.a().getMessageTypes().get(1);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"CompartmentId", "AccountId", "Name", "Color", "Index", "FreeCapacity", "Capacity", "IsReadonly", "Items"});
        kM.a();
    }
}

