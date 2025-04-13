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
 * Renamed from io
 */
public final class io_0 {
    static final Descriptors.Descriptor a;
    static final GeneratedMessageV3.FieldAccessorTable b;
    static final Descriptors.Descriptor c;
    static final GeneratedMessageV3.FieldAccessorTable d;
    static final Descriptors.Descriptor e;
    static final GeneratedMessageV3.FieldAccessorTable f;
    static final Descriptors.Descriptor g;
    static final GeneratedMessageV3.FieldAccessorTable h;
    static final Descriptors.Descriptor i;
    static final GeneratedMessageV3.FieldAccessorTable j;
    static final Descriptors.Descriptor k;
    static final GeneratedMessageV3.FieldAccessorTable l;
    static final Descriptors.Descriptor m;
    static final GeneratedMessageV3.FieldAccessorTable n;
    static final Descriptors.Descriptor o;
    static final GeneratedMessageV3.FieldAccessorTable p;
    static Descriptors.FileDescriptor q;

    private io_0() {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void a(ExtensionRegistry extensionRegistry) {
        io_0.a((ExtensionRegistryLite)extensionRegistry);
    }

    public static Descriptors.FileDescriptor a() {
        return q;
    }

    static {
        String[] stringArray = new String[]{"\n\u0013fight/effects.proto\u001a\u0012fight/spells.proto\"\u00df\u0002\n\u0012ProtoRunningEffect\u0012\u0010\n\buniqueId\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007baseUid\u0018\u0002 \u0002(\u0003\u0012\u0017\n\u000fgenericEffectId\u0018\u0003 \u0002(\u0005\u0012\r\n\u0005value\u0018\u0004 \u0002(\u0005\u0012\u0019\n\ntargetCell\u0018\u0005 \u0001(\u000b2\u0005.Cell\u0012\u0010\n\bcasterId\u0018\u0006 \u0001(\u0003\u0012\u0010\n\btargetId\u0018\u0007 \u0001(\u0003\u0012)\n\u000fadditionalDatas\u0018\b \u0001(\u000b2\u0010.AdditionalDatas\u0012\u001b\n\u0013effectContainerType\u0018\t \u0001(\u0005\u0012\u0019\n\u0011effectContainerId\u0018\n \u0001(\u0003\u0012+\n\u0010gameSpecificData\u0018\u000b \u0001(\u000b2\u0011.GameSpecificData\u0012/\n\u0012specificTargetData\u0018\f \u0001(\u000b2\u0013.SpecificTargetData\"'\n\u0004Cell\u0012\t\n\u0001x\u0018\u0001 \u0002(\u0005\u0012\t\n\u0001y\u0018\u0002 \u0002(\u0005\u0012\t\n\u0001z\u0018\u0003 \u0002(\u0005\"\u0098\u0001\n\u0010GameSpecificData\u0012!\n\u0019notifyUnapplicationForced\u0018\u0001 \u0002(\b\u0012\u0017\n\u000fexecutionStatus\u0018\u0002 \u0002(\u0005\u0012\u001d\n\tfightTime\u0018\u0003 \u0002(\u000b2\n.FightTime\u0012\u0017\n\u000fremainingTimeMs\u0018\u0004 \u0002(\u0003\u0012\u0010\n\bexecuted\u0018\u0005 \u0002(\b\"F\n\tFightTime\u0012\u0011\n\tfighterId\u0018\u0001 \u0002(\u0003\u0012\u0011\n\ttableTurn\u0018\u0002 \u0002(\u0005\u0012\u0013\n\u000batEndOfTurn\u0018\u0003 \u0002(\b\"\u007f\n\u0012SpecificTargetData\u0012\u0014\n\fbaseUniqueId\u0018\u0001 \u0001(\u0003\u0012\u0019\n\u0011currentHourAreaId\u0018\u0002 \u0001(\u0005\u0012\u0012\n\nsystemHour\u0018\u0003 \u0001(\u0005\u0012\u0013\n\u000bnewTargetId\u0018\u0004 \u0001(\u0003\u0012\u000f\n\u0007breedId\u0018\u0005 \u0001(\u0005\"\u00b3\u0005\n\u000fAdditionalDatas\u0012\u000f\n\u0007rawData\u0018\u0001 \u0001(\f\u0012\r\n\u0005value\u0018\n \u0001(\u0005\u0012\u000f\n\u0007stateId\u0018\u000b \u0001(\u0005\u0012\u0010\n\bcharacId\u0018\f \u0001(\u0005\u0012\u0010\n\buniqueId\u0018\r \u0001(\u0003\u0012\r\n\u0005level\u0018\u000e \u0001(\u0005\u0012\u001a\n\ntargetCell\u0018\u000f \u0001(\u000b2\u0006.Point\u0012\u0017\n\u000ftargetDirection\u0018\u0010 \u0001(\u0005\u0012\u0017\n\u000fwhatYouWantBool\u0018\u0011 \u0001(\b\u0012\u001c\n\u0014whatYouWantOtherBool\u0018\u0012 \u0001(\b\u0012\u0016\n\u000ewhatYouWantInt\u0018\u0013 \u0001(\u0005\u0012\u001b\n\u0013whatYouWantOtherInt\u0018\u0014 \u0001(\u0005\u0012\u0017\n\u000fwhatYouWantLong\u0018\u0015 \u0001(\u0003\u0012\u001c\n\u0014whatYouWantOtherLong\u0018\u0016 \u0001(\u0003\u0012\u001f\n\u000fwhatYouWantCell\u0018\u0017 \u0001(\u000b2\u0006.Point\u0012\u0018\n\u0010whatYouWantFloat\u0018\u0018 \u0001(\u0002\u0012\u0013\n\u000boriginValue\u0018\u0019 \u0001(\u0005\u0012\u0015\n\rapplyOnCaster\u0018\u001e \u0001(\b\u0012\u0017\n\u000faddCurrentValue\u0018\u001f \u0001(\b\u0012\u001c\n\u0014subtractCurrentValue\u0018  \u0001(\b\u0012\u0010\n\bexecuted\u0018! \u0001(\b\u0012\"\n\u001amodifyValueOnUnapplication\u0018\" \u0001(\b\u0012 \n\u0018modifyValueOnApplication\u0018# \u0001(\b\u0012\u001b\n\u0013isBuffInsteadOfGain\u0018& \u0001(\b\u0012\u0011\n\tstartDate\u00182 \u0001(\u0003\u0012\u0013\n\u0004path\u0018F \u0001(\u000b2\u0005.Path\u0012)\n\u000fspellsInventory\u0018G \u0001(\u000b2\u0010.SpellsInventory\"(\n\u0005Point\u0012\t\n\u0001x\u0018\u0001 \u0002(\u0005\u0012\t\n\u0001y\u0018\u0002 \u0002(\u0005\u0012\t\n\u0001z\u0018\u0003 \u0002(\u0005\"\u001e\n\u0004Path\u0012\u0016\n\u0006points\u0018\u0001 \u0003(\u000b2\u0006.PointB:\n'com.ankama.wakfu.protocol.fight.effectsB\u000fProtobufEffects"};
        ip ip2 = new ip();
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom((String[])stringArray, (Descriptors.FileDescriptor[])new Descriptors.FileDescriptor[]{zo_2.a()}, (Descriptors.FileDescriptor.InternalDescriptorAssigner)ip2);
        a = (Descriptors.Descriptor)io_0.a().getMessageTypes().get(0);
        b = new GeneratedMessageV3.FieldAccessorTable(a, new String[]{"UniqueId", "BaseUid", "GenericEffectId", "Value", "TargetCell", "CasterId", "TargetId", "AdditionalDatas", "EffectContainerType", "EffectContainerId", "GameSpecificData", "SpecificTargetData"});
        c = (Descriptors.Descriptor)io_0.a().getMessageTypes().get(1);
        d = new GeneratedMessageV3.FieldAccessorTable(c, new String[]{"X", "Y", "Z"});
        e = (Descriptors.Descriptor)io_0.a().getMessageTypes().get(2);
        f = new GeneratedMessageV3.FieldAccessorTable(e, new String[]{"NotifyUnapplicationForced", "ExecutionStatus", "FightTime", "RemainingTimeMs", "Executed"});
        g = (Descriptors.Descriptor)io_0.a().getMessageTypes().get(3);
        h = new GeneratedMessageV3.FieldAccessorTable(g, new String[]{"FighterId", "TableTurn", "AtEndOfTurn"});
        i = (Descriptors.Descriptor)io_0.a().getMessageTypes().get(4);
        j = new GeneratedMessageV3.FieldAccessorTable(i, new String[]{"BaseUniqueId", "CurrentHourAreaId", "SystemHour", "NewTargetId", "BreedId"});
        k = (Descriptors.Descriptor)io_0.a().getMessageTypes().get(5);
        l = new GeneratedMessageV3.FieldAccessorTable(k, new String[]{"RawData", "Value", "StateId", "CharacId", "UniqueId", "Level", "TargetCell", "TargetDirection", "WhatYouWantBool", "WhatYouWantOtherBool", "WhatYouWantInt", "WhatYouWantOtherInt", "WhatYouWantLong", "WhatYouWantOtherLong", "WhatYouWantCell", "WhatYouWantFloat", "OriginValue", "ApplyOnCaster", "AddCurrentValue", "SubtractCurrentValue", "Executed", "ModifyValueOnUnapplication", "ModifyValueOnApplication", "IsBuffInsteadOfGain", "StartDate", "Path", "SpellsInventory"});
        m = (Descriptors.Descriptor)io_0.a().getMessageTypes().get(6);
        n = new GeneratedMessageV3.FieldAccessorTable(m, new String[]{"X", "Y", "Z"});
        o = (Descriptors.Descriptor)io_0.a().getMessageTypes().get(7);
        p = new GeneratedMessageV3.FieldAccessorTable(o, new String[]{"Points"});
        zo_2.a();
    }
}

