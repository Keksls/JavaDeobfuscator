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
 * Renamed from zw
 */
public final class zw_1 {
    static final Descriptors.Descriptor a;
    static final GeneratedMessageV3.FieldAccessorTable b;
    static final Descriptors.Descriptor c;
    static final GeneratedMessageV3.FieldAccessorTable d;
    static final Descriptors.Descriptor e;
    static final GeneratedMessageV3.FieldAccessorTable f;
    static final Descriptors.Descriptor g;
    static final GeneratedMessageV3.FieldAccessorTable h;
    static Descriptors.FileDescriptor i;

    private zw_1() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        zw_1.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return i;
    }

    static {
        String[] stringArray = new String[]{"\n\u0019resources/resources.proto\"Q\n\u0016ProtoResourcePartition\u0012\t\n\u0001x\u0018\u0001 \u0002(\u0005\u0012\t\n\u0001y\u0018\u0002 \u0002(\u0005\u0012!\n\tresources\u0018\u0003 \u0003(\u000b2\u000e.ProtoResource\"\u008d\u0001\n\rProtoResource\u0012\r\n\u0005refId\u0018\u0001 \u0002(\u0005\u0012\t\n\u0001x\u0018\u0002 \u0002(\u0005\u0012\t\n\u0001y\u0018\u0003 \u0002(\u0005\u0012\t\n\u0001z\u0018\u0004 \u0002(\u0005\u0012\f\n\u0004step\u0018\u0005 \u0002(\u0005\u0012\u0013\n\u000bautoRespawn\u0018\u0006 \u0002(\b\u0012\u0014\n\fownerAccount\u0018\u0007 \u0001(\u0003\u0012\u0013\n\u000bownerNation\u0018\b \u0001(\u0005\"D\n\u001aActorCollectRequestMessage\u0012\u0010\n\bactionId\u0018\u0001 \u0002(\u0005\u0012\t\n\u0001x\u0018\u0002 \u0002(\u0005\u0012\t\n\u0001y\u0018\u0003 \u0002(\u0005\"H\n!ActorCollectMonsterRequestMessage\u0012\u0010\n\bactionId\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tmonsterId\u0018\u0002 \u0002(\u0003B8\n#com.ankama.wakfu.protocol.resourcesB\u0011ProtobufResources"};
        zx_1 zx_12 = new zx_1();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0], (Descriptors.FileDescriptor.InternalDescriptorAssigner)zx_12);
        a = (Descriptors.Descriptor)zw_1.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"X", "Y", "Resources"});
        c = (Descriptors.Descriptor)zw_1.a().getMessageTypes().get(1);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"RefId", "X", "Y", "Z", "Step", "AutoRespawn", "OwnerAccount", "OwnerNation"});
        e = (Descriptors.Descriptor)zw_1.a().getMessageTypes().get(2);
        f = new GeneratedMessageV3.FieldAccessorTable(e, new String[]{"ActionId", "X", "Y"});
        g = (Descriptors.Descriptor)zw_1.a().getMessageTypes().get(3);
        h = new GeneratedMessageV3.FieldAccessorTable(g, new String[]{"ActionId", "MonsterId"});
    }
}

