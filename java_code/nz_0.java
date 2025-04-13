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
 * Renamed from nZ
 */
public final class nz_0 {
    static final Descriptors.Descriptor a;
    static final GeneratedMessageV3.FieldAccessorTable b;
    static final Descriptors.Descriptor c;
    private static final GeneratedMessageV3.FieldAccessorTable d;
    static final Descriptors.Descriptor e;
    static final GeneratedMessageV3.FieldAccessorTable f;
    static final Descriptors.Descriptor g;
    static final GeneratedMessageV3.FieldAccessorTable h;
    static Descriptors.FileDescriptor i;

    private nz_0() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        nz_0.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return i;
    }

    static {
        String[] stringArray = new String[]{"\n\raccount.proto\"\\\n\u0006Status\u0012#\n\u0006status\u0018\u0001 \u0003(\u000b2\u0013.Status.StatusEntry\u001a-\n\u000bStatusEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\"-\n\u0018AccountConnectionMessage\u0012\u0011\n\taccountId\u0018\u0002 \u0002(\u0003\"0\n\u001bAccountDisconnectionMessage\u0012\u0011\n\taccountId\u0018\u0002 \u0002(\u0003B-\n\"com.ankama.wakfu.protocol.protobufB\u0007Account"};
        oa_0 oa_02 = new oa_0();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0], (Descriptors.FileDescriptor.InternalDescriptorAssigner)oa_02);
        a = (Descriptors.Descriptor)nz_0.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"Status"});
        c = (Descriptors.Descriptor)a.getNestedTypes().get(0);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"Key", "Value"});
        e = (Descriptors.Descriptor)nz_0.a().getMessageTypes().get(1);
        f = new GeneratedMessageV3.FieldAccessorTable(e, new String[]{"AccountId"});
        g = (Descriptors.Descriptor)nz_0.a().getMessageTypes().get(2);
        h = new GeneratedMessageV3.FieldAccessorTable(g, new String[]{"AccountId"});
    }
}

