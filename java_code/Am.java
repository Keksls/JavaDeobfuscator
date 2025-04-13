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

public final class Am {
    static final Descriptors.Descriptor a;
    static final GeneratedMessageV3.FieldAccessorTable b;
    static final Descriptors.Descriptor c;
    static final GeneratedMessageV3.FieldAccessorTable d;
    static Descriptors.FileDescriptor e;

    private Am() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        Am.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return e;
    }

    static {
        String[] stringArray = new String[]{"\n\u0011storage_box.proto\u001a\nitem.proto\"D\n\u000fProtoStorageBox\u00121\n\fcompartments\u0018\u0001 \u0003(\u000b2\u001b.ProtoStorageBoxCompartment\"F\n\u001aProtoStorageBoxCompartment\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u001c\n\u0005items\u0018\u0002 \u0003(\u000b2\r.ProtoBagItemB:\n$com.ankama.wakfu.protocol.storageBoxB\u0012ProtobufStorageBox"};
        An an = new An();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[]{kM.a()}, (Descriptors.FileDescriptor.InternalDescriptorAssigner)an);
        a = (Descriptors.Descriptor)Am.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"Compartments"});
        c = (Descriptors.Descriptor)Am.a().getMessageTypes().get(1);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"Id", "Items"});
        kM.a();
    }
}

