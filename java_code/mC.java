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

public final class mC {
    static final Descriptors.Descriptor a;
    static final GeneratedMessageV3.FieldAccessorTable b;
    static final Descriptors.Descriptor c;
    static final GeneratedMessageV3.FieldAccessorTable d;
    static Descriptors.FileDescriptor e;

    private mC() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        mC.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return e;
    }

    static {
        String[] stringArray = new String[]{"\n\u0014market_history.proto\u001a\nitem.proto\u001a\u0012market_entry.proto\"\u008c\u0001\n\u0018ProtoHistorySearchResult\u0012$\n\npagination\u0018\u0001 \u0002(\u000b2\u0010.ProtoPagination\u0012.\n\u0010history_elements\u0018\u0002 \u0003(\u000b2\u0014.ProtoHistoryElement\u0012\u001a\n\u0012market_server_time\u0018\u0003 \u0002(\u0003\"\u00b8\u0001\n\u0013ProtoHistoryElement\u0012\u000b\n\u0003uid\u0018\u0001 \u0002(\u0003\u0012&\n\u0004type\u0018\u0002 \u0002(\u000e2\u0018.ProtoHistoryElementType\u0012\u0012\n\naccount_id\u0018\u0003 \u0002(\u0003\u0012\u0013\n\u000btotal_price\u0018\u0004 \u0002(\u0003\u0012\u0016\n\u000etotal_quantity\u0018\u0005 \u0002(\u0005\u0012\u0011\n\ttimestamp\u0018\u0006 \u0002(\u0003\u0012\u0018\n\u0004item\u0018\u0007 \u0002(\u000b2\n.ProtoItem*W\n\u0017ProtoHistoryElementType\u0012\u0011\n\rEXPIRED_ENTRY\u0010\u0000\u0012\b\n\u0004SALE\u0010\u0001\u0012\u0011\n\rEXPIRED_OFFER\u0010\u0002\u0012\f\n\bPURCHASE\u0010\u0003B>\n%com.ankama.wakfu.protocol.item.marketB\u0015ProtobufMarketHistory"};
        mD mD2 = new mD();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[]{kM.a(), mk.a()}, (Descriptors.FileDescriptor.InternalDescriptorAssigner)mD2);
        a = (Descriptors.Descriptor)mC.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"Pagination", "HistoryElements", "MarketServerTime"});
        c = (Descriptors.Descriptor)mC.a().getMessageTypes().get(1);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"Uid", "Type", "AccountId", "TotalPrice", "TotalQuantity", "Timestamp", "Item"});
        kM.a();
        mk.a();
    }
}

