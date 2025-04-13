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
 * Renamed from zY
 */
public final class zy_1 {
    static final Descriptors.Descriptor a;
    static final GeneratedMessageV3.FieldAccessorTable b;
    static final Descriptors.Descriptor c;
    static final GeneratedMessageV3.FieldAccessorTable d;
    static final Descriptors.Descriptor e;
    static final GeneratedMessageV3.FieldAccessorTable f;
    static Descriptors.FileDescriptor g;

    private zy_1() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        zy_1.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return g;
    }

    static {
        String[] stringArray = new String[]{"\n\u0011stele/stele.proto\"w\n\u0010SteleInformation\u0012\u000f\n\u0007steleId\u0018\u0001 \u0002(\u0005\u0012%\n\u0010steleRewardTiers\u0018\u0002 \u0003(\u000b2\u000b.RewardTier\u0012\u001b\n\u0013enabledDifficulties\u0018\u0003 \u0003(\u0005\u0012\u000e\n\u0006active\u0018\u0004 \u0002(\b\"\u007f\n\nRewardTier\u0012\u000e\n\u0006tierId\u0018\u0001 \u0002(\u0005\u0012#\n\rstaticRewards\u0018\u0002 \u0003(\u000b2\f.SteleReward\u0012$\n\u000edynamicRewards\u0018\u0003 \u0003(\u000b2\f.SteleReward\u0012\u0016\n\u000erequiredWeight\u0018\u0004 \u0002(\u0005\"R\n\u000bSteleReward\u0012\u0010\n\brewardId\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006itemId\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bquantity\u0018\u0003 \u0002(\u0005\u0012\u000f\n\u0007enabled\u0018\u0004 \u0002(\bB7\n\u001fcom.ankama.wakfu.protocol.steleB\u0014ProtobufSteleContent"};
        zz_1 zz_12 = new zz_1();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0], (Descriptors.FileDescriptor.InternalDescriptorAssigner)zz_12);
        a = (Descriptors.Descriptor)zy_1.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"SteleId", "SteleRewardTiers", "EnabledDifficulties", "Active"});
        c = (Descriptors.Descriptor)zy_1.a().getMessageTypes().get(1);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"TierId", "StaticRewards", "DynamicRewards", "RequiredWeight"});
        e = (Descriptors.Descriptor)zy_1.a().getMessageTypes().get(2);
        f = new GeneratedMessageV3.FieldAccessorTable(e, new String[]{"RewardId", "ItemId", "Quantity", "Enabled"});
    }
}

