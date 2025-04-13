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
 * Renamed from fr
 */
public final class fr_1 {
    static final Descriptors.Descriptor a;
    static final GeneratedMessageV3.FieldAccessorTable b;
    static final Descriptors.Descriptor c;
    private static final GeneratedMessageV3.FieldAccessorTable d;
    static final Descriptors.Descriptor e;
    static final GeneratedMessageV3.FieldAccessorTable f;
    static final Descriptors.Descriptor g;
    private static final GeneratedMessageV3.FieldAccessorTable h;
    static final Descriptors.Descriptor i;
    private static final GeneratedMessageV3.FieldAccessorTable j;
    static final Descriptors.Descriptor k;
    static final GeneratedMessageV3.FieldAccessorTable l;
    static final Descriptors.Descriptor m;
    static final GeneratedMessageV3.FieldAccessorTable n;
    static final Descriptors.Descriptor o;
    static final GeneratedMessageV3.FieldAccessorTable p;
    static final Descriptors.Descriptor q;
    static final GeneratedMessageV3.FieldAccessorTable r;
    static final Descriptors.Descriptor s;
    private static final GeneratedMessageV3.FieldAccessorTable t;
    static Descriptors.FileDescriptor u;

    private fr_1() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        fr_1.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return u;
    }

    static {
        String[] stringArray = new String[]{"\n#accountData/cosmeticInventory.proto\"\u00d1\u0001\n\u0016ProtoCosmeticInventory\u0012K\n\u0012cosmeticCategories\u0018\u0001 \u0003(\u000b2/.ProtoCosmeticInventory.CosmeticCategoriesEntry\u0012\u0017\n\u000fnoHatCharacters\u0018\u0002 \u0003(\u0003\u001aQ\n\u0017CosmeticCategoriesEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0005\u0012%\n\u0005value\u0018\u0002 \u0001(\u000b2\u0016.ProtoCosmeticCategory:\u00028\u0001\"\u00f3\u0002\n\u0015ProtoCosmeticCategory\u0012)\n\rcosmeticItems\u0018\u0001 \u0003(\u000b2\u0012.ProtoCosmeticItem\u0012F\n\u000eoldActiveItems\u0018\u0002 \u0003(\u000b2*.ProtoCosmeticCategory.OldActiveItemsEntryB\u0002\u0018\u0001\u0012\u0017\n\u000bnewsItemIds\u0018\u0003 \u0003(\u0005B\u0002\u0010\u0001\u0012<\n\u000bactiveItems\u0018\u0004 \u0003(\u000b2'.ProtoCosmeticCategory.ActiveItemsEntry\u001aI\n\u0013OldActiveItemsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0003\u0012!\n\u0005value\u0018\u0002 \u0001(\u000b2\u0012.ProtoCosmeticItem:\u00028\u0001\u001aE\n\u0010ActiveItemsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0003\u0012 \n\u0005value\u0018\u0002 \u0001(\u000b2\u0011.ProtoActiveItems:\u00028\u0001\";\n\u0010ProtoActiveItems\u0012'\n\u000bactiveItems\u0018\u0001 \u0003(\u000b2\u0012.ProtoCosmeticItem\"N\n\u0011ProtoCosmeticItem\u0012\u0011\n\titemRefId\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005color\u0018\u0002 \u0001(\u0005\u0012\u0011\n\taccessory\u0018\u0003 \u0001(\u0005J\u0004\b\u0004\u0010\u0005\"0\n\u0012ProtoCosmeticItems\u0012\u001a\n\u0012cosmeticItemRefIds\u0018\u0001 \u0003(\u0005\"\u00c9\u0001\n ProtoCosmeticItemsWithCategories\u0012U\n\u0012cosmeticCategories\u0018\u0001 \u0003(\u000b29.ProtoCosmeticItemsWithCategories.CosmeticCategoriesEntry\u001aN\n\u0017CosmeticCategoriesEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0005\u0012\"\n\u0005value\u0018\u0002 \u0001(\u000b2\u0013.ProtoCosmeticItems:\u00028\u0001*\u00d0\u0002\n\fCosmeticType\u0012\u000e\n\nMOUNT_SKIN\u0010\u0001\u0012\f\n\bPET_SKIN\u0010\u0002\u0012\u0012\n\u000ePLAYER_COSTUME\u0010\u0003\u0012\u0011\n\rPLAYER_SPRINT\u0010\u0004\u0012\u0013\n\u000fPLAYER_FINISHER\u0010\u0005\u0012\u000f\n\u000bPLAYER_AURA\u0010\u0006\u0012\u0010\n\fPLAYER_TITLE\u0010\u0007\u0012\u0014\n\u0010PLAYER_HEAD_SKIN\u0010\b\u0012\u0015\n\u0011PLAYER_CHEST_SKIN\u0010\t\u0012\u0018\n\u0014PLAYER_SHOULDER_SKIN\u0010\n\u0012\u0014\n\u0010PLAYER_BACK_SKIN\u0010\u000b\u0012\u0015\n\u0011PLAYER_BOOTS_SKIN\u0010\f\u0012\u001c\n\u0018PLAYER_FIRST_WEAPON_SKIN\u0010\r\u0012\u001d\n\u0019PLAYER_SECOND_WEAPON_SKIN\u0010\u000e\u0012\u0012\n\u000eHAVEN_BAG_SKIN\u0010\u000fB@\n#com.ankama.wakfu.protocol.cosmeticsB\u0019ProtobufCosmeticInventory"};
        fs_1 fs_12 = new fs_1();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0], (Descriptors.FileDescriptor.InternalDescriptorAssigner)fs_12);
        a = (Descriptors.Descriptor)fr_1.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"CosmeticCategories", "NoHatCharacters"});
        c = (Descriptors.Descriptor)a.getNestedTypes().get(0);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"Key", "Value"});
        e = (Descriptors.Descriptor)fr_1.a().getMessageTypes().get(1);
        f = new GeneratedMessageV3.FieldAccessorTable(e, new String[]{"CosmeticItems", "OldActiveItems", "NewsItemIds", "ActiveItems"});
        g = (Descriptors.Descriptor)e.getNestedTypes().get(0);
        h = new GeneratedMessageV3.FieldAccessorTable(g, new String[]{"Key", "Value"});
        i = (Descriptors.Descriptor)e.getNestedTypes().get(1);
        j = new GeneratedMessageV3.FieldAccessorTable(i, new String[]{"Key", "Value"});
        k = (Descriptors.Descriptor)fr_1.a().getMessageTypes().get(2);
        l = new GeneratedMessageV3.FieldAccessorTable(k, new String[]{"ActiveItems"});
        m = (Descriptors.Descriptor)fr_1.a().getMessageTypes().get(3);
        n = new GeneratedMessageV3.FieldAccessorTable(m, new String[]{"ItemRefId", "Color", "Accessory"});
        o = (Descriptors.Descriptor)fr_1.a().getMessageTypes().get(4);
        p = new GeneratedMessageV3.FieldAccessorTable(o, new String[]{"CosmeticItemRefIds"});
        q = (Descriptors.Descriptor)fr_1.a().getMessageTypes().get(5);
        r = new GeneratedMessageV3.FieldAccessorTable(q, new String[]{"CosmeticCategories"});
        s = (Descriptors.Descriptor)q.getNestedTypes().get(0);
        t = new GeneratedMessageV3.FieldAccessorTable(s, new String[]{"Key", "Value"});
    }
}

