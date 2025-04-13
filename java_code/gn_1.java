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
 * Renamed from gN
 */
public final class gn_1 {
    static final Descriptors.Descriptor a;
    static final GeneratedMessageV3.FieldAccessorTable b;
    static final Descriptors.Descriptor c;
    static final GeneratedMessageV3.FieldAccessorTable d;
    static final Descriptors.Descriptor e;
    static final GeneratedMessageV3.FieldAccessorTable f;
    static Descriptors.FileDescriptor g;

    private gn_1() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        gn_1.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return g;
    }

    static {
        String[] stringArray = new String[]{"\n\u0015dungeon/dungeon.proto\"\u00d8\u0001\n\fProtoDungeon\u0012\u0010\n\bmaxLevel\u0018\u0001 \u0002(\u0005\u0012\u0017\n\u000fdifficultyLevel\u0018\u0002 \u0002(\u0005\u0012\u001d\n\u0015isDifficultyAvailable\u0018\u0003 \u0002(\b\u0012\u001d\n\u0015canIncreaseDifficulty\u0018\u0004 \u0002(\b\u0012\u0019\n\u0011isfightInProgress\u0018\u0005 \u0002(\b\u0012\u001e\n\u0016isCompetitiveCancelled\u0018\u0006 \u0002(\b\u0012\u0012\n\nallowedIds\u0018\u0007 \u0003(\u0003\u0012\u0010\n\bminLevel\u0018\b \u0002(\u0005\"E\n\u0016ProtoPartyInstanceInfo\u0012+\n\u0005entry\u0018\u0001 \u0003(\u000b2\u001c.ProtoPartyInstanceInfoEntry\"P\n\u001bProtoPartyInstanceInfoEntry\u0012\r\n\u0005index\u0018\u0001 \u0002(\u0003\u0012\"\n\u000bdungeonInfo\u0018\u0002 \u0002(\u000b2\r.ProtoDungeonB4\n!com.ankama.wakfu.protocol.dungeonB\u000fProtobufDungeon"};
        go_2 go_22 = new go_2();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0], (Descriptors.FileDescriptor.InternalDescriptorAssigner)go_22);
        a = (Descriptors.Descriptor)gn_1.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"MaxLevel", "DifficultyLevel", "IsDifficultyAvailable", "CanIncreaseDifficulty", "IsfightInProgress", "IsCompetitiveCancelled", "AllowedIds", "MinLevel"});
        c = (Descriptors.Descriptor)gn_1.a().getMessageTypes().get(1);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"Entry"});
        e = (Descriptors.Descriptor)gn_1.a().getMessageTypes().get(2);
        f = new GeneratedMessageV3.FieldAccessorTable(e, new String[]{"Index", "DungeonInfo"});
    }
}

