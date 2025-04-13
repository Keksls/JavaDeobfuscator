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

public final class kM {
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
    static Descriptors.FileDescriptor G;

    private kM() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        kM.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return G;
    }

    static {
        String[] stringArray = new String[]{"\n\nitem.proto\"\u00c2\u0002\n\tProtoItem\u0012\u0010\n\buniqueId\u0018\u0001 \u0002(\u0003\u0012\r\n\u0005refId\u0018\u0002 \u0002(\u0005\u0012\u000b\n\u0003qty\u0018\u0003 \u0002(\u0005\u0012\u0016\n\u0003pet\u00182 \u0001(\u000b2\t.ProtoPet\u0012\u0018\n\u0002xp\u00183 \u0001(\u000b2\f.ProtoItemXp\u0012\u001a\n\u0005shard\u00184 \u0001(\u000b2\u000b.ProtoShard\u0012*\n\rcompanionInfo\u00186 \u0001(\u000b2\u0013.ProtoCompanionInfo\u0012\u001c\n\u0004bind\u00187 \u0001(\u000b2\u000e.ProtoItemBind\u0012$\n\belements\u00188 \u0001(\u000b2\u0012.ProtoItemElements\u0012&\n\u000bmergedItems\u00189 \u0001(\u000b2\u0011.ProtoMergedItems\u0012\u001b\n\u0013mimiSymbicSkinRefId\u0018: \u0001(\u0005J\u0004\b5\u00106\"\u00d6\u0001\n\bProtoPet\u0012\u0014\n\fdefinitionId\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004name\u0018\u0002 \u0002(\t\u0012\u0016\n\u000ecolorItemRefId\u0018\u0003 \u0002(\u0005\u0012\u0019\n\u0011equippedRefItemId\u0018\u0004 \u0002(\u0005\u0012\u000e\n\u0006health\u0018\u0005 \u0002(\u0005\u0012\n\n\u0002xp\u0018\u0006 \u0002(\u0005\u0012\u0014\n\flastMealDate\u0018\u0007 \u0002(\u0003\u0012\u0016\n\u000elastHungryDate\u0018\b \u0002(\u0003\u0012\u0016\n\u000esleepRefItemId\u0018\t \u0002(\u0005\u0012\u0011\n\tsleepdate\u0018\n \u0002(\u0003\"3\n\u000bProtoItemXp\u0012\u0014\n\fdefinitionId\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006itemXp\u0018\u0002 \u0002(\u0003\"\u00fd\u0002\n\nProtoShard\u0012.\n\nshardSlots\u0018\u0001 \u0003(\u000b2\u001a.ProtoShard.ProtoShardSlot\u00127\n\u000eadditionalGems\u0018\u0002 \u0003(\u000b2\u001f.ProtoShard.ProtoAdditionalGems\u0012\u0019\n\u0011sublimationItemId\u0018\u0003 \u0001(\u0005\u0012 \n\u0018specialSublimationItemId\u0018\u0004 \u0001(\u0005\u0012\u0013\n\u0007charges\u0018\t \u0001(\u0005:\u0002-1\u001ab\n\u000eProtoShardSlot\u0012\u0010\n\bposition\u0018\n \u0002(\u0005\u0012\u0015\n\rslottedItemId\u0018\u000b \u0002(\u0005\u0012\u0011\n\tslotColor\u0018\f \u0001(\u0005\u0012\u0014\n\fshardsAmount\u0018\u000e \u0001(\u0005\u001a8\n\u0013ProtoAdditionalGems\u0012\u0012\n\npropertyId\u0018\u0014 \u0002(\u0005\u0012\r\n\u0005refId\u0018\u0015 \u0002(\u0005J\u0004\b\u0005\u0010\u0006J\u0004\b\u0006\u0010\u0007J\u0004\b\u0007\u0010\bJ\u0004\b\b\u0010\t\" \n\u0012ProtoCompanionInfo\u0012\n\n\u0002xp\u0018\u0001 \u0002(\u0003\".\n\rProtoItemBind\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007applied\u0018\u0002 \u0002(\b\"G\n\u0011ProtoItemElements\u0012\u0016\n\u000edamageElements\u0018\u0001 \u0002(\u0005\u0012\u001a\n\u0012resistanceElements\u0018\u0002 \u0002(\u0005\"-\n\u0010ProtoMergedItems\u0012\u0019\n\u0005items\u0018\u0001 \u0003(\u000b2\n.ProtoItem\":\n\fProtoBagItem\u0012\u0018\n\u0004item\u0018\u0001 \u0002(\u000b2\n.ProtoItem\u0012\u0010\n\bposition\u0018\u0002 \u0002(\u0005\"l\n\bProtoBag\u0012\u0010\n\buniqueId\u0018\u0001 \u0002(\u0003\u0012\r\n\u0005refId\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bposition\u0018\u0003 \u0002(\u0005\u0012\u000f\n\u0007maxSize\u0018\u0005 \u0002(\u0005\u0012\u001c\n\u0005items\u0018\u0006 \u0003(\u000b2\r.ProtoBagItem\"-\n\u0012ProtoCharacterBags\u0012\u0017\n\u0004bags\u0018\u0001 \u0003(\u000b2\t.ProtoBag\"4\n\u0017ProtoTemporaryInventory\u0012\u0019\n\u0005items\u0018\u0001 \u0003(\u000b2\n.ProtoItem\"C\n\u0015ProtoItemWithPosition\u0012\u0018\n\u0004item\u0018\u0001 \u0002(\u000b2\n.ProtoItem\u0012\u0010\n\bposition\u0018\u0002 \u0002(\u0005\"B\n\u0019ProtoItemWithPositionList\u0012%\n\u0005items\u0018\u0001 \u0003(\u000b2\u0016.ProtoItemWithPositionB.\n\u001ecom.ankama.wakfu.protocol.itemB\fProtobufItem"};
        kN kN2 = new kN();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0], (Descriptors.FileDescriptor.InternalDescriptorAssigner)kN2);
        a = (Descriptors.Descriptor)kM.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"UniqueId", "RefId", "Qty", "Pet", "Xp", "Shard", "CompanionInfo", "Bind", "Elements", "MergedItems", "MimiSymbicSkinRefId"});
        c = (Descriptors.Descriptor)kM.a().getMessageTypes().get(1);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"DefinitionId", "Name", "ColorItemRefId", "EquippedRefItemId", "Health", "Xp", "LastMealDate", "LastHungryDate", "SleepRefItemId", "Sleepdate"});
        e = (Descriptors.Descriptor)kM.a().getMessageTypes().get(2);
        f = new GeneratedMessageV3.FieldAccessorTable(e, new String[]{"DefinitionId", "ItemXp"});
        g = (Descriptors.Descriptor)kM.a().getMessageTypes().get(3);
        h = new GeneratedMessageV3.FieldAccessorTable(g, new String[]{"ShardSlots", "AdditionalGems", "SublimationItemId", "SpecialSublimationItemId", "Charges"});
        i = (Descriptors.Descriptor)g.getNestedTypes().get(0);
        j = new GeneratedMessageV3.FieldAccessorTable(i, new String[]{"Position", "SlottedItemId", "SlotColor", "ShardsAmount"});
        k = (Descriptors.Descriptor)g.getNestedTypes().get(1);
        l = new GeneratedMessageV3.FieldAccessorTable(k, new String[]{"PropertyId", "RefId"});
        m = (Descriptors.Descriptor)kM.a().getMessageTypes().get(4);
        n = new GeneratedMessageV3.FieldAccessorTable(m, new String[]{"Xp"});
        o = (Descriptors.Descriptor)kM.a().getMessageTypes().get(5);
        p = new GeneratedMessageV3.FieldAccessorTable(o, new String[]{"Type", "Applied"});
        q = (Descriptors.Descriptor)kM.a().getMessageTypes().get(6);
        r = new GeneratedMessageV3.FieldAccessorTable(q, new String[]{"DamageElements", "ResistanceElements"});
        s = (Descriptors.Descriptor)kM.a().getMessageTypes().get(7);
        t = new GeneratedMessageV3.FieldAccessorTable(s, new String[]{"Items"});
        u = (Descriptors.Descriptor)kM.a().getMessageTypes().get(8);
        v = new GeneratedMessageV3.FieldAccessorTable(u, new String[]{"Item", "Position"});
        w = (Descriptors.Descriptor)kM.a().getMessageTypes().get(9);
        x = new GeneratedMessageV3.FieldAccessorTable(w, new String[]{"UniqueId", "RefId", "Position", "MaxSize", "Items"});
        y = (Descriptors.Descriptor)kM.a().getMessageTypes().get(10);
        z = new GeneratedMessageV3.FieldAccessorTable(y, new String[]{"Bags"});
        A = (Descriptors.Descriptor)kM.a().getMessageTypes().get(11);
        B = new GeneratedMessageV3.FieldAccessorTable(A, new String[]{"Items"});
        C = (Descriptors.Descriptor)kM.a().getMessageTypes().get(12);
        D = new GeneratedMessageV3.FieldAccessorTable(C, new String[]{"Item", "Position"});
        E = (Descriptors.Descriptor)kM.a().getMessageTypes().get(13);
        F = new GeneratedMessageV3.FieldAccessorTable(E, new String[]{"Items"});
    }
}

