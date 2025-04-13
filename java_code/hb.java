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

public final class hb {
    static final Descriptors.Descriptor a;
    static final GeneratedMessageV3.FieldAccessorTable b;
    static final Descriptors.Descriptor c;
    static final GeneratedMessageV3.FieldAccessorTable d;
    static Descriptors.FileDescriptor e;

    private hb() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        hb.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return e;
    }

    static {
        String[] stringArray = new String[]{"\n!dungeon/dungeon_progression.proto\":\n\u0017ProtoDungeonProgression\u0012\u001f\n\u0003map\u0018\u0001 \u0003(\u000b2\u0012.ProtoDungeonEntry\"6\n\u0011ProtoDungeonEntry\u0012\r\n\u0005index\u0018\u0001 \u0002(\u0005\u0012\u0012\n\ndifficulty\u0018\u0002 \u0002(\u0005B?\n!com.ankama.wakfu.protocol.dungeonB\u001aProtobufDungeonProgression"};
        hc_0 hc_02 = new hc_0();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0], (Descriptors.FileDescriptor.InternalDescriptorAssigner)hc_02);
        a = (Descriptors.Descriptor)hb.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"Map"});
        c = (Descriptors.Descriptor)hb.a().getMessageTypes().get(1);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"Index", "Difficulty"});
    }
}

