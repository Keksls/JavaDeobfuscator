/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.Nullable
 */
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eYl
 */
public class eyl_1 {
    private static final Logger a = Logger.getLogger(eyl_1.class);

    @Nullable
    public static byte[] a(exk_2 exk_22) {
        if (exk_22 == null) {
            return null;
        }
        return eyl_1.b(exk_22).G().toByteArray();
    }

    public static lg a(vf_2 vf_22) {
        exk_2 exk_22 = new exk_2();
        exk_22.b(vf_22);
        return eyl_1.b(exk_22);
    }

    @Contract(value="null -> null")
    public static lg b(exk_2 exk_22) {
        Object object;
        GeneratedMessageV3.Builder builder;
        Object object2;
        if (exk_22 == null) {
            a.fatal((Object)"Trying to serialize a null item", (Throwable)new IllegalStateException(""));
            return null;
        }
        lg lg2 = le_0.F();
        lg2.a(exk_22.a()).a(exk_22.aT_()).b(exk_22.e());
        if (exk_22.aQ_()) {
            object2 = exk_22.f();
            builder = lg_0.x();
            object = object2.b();
            builder.a(object2.a().b()).a((String)(object == null ? "" : object)).b(object2.c()).c(object2.e()).d(object2.f()).e(object2.h()).a(object2.k().h()).b(object2.l().h()).f(object2.m()).c(object2.n().h());
            lg2.a((li_0)builder);
        }
        if (exk_22.w()) {
            if (exk_22.x().a() != null) {
                lg2.a(ly.g().a(exk_22.x().a().a()).a(exk_22.x().b()));
            } else {
                lg2.a(ly.g().a(exk_22.T().W()).a(0L));
            }
        }
        if (exk_22.y()) {
            lg2.a(eyl_1.c(exk_22));
        }
        if (exk_22.an()) {
            lg2.a(la.e().a(exk_22.am().a()));
        }
        if (exk_22.aa()) {
            object2 = exk_22.n();
            lg2.a(lh_0.g().a(object2.a().a()).a(object2.c()));
        }
        if (exk_22.ak()) {
            object2 = exk_22.al();
            lg2.a(ll.g().a(((eyj_1)object2).a(efc_0.p.a())).b(((eyj_1)object2).a(efc_0.q.a())));
        }
        if ((object2 = exk_22.ap()) != null) {
            builder = lc_0.f();
            object = ((eZo)object2).b();
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                exk_2 exk_23 = (exk_2)iterator.next();
                if (exk_23 == null) {
                    a.fatal((Object)"Null item to save on a set, we skip it");
                    continue;
                }
                builder.a(eyl_1.b(exk_23));
            }
            lg2.a((lE)builder);
        }
        if (exk_22.l() > 0) {
            lg2.c(exk_22.l());
        }
        return lg2;
    }

    @Nullable
    public static lM c(exk_2 exk_22) {
        if (!exk_22.y()) {
            return null;
        }
        return eyl_1.a(exk_22.C());
    }

    @Nullable
    public static lM a(eZw eZw2) {
        Object object;
        if (eZw2 == null) {
            return null;
        }
        lM lM2 = lk_0.o();
        Map<Byte, eze_0> map = eZw2.c();
        if (map != null) {
            object = map.entrySet().iterator();
            while (object.hasNext()) {
                Map.Entry entry = (Map.Entry)object.next();
                byte by = (Byte)entry.getKey();
                eze_0 eze_02 = (eze_0)entry.getValue();
                lT lT2 = lR.k().a(by);
                if (eze_02 != null) {
                    lT2.a(by).b(eze_02.a()).c(eze_02.c().a()).d(eze_02.d());
                }
                lM2.a(lT2);
            }
        }
        if ((object = eZw2.k()) != null) {
            for (Map.Entry entry : object.entrySet()) {
                lM2.a(ln_0.g().a(((ext_1)entry.getKey()).a()).b((Integer)entry.getValue()));
            }
        }
        lM2.k(eZw2.l());
        lM2.l(eZw2.n());
        lM2.m(eZw2.d());
        return lM2;
    }

    public static kT a(exk_2 exk_22, exg_2 exg_22) {
        if (exk_22 == null) {
            return null;
        }
        return eyl_1.a(exk_22, exg_22.d(exk_22));
    }

    public static kT a(exk_2 exk_22, int n) {
        if (exk_22 == null) {
            return null;
        }
        lg lg2 = eyl_1.b(exk_22);
        return kR.h().a(lg2).a(n);
    }

    public static kQ a(exg_2 exg_22) {
        kQ kQ2 = kO.n();
        kQ2.a(exg_22.f()).c(exg_22.d()).d(exg_22.e()).e(exg_22.h());
        TK<exk_2, vf_2> tK = exg_22.g();
        tK.a(new eym_1(kQ2, exg_22));
        return kQ2;
    }

    public static byte[] a(exh_1 exh_12) {
        kY kY2 = kW.f();
        for (exg_2 exg_22 : exh_12.j()) {
            kY2.a(eyl_1.a(exg_22));
        }
        return kY2.g().toByteArray();
    }

    public static exk_2 a(byte[] byArray) {
        le_0 le_02;
        try {
            le_02 = le_0.a(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            a.fatal((Object)"Error unserializing an item", (Throwable)invalidProtocolBufferException);
            return null;
        }
        return eyl_1.a(le_02);
    }

    public static exk_2 a(le_0 le_02) {
        List<le_0> list;
        Object object;
        Object r2;
        int n = 24252;
        if (le_02.e() == 24252 && le_02.t()) {
            int n2 = 24250;
            r2 = eyo_1.g().d(24250);
            a.warn((Object)"[BOSS SMASHER 9] Change Harmony to Vertox Haven Bag 24252 to 24250");
        } else {
            r2 = eyo_1.g().d(le_02.e());
        }
        if (r2 == null) {
            a.error((Object)("Can't unserialize item with uniqueId " + le_02.c() + " and refId " + le_02.e() + " : unable to find a reference item"));
            return null;
        }
        exk_2 exk_22 = exk_2.a(le_02.c(), r2);
        if (exk_22 == null) {
            a.error((Object)("Can't unserialize item with uniqueId" + le_02.c() + " and refId " + le_02.e() + " : unable to create a new instance."));
            return null;
        }
        try {
            exk_22.a(Hw.c((long)le_02.g()));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            a.error((Object)("Unable to set correct quantity for item " + le_02.e() + ", qty : " + le_02.g() + ", skip it"));
            if (le_02.g() > exk_22.aR_()) {
                a.fatal((Object)("Player lost some quantity of " + le_02.e() + ", qty : " + (le_02.g() - exk_22.aR_()) + ", set max stack height, uid : " + le_02.c()));
                exk_22.a(exk_22.aR_());
            }
            return null;
        }
        if (le_02.h()) {
            object = ffx.a.a(le_02.i());
            exk_22.a((ffu_0)object);
        }
        if (le_02.k()) {
            object = new fad_0(ezz_0.a.a(le_02.l().c()));
            ((fad_0)object).a(le_02.l().e());
            exk_22.a((fad_0)object);
        }
        if (le_02.n()) {
            exk_22.a(eyl_1.b(le_02));
        }
        if (le_02.q()) {
            exk_22.a(new eyi_1(le_02.r().c()));
        }
        if (le_02.t()) {
            object = le_02.u();
            list = new eyf_2(eyh_1.a((byte)((lh_0)object).c()), ((lh_0)object).e());
            exk_22.a((eyc_2)((Object)list));
        }
        if (le_02.w()) {
            object = le_02.x();
            list = new eyj_1();
            eyj_1.a((eyj_1)((Object)list), (byte)((ll)object).c(), efc_0.p.a());
            eyj_1.a(list, (byte)((ll)object).e(), efc_0.q.a());
            exk_22.a((eyj_1)((Object)list));
        } else {
            exk_22.a((eyj_1)null);
        }
        if (le_02.z()) {
            object = new eZo();
            list = le_02.A().b();
            for (le_0 le_03 : list) {
                ((eZo)object).a(eyl_1.a(le_03));
            }
            exk_22.a((eZo)object);
        }
        if (le_02.C()) {
            exk_22.a(le_02.D());
        }
        exk_22.R();
        return exk_22;
    }

    @Nullable
    public static eZw b(le_0 le_02) {
        if (!le_02.n()) {
            return null;
        }
        return eyl_1.a(le_02.o());
    }

    public static eZw a(lk_0 lk_02) {
        eZw eZw2 = eZy.a(lk_02);
        if (eZw2 == null) {
            return null;
        }
        List<ln_0> list = lk_02.e();
        for (ln_0 ln_02 : list) {
            ext_1 ext_12 = ext_1.a(ln_02.c());
            if (ext_12 == null) {
                a.fatal((Object)("Saved an item with unknown propertyId : " + ln_02.c()));
                continue;
            }
            eZw2.a(ext_12, ln_02.e());
        }
        return eZw2;
    }

    public static exk_2 a(kR kR2) {
        try {
            return eyl_1.a(kR2.c());
        }
        catch (Exception exception) {
            a.error((Object)("Error unserializing item " + kR2 + ", skip it"), (Throwable)exception);
            return null;
        }
    }

    public static exg_2 a(exg_2 exg_22, kO kO2) {
        short s2 = exd_1.a.c(kO2.e());
        int n = kO2.i();
        exg_2 exg_23 = exg_22.a();
        exg_23.e(kO2.c());
        exg_23.e(kO2.e());
        exg_23.a((byte)kO2.g());
        exg_23.c(s2 > n ? s2 : (short)n);
        exg_23.a(exb_1.o);
        List<kR> list = kO2.j();
        for (kR kR2 : list) {
            exk_2 exk_22 = eyl_1.a(kR2);
            if (exk_22 == null) continue;
            try {
                exg_23.c(exk_22, (short)kR2.f());
            }
            catch (uz_0 uz_02) {
                a.fatal((Object)("Error unserializing a bag " + exg_23 + " from protoBag " + kO2), (Throwable)uz_02);
            }
            catch (Uy uy) {
                a.fatal((Object)("Error unserializing a bag " + exg_23 + " from protoBag " + kO2), (Throwable)uy);
            }
            catch (uc_0 uc_02) {
                a.fatal((Object)("Error unserializing a bag " + exg_23 + " from protoBag " + kO2), (Throwable)uc_02);
            }
        }
        exg_23.c();
        return exg_23;
    }

    public static exh_1 a(exh_1 exh_12, exg_2 exg_22, byte[] byArray) {
        kW kW2;
        try {
            kW2 = kW.a(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            a.fatal((Object)"Error unserializing bags", (Throwable)invalidProtocolBufferException);
            return null;
        }
        return eyl_1.a(exh_12, exg_22, kW2);
    }

    private static exh_1 a(exh_1 exh_12, exg_2 exg_22, kW kW2) {
        for (kO kO2 : kW2.b()) {
            exh_12.c(eyl_1.a(exg_22, kO2));
        }
        return exh_12;
    }
}

