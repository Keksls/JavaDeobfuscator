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
 * Renamed from gt
 */
@Deprecated
public final class gt_1 {
    static final Descriptors.Descriptor a;
    static final GeneratedMessageV3.FieldAccessorTable b;
    static final Descriptors.Descriptor c;
    static final GeneratedMessageV3.FieldAccessorTable d;
    static Descriptors.FileDescriptor e;

    private gt_1() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        gt_1.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return e;
    }

    static {
        String[] stringArray = new String[]{"\n#dimensionalBag/dimensionalBag.proto\"\u0089\u0001\n\u001bProtoDimensionalBagCraftFee\u00124\n\u000bcategoryFee\u0018\u0001 \u0003(\u000b2\u001f.ProtoDimensionalBagCategoryFee\u0012\u0018\n\u0010isFreeForFriends\u0018\u0002 \u0002(\b\u0012\u0016\n\u000eisFreeForGuild\u0018\u0003 \u0002(\b:\u0002\u0018\u0001\"q\n\u001eProtoDimensionalBagCategoryFee\u0012\u0015\n\rcategoryIndex\u0018\u0001 \u0002(\u0005\u0012\u0019\n\u0011equipmentCraftFee\u0018\u0002 \u0002(\u0005\u0012\u0019\n\u0011componentCraftFee\u0018\u0003 \u0002(\u0005:\u0002\u0018\u0001BE\n(com.ankama.wakfu.protocol.dimensionalBagB\u0016ProtobufDimensionalBag\u00b8\u0001\u0001"};
        gu_1 gu_12 = new gu_1();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0], (Descriptors.FileDescriptor.InternalDescriptorAssigner)gu_12);
        a = (Descriptors.Descriptor)gt_1.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"CategoryFee", "IsFreeForFriends", "IsFreeForGuild"});
        c = (Descriptors.Descriptor)gt_1.a().getMessageTypes().get(1);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"CategoryIndex", "EquipmentCraftFee", "ComponentCraftFee"});
    }
}

