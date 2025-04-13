/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.base.Function;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

public final class erQ {
    public static final Function<fgy_0, fgr_0> a = new erY();
    public static final Function<fgr_0, TIntObjectHashMap<aeo_2>> b = new erU();
    public static final Function<fgr_0, TIntObjectHashMap<aeo_2>> c = new erW();
    public static final Function<aeo_2, Integer> d = new erT();
    public static final Function<aeo_2, Integer> e = new erS();
    public static final Function<fgv_0, fgy_0> f = new erV();
    public static final Function<fgv_0, Boolean> g = new erZ();
    public static final Function<fgy_0, fgk_0> h = new erX();
    private static final List<eqq_1> i = Collections.emptyList();

    private erQ() {
    }

    public static epq_2 a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.c(object, object2, object3, object4);
        if (eqq_12 instanceof epq_2) {
            return (epq_2)eqq_12;
        }
        return null;
    }

    public static epq_2 a(boolean bl, Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.b(bl, object, object2, object3, object4);
        if (eqq_12 instanceof epq_2) {
            return (epq_2)eqq_12;
        }
        return null;
    }

    public static epq_2 a(eyJ eyJ2, Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.b(eyJ2, object, object2, object3, object4);
        if (eqq_12 instanceof epq_2) {
            return (epq_2)eqq_12;
        }
        return null;
    }

    public static eqq_1 b(boolean bl, Object object, Object object2, Object object3, Object object4) {
        Object object5;
        Object object6 = object5 = bl ? object2 : object;
        if (object5 instanceof eqq_1) {
            return (eqq_1)object5;
        }
        return erQ.a(eyJ.a, object2, object3, object4);
    }

    public static eqq_1 b(eyJ eyJ2, Object object, Object object2, Object object3, Object object4) {
        if (eyJ2 == eyJ.b && object instanceof eqq_1) {
            return (eqq_1)object;
        }
        if (eyJ2 == eyJ.c && object2 instanceof eqq_1) {
            return (eqq_1)object2;
        }
        return erQ.a(eyJ2, object2, object3, object4);
    }

    public static List<eqq_1> c(boolean bl, Object object, Object object2, Object object3, Object object4) {
        Object object5;
        Object object6 = object5 = bl ? object2 : object;
        if (object5 instanceof eqq_1) {
            return Collections.singletonList((eqq_1)object5);
        }
        return erQ.b(eyJ.a, object2, object3, object4);
    }

    public static List<eqq_1> c(eyJ eyJ2, Object object, Object object2, Object object3, Object object4) {
        if (eyJ2 == eyJ.b && object instanceof eqq_1) {
            return Collections.singletonList((eqq_1)object);
        }
        if (eyJ2 == eyJ.c && object2 instanceof eqq_1) {
            return Collections.singletonList((eqq_1)object2);
        }
        return erQ.b(eyJ2, object2, object3, object4);
    }

    public static aff_1 d(boolean bl, Object object, Object object2, Object object3, Object object4) {
        Object object5;
        Object object6 = object5 = bl ? object2 : object;
        if (object5 instanceof aff_1) {
            return (aff_1)object5;
        }
        if (object5 instanceof eqq_1) {
            return ((eqq_1)object5).P_();
        }
        return null;
    }

    @Nullable
    public static aff_1[] a(Object object) {
        aff_1 aff_12 = erQ.d(true, null, object, null, null);
        if (aff_12 == null) {
            return null;
        }
        if (object instanceof aoc_2) {
            byte by = ((aoc_2)object).X();
            int n = (2 * by + 1) * (2 * by + 1);
            aff_1[] aff_1Array = new aff_1[n];
            int n2 = 0;
            for (int k = aff_12.d() - by; k <= aff_12.d() + by; ++k) {
                for (int i2 = aff_12.e() - by; i2 <= aff_12.e() + by; ++i2) {
                    aff_1Array[n2] = new aff_1(k, i2, aff_12.f());
                    ++n2;
                }
            }
            return aff_1Array;
        }
        return new aff_1[]{aff_12};
    }

    public static Optional<fgv_0> b(Object object, Object object2, Object object3, Object object4) {
        if (object instanceof fgy_0) {
            return Optional.ofNullable(((fgy_0)object).E());
        }
        eqq_1 eqq_12 = erQ.c(object, object2, object3, object4);
        if (eqq_12 instanceof epq_2) {
            return Optional.ofNullable(fgT.a.a(((epq_2)eqq_12).bO()));
        }
        return Optional.empty();
    }

    public static eqq_1 c(Object object, Object object2, Object object3, Object object4) {
        if (object instanceof eqq_1) {
            return (eqq_1)object;
        }
        if (object2 instanceof eqq_1) {
            return (eqq_1)object2;
        }
        return erQ.a(eyJ.a, object2, object3, object4);
    }

    private static eqq_1 a(eyJ eyJ2, Object object, Object object2, Object object3) {
        switch (eyJ2) {
            case d: {
                return erQ.c(object2, object3);
            }
            case e: {
                return erQ.d(object2, object3);
            }
            case f: {
                return erQ.b(object, object2);
            }
        }
        eqq_1 eqq_12 = erQ.c(object2, object3);
        if (eqq_12 != null) {
            return eqq_12;
        }
        return erQ.b(object, object2);
    }

    private static eqq_1 b(Object object, Object object2) {
        if (!(object instanceof aff_1)) {
            return null;
        }
        elm_0 elm_02 = erQ.b(object2);
        if (elm_02 == null) {
            return null;
        }
        aff_1 aff_12 = (aff_1)object;
        return elm_02.d(aff_12);
    }

    private static eqq_1 c(Object object, Object object2) {
        if (object instanceof eyc_0) {
            eyc_0 eyc_02 = (eyc_0)object;
            return eyc_02.b();
        }
        if (object2 instanceof eyc_0) {
            eyc_0 eyc_03 = (eyc_0)object2;
            return eyc_03.b();
        }
        return null;
    }

    private static eqq_1 d(Object object, Object object2) {
        if (object instanceof eyL) {
            eyL eyL2 = (eyL)object;
            return (eqq_1)((Object)eyL2.b());
        }
        if (object2 instanceof eyL) {
            eyL eyL3 = (eyL)object2;
            return (eqq_1)((Object)eyL3.b());
        }
        return null;
    }

    private static List<eqq_1> b(eyJ eyJ2, Object object, Object object2, Object object3) {
        switch (eyJ2) {
            case d: {
                eqq_1 eqq_12 = erQ.c(object2, object3);
                return eqq_12 != null ? Collections.singletonList(eqq_12) : i;
            }
            case e: {
                eqq_1 eqq_13 = erQ.d(object2, object3);
                return eqq_13 != null ? Collections.singletonList(eqq_13) : i;
            }
        }
        eqq_1 eqq_14 = erQ.c(object2, object3);
        if (eqq_14 != null) {
            return Collections.singletonList(eqq_14);
        }
        return erQ.e(object, object2);
    }

    private static List<eqq_1> e(Object object, Object object2) {
        if (!(object instanceof aff_1)) {
            return Collections.emptyList();
        }
        ArrayList<eqq_1> arrayList = new ArrayList<eqq_1>();
        elm_0 elm_02 = erQ.b(object2);
        if (elm_02 == null) {
            return Collections.emptyList();
        }
        aff_1 aff_12 = (aff_1)object;
        arrayList.add((eqq_1)elm_02.d(aff_12));
        List<sr_0> list = elm_02.i().b(aff_12);
        int n = list.size();
        for (int k = 0; k < n; ++k) {
            sr_0 sr_02 = list.get(k);
            arrayList.add((eqq_1)((Object)sr_02));
        }
        return arrayList;
    }

    public static elm_0 b(Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof elm_0) {
            return (elm_0)object;
        }
        if (object instanceof efq_0) {
            return ((efq_0)object).l();
        }
        return null;
    }

    public static Su c(Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof epq_2) {
            return ((epq_2)object).cl();
        }
        if (object instanceof sq_0) {
            return erQ.c(((sq_0)object).v());
        }
        if (object instanceof Su) {
            return (Su)object;
        }
        return null;
    }

    @Nullable
    public static ejh_0 d(Object object) {
        if (object == null) {
            return null;
        }
        if (!(object instanceof ejh_0)) {
            return null;
        }
        ejh_0 ejh_02 = (ejh_0)object;
        if (ejh_02.bj() != null) {
            return (ejh_0)ejh_02.bj();
        }
        efn_0 efn_02 = (efn_0)((sd_0)object).l();
        if (efn_02 == null) {
            return null;
        }
        return efn_02.f();
    }

    @Nullable
    public static Su e(Object object) {
        ejh_0 ejh_02 = erQ.d(object);
        if (ejh_02 == null) {
            return null;
        }
        return ejh_02.i();
    }

    @Nullable
    public static Su f(Object object) {
        ejh_0 ejh_02 = erQ.d(object);
        if (ejh_02 == null) {
            return null;
        }
        return ejh_02.h();
    }

    public static elm_0<?> a(Object object, Object object2) {
        if (object2 instanceof elm_0) {
            return (elm_0)object2;
        }
        if (object2 instanceof efq_0) {
            return ((efq_0)object2).l();
        }
        if (!(object instanceof eqq_1)) {
            throw new aob_1("On essaie de compter les fighters d'un caster qui n'est pas un perso");
        }
        if (object instanceof epq_2) {
            return (elm_0)((epq_2)object).ck();
        }
        return null;
    }

    public static eqq_1 a(String string, Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = null;
        if (string == null || string.equalsIgnoreCase("caster")) {
            eqq_12 = erQ.b(false, object, object2, object3, object4);
        } else if (string.equalsIgnoreCase("target")) {
            eqq_12 = erQ.b(true, object, object2, object3, object4);
        } else if (string.equalsIgnoreCase("triggeringCaster")) {
            Su su = erQ.f(object4);
            if (su instanceof eqq_1) {
                eqq_12 = (eqq_1)((Object)su);
            }
        } else if (string.equalsIgnoreCase("triggeringTarget")) {
            Su su = erQ.e(object4);
            if (su instanceof eqq_1) {
                eqq_12 = (eqq_1)((Object)su);
            }
        } else if (string.equalsIgnoreCase("casterController")) {
            eqq_1 eqq_13 = erQ.b(false, object, object2, object3, object4);
            if (eqq_13 == null) {
                return null;
            }
            elm_0 elm_02 = erQ.b(object3);
            if (elm_02 == null) {
                return null;
            }
            eqq_12 = elm_02.n(eqq_13.B_());
        } else if (string.equalsIgnoreCase("eventTarget")) {
            ese ese2;
            ese ese3 = object3 instanceof eyL ? ((eyL)object3).b() : (ese2 = object4 instanceof eyL ? ((eyL)object4).b() : null);
            if (!(ese2 instanceof eqq_1)) {
                return null;
            }
            eqq_12 = (eqq_1)((Object)ese2);
        }
        return eqq_12;
    }

    public static ece_0 d(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(object, object2, object3, object4);
        if (!(epq_22 instanceof ecb_0)) {
            throw new aob_1("Unable to get criterion target");
        }
        Optional<ece_0> optional = ((ecb_0)((Object)epq_22)).eW();
        if (optional.isEmpty()) {
            throw new aob_1("Unable to get craftHandler of user");
        }
        return optional.get();
    }
}

