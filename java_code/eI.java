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

public final class eI {
    static final Descriptors.Descriptor a;
    static final GeneratedMessageV3.FieldAccessorTable b;
    static final Descriptors.Descriptor c;
    static final GeneratedMessageV3.FieldAccessorTable d;
    static Descriptors.FileDescriptor e;

    private eI() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        eI.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return e;
    }

    static {
        String[] stringArray = new String[]{"\n\u0010buildSheet.proto\"{\n\u0012ProtoBuildSheetSet\u0012\u0018\n\u0010activeSheetIndex\u0018\u0001 \u0002(\u0005\u0012%\n\u000bbuildSheets\u0018\u0002 \u0003(\u000b2\u0010.ProtoBuildSheet\u0012\u001e\n\u0012previousSheetIndex\u0018\u0004 \u0001(\u0005:\u0002-2J\u0004\b\u0003\u0010\u0004\"|\n\u000fProtoBuildSheet\u0012\r\n\u0005index\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004name\u0018\u0002 \u0002(\t\u0012\r\n\u0005level\u0018\u0003 \u0002(\u0005\u0012\u0011\n\ticonIndex\u0018\u0007 \u0002(\u0005\u0012\u0018\n\tpermanent\u0018\b \u0001(\b:\u0005falseJ\u0004\b\u0004\u0010\u0005J\u0004\b\u0005\u0010\u0006J\u0004\b\u0006\u0010\u0007B:\n$com.ankama.wakfu.protocol.buildSheetB\u0012ProtobufBuildSheet"};
        eJ eJ2 = new eJ();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0], (Descriptors.FileDescriptor.InternalDescriptorAssigner)eJ2);
        a = (Descriptors.Descriptor)eI.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"ActiveSheetIndex", "BuildSheets", "PreviousSheetIndex"});
        c = (Descriptors.Descriptor)eI.a().getMessageTypes().get(1);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"Index", "Name", "Level", "IconIndex", "Permanent"});
    }
}

