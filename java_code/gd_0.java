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
 * Renamed from gD
 */
public final class gd_0 {
    static final Descriptors.Descriptor a;
    static final GeneratedMessageV3.FieldAccessorTable b;
    static final Descriptors.Descriptor c;
    static final GeneratedMessageV3.FieldAccessorTable d;
    static Descriptors.FileDescriptor e;

    private gd_0() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        gd_0.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return e;
    }

    static {
        String[] stringArray = new String[]{"\n\u0013downscalingHP.proto\"F\n\u0012ProtoDownscalingHP\u00120\n\ncharacters\u0018\u0001 \u0003(\u000b2\u001c.ProtoDownscalingHPCharacter\"Q\n\u001bProtoDownscalingHPCharacter\u0012\u000e\n\u0006charId\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007hpValue\u0018\u0002 \u0002(\u0005\u0012\u0011\n\ttimestamp\u0018\u0003 \u0002(\u0003B@\n'com.ankama.wakfu.protocol.downscalingHPB\u0015ProtobufDownscalingHP"};
        ge_0 ge_02 = new ge_0();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0], (Descriptors.FileDescriptor.InternalDescriptorAssigner)ge_02);
        a = (Descriptors.Descriptor)gd_0.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"Characters"});
        c = (Descriptors.Descriptor)gd_0.a().getMessageTypes().get(1);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"CharId", "HpValue", "Timestamp"});
    }
}

