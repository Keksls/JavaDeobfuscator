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
 * Renamed from aK
 */
public final class ak_2 {
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
    static final Descriptors.Descriptor o;
    static final GeneratedMessageV3.FieldAccessorTable p;
    static final Descriptors.Descriptor q;
    static final GeneratedMessageV3.FieldAccessorTable r;
    static final Descriptors.Descriptor s;
    static final GeneratedMessageV3.FieldAccessorTable t;
    static final Descriptors.Descriptor u;
    static final GeneratedMessageV3.FieldAccessorTable v;
    static final Descriptors.Descriptor w;
    static final GeneratedMessageV3.FieldAccessorTable x;
    static final Descriptors.Descriptor y;
    static final GeneratedMessageV3.FieldAccessorTable z;
    static final Descriptors.Descriptor A;
    static final GeneratedMessageV3.FieldAccessorTable B;
    static final Descriptors.Descriptor C;
    static final GeneratedMessageV3.FieldAccessorTable D;
    static final Descriptors.Descriptor E;
    static final GeneratedMessageV3.FieldAccessorTable F;
    static final Descriptors.Descriptor G;
    static final GeneratedMessageV3.FieldAccessorTable H;
    static final Descriptors.Descriptor I;
    static final GeneratedMessageV3.FieldAccessorTable J;
    static final Descriptors.Descriptor K;
    static final GeneratedMessageV3.FieldAccessorTable L;
    static final Descriptors.Descriptor M;
    static final GeneratedMessageV3.FieldAccessorTable N;
    static final Descriptors.Descriptor O;
    static final GeneratedMessageV3.FieldAccessorTable P;
    static final Descriptors.Descriptor Q;
    static final GeneratedMessageV3.FieldAccessorTable R;
    static final Descriptors.Descriptor S;
    static final GeneratedMessageV3.FieldAccessorTable T;
    static final Descriptors.Descriptor U;
    static final GeneratedMessageV3.FieldAccessorTable V;
    static final Descriptors.Descriptor W;
    private static final GeneratedMessageV3.FieldAccessorTable X;
    static final Descriptors.Descriptor Y;
    static final GeneratedMessageV3.FieldAccessorTable Z;
    static final Descriptors.Descriptor aa;
    static final GeneratedMessageV3.FieldAccessorTable ab;
    static final Descriptors.Descriptor ac;
    static final GeneratedMessageV3.FieldAccessorTable ad;
    static final Descriptors.Descriptor ae;
    static final GeneratedMessageV3.FieldAccessorTable af;
    static final Descriptors.Descriptor ag;
    static final GeneratedMessageV3.FieldAccessorTable ah;
    static Descriptors.FileDescriptor ai;

