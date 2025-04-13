/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from eDQ
 */
public class edq_0
extends eDO {
    @Override
    protected String a(efh_0 efh_02, String string, Object[] objectArray, boolean bl, eDl eDl2) {
        Object object;
        sr_0<efh_0, elb_0> sr_02 = edq_0.a(efh_02.j(), objectArray);
        ani_2 ani_22 = eDi.aq.a();
        short s2 = eDl2.d();
        if (sr_02 != null) {
            boolean bl2;
            boolean bl3 = bl2 = !eDl2.l() && !eDl2.k() && efh_02.j() != eDi.ai;
            if (bl2) {
                String string2;
                object = eDi.ap.a(eDi.aM, (long)((short)sr_02.A()), new Object[0]);
                ani_22.a((CharSequence)object);
                if (!this.a && (string2 = eDi.a(efh_02)) != null && string2.length() > 0) {
                    ani_22.a((CharSequence)" ").a((CharSequence)string2);
                }
                ani_22.a((CharSequence)edq_0.a(efh_02));
                if (efh_02.j() == efc_0.dp.a() || efh_02.j() == efc_0.dw.a()) {
                    int n = (int)(sr_02.c(0) + sr_02.c(1) * (float)s2);
                    ani_22.a((CharSequence)"\n").a((CharSequence)eDi.an);
                    ani_22.a((CharSequence)eDi.ap.a(efh_02.j() == efc_0.dw.a() ? eDi.av : eDi.au, n));
                }
            }
            if (eDl2.l()) {
                ani_22.a((CharSequence)eDi.a((ekk_0)sr_02, objectArray.length > 1 ? ((Number)objectArray[1]).shortValue() : (short)1, false));
            } else if (efh_02.j() != eDi.ah && ((ArrayList)(object = eDi.a(new eDt(sr_02, s2, eDl2.j())))).size() != 0) {
                if (bl2) {
                    ani_22.a((CharSequence)"\n").a((CharSequence)eDi.a((ArrayList<String>)object, !string.contains("\n")));
                } else {
                    ani_22.a((CharSequence)eDi.a((ArrayList<String>)object, false));
                }
            }
        }
        if (eDl2.l()) {
            return ani_22.r();
        }
        if (objectArray == null || objectArray.length == 0) {
            return Cr.a(string, new Object[]{ani_22.r()});
        }
        Object object2 = objectArray[0];
        objectArray[0] = ani_22.r();
        object = Cr.a(string, objectArray);
        objectArray[0] = object2;
        return object;
    }

    public static sr_0<efh_0, elb_0> a(int n, Object[] objectArray) {
        if (n == efc_0.dn.a()) {
            return elg_0.a().a(((Number)objectArray[0]).intValue());
        }
        if (n == efc_0.ds.a()) {
            return elg_0.a().b(((Number)objectArray[0]).intValue());
        }
        if (n == efc_0.dq.a() || n == efc_0.dr.a()) {
            return elg_0.a().d(((Number)objectArray[0]).intValue());
        }
        if (n == efc_0.dv.a()) {
            return elg_0.a().i(((Number)objectArray[0]).intValue());
        }
        if (n == efc_0.dw.a()) {
            return elg_0.a().i(((Number)objectArray[0]).intValue());
        }
        if (n == efc_0.dp.a()) {
            return elg_0.a().c(((Number)objectArray[0]).intValue());
        }
        if (n == efc_0.do.a()) {
            return elg_0.a().f(((Number)objectArray[0]).intValue());
        }
        if (n == efc_0.du.a()) {
            return elg_0.a().i(((Number)objectArray[0]).intValue());
        }
        if (n == efc_0.dt.a()) {
            return elg_0.a().j(((Number)objectArray[0]).intValue());
        }
        return null;
    }
}

