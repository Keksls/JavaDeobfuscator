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
 * Renamed from fX
 */
public final class fx_2 {
    static final Descriptors.Descriptor a;
    static final GeneratedMessageV3.FieldAccessorTable b;
    static Descriptors.FileDescriptor c;

    private fx_2() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        fx_2.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return c;
    }

    static {
        String[] stringArray = new String[]{"\n\u0018craft/artisansBook.proto\u001a accountData/craftInventory.proto\u001a\u0017craft/secureCraft.proto\"{\n\u0018ProtoArtisanInformations\u00126\n\u000fsecureCraftInfo\u0018\u0001 \u0002(\u000b2\u001d.ProtoSecureCraftInformations\u0012'\n\u000bserviceInfo\u0018\u0002 \u0001(\u000b2\u0012.ProtoCraftServiceB7\n\u001fcom.ankama.wakfu.protocol.craftB\u0014ProtobufArtisansBook"};
        fy_2 fy_22 = new fy_2();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[]{dn_1.a(), gd_2.a()}, (Descriptors.FileDescriptor.InternalDescriptorAssigner)fy_22);
        a = (Descriptors.Descriptor)fx_2.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"SecureCraftInfo", "ServiceInfo"});
        dn_1.a();
        gd_2.a();
    }
}

