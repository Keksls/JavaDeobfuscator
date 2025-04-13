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

public final class mY {
    static final Descriptors.Descriptor a;
    static final GeneratedMessageV3.FieldAccessorTable b;
    static final Descriptors.Descriptor c;
    static final GeneratedMessageV3.FieldAccessorTable d;
    static Descriptors.FileDescriptor e;

    private mY() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        mY.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return e;
    }

    static {
        String[] stringArray = new String[]{"\n\u0015market_purchase.proto\u001a\nitem.proto\u001a\u0012market_entry.proto\"p\n\u001fProtoMarketPurchaseSearchResult\u0012$\n\npagination\u0018\u0001 \u0002(\u000b2\u0010.ProtoPagination\u0012'\n\tpurchases\u0018\u0002 \u0003(\u000b2\u0014.ProtoMarketPurchase\"\u0095\u0001\n\u0013ProtoMarketPurchase\u0012\u0014\n\fpurchase_uid\u0018\u0001 \u0002(\u0003\u0012\u0011\n\toffer_uid\u0018\u0002 \u0002(\u0003\u0012\u0018\n\u0004item\u0018\u0003 \u0002(\u000b2\n.ProtoItem\u0012\u0010\n\bquantity\u0018\u0004 \u0002(\u0005\u0012\u0012\n\nunit_price\u0018\u0005 \u0002(\u0003\u0012\u0015\n\rpurchase_time\u0018\u0006 \u0002(\u0003B?\n%com.ankama.wakfu.protocol.item.marketB\u0016ProtobufMarketPurchase"};
        mZ mZ2 = new mZ();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[]{kM.a(), mk.a()}, (Descriptors.FileDescriptor.InternalDescriptorAssigner)mZ2);
        a = (Descriptors.Descriptor)mY.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"Pagination", "Purchases"});
        c = (Descriptors.Descriptor)mY.a().getMessageTypes().get(1);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"PurchaseUid", "OfferUid", "Item", "Quantity", "UnitPrice", "PurchaseTime"});
        kM.a();
        mk.a();
    }
}

