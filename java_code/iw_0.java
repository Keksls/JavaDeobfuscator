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
 * Renamed from iW
 */
public final class iw_0 {
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
    static Descriptors.FileDescriptor q;

    private iw_0() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        iw_0.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return q;
    }

    static {
        String[] stringArray = new String[]{"\n\u0012fight/report.proto\"\u00d4\u0002\n\u000bFightReport\u0012\u000f\n\u0007fightId\u0018\u0001 \u0002(\u0003\u0012\u0010\n\bduration\u0018\u0002 \u0002(\u0003\u0012\u0011\n\tturnCount\u0018\u0003 \u0002(\u0005\u0012\u0014\n\fwinnerTeamId\u0018\u0004 \u0002(\u0005\u0012!\n\rinitiatorTeam\u0018\u0005 \u0002(\u000b2\n.FightTeam\u0012\u001d\n\totherTeam\u0018\u0006 \u0002(\u000b2\n.FightTeam\u0012\u0013\n\u000binitiatorId\u0018\u0007 \u0002(\u0003\u0012\u0012\n\nfightModel\u0018\b \u0002(\u0005\u0012\u0013\n\u000bstasisLevel\u0018\t \u0001(\u0005\u0012\u0011\n\twaveCount\u0018\n \u0001(\u0005\u0012\u0018\n\u0010waveMonsterCount\u0018\u000b \u0001(\u0005\u0012\u0015\n\rrealWaveCount\u0018\f \u0001(\u0005\u0012\u001c\n\u0014realWaveMonsterCount\u0018\r \u0001(\u0005\u0012\u0017\n\u000ffightInstanceId\u0018\u000e \u0002(\u0003\"[\n\tFightTeam\u0012\u000e\n\u0006teamId\u0018\u0001 \u0002(\u0005\u0012\u001d\n\u0007players\u0018\u0002 \u0003(\u000b2\f.FightPlayer\u0012\u001f\n\bmonsters\u0018\u0003 \u0003(\u000b2\r.FightMonster\"\u00c4\u0001\n\u000bFightPlayer\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0003\u0012\u0011\n\taccountId\u0018\u0002 \u0002(\u0003\u0012\f\n\u0004name\u0018\u0003 \u0002(\t\u0012\u000f\n\u0007breedId\u0018\u0004 \u0002(\u0005\u0012\u000e\n\u0006isMale\u0018\u0005 \u0002(\b\u0012\u000e\n\u0006isHero\u0018\u0006 \u0002(\b\u0012\u0019\n\u0005loots\u0018\u0007 \u0003(\u000b2\n.FightLoot\u0012\u0017\n\u0006xpInfo\u0018\b \u0001(\u000b2\u0007.XpInfo\u0012\u0013\n\u000bgainedKamas\u0018\t \u0001(\u0005\u0012\u000e\n\u0006isDead\u0018\n \u0001(\b\"\u0089\u0001\n\fFightMonster\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0003\u0012\u0016\n\u000eownerAccountId\u0018\u0002 \u0001(\u0003\u0012\u000f\n\u0007breedId\u0018\u0003 \u0002(\u0005\u0012\u0019\n\u0005loots\u0018\u0004 \u0003(\u000b2\n.FightLoot\u0012\u0017\n\u0006xpInfo\u0018\u0005 \u0001(\u000b2\u0007.XpInfo\u0012\u0010\n\bquantity\u0018\u0006 \u0001(\u0005\"X\n\tFightLoot\u0012\u0011\n\titemRefId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bquantity\u0018\u0002 \u0002(\u0005\u0012\u0013\n\u000bisPurseLoot\u0018\u0003 \u0001(\b\u0012\u0011\n\tisPvpLoot\u0018\u0004 \u0001(\b\"\u009b\u0001\n\u0006XpInfo\u0012\r\n\u0005endXp\u0018\u0001 \u0001(\u0003\u0012\r\n\u0005wonXp\u0018\u0002 \u0001(\u0003\u0012\u0011\n\tisBoosted\u0018\u0004 \u0001(\b\u0012\u0012\n\nstartLevel\u0018\u0005 \u0001(\u0005\u0012\u0010\n\bendLevel\u0018\u0006 \u0001(\u0005\u0012\u0017\n\u000fdownscaledLevel\u0018\u0007 \u0001(\u0005\u0012\u001b\n\u0013wonXpWithoutBooster\u0018\b \u0001(\u0003J\u0004\b\u0003\u0010\u0004\"C\n\u0014SavagePvpStealReport\u0012+\n\u0007entries\u0018\u0001 \u0003(\u000b2\u001a.SavagePvpStealReportEntry\"I\n\u0019SavagePvpStealReportEntry\u0012\u0011\n\taccountId\u0018\u0001 \u0002(\u0003\u0012\u0019\n\u0005loots\u0018\u0002 \u0003(\u000b2\n.FightLootB=\n&com.ankama.wakfu.protocol.fight.reportB\u0013ProtobufFightReport"};
        ix_0 ix_02 = new ix_0();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0], (Descriptors.FileDescriptor.InternalDescriptorAssigner)ix_02);
        a = (Descriptors.Descriptor)iw_0.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"FightId", "Duration", "TurnCount", "WinnerTeamId", "InitiatorTeam", "OtherTeam", "InitiatorId", "FightModel", "StasisLevel", "WaveCount", "WaveMonsterCount", "RealWaveCount", "RealWaveMonsterCount", "FightInstanceId"});
        c = (Descriptors.Descriptor)iw_0.a().getMessageTypes().get(1);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"TeamId", "Players", "Monsters"});
        e = (Descriptors.Descriptor)iw_0.a().getMessageTypes().get(2);
        f = new GeneratedMessageV3.FieldAccessorTable(e, new String[]{"Id", "AccountId", "Name", "BreedId", "IsMale", "IsHero", "Loots", "XpInfo", "GainedKamas", "IsDead"});
        g = (Descriptors.Descriptor)iw_0.a().getMessageTypes().get(3);
        h = new GeneratedMessageV3.FieldAccessorTable(g, new String[]{"Id", "OwnerAccountId", "BreedId", "Loots", "XpInfo", "Quantity"});
        i = (Descriptors.Descriptor)iw_0.a().getMessageTypes().get(4);
        j = new GeneratedMessageV3.FieldAccessorTable(i, new String[]{"ItemRefId", "Quantity", "IsPurseLoot", "IsPvpLoot"});
        k = (Descriptors.Descriptor)iw_0.a().getMessageTypes().get(5);
        l = new GeneratedMessageV3.FieldAccessorTable(k, new String[]{"EndXp", "WonXp", "IsBoosted", "StartLevel", "EndLevel", "DownscaledLevel", "WonXpWithoutBooster"});
        m = (Descriptors.Descriptor)iw_0.a().getMessageTypes().get(6);
        n = new GeneratedMessageV3.FieldAccessorTable(m, new String[]{"Entries"});
        o = (Descriptors.Descriptor)iw_0.a().getMessageTypes().get(7);
        p = new GeneratedMessageV3.FieldAccessorTable(o, new String[]{"AccountId", "Loots"});
    }
}

