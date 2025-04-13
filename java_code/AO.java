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

public final class AO {
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
    static Descriptors.FileDescriptor y;

    private AO() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        AO.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return y;
    }

    static {
        String[] stringArray = new String[]{"\n\rrewards.proto\u001a\nitem.proto\"\u00a2\u0001\n\u0011AddRewardsMessage\u0012;\n\u0007rewards\u0018\u0001 \u0003(\u000b2*.AddRewardsMessage.RewardsAccountContainer\u001aP\n\u0017RewardsAccountContainer\u0012\u0011\n\taccountId\u0018\u0001 \u0002(\u0003\u0012\"\n\u0007rewards\u0018\u0002 \u0002(\u000b2\u0011.RewardsContainer\"=\n\u0015ConsultRewardsMessage\u0012\u000f\n\u0007ownerId\u0018\u0001 \u0002(\u0003\u0012\u0013\n\u000bcharacterId\u0018\u0002 \u0001(\u0003\"I\n\u001bConsultRewardsResultMessage\u0012\u000f\n\u0007ownerId\u0018\u0001 \u0002(\u0003\u0012\u0019\n\u0007rewards\u0018\u0002 \u0002(\u000b2\b.Rewards\"c\n\u0014ConsumeRewardMessage\u0012\u000f\n\u0007ownerId\u0018\u0001 \u0002(\u0003\u0012\u0013\n\u000bcontainerId\u0018\u0002 \u0002(\t\u0012\u0010\n\brewardId\u0018\u0003 \u0001(\t\u0012\u0013\n\u000bcharacterId\u0018\u0004 \u0001(\u0003\"\u00ac\u0001\n\u0018ConsumeAllRewardsMessage\u0012\u000f\n\u0007ownerId\u0018\u0001 \u0002(\u0003\u0012\u0013\n\u000bcharacterId\u0018\u0002 \u0002(\u0003\u0012&\n\ncategories\u0018\u0003 \u0003(\u000e2\u0012.RewardsCategories\u0012\u001c\n\u0005types\u0018\u0004 \u0003(\u000e2\r.RewardsTypes\u0012\r\n\u0005limit\u0018\u0005 \u0001(\u0005\u0012\u0015\n\rcharacterOnly\u0018\u0006 \u0002(\b\"h\n\u001aConsumeRewardResultMessage\u0012\u000f\n\u0007ownerId\u0018\u0001 \u0002(\u0003\u0012$\n\tcontainer\u0018\u0002 \u0002(\u000b2\u0011.RewardsContainer\u0012\u0013\n\u000bcharacterId\u0018\u0003 \u0001(\u0003\"-\n\u0007Rewards\u0012\"\n\u0007rewards\u0018\u0001 \u0003(\u000b2\u0011.RewardsContainer\"\u00b6\u0001\n\u0010RewardsContainer\u0012\u0012\n\u0006OLD_id\u0018\u0001 \u0001(\u0003B\u0002\u0018\u0001\u0012'\n\u000bdescription\u0018\u0002 \u0002(\u000b2\u0012.ContainerMetadata\u0012\u001f\n\nitemReward\u0018\u0003 \u0003(\u000b2\u000b.ItemReward\u0012\u0013\n\u000bcharacterId\u0018\u0004 \u0001(\u0003\u0012!\n\fotherRewards\u0018\u0005 \u0003(\u000b2\u000b.BaseReward\u0012\f\n\u0004uuid\u0018\u0006 \u0001(\t\"8\n\nItemReward\u0012\r\n\u0005refId\u0018\u0001 \u0001(\u0005\u0012\u001b\n\u0006reward\u0018\u0002 \u0001(\u000b2\u000b.BaseReward\"w\n\nBaseReward\u0012\u0012\n\u0006OLD_id\u0018\u0001 \u0001(\u0003B\u0002\u0018\u0001\u0012\u001b\n\u0004type\u0018\u0002 \u0002(\u000e2\r.RewardsTypes\u0012\u0010\n\bquantity\u0018\u0004 \u0002(\u0003\u0012\u0018\n\u0004item\u0018\u0005 \u0001(\u000b2\n.ProtoItem\u0012\f\n\u0004uuid\u0018\u0006 \u0001(\t\"O\n\u0011ContainerMetadata\u0012$\n\bcategory\u0018\u0001 \u0002(\u000e2\u0012.RewardsCategories\u0012\u0014\n\fseasonNumber\u0018\u0002 \u0001(\u0005*X\n\u0011RewardsCategories\u0012\u0012\n\u000eDUNGEON_LADDER\u0010\u0001\u0012\u0010\n\fBATTLEGROUND\u0010\u0002\u0012\u000b\n\u0007COMMAND\u0010\u0003\u0012\u0010\n\fOGRINE_TOKEN\u0010\u0004*D\n\fRewardsTypes\u0012\b\n\u0004ITEM\u0010\u0001\u0012\u0006\n\u0002XP\u0010\u0002\u0012\t\n\u0005MERIT\u0010\u0003\u0012\r\n\tGLORY_ORB\u0010\u0004\u0012\b\n\u0004KAMA\u0010\u0005B4\n!com.ankama.wakfu.rewards.protocolB\u000fRewardsProtocol"};
        AP aP = new AP();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[]{kM.a()}, (Descriptors.FileDescriptor.InternalDescriptorAssigner)aP);
        a = (Descriptors.Descriptor)AO.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"Rewards"});
        c = (Descriptors.Descriptor)a.getNestedTypes().get(0);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"AccountId", "Rewards"});
        e = (Descriptors.Descriptor)AO.a().getMessageTypes().get(1);
        f = new GeneratedMessageV3.FieldAccessorTable(e, new String[]{"OwnerId", "CharacterId"});
        g = (Descriptors.Descriptor)AO.a().getMessageTypes().get(2);
        h = new GeneratedMessageV3.FieldAccessorTable(g, new String[]{"OwnerId", "Rewards"});
        i = (Descriptors.Descriptor)AO.a().getMessageTypes().get(3);
        j = new GeneratedMessageV3.FieldAccessorTable(i, new String[]{"OwnerId", "ContainerId", "RewardId", "CharacterId"});
        k = (Descriptors.Descriptor)AO.a().getMessageTypes().get(4);
        l = new GeneratedMessageV3.FieldAccessorTable(k, new String[]{"OwnerId", "CharacterId", "Categories", "Types", "Limit", "CharacterOnly"});
        m = (Descriptors.Descriptor)AO.a().getMessageTypes().get(5);
        n = new GeneratedMessageV3.FieldAccessorTable(m, new String[]{"OwnerId", "Container", "CharacterId"});
        o = (Descriptors.Descriptor)AO.a().getMessageTypes().get(6);
        p = new GeneratedMessageV3.FieldAccessorTable(o, new String[]{"Rewards"});
        q = (Descriptors.Descriptor)AO.a().getMessageTypes().get(7);
        r = new GeneratedMessageV3.FieldAccessorTable(q, new String[]{"OLDId", "Description", "ItemReward", "CharacterId", "OtherRewards", "Uuid"});
        s = (Descriptors.Descriptor)AO.a().getMessageTypes().get(8);
        t = new GeneratedMessageV3.FieldAccessorTable(s, new String[]{"RefId", "Reward"});
        u = (Descriptors.Descriptor)AO.a().getMessageTypes().get(9);
        v = new GeneratedMessageV3.FieldAccessorTable(u, new String[]{"OLDId", "Type", "Quantity", "Item", "Uuid"});
        w = (Descriptors.Descriptor)AO.a().getMessageTypes().get(10);
        x = new GeneratedMessageV3.FieldAccessorTable(w, new String[]{"Category", "SeasonNumber"});
        kM.a();
    }
}

