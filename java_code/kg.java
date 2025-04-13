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

public final class kg {
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
    static Descriptors.FileDescriptor k;

    private kg() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        kg.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return k;
    }

    static {
        String[] stringArray = new String[]{"\n\u0013guild_storage.proto\u001a\nitem.proto\"S\n\u0011ProtoGuildStorage\u0012#\n\fcompartments\u0018\u0001 \u0003(\u000b2\r.Compartments\u0012\u0019\n\u0007history\u0018\u0002 \u0002(\u000b2\b.History\"^\n\fCompartments\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007enabled\u0018\u0002 \u0002(\b\u0012\u001c\n\u0005items\u0018\u0003 \u0003(\u000b2\r.ProtoBagItem\u0012\u0013\n\u000bbuildingUid\u0018\u0004 \u0001(\u0003\"\u00fd\u0001\n\u0007History\u0012*\n\u000bitemHistory\u0018\u0001 \u0003(\u000b2\u0015.History.HistoryEntry\u0012+\n\fmoneyHistory\u0018\u0002 \u0003(\u000b2\u0015.History.MoneyHistory\u001aW\n\fHistoryEntry\u0012\u0012\n\nplayerName\u0018\u0001 \u0002(\t\u0012\f\n\u0004date\u0018\u0002 \u0002(\u0003\u0012\u0018\n\u0004item\u0018\u0003 \u0002(\u000b2\n.ProtoItem\u0012\u000b\n\u0003qty\u0018\u0004 \u0002(\u0005\u001a@\n\fMoneyHistory\u0012\u0012\n\nplayerName\u0018\u0001 \u0002(\t\u0012\f\n\u0004date\u0018\u0002 \u0002(\u0003\u0012\u000e\n\u0006amount\u0018\u0003 \u0002(\u0003B?\n'com.ankama.wakfu.protocol.guild.storageB\u0014ProtobufGuildStorage"};
        kh kh2 = new kh();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[]{kM.a()}, (Descriptors.FileDescriptor.InternalDescriptorAssigner)kh2);
        a = (Descriptors.Descriptor)kg.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"Compartments", "History"});
        c = (Descriptors.Descriptor)kg.a().getMessageTypes().get(1);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"Id", "Enabled", "Items", "BuildingUid"});
        e = (Descriptors.Descriptor)kg.a().getMessageTypes().get(2);
        f = new GeneratedMessageV3.FieldAccessorTable(e, new String[]{"ItemHistory", "MoneyHistory"});
        g = (Descriptors.Descriptor)e.getNestedTypes().get(0);
        h = new GeneratedMessageV3.FieldAccessorTable(g, new String[]{"PlayerName", "Date", "Item", "Qty"});
        i = (Descriptors.Descriptor)e.getNestedTypes().get(1);
        j = new GeneratedMessageV3.FieldAccessorTable(i, new String[]{"PlayerName", "Date", "Amount"});
        kM.a();
    }
}

