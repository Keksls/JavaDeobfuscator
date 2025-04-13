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
 * Renamed from dn
 */
public final class dn_1 {
    static final Descriptors.Descriptor a;
    static final GeneratedMessageV3.FieldAccessorTable b;
    static final Descriptors.Descriptor c;
    private static final GeneratedMessageV3.FieldAccessorTable d;
    static final Descriptors.Descriptor e;
    static final GeneratedMessageV3.FieldAccessorTable f;
    static final Descriptors.Descriptor g;
    static final GeneratedMessageV3.FieldAccessorTable h;
    static final Descriptors.Descriptor i;
    static final GeneratedMessageV3.FieldAccessorTable j;
    static final Descriptors.Descriptor k;
    static final GeneratedMessageV3.FieldAccessorTable l;
    static final Descriptors.Descriptor m;
    private static final GeneratedMessageV3.FieldAccessorTable n;
    static final Descriptors.Descriptor o;
    static final GeneratedMessageV3.FieldAccessorTable p;
    static final Descriptors.Descriptor q;
    static final GeneratedMessageV3.FieldAccessorTable r;
    static final Descriptors.Descriptor s;
    private static final GeneratedMessageV3.FieldAccessorTable t;
    static final Descriptors.Descriptor u;
    private static final GeneratedMessageV3.FieldAccessorTable v;
    static final Descriptors.Descriptor w;
    static final GeneratedMessageV3.FieldAccessorTable x;
    static Descriptors.FileDescriptor y;

    private dn_1() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        dn_1.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return y;
    }

    static {
        String[] stringArray = new String[]{"\n accountData/craftInventory.proto\"\u00cc\u0001\n\u0013ProtoCraftInventory\u00120\n\u0006crafts\u0018\u0001 \u0003(\u000b2 .ProtoCraftInventory.CraftsEntry\u0012(\n\fcraftService\u0018\u0002 \u0001(\u000b2\u0012.ProtoCraftService\u0012\u001d\n\u0004fees\u0018\u0003 \u0001(\u000b2\u000f.ProtoCraftFees\u001a:\n\u000bCraftsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0005\u0012\u001a\n\u0005value\u0018\u0002 \u0001(\u000b2\u000b.ProtoCraft:\u00028\u0001\"d\n\nProtoCraft\u0012\n\n\u0002xp\u0018\u0001 \u0002(\u0003\u0012$\n\bcounters\u0018\u0002 \u0002(\u000b2\u0012.ProtoCraftCounter\u0012$\n\u000elearnedRecipes\u0018\u0003 \u0003(\u000b2\f.ProtoRecipe\"y\n\u0011ProtoCraftCounter\u0012\u0013\n\u000bseedCounter\u0018\u0001 \u0001(\u0005\u0012\u001a\n\u0012endResourceCounter\u0018\u0002 \u0001(\u0005\u0012\u001c\n\u0014grossResourceCounter\u0018\u0003 \u0001(\u0005\u0012\u0015\n\rrecipeCounter\u0018\u0004 \u0001(\u0005\"\u001f\n\u000bProtoRecipe\u0012\u0010\n\brecipeId\u0018\u0001 \u0002(\u0005\"\u00f8\u0001\n\u0011ProtoCraftService\u0012\u000f\n\u0007enabled\u0018\u0001 \u0002(\b\u0012@\n\u000fcraftDirectives\u0018\u0002 \u0003(\u000b2'.ProtoCraftService.CraftDirectivesEntry\u001aZ\n\u0014CraftDirectivesEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0005\u00121\n\u0005value\u0018\u0002 \u0001(\u000b2\".ProtoCraftService.CraftDirectives:\u00028\u0001\u001a4\n\u000fCraftDirectives\u0012\u000f\n\u0007enabled\u0018\u0001 \u0002(\b\u0012\u0010\n\bminLevel\u0018\u0002 \u0001(\u0005\"\u00b0\u0002\n\u000eProtoCraftFees\u0012/\n\bstepFees\u0018\u0001 \u0003(\u000b2\u001d.ProtoCraftFees.StepFeesEntry\u00129\n\rexceptionFees\u0018\u0002 \u0003(\u000b2\".ProtoCraftFees.ExceptionFeesEntry\u0012\u0016\n\u000eisFreeForGuild\u0018\u0003 \u0002(\b\u0012\u001f\n\u0010stepsFallthrough\u0018\u0004 \u0001(\b:\u0005false\u001aC\n\rStepFeesEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0005\u0012!\n\u0005value\u0018\u0002 \u0001(\u000b2\u0012.ProtoStepCraftFee:\u00028\u0001\u001a4\n\u0012ExceptionFeesEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005value\u0018\u0002 \u0001(\u0005:\u00028\u0001\"I\n\u0011ProtoStepCraftFee\u0012\u0019\n\u0011equipmentCraftFee\u0018\u0001 \u0002(\u0005\u0012\u0019\n\u0011componentCraftFee\u0018\u0002 \u0002(\u0005B?\n%com.ankama.wakfu.protocol.accountDataB\u0016ProtobufCraftInventory"};
        do_1 do_12 = new do_1();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[0], (Descriptors.FileDescriptor.InternalDescriptorAssigner)do_12);
        a = (Descriptors.Descriptor)dn_1.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"Crafts", "CraftService", "Fees"});
        c = (Descriptors.Descriptor)a.getNestedTypes().get(0);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"Key", "Value"});
        e = (Descriptors.Descriptor)dn_1.a().getMessageTypes().get(1);
        f = new GeneratedMessageV3.FieldAccessorTable(e, new String[]{"Xp", "Counters", "LearnedRecipes"});
        g = (Descriptors.Descriptor)dn_1.a().getMessageTypes().get(2);
        h = new GeneratedMessageV3.FieldAccessorTable(g, new String[]{"SeedCounter", "EndResourceCounter", "GrossResourceCounter", "RecipeCounter"});
        i = (Descriptors.Descriptor)dn_1.a().getMessageTypes().get(3);
        j = new GeneratedMessageV3.FieldAccessorTable(i, new String[]{"RecipeId"});
        k = (Descriptors.Descriptor)dn_1.a().getMessageTypes().get(4);
        l = new GeneratedMessageV3.FieldAccessorTable(k, new String[]{"Enabled", "CraftDirectives"});
        m = (Descriptors.Descriptor)k.getNestedTypes().get(0);
        n = new GeneratedMessageV3.FieldAccessorTable(m, new String[]{"Key", "Value"});
        o = (Descriptors.Descriptor)k.getNestedTypes().get(1);
        p = new GeneratedMessageV3.FieldAccessorTable(o, new String[]{"Enabled", "MinLevel"});
        q = (Descriptors.Descriptor)dn_1.a().getMessageTypes().get(5);
        r = new GeneratedMessageV3.FieldAccessorTable(q, new String[]{"StepFees", "ExceptionFees", "IsFreeForGuild", "StepsFallthrough"});
        s = (Descriptors.Descriptor)q.getNestedTypes().get(0);
        t = new GeneratedMessageV3.FieldAccessorTable(s, new String[]{"Key", "Value"});
        u = (Descriptors.Descriptor)q.getNestedTypes().get(1);
        v = new GeneratedMessageV3.FieldAccessorTable(u, new String[]{"Key", "Value"});
        w = (Descriptors.Descriptor)dn_1.a().getMessageTypes().get(6);
        x = new GeneratedMessageV3.FieldAccessorTable(w, new String[]{"EquipmentCraftFee", "ComponentCraftFee"});
    }
}

