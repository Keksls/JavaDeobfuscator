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
 * Renamed from Aw
 */
public final class aw_0 {
    static final Descriptors.Descriptor a;
    static final GeneratedMessageV3.FieldAccessorTable b;
    static final Descriptors.Descriptor c;
    static final GeneratedMessageV3.FieldAccessorTable d;
    static Descriptors.FileDescriptor e;

    private aw_0() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        aw_0.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return e;
    }

    static {
        String[] stringArray = new String[]{"\n\u001caccountData/transports.proto\"9\n\u000eTransportation\u0012'\n\u000fknownTransports\u0018\u0001 \u0003(\u000b2\u000e.TravelDetails\"?\n\rTravelDetails\u0012\u001c\n\u0004type\u0018\u0001 \u0002(\u000e2\u000e.TransportType\u0012\u0010\n\bknownIds\u0018\u0002 \u0003(\u0005*$\n\rTransportType\u0012\b\n\u0004ZAAP\u0010\u0001\u0012\t\n\u0005DRAGO\u0010\u0002B=\n#com.ankama.wakfu.protocol.transportB\u0016ProtobufTransportation"};
        ax_0 ax_02 = new ax_0();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0], (Descriptors.FileDescriptor.InternalDescriptorAssigner)ax_02);
        a = (Descriptors.Descriptor)aw_0.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"KnownTransports"});
        c = (Descriptors.Descriptor)aw_0.a().getMessageTypes().get(1);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"Type", "KnownIds"});
    }
}

