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
 * Renamed from MT
 */
public final class mt_2 {
    static final Descriptors.Descriptor a;
    static final GeneratedMessageV3.FieldAccessorTable b;
    static final Descriptors.Descriptor c;
    static final GeneratedMessageV3.FieldAccessorTable d;
    static Descriptors.FileDescriptor e;

    private mt_2() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        mt_2.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return e;
    }

    static {
        String[] stringArray = new String[]{"\n\fbasics.proto\"T\n\u0015IdentificationMessage\u0012\u0014\n\fplatformName\u0018\u0001 \u0002(\t\u0012\u0013\n\u000bserviceName\u0018\u0002 \u0002(\t\u0012\u0010\n\bserverId\u0018\u0003 \u0002(\u0005\"Z\n\u001bIdentificationResultMessage\u0012\u0014\n\fplatformName\u0018\u0001 \u0002(\t\u0012\u0013\n\u000bserviceName\u0018\u0002 \u0002(\t\u0012\u0010\n\bserverId\u0018\u0003 \u0002(\u0005B0\n\u001fcom.ankama.wakfu.utils.protobufB\rBasicMessages"};
        mu_2 mu_22 = new mu_2();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0], (Descriptors.FileDescriptor.InternalDescriptorAssigner)mu_22);
        a = (Descriptors.Descriptor)mt_2.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"PlatformName", "ServiceName", "ServerId"});
        c = (Descriptors.Descriptor)mt_2.a().getMessageTypes().get(1);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"PlatformName", "ServiceName", "ServerId"});
    }
}

