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
 * Renamed from eu
 */
public final class eu_2 {
    static final Descriptors.Descriptor a;
    static final GeneratedMessageV3.FieldAccessorTable b;
    static final Descriptors.Descriptor c;
    static final GeneratedMessageV3.FieldAccessorTable d;
    static final Descriptors.Descriptor e;
    static final GeneratedMessageV3.FieldAccessorTable f;
    static Descriptors.FileDescriptor g;

    private eu_2() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        eu_2.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return g;
    }

    static {
        String[] stringArray = new String[]{"\n%basics/worldAndDispatchProtocol.proto\"@\n\u0016WorldConnectionMessage\u0012\u000f\n\u0007version\u0018\u0001 \u0002(\f\u0012\u0015\n\rconfiguration\u0018\u0002 \u0002(\f\"3\n\u001bWorldConnectionErrorMessage\u0012\u0014\n\fuselessField\u0018\u0001 \u0002(\u0005\"6\n\u0012WorldStatusMessage\u0012\u0010\n\bserverId\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006locked\u0018\u0002 \u0002(\bBM\n1com.ankama.wakfu.protocol.basics.worldAndDispatchB\u0018WorldAndDispatchProtocol"};
        ev_2 ev_22 = new ev_2();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0], (Descriptors.FileDescriptor.InternalDescriptorAssigner)ev_22);
        a = (Descriptors.Descriptor)eu_2.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"Version", "Configuration"});
        c = (Descriptors.Descriptor)eu_2.a().getMessageTypes().get(1);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"UselessField"});
        e = (Descriptors.Descriptor)eu_2.a().getMessageTypes().get(2);
        f = new GeneratedMessageV3.FieldAccessorTable(e, new String[]{"ServerId", "Locked"});
    }
}

