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
 * Renamed from E
 */
public final class e_0 {
    static final Descriptors.Descriptor a;
    static final GeneratedMessageV3.FieldAccessorTable b;
    static final Descriptors.Descriptor c;
    static final GeneratedMessageV3.FieldAccessorTable d;
    static final Descriptors.Descriptor e;
    static final GeneratedMessageV3.FieldAccessorTable f;
    static final Descriptors.Descriptor g;
    static final GeneratedMessageV3.FieldAccessorTable h;
    static final Descriptors.Descriptor i;
    static final GeneratedMessageV3.FieldAccessorTable j;
    static final Descriptors.Descriptor k;
    static final GeneratedMessageV3.FieldAccessorTable l;
    static final Descriptors.Descriptor m;
    static final GeneratedMessageV3.FieldAccessorTable n;
    static Descriptors.FileDescriptor o;

    private e_0() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        e_0.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return o;
    }

    static {
        String[] stringArray = new String[]{"\n\u0013friend_invite.proto\u0012\rfriend_invite\u001a\nuser.proto\"\u0094\u0002\n\u0015CreateFriendInviteCmd\u0012\u0017\n\u000finviter_user_id\u0018\u0001 \u0001(\u0003\u0012\u001b\n\u0011recipient_user_id\u0018\u0002 \u0001(\u0003H\u0000\u0012\u001d\n\u0013recipient_user_name\u0018\u0003 \u0001(\tH\u0000\u0012c\n\u001brecipient_user_name_and_tag\u0018\u0004 \u0001(\u000b2<.friend_invite.CreateFriendInviteCmd.RecipientUserNameAndTagH\u0000\u001a4\n\u0017RecipientUserNameAndTag\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u000b\n\u0003tag\u0018\u0002 \u0001(\tB\u000b\n\trecipient\"\u00bc\u0001\n\u0015DeleteFriendInviteCmd\u0012\u0017\n\u000finviter_user_id\u0018\u0001 \u0001(\u0003\u0012\u0019\n\u0011recipient_user_id\u0018\u0002 \u0001(\u0003\u0012;\n\u0006reason\u0018\u0003 \u0001(\u000e2+.friend_invite.DeleteFriendInviteCmd.Reason\"2\n\u0006Reason\u0012\f\n\bAccepted\u0010\u0000\u0012\f\n\bRejected\u0010\u0001\u0012\f\n\bCanceled\u0010\u0002\"E\n\u0016FriendInviteCreatedEvt\u0012+\n\u0006invite\u0018\u0001 \u0001(\u000b2\u001b.friend_invite.FriendInvite\"\u0082\u0001\n\u0016FriendInviteDeletedEvt\u0012+\n\u0006invite\u0018\u0001 \u0001(\u000b2\u001b.friend_invite.FriendInvite\u0012;\n\u0006reason\u0018\u0002 \u0001(\u000e2+.friend_invite.DeleteFriendInviteCmd.Reason\"J\n\fFriendInvite\u0012\u001b\n\u0007inviter\u0018\u0001 \u0001(\u000b2\n.user.User\u0012\u001d\n\trecipient\u0018\u0002 \u0001(\u000b2\n.user.User\"?\n\u0010FriendInviteList\u0012+\n\u0006values\u0018\u0001 \u0003(\u000b2\u001b.friend_invite.FriendInviteB/\n-com.ankama.wakfu.chat.endpoint.spin2.protocolb\u0006proto3"};
        f_0 f_02 = new f_0();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[]{ak_2.a()}, (Descriptors.FileDescriptor.InternalDescriptorAssigner)f_02);
        a = (Descriptors.Descriptor)e_0.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"InviterUserId", "RecipientUserId", "RecipientUserName", "RecipientUserNameAndTag", "Recipient"});
        c = (Descriptors.Descriptor)a.getNestedTypes().get(0);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"Name", "Tag"});
        e = (Descriptors.Descriptor)e_0.a().getMessageTypes().get(1);
        f = new GeneratedMessageV3.FieldAccessorTable(e, new String[]{"InviterUserId", "RecipientUserId", "Reason"});
        g = (Descriptors.Descriptor)e_0.a().getMessageTypes().get(2);
        h = new GeneratedMessageV3.FieldAccessorTable(g, new String[]{"Invite"});
        i = (Descriptors.Descriptor)e_0.a().getMessageTypes().get(3);
        j = new GeneratedMessageV3.FieldAccessorTable(i, new String[]{"Invite", "Reason"});
        k = (Descriptors.Descriptor)e_0.a().getMessageTypes().get(4);
        l = new GeneratedMessageV3.FieldAccessorTable(k, new String[]{"Inviter", "Recipient"});
        m = (Descriptors.Descriptor)e_0.a().getMessageTypes().get(5);
        n = new GeneratedMessageV3.FieldAccessorTable(m, new String[]{"Values"});
        ak_2.a();
    }
}

