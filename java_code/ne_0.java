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
 * Renamed from nE
 */
public final class ne_0 {
    static final Descriptors.Descriptor a;
    static final GeneratedMessageV3.FieldAccessorTable b;
    static final Descriptors.Descriptor c;
    static final GeneratedMessageV3.FieldAccessorTable d;
    static final Descriptors.Descriptor e;
    static final GeneratedMessageV3.FieldAccessorTable f;
    static Descriptors.FileDescriptor g;

    private ne_0() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        ne_0.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return g;
    }

    static {
        String[] stringArray = new String[]{"\n\u001amoderationGuildInfos.proto\"\u00be\u0001\n\u000fProtoGuildInfos\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0003\u0012\f\n\u0004name\u0018\u0002 \u0002(\t\u0012\u0013\n\u000bdescription\u0018\u0003 \u0002(\t\u0012\u000f\n\u0007message\u0018\u0004 \u0002(\t\u0012\r\n\u0005level\u0018\u0005 \u0002(\u0005\u0012\u000e\n\u0006blazon\u0018\u0006 \u0002(\u0003\u0012#\n\u0005ranks\u0018\u0007 \u0003(\u000b2\u0014.ProtoGuildRankInfos\u0012'\n\u0007members\u0018\b \u0003(\u000b2\u0016.ProtoGuildMemberInfos\"A\n\u0013ProtoGuildRankInfos\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0003\u0012\f\n\u0004name\u0018\u0002 \u0002(\t\u0012\u0010\n\bposition\u0018\u0003 \u0002(\u0005\"c\n\u0015ProtoGuildMemberInfos\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0003\u0012\u0012\n\naccount_id\u0018\u0002 \u0002(\u0003\u0012\f\n\u0004name\u0018\u0003 \u0002(\t\u0012\f\n\u0004rank\u0018\u0004 \u0002(\u0003\u0012\u000e\n\u0006online\u0018\u0005 \u0002(\bBD\n.com.ankama.wakfu.protocol.moderationGuildInfosB\u0012ProtobufGuildInfos"};
        nf_0 nf_02 = new nf_0();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0], (Descriptors.FileDescriptor.InternalDescriptorAssigner)nf_02);
        a = (Descriptors.Descriptor)ne_0.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"Id", "Name", "Description", "Message", "Level", "Blazon", "Ranks", "Members"});
        c = (Descriptors.Descriptor)ne_0.a().getMessageTypes().get(1);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"Id", "Name", "Position"});
        e = (Descriptors.Descriptor)ne_0.a().getMessageTypes().get(2);
        f = new GeneratedMessageV3.FieldAccessorTable(e, new String[]{"Id", "AccountId", "Name", "Rank", "Online"});
    }
}

