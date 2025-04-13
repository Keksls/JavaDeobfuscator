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

public final class oC {
    static final Descriptors.Descriptor a;
    static final GeneratedMessageV3.FieldAccessorTable b;
    static final Descriptors.Descriptor c;
    static final GeneratedMessageV3.FieldAccessorTable d;
    static final Descriptors.Descriptor e;
    static final GeneratedMessageV3.FieldAccessorTable f;
    static Descriptors.FileDescriptor g;

    private oC() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        oC.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return g;
    }

    static {
        String[] stringArray = new String[]{"\n\u0012pvpInventory.proto\"C\n\fPvpInventory\u0012\u0011\n\taccountId\u0018\u0001 \u0002(\u0003\u0012 \n\u0005items\u0018\u0002 \u0001(\u000b2\u0011.InventoryContent\"\u0098\u0001\n\u0010InventoryContent\u00123\n\u0007content\u0018\u0001 \u0003(\u000b2\".InventoryContent.InventoryElement\u001aO\n\u0010InventoryElement\u0012\u0014\n\u0006locked\u0018\u0001 \u0001(\b:\u0004true\u0012\u0013\n\u000breferenceId\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bquantity\u0018\u0003 \u0002(\u0005B5\n\u001dcom.ankama.wakfu.protocol.pvpB\u0014ProtobufPvpInventory"};
        oD oD2 = new oD();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0], (Descriptors.FileDescriptor.InternalDescriptorAssigner)oD2);
        a = (Descriptors.Descriptor)oC.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"AccountId", "Items"});
        c = (Descriptors.Descriptor)oC.a().getMessageTypes().get(1);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"Content"});
        e = (Descriptors.Descriptor)c.getNestedTypes().get(0);
        f = new GeneratedMessageV3.FieldAccessorTable(e, new String[]{"Locked", "ReferenceId", "Quantity"});
    }
}

