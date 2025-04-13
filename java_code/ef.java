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

public final class ef {
    static final Descriptors.Descriptor a;
    static final GeneratedMessageV3.FieldAccessorTable b;
    static final Descriptors.Descriptor c;
    private static final GeneratedMessageV3.FieldAccessorTable d;
    static final Descriptors.Descriptor e;
    static final GeneratedMessageV3.FieldAccessorTable f;
    static final Descriptors.Descriptor g;
    static final GeneratedMessageV3.FieldAccessorTable h;
    static Descriptors.FileDescriptor i;

    private ef() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        ef.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return i;
    }

    static {
        String[] stringArray = new String[]{"\n\u000eaptitude.proto\"n\n\bSheetSet\u0012%\n\u0006sheets\u0018\u0002 \u0003(\u000b2\u0015.SheetSet.SheetsEntry\u001a5\n\u000bSheetsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0005\u0012\u0015\n\u0005value\u0018\u0002 \u0001(\u000b2\u0006.Sheet:\u00028\u0001J\u0004\b\u0001\u0010\u0002\"G\n\u0005Sheet\u0012\r\n\u0005level\u0018\u0003 \u0001(\u0005\u0012\u001d\n\u0005bonus\u0018\u0004 \u0003(\u000b2\u000e.LevelsByBonusJ\u0004\b\u0001\u0010\u0002J\u0004\b\u0002\u0010\u0003J\u0004\b\u0005\u0010\u0006\"/\n\rLevelsByBonus\u0012\u000f\n\u0007bonusId\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0002 \u0002(\u0005B6\n\"com.ankama.wakfu.protocol.aptitudeB\u0010ProtobufAptitude"};
        eg eg2 = new eg();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0], (Descriptors.FileDescriptor.InternalDescriptorAssigner)eg2);
        a = (Descriptors.Descriptor)ef.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"Sheets"});
        c = (Descriptors.Descriptor)a.getNestedTypes().get(0);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"Key", "Value"});
        e = (Descriptors.Descriptor)ef.a().getMessageTypes().get(1);
        f = new GeneratedMessageV3.FieldAccessorTable(e, new String[]{"Level", "Bonus"});
        g = (Descriptors.Descriptor)ef.a().getMessageTypes().get(2);
        h = new GeneratedMessageV3.FieldAccessorTable(g, new String[]{"BonusId", "Level"});
    }
}

