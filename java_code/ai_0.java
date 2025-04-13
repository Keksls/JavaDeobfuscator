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
 * Renamed from AI
 */
public final class ai_0 {
    static final Descriptors.Descriptor a;
    static final GeneratedMessageV3.FieldAccessorTable b;
    static Descriptors.FileDescriptor c;

    private ai_0() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        ai_0.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return c;
    }

    static {
        String[] stringArray = new String[]{"\n\u001aaccountData/tutorial.proto\":\n\bTutorial\u0012\u0018\n\u0010discoveredGuides\u0018\u0001 \u0003(\u0005\u0012\u0014\n\funreadGuides\u0018\u0002 \u0003(\u0005B6\n\"com.ankama.wakfu.protocol.tutorialB\u0010ProtobufTutorial"};
        aj_0 aj_02 = new aj_0();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0], (Descriptors.FileDescriptor.InternalDescriptorAssigner)aj_02);
        a = (Descriptors.Descriptor)ai_0.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"DiscoveredGuides", "UnreadGuides"});
    }
}

