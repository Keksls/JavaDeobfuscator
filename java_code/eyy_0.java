/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableCollection
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.google.common.collect.ImmutableCollection;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eYY
 */
public final class eyy_0 {
    public static final int a = 10000;
    private static final Logger b = Logger.getLogger(eyy_0.class);

    private eyy_0() {
    }

    public static byte[] a(eyz_0 eyz_02) {
        return eyy_0.c(eyz_02).o().i().toByteArray();
    }

    public static byte[] b(eyz_0 eyz_02) {
        return eyy_0.c(eyz_02).i().toByteArray();
    }

    public static ii c(eyz_0 eyz_02) {
        exh_2[] exh_2Array;
        ii ii2 = ig.h();
        ii2.f(eyz_02.c());
        for (exh_2 exh_22 : exh_2Array = exh_2.values()) {
            Long l = eyz_02.a(exh_22);
            if (l == null) continue;
            ii2.a(ij.g().a(exh_22.a()).a(l));
        }
        return ii2;
    }

    public static eyz_0 a(byte[] byArray) {
        ig ig2;
        try {
            ig2 = ig.a(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            b.error((Object)("[Build] Unable to parse equipment sheet data " + Arrays.toString(byArray)), (Throwable)invalidProtocolBufferException);
            return new eyz_0();
        }
        return eyy_0.a(ig2);
    }

    @NotNull
    private static eyz_0 a(ig ig2) {
        eyz_0 eyz_02 = new eyz_0();
        if (ig2.e()) {
            eyz_02.a((short)ig2.f());
        }
        List<ij> list = ig2.b();
        for (ij ij2 : list) {
            eyz_02.a(exh_2.a((byte)ij2.e()), ij2.c());
        }
        return eyz_02;
    }

    public static ib_0 a(eZb eZb2) {
        id id2 = ib_0.h().a(eZb2.c());
        Map<Integer, eyz_0> map = eZb2.a();
        map.forEach((n, eyz_02) -> id2.b((int)n, eyy_0.c(eyz_02).i()));
        return id2.i();
    }

    public static byte[] a(Collection<eZb> collection) {
        hV hV2 = hT.f();
        for (eZb eZb2 : collection) {
            hV2.a(eyy_0.a(eZb2));
        }
        return hV2.g().toByteArray();
    }

    private static eZb a(ib_0 ib_02) {
        eZb eZb2 = new eZb(ib_02.f());
        Map<Integer, ig> map = ib_02.d();
        map.forEach((n, ig2) -> eZb2.a((int)n, eyy_0.a(ig2)));
        return eZb2;
    }

    public static List<eZb> b(byte[] byArray) {
        hT hT2;
        ArrayList<eZb> arrayList = new ArrayList<eZb>();
        try {
            hT2 = hT.a(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            b.error((Object)("Unable to parse ProtoEquipmentAccount from data: " + Arrays.toString(byArray)), (Throwable)invalidProtocolBufferException);
            return arrayList;
        }
        List<ib_0> list = hT2.b();
        for (ib_0 ib_02 : list) {
            eZb eZb2 = eyy_0.a(ib_02);
            arrayList.add(eZb2);
        }
        return arrayList;
    }

    public static byte[] a(eyt_0 eyt_02) {
        hz_0 hz_02 = hx_0.f();
        if (eyt_02.b() > 0) {
            ImmutableCollection immutableCollection = eyt_02.a().values();
            for (exk_2 exk_22 : immutableCollection) {
                if (exk_22 == null) {
                    b.fatal((Object)("Null item during EquipmentInventory serialization, inventory characterId : " + eyt_02.c()));
                    continue;
                }
                hz_02.a(eyl_1.b(exk_22));
            }
        }
        return hz_02.g().toByteArray();
    }

    public static hx_0 c(byte[] byArray) {
        try {
            return hx_0.a(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            b.error((Object)"Unable to decode EquipmentInventory", (Throwable)invalidProtocolBufferException);
            return null;
        }
    }

    public static eyt_0 a(long l, byte[] byArray) {
        hx_0 hx_02 = eyy_0.c(byArray);
        if (hx_02 == null) {
            b.error((Object)("Can't parse EquipmentInventory for character " + l));
            return null;
        }
        return eyy_0.a(l, hx_02);
    }

    @NotNull
    public static eyt_0 a(long l, @NotNull hx_0 hx_02) {
        eyt_0 eyt_02 = new eyt_0(l);
        List<le_0> list = hx_02.b();
        for (le_0 le_02 : list) {
            exk_2 exk_22 = eyl_1.a(le_02);
            if (exk_22 == null) {
                b.error((Object)("Null item unserializing EquipmentInventory, uniqueId " + le_02.c() + ", refId " + le_02.e()));
                continue;
            }
            eyt_02.a(exk_22);
        }
        return eyt_02;
    }
}

