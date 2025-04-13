/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLite
 */
import com.google.protobuf.MessageLite;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.zip.CRC32;

/*
 * Renamed from am
 */
public enum am_2 {
    a(am_2.a("channel.ChannelMessage"), (MessageLite)j.o()),
    b(am_2.a("channel.ChannelMessageCreatedEvt"), (MessageLite)m_0.h()),
    c(am_2.a("channel.ChannelMessageList"), (MessageLite)q_0.h()),
    d(am_2.a("channel.CreateChannelMessageCmd"), (MessageLite)v_0.j()),
    e(am_2.a("channel.ListChannelMessagesCmd"), (MessageLite)z_0.m()),
    f(am_2.a("friend_invite.CreateFriendInviteCmd"), (MessageLite)H.m()),
    g(am_2.a("friend_invite.CreateFriendInviteCmd.RecipientUserNameAndTag"), (MessageLite)L.i()),
    h(am_2.a("friend_invite.DeleteFriendInviteCmd"), (MessageLite)Q.i()),
    i(am_2.a("friend_invite.FriendInvite"), (MessageLite)W.k()),
    j(am_2.a("friend_invite.FriendInviteCreatedEvt"), (MessageLite)Z.h()),
    k(am_2.a("friend_invite.FriendInviteDeletedEvt"), (MessageLite)ad_2.j()),
    l(am_2.a("friend_invite.FriendInviteList"), (MessageLite)ah_2.h()),
    m(am_2.a("user.CreateUserBlockedUserCmd"), (MessageLite)am_1.g()),
    n(am_2.a("user.CreateUserFriendGroupCmd"), (MessageLite)aq_2.i()),
    o(am_2.a("user.DeleteUserBlockedUserCmd"), (MessageLite)au_1.g()),
    p(am_2.a("user.DeleteUserFriendCmd"), (MessageLite)ay_1.g()),
    q(am_2.a("user.DeleteUserFriendGroupCmd"), (MessageLite)bc_1.h()),
    r(am_2.a("user.EndpointProperties"), (MessageLite)bg_2.k()),
    s(am_2.a("user.Friend"), (MessageLite)bl_1.m()),
    t(am_2.a("user.Friend.Group"), (MessageLite)bo_1.g()),
    u(am_2.a("user.FriendGroupList"), (MessageLite)bs_1.h()),
    v(am_2.a("user.FriendList"), (MessageLite)bw_2.h()),
    w(am_2.a("user.ListUserBlockedUsersCmd"), (MessageLite)bb_1.f()),
    x(am_2.a("user.ListUserFriendGroupsCmd"), (MessageLite)bf_2.f()),
    y(am_2.a("user.ListUserFriendInvitesCmd"), (MessageLite)bj_2.f()),
    z(am_2.a("user.ListUserFriendsCmd"), (MessageLite)bn_1.f()),
    A(am_2.a("user.UpdateUserEndpointPropertiesCmd"), (MessageLite)br_2.i()),
    B(am_2.a("user.UpdateUserFriendCmd"), (MessageLite)bv_2.i()),
    C(am_2.a("user.UpdateUserStatusCmd"), (MessageLite)bz_1.h()),
    D(am_2.a("user.User"), (MessageLite)cd_2.j()),
    E(am_2.a("user.UserBlockedUserCreatedEvt"), (MessageLite)cg_1.i()),
    F(am_2.a("user.UserBlockedUserDeletedEvt"), (MessageLite)ck_2.g()),
    G(am_2.a("user.UserEndpointPropertiesUpdatedEvt"), (MessageLite)co_1.i()),
    H(am_2.a("user.UserFriendCreatedEvt"), (MessageLite)cs_1.i()),
    I(am_2.a("user.UserFriendDeletedEvt"), (MessageLite)cw_2.g()),
    J(am_2.a("user.UserFriendGroupCreatedEvt"), (MessageLite)ca_1.i()),
    K(am_2.a("user.UserFriendGroupDeletedEvt"), (MessageLite)ce_2.h()),
    L(am_2.a("user.UserFriendUpdatedEvt"), (MessageLite)ci_1.i()),
    M(am_2.a("user.UserList"), (MessageLite)cm_1.h()),
    N(am_2.a("user.UserPresenceUpdatedEvt"), (MessageLite)ct_2.h()),
    O(am_2.a("user.UserStatusUpdatedEvt"), (MessageLite)cz_1.h());

    private final int P;
    private final MessageLite Q;

    private am_2(int n2, MessageLite messageLite) {
        this.P = n2;
        this.Q = messageLite;
    }

    private static int a(String string) {
        CRC32 cRC32 = new CRC32();
        byte[] byArray = string.getBytes(StandardCharsets.UTF_8);
        cRC32.update(byArray, 0, byArray.length);
        return Long.valueOf(cRC32.getValue()).intValue();
    }

    public static int a(MessageLite messageLite) {
        for (am_2 am_22 : am_2.values()) {
            if (am_22.Q.getClass() != messageLite.getClass()) continue;
            return am_22.P;
        }
        return 0;
    }

    public static Optional<MessageLite> a(long l) {
        for (am_2 am_22 : am_2.values()) {
            if ((long)am_22.P != l) continue;
            return Optional.of(am_22.Q);
        }
        return Optional.empty();
    }
}

