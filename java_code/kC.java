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

public final class kC {
    static final Descriptors.Descriptor a;
    static final GeneratedMessageV3.FieldAccessorTable b;
    static final Descriptors.Descriptor c;
    static final GeneratedMessageV3.FieldAccessorTable d;
    static Descriptors.FileDescriptor e;

    private kC() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        kC.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return e;
    }

    static {
        String[] stringArray = new String[]{"\n\u001bhavenworld/havenworld.proto\"O\n\u0014ProtoHavenWorldLight\u0012\u000f\n\u0007guildId\u0018\u0002 \u0001(\u0003\u0012\u0013\n\u000bguildBlazon\u0018\u0003 \u0001(\u0003\u0012\u0011\n\tguildName\u0018\u0004 \u0001(\t\"E\n\u0018ProtoHavenWorldLightList\u0012)\n\nhavenWorld\u0018\u0001 \u0003(\u000b2\u0015.ProtoHavenWorldLightB:\n$com.ankama.wakfu.protocol.havenworldB\u0012ProtobufHavenWorld"};
        kD kD2 = new kD();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0], (Descriptors.FileDescriptor.InternalDescriptorAssigner)kD2);
        a = (Descriptors.Descriptor)kC.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"GuildId", "GuildBlazon", "GuildName"});
        c = (Descriptors.Descriptor)kC.a().getMessageTypes().get(1);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"HavenWorld"});
    }
}