    private ak_2() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        ak_2.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return ai;
    }

    static {
        String[] stringArray = new String[]{"\n\nuser.proto\u0012\u0004user\"H\n\u0013UpdateUserStatusCmd\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012 \n\u0006status\u0018\u0002 \u0001(\u000e2\u0010.user.UserStatus\"`\n\u001fUpdateUserEndpointPropertiesCmd\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012,\n\nproperties\u0018\u0002 \u0001(\u000b2\u0018.user.EndpointProperties\"%\n\u0012ListUserFriendsCmd\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\"D\n\u0013UpdateUserFriendCmd\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012\u001c\n\u0006friend\u0018\u0002 \u0001(\u000b2\f.user.Friend\"+\n\u0018ListUserFriendInvitesCmd\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\">\n\u0013DeleteUserFriendCmd\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012\u0016\n\u000efriend_user_id\u0018\u0002 \u0001(\u0003\"*\n\u0017ListUserFriendGroupsCmd\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\"N\n\u0018CreateUserFriendGroupCmd\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012!\n\u0005group\u0018\u0002 \u0001(\u000b2\u0012.user.Friend.Group\"9\n\u0018DeleteUserFriendGroupCmd\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\"*\n\u0017ListUserBlockedUsersCmd\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\"D\n\u0018CreateUserBlockedUserCmd\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012\u0017\n\u000fblocked_user_id\u0018\u0002 \u0001(\u0003\"D\n\u0018DeleteUserBlockedUserCmd\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012\u0017\n\u000fblocked_user_id\u0018\u0002 \u0001(\u0003\"O\n\u0016UserPresenceUpdatedEvt\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012$\n\bpresence\u0018\u0002 \u0001(\u000e2\u0012.user.UserPresence\"I\n\u0014UserStatusUpdatedEvt\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012 \n\u0006status\u0018\u0002 \u0001(\u000e2\u0010.user.UserStatus\"a\n UserEndpointPropertiesUpdatedEvt\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012,\n\nproperties\u0018\u0002 \u0003(\u000b2\u0018.user.EndpointProperties\"E\n\u0014UserFriendCreatedEvt\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012\u001c\n\u0006friend\u0018\u0002 \u0001(\u000b2\f.user.Friend\"E\n\u0014UserFriendUpdatedEvt\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012\u001c\n\u0006friend\u0018\u0002 \u0001(\u000b2\f.user.Friend\"?\n\u0014UserFriendDeletedEvt\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012\u0016\n\u000efriend_user_id\u0018\u0002 \u0001(\u0003\"O\n\u0019UserFriendGroupCreatedEvt\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012!\n\u0005group\u0018\u0002 \u0001(\u000b2\u0012.user.Friend.Group\":\n\u0019UserFriendGroupDeletedEvt\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\"N\n\u0019UserBlockedUserCreatedEvt\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012 \n\fblocked_user\u0018\u0002 \u0001(\u000b2\n.user.User\"E\n\u0019UserBlockedUserDeletedEvt\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012\u0017\n\u000fblocked_user_id\u0018\u0002 \u0001(\u0003\"2\n\u0004User\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\u0003\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\u0012\u000b\n\u0003tag\u0018\u0003 \u0001(\t\"\u00ab\u0001\n\u0012EndpointProperties\u0012\u0016\n\u000eapplication_id\u0018\u0001 \u0001(\u0005\u0012\u0012\n\nactivities\u0018\u0002 \u0003(\t\u00128\n\bmetadata\u0018\u0003 \u0003(\u000b2&.user.EndpointProperties.MetadataEntry\u001a/\n\rMetadataEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\"j\n\u0006Friend\u0012\u0018\n\u0004user\u0018\u0001 \u0001(\u000b2\n.user.User\u0012!\n\u0005group\u0018\u0002 \u0001(\u000b2\u0012.user.Friend.Group\u0012\f\n\u0004note\u0018\u0003 \u0001(\t\u001a\u0015\n\u0005Group\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\"&\n\bUserList\u0012\u001a\n\u0006values\u0018\u0001 \u0003(\u000b2\n.user.User\"*\n\nFriendList\u0012\u001c\n\u0006values\u0018\u0001 \u0003(\u000b2\f.user.Friend\"5\n\u000fFriendGroupList\u0012\"\n\u0006values\u0018\u0001 \u0003(\u000b2\u0012.user.Friend.Group*'\n\fUserPresence\u0012\n\n\u0006Online\u0010\u0000\u0012\u000b\n\u0007Offline\u0010\u0001*/\n\nUserStatus\u0012\r\n\tAvailable\u0010\u0000\u0012\b\n\u0004Away\u0010\u0001\u0012\b\n\u0004Busy\u0010\u0002B/\n-com.ankama.wakfu.chat.endpoint.spin2.protocolb\u0006proto3"};
        al_2 al_22 = new al_2();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0], (Descriptors.FileDescriptor.InternalDescriptorAssigner)al_22);
        a = (Descriptors.Descriptor)ak_2.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"UserId", "Status"});
        c = (Descriptors.Descriptor)ak_2.a().getMessageTypes().get(1);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"UserId", "Properties"});
        e = (Descriptors.Descriptor)ak_2.a().getMessageTypes().get(2);
        f = new GeneratedMessageV3.FieldAccessorTable(e, new String[]{"UserId"});
        g = (Descriptors.Descriptor)ak_2.a().getMessageTypes().get(3);
        h = new GeneratedMessageV3.FieldAccessorTable(g, new String[]{"UserId", "Friend"});
        i = (Descriptors.Descriptor)ak_2.a().getMessageTypes().get(4);
        j = new GeneratedMessageV3.FieldAccessorTable(i, new String[]{"UserId"});
        k = (Descriptors.Descriptor)ak_2.a().getMessageTypes().get(5);
        l = new GeneratedMessageV3.FieldAccessorTable(k, new String[]{"UserId", "FriendUserId"});
        m = (Descriptors.Descriptor)ak_2.a().getMessageTypes().get(6);
        n = new GeneratedMessageV3.FieldAccessorTable(m, new String[]{"UserId"});
        o = (Descriptors.Descriptor)ak_2.a().getMessageTypes().get(7);
        p = new GeneratedMessageV3.FieldAccessorTable(o, new String[]{"UserId", "Group"});
        q = (Descriptors.Descriptor)ak_2.a().getMessageTypes().get(8);
        r = new GeneratedMessageV3.FieldAccessorTable(q, new String[]{"UserId", "Name"});
        s = (Descriptors.Descriptor)ak_2.a().getMessageTypes().get(9);
        t = new GeneratedMessageV3.FieldAccessorTable(s, new String[]{"UserId"});
        u = (Descriptors.Descriptor)ak_2.a().getMessageTypes().get(10);
        v = new GeneratedMessageV3.FieldAccessorTable(u, new String[]{"UserId", "BlockedUserId"});
        w = (Descriptors.Descriptor)ak_2.a().getMessageTypes().get(11);
        x = new GeneratedMessageV3.FieldAccessorTable(w, new String[]{"UserId", "BlockedUserId"});
        y = (Descriptors.Descriptor)ak_2.a().getMessageTypes().get(12);
        z = new GeneratedMessageV3.FieldAccessorTable(y, new String[]{"UserId", "Presence"});
        A = (Descriptors.Descriptor)ak_2.a().getMessageTypes().get(13);
        B = new GeneratedMessageV3.FieldAccessorTable(A, new String[]{"UserId", "Status"});
        C = (Descriptors.Descriptor)ak_2.a().getMessageTypes().get(14);
        D = new GeneratedMessageV3.FieldAccessorTable(C, new String[]{"UserId", "Properties"});
        E = (Descriptors.Descriptor)ak_2.a().getMessageTypes().get(15);
        F = new GeneratedMessageV3.FieldAccessorTable(E, new String[]{"UserId", "Friend"});
        G = (Descriptors.Descriptor)ak_2.a().getMessageTypes().get(16);
        H = new GeneratedMessageV3.FieldAccessorTable(G, new String[]{"UserId", "Friend"});
        I = (Descriptors.Descriptor)ak_2.a().getMessageTypes().get(17);
        J = new GeneratedMessageV3.FieldAccessorTable(I, new String[]{"UserId", "FriendUserId"});
        K = (Descriptors.Descriptor)ak_2.a().getMessageTypes().get(18);
        L = new GeneratedMessageV3.FieldAccessorTable(K, new String[]{"UserId", "Group"});
        M = (Descriptors.Descriptor)ak_2.a().getMessageTypes().get(19);
        N = new GeneratedMessageV3.FieldAccessorTable(M, new String[]{"UserId", "Name"});
        O = (Descriptors.Descriptor)ak_2.a().getMessageTypes().get(20);
        P = new GeneratedMessageV3.FieldAccessorTable(O, new String[]{"UserId", "BlockedUser"});
        Q = (Descriptors.Descriptor)ak_2.a().getMessageTypes().get(21);
        R = new GeneratedMessageV3.FieldAccessorTable(Q, new String[]{"UserId", "BlockedUserId"});
        S = (Descriptors.Descriptor)ak_2.a().getMessageTypes().get(22);
        T = new GeneratedMessageV3.FieldAccessorTable(S, new String[]{"UserId", "Name", "Tag"});
        U = (Descriptors.Descriptor)ak_2.a().getMessageTypes().get(23);
        V = new GeneratedMessageV3.FieldAccessorTable(U, new String[]{"ApplicationId", "Activities", "Metadata"});
        W = (Descriptors.Descriptor)U.getNestedTypes().get(0);
        X = new GeneratedMessageV3.FieldAccessorTable(W, new String[]{"Key", "Value"});
        Y = (Descriptors.Descriptor)ak_2.a().getMessageTypes().get(24);
        Z = new GeneratedMessageV3.FieldAccessorTable(Y, new String[]{"User", "Group", "Note"});
        aa = (Descriptors.Descriptor)Y.getNestedTypes().get(0);
        ab = new GeneratedMessageV3.FieldAccessorTable(aa, new String[]{"Name"});
        ac = (Descriptors.Descriptor)ak_2.a().getMessageTypes().get(25);
        ad = new GeneratedMessageV3.FieldAccessorTable(ac, new String[]{"Values"});
        ae = (Descriptors.Descriptor)ak_2.a().getMessageTypes().get(26);
        af = new GeneratedMessageV3.FieldAccessorTable(ae, new String[]{"Values"});
        ag = (Descriptors.Descriptor)ak_2.a().getMessageTypes().get(27);
        ah = new GeneratedMessageV3.FieldAccessorTable(ag, new String[]{"Values"});
    }
}

