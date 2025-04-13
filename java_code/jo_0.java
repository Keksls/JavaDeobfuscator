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
 * Renamed from jO
 */
public final class jo_0 {
    static final Descriptors.Descriptor a;
    static final GeneratedMessageV3.FieldAccessorTable b;
    static final Descriptors.Descriptor c;
    static final GeneratedMessageV3.FieldAccessorTable d;
    static final Descriptors.Descriptor e;
    static final GeneratedMessageV3.FieldAccessorTable f;
    static final Descriptors.Descriptor g;
    static final GeneratedMessageV3.FieldAccessorTable h;
    static Descriptors.FileDescriptor i;

    private jo_0() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        jo_0.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return i;
    }

    static {
        String[] stringArray = new String[]{"\n\u0016guild/guildModel.proto\"\u00f6\u0002\n\u000fProtoGuildModel\u0012\u000f\n\u0007guildId\u0018\u0001 \u0002(\u0003\u0012\r\n\u0005level\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006blazon\u0018\u0003 \u0002(\u0003\u0012\f\n\u0004name\u0018\u0005 \u0002(\t\u0012\u0013\n\u000bdescription\u0018\u0006 \u0002(\t\u0012\u000f\n\u0007message\u0018\u0007 \u0002(\t\u0012\u001a\n\u0012currentGuildPoints\u0018\b \u0002(\u0005\u0012\u0018\n\u0010totalGuildPoints\u0018\t \u0002(\u0005\u0012\u0019\n\u0011weeklyPointsLimit\u0018\n \u0002(\u0005\u0012\u0019\n\u0011earnedPointsLimit\u0018\u000b \u0002(\u0005\u0012\u001c\n\u0014lastEarningPointWeek\u0018\f \u0002(\u0005\u0012\u001e\n\u0005ranks\u0018\r \u0003(\u000b2\u000f.ProtoGuildRank\u0012\"\n\u0007members\u0018\u000e \u0003(\u000b2\u0011.ProtoGuildMember\u0012!\n\u0007bonuses\u0018\u000f \u0003(\u000b2\u0010.ProtoGuildBonusJ\u0004\b\u0004\u0010\u0005R\bnationId\"T\n\u000eProtoGuildRank\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0003\u0012\f\n\u0004name\u0018\u0002 \u0002(\t\u0012\u0016\n\u000eauthorizations\u0018\u0003 \u0002(\u0003\u0012\u0010\n\bposition\u0018\u0004 \u0002(\u0005\"\u008c\u0002\n\u0010ProtoGuildMember\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007ownerId\u0018\u0002 \u0002(\u0003\u0012\u0013\n\u000bguildPoints\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004rank\u0018\u0004 \u0002(\u0003\u0012\n\n\u0002xp\u0018\u0005 \u0002(\u0003\u0012\u0013\n\u000bisConnected\u0018\u0006 \u0002(\b\u0012\u000e\n\u0006smiley\u0018\u0007 \u0002(\f\u0012\u000b\n\u0003sex\u0018\b \u0002(\f\u0012\u000f\n\u0007breedId\u0018\t \u0002(\u0005\u0012\u0010\n\bnationId\u0018\n \u0002(\u0005\u0012\f\n\u0004name\u0018\u000b \u0002(\t\u0012\u0010\n\bsaveDate\u0018\f \u0002(\u0003\u0012\u001b\n\u0013serializedLanguages\u0018\r \u0002(\f\u0012\u001a\n\u0012accountCommunityId\u0018\u000e \u0002(\f\"F\n\u000fProtoGuildBonus\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u0016\n\u000eactivationDate\u0018\u0002 \u0002(\u0003\u0012\u000f\n\u0007buyDate\u0018\u0003 \u0002(\u0003B0\n\u001fcom.ankama.wakfu.protocol.guildB\rProtobufGuild"};
        jp_0 jp_02 = new jp_0();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0], (Descriptors.FileDescriptor.InternalDescriptorAssigner)jp_02);
        a = (Descriptors.Descriptor)jo_0.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"GuildId", "Level", "Blazon", "Name", "Description", "Message", "CurrentGuildPoints", "TotalGuildPoints", "WeeklyPointsLimit", "EarnedPointsLimit", "LastEarningPointWeek", "Ranks", "Members", "Bonuses"});
        c = (Descriptors.Descriptor)jo_0.a().getMessageTypes().get(1);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"Id", "Name", "Authorizations", "Position"});
        e = (Descriptors.Descriptor)jo_0.a().getMessageTypes().get(2);
        f = new GeneratedMessageV3.FieldAccessorTable(e, new String[]{"Id", "OwnerId", "GuildPoints", "Rank", "Xp", "IsConnected", "Smiley", "Sex", "BreedId", "NationId", "Name", "SaveDate", "SerializedLanguages", "AccountCommunityId"});
        g = (Descriptors.Descriptor)jo_0.a().getMessageTypes().get(3);
        h = new GeneratedMessageV3.FieldAccessorTable(g, new String[]{"Id", "ActivationDate", "BuyDate"});
    }
}

