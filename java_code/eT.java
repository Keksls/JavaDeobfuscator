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

public final class eT {
    static final Descriptors.Descriptor a;
    static final GeneratedMessageV3.FieldAccessorTable b;
    static final Descriptors.Descriptor c;
    static final GeneratedMessageV3.FieldAccessorTable d;
    static final Descriptors.Descriptor e;
    static final GeneratedMessageV3.FieldAccessorTable f;
    static final Descriptors.Descriptor g;
    static final GeneratedMessageV3.FieldAccessorTable h;
    static Descriptors.FileDescriptor i;

    private eT() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        eT.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return i;
    }

    static {
        String[] stringArray = new String[]{"\n\nchat.proto\"v\n\u0010ProtoFriendLists\u0012\u001d\n\u0007friends\u0018\u0001 \u0003(\u000b2\f.ProtoFriend\u0012$\n\u0016uselessFieldToSeparate\u0018\u0002 \u0001(\b:\u0004true\u0012\u001d\n\u0007ignored\u0018\u0003 \u0003(\u000b2\f.ProtoFriend\"b\n\u000bProtoFriend\u0012\u0011\n\taccountId\u0018\u0001 \u0002(\u0003\u0012\u0013\n\u000baccountName\u0018\u0002 \u0002(\t\u0012\u000b\n\u0003tag\u0018\u0003 \u0001(\t\u0012\r\n\u0005flags\u00182 \u0001(\u0005\u0012\u000f\n\u0007comment\u00183 \u0001(\t\"s\n\u0019ProtoFriendListsForClient\u0012*\n\u0007friends\u0018\u0001 \u0003(\u000b2\u0019.ProtoFriendInfoForClient\u0012*\n\u0007ignored\u0018\u0002 \u0003(\u000b2\u0019.ProtoFriendInfoForClient\"\u00c7\u0001\n\u0018ProtoFriendInfoForClient\u0012\u0011\n\taccountId\u0018\u0001 \u0002(\u0003\u0012\u0013\n\u000baccountName\u0018\u0002 \u0002(\t\u0012\u0010\n\bisOnline\u0018\u0004 \u0002(\b\u0012\u0017\n\rcharacterName\u00182 \u0001(\t:\u0000\u0012\u000e\n\u0006notify\u00183 \u0001(\b\u0012\u0013\n\u0007breedId\u00184 \u0001(\u0005:\u0002-1\u0012\u000f\n\u0003sex\u00185 \u0001(\u0005:\u0002-1\u0012\u0012\n\ncommentary\u00186 \u0001(\t\u0012\u000e\n\u0002xp\u00187 \u0001(\u0003:\u0002-1B.\n\u001ecom.ankama.wakfu.protocol.chatB\fProtobufChat"};
        eU eU2 = new eU();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0], (Descriptors.FileDescriptor.InternalDescriptorAssigner)eU2);
        a = (Descriptors.Descriptor)eT.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"Friends", "UselessFieldToSeparate", "Ignored"});
        c = (Descriptors.Descriptor)eT.a().getMessageTypes().get(1);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"AccountId", "AccountName", "Tag", "Flags", "Comment"});
        e = (Descriptors.Descriptor)eT.a().getMessageTypes().get(2);
        f = new GeneratedMessageV3.FieldAccessorTable(e, new String[]{"Friends", "Ignored"});
        g = (Descriptors.Descriptor)eT.a().getMessageTypes().get(3);
        h = new GeneratedMessageV3.FieldAccessorTable(g, new String[]{"AccountId", "AccountName", "IsOnline", "CharacterName", "Notify", "BreedId", "Sex", "Commentary", "Xp"});
    }
}

