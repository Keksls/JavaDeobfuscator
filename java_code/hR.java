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

public final class hR {
    static final Descriptors.Descriptor a;
    static final GeneratedMessageV3.FieldAccessorTable b;
    static final Descriptors.Descriptor c;
    static final GeneratedMessageV3.FieldAccessorTable d;
    static final Descriptors.Descriptor e;
    static final GeneratedMessageV3.FieldAccessorTable f;
    static final Descriptors.Descriptor g;
    private static final GeneratedMessageV3.FieldAccessorTable h;
    static final Descriptors.Descriptor i;
    static final GeneratedMessageV3.FieldAccessorTable j;
    static final Descriptors.Descriptor k;
    static final GeneratedMessageV3.FieldAccessorTable l;
    static Descriptors.FileDescriptor m;

    private hR() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        hR.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return m;
    }

    static {
        String[] stringArray = new String[]{"\n\u000fequipment.proto\u001a\nitem.proto\"\u009d\u0001\n\u0013ProtoEquipmentSheet\u00126\n\u0005items\u0018\u0001 \u0003(\u000b2'.ProtoEquipmentSheet.ProtoEquipmentItem\u0012\r\n\u0005level\u00185 \u0001(\u0005\u001a3\n\u0012ProtoEquipmentItem\u0012\u000b\n\u0003uid\u0018\u0001 \u0002(\u0003\u0012\u0010\n\bposition\u0018\u0002 \u0002(\u0005J\u0004\b3\u00104J\u0004\b4\u00105\"\u009d\u0001\n\u0011ProtoEquipmentSet\u0012.\n\u0006sheets\u0018\u0001 \u0003(\u000b2\u001e.ProtoEquipmentSet.SheetsEntry\u0012\u0013\n\u000bcharacterId\u0018\u0002 \u0001(\u0003\u001aC\n\u000bSheetsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0005\u0012#\n\u0005value\u0018\u0002 \u0001(\u000b2\u0014.ProtoEquipmentSheet:\u00028\u0001\"9\n\u0015ProtoEquipmentAccount\u0012 \n\u0004sets\u0018\u0001 \u0003(\u000b2\u0012.ProtoEquipmentSet\"4\n\u0017ProtoEquipmentInventory\u0012\u0019\n\u0005items\u0018\u0001 \u0003(\u000b2\n.ProtoItemB8\n#com.ankama.wakfu.protocol.equipmentB\u0011ProtobufEquipment"};
        hS hS2 = new hS();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[]{kM.a()}, (Descriptors.FileDescriptor.InternalDescriptorAssigner)hS2);
        a = (Descriptors.Descriptor)hR.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"Items", "Level"});
        c = (Descriptors.Descriptor)a.getNestedTypes().get(0);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"Uid", "Position"});
        e = (Descriptors.Descriptor)hR.a().getMessageTypes().get(1);
        f = new GeneratedMessageV3.FieldAccessorTable(e, new String[]{"Sheets", "CharacterId"});
        g = (Descriptors.Descriptor)e.getNestedTypes().get(0);
        h = new GeneratedMessageV3.FieldAccessorTable(g, new String[]{"Key", "Value"});
        i = (Descriptors.Descriptor)hR.a().getMessageTypes().get(2);
        j = new GeneratedMessageV3.FieldAccessorTable(i, new String[]{"Sets"});
        k = (Descriptors.Descriptor)hR.a().getMessageTypes().get(3);
        l = new GeneratedMessageV3.FieldAccessorTable(k, new String[]{"Items"});
        kM.a();
    }
}

