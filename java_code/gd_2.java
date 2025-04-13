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
 * Renamed from gd
 */
public final class gd_2 {
    static final Descriptors.Descriptor a;
    static final GeneratedMessageV3.FieldAccessorTable b;
    static final Descriptors.Descriptor c;
    private static final GeneratedMessageV3.FieldAccessorTable d;
    static final Descriptors.Descriptor e;
    static final GeneratedMessageV3.FieldAccessorTable f;
    static Descriptors.FileDescriptor g;

    private gd_2() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        gd_2.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return g;
    }

    static {
        String[] stringArray = new String[]{"\n\u0017craft/secureCraft.proto\u001a accountData/craftInventory.proto\"\u00ba\u0001\n\u001cProtoSecureCraftInformations\u00129\n\u0006crafts\u0018\u0001 \u0003(\u000b2).ProtoSecureCraftInformations.CraftsEntry\u0012\u001d\n\u0004fees\u0018\u0002 \u0001(\u000b2\u000f.ProtoCraftFees\u001a@\n\u000bCraftsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0005\u0012 \n\u0005value\u0018\u0002 \u0001(\u000b2\u0011.ProtoPublicCraft:\u00028\u0001\"G\n\u0010ProtoPublicCraft\u0012\r\n\u0005level\u0018\u0001 \u0002(\u0005\u0012$\n\u000elearnedRecipes\u0018\u0002 \u0003(\u000b2\f.ProtoRecipeB6\n\u001fcom.ankama.wakfu.protocol.craftB\u0013ProtobufSecureCraft"};
        ge_2 ge_22 = new ge_2();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[]{dn_1.a()}, (Descriptors.FileDescriptor.InternalDescriptorAssigner)ge_22);
        a = (Descriptors.Descriptor)gd_2.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"Crafts", "Fees"});
        c = (Descriptors.Descriptor)a.getNestedTypes().get(0);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"Key", "Value"});
        e = (Descriptors.Descriptor)gd_2.a().getMessageTypes().get(1);
        f = new GeneratedMessageV3.FieldAccessorTable(e, new String[]{"Level", "LearnedRecipes"});
        dn_1.a();
    }
}

