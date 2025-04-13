/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TObjectIntHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TObjectIntHashMap;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bPg {
    private static final Logger a = Logger.getLogger(bPg.class);

    private bPg() {
    }

    /*
     * WARNING - void declaration
     */
    public static ArrayList<String> a(Iterable<sd_0> iterable, Sm sm) {
        bpl_0 bpl_02;
        boolean bl = true;
        ArrayList<String> arrayList = new ArrayList<String>();
        if (sm instanceof bpl_0 && !((bph_0)(bpl_02 = (bpl_0)sm).r()).e()) {
            bl = false;
            if (bae.h().a(5, (long)((bph_0)bpl_02.r()).i())) {
                arrayList.add(bae.h().a(5, (long)((bph_0)bpl_02.r()).i(), new Object[0]));
            }
        }
        if (bl && iterable != null) {
            bpl_02 = new TObjectIntHashMap();
            ArrayList<String> arrayList2 = new ArrayList<String>();
            sd_0 object = null;
            int n = 0;
            for (sd_0 object2 : iterable) {
                ani_2 ani_22 = new ani_2();
                Object FX = object2.f();
                String string = "";
                if (FX != null) {
                    if (FX instanceof efh_0) {
                        eDp eDp2;
                        int n2;
                        edp_0 edp_02;
                        float f2;
                        Object object3;
                        eDq eDq2;
                        short s2 = 0;
                        if (object2.k() instanceof bpe_0) {
                            s2 = ((efi_0)object2.k()).c();
                            eDq2 = new edy_0(sm, 0, s2);
                        } else if (object2.k() instanceof bpl_0) {
                            object3 = (bpl_0)object2.k();
                            s2 = ((fio_0)object3).c();
                            eDq2 = new edg_0((fio_0<? extends fin_0>)object3);
                        } else if (object2.k() instanceof ekk_0) {
                            s2 = ((efi_0)object2.k()).c();
                            eDq2 = new edy_0(sm, 0, s2);
                        } else {
                            eDq2 = new edy_0(sm, 0, s2);
                        }
                        if ((f2 = (object3 = (efh_0)FX).b(s2)) <= 0.0f || (edp_02 = new edp_0(object2)).j() == -1 || (n2 = (eDp2 = eDi.e(edp_02.j())).a(ani_22, edp_02, eDq2)) == -1) continue;
                        String string2 = ani_22.r();
                        string2 = eDq2.a(string2, (efh_0)object3);
                        string2 = eDq.a(string2);
                        if (object2.k() instanceof bpl_0) {
                            string2 = edg_0.a((fio_0)object2.k(), s2, string2);
                        }
                        string = string2;
                    }
                } else {
                    if (object != null && object.bt_() != object2.bt_()) {
                        bPg.a(ani_22, object.f().i(), object.bt_(), n, bPg.a(object.f()));
                        n = 0;
                    }
                    object = object2;
                    n += object2.n();
                    string = ani_22.r();
                }
                if (string.isEmpty()) continue;
                if (!bpl_02.contains(string)) {
                    arrayList2.add(string);
                }
                bpl_02.adjustOrPutValue(string, 1, 1);
            }
            for (String string : arrayList2) {
                void var9_13;
                int n3 = bpl_02.get(string);
                if (n3 > 1) {
                    String string3 = string + " (x" + n3 + ")";
                }
                arrayList.add((String)var9_13);
            }
            if (object != null) {
                ani_2 ani_23 = new ani_2();
                bPg.a(ani_23, object.f().i(), object.bt_(), n, bPg.a(object.f()));
                arrayList.add(ani_23.r());
            }
        }
        return arrayList;
    }

    private static efa_0 a(Sl sl) {
        return ((ejh_0)efc_0.a().b(sl.j())).br_();
    }

    private static void a(ani_2 ani_22, int n, int n2, int n3, efa_0 efa_02) {
        String string;
        String string2 = null;
        if (bae.h().a(33, (long)n)) {
            string = bae.h().a(33, (long)n, new Object[0]);
            string2 = Cr.a(string, n3);
        }
        if ((string2 == null || string2.isEmpty()) && bae.h().a(10, (long)n2)) {
            string = bae.h().a(10, n2);
            string2 = Cr.a(string, n3);
        }
        if (string2 != null && !string2.isEmpty()) {
            ani_22.a((CharSequence)string2);
            if (efa_02 != null) {
                try {
                    string = String.format(azs_0.a().a("elementsSmallIconsPath"), efa_02.name());
                    ani_22.a((CharSequence)" ").a((CharSequence)fkq_1.a(string, -1, -1, null));
                }
                catch (gm_0 gm_02) {
                    a.error((Object)gm_02.toString());
                }
            }
        }
    }

    public static boolean a(Sm<efh_0> sm) {
        if (sm == null) {
            return false;
        }
        for (efh_0 efh_02 : sm) {
            if (bPg.a(efh_02)) {
                return true;
            }
            fil_0 fil_02 = fim_0.a().a(efh_02.i());
            if (fil_02 == null || !bPg.a(fil_02)) continue;
            return true;
        }
        return false;
    }

    private static boolean a(efh_0 efh_02) {
        ejh_0 ejh_02 = (ejh_0)efc_0.a().b(efh_02.j());
        return ejh_02 instanceof ehi_0;
    }

    public static boolean b(Sm<efh_0> sm) {
        if (sm == null) {
            return false;
        }
        for (efh_0 efh_02 : sm) {
            if (bPg.b(efh_02)) {
                return true;
            }
            fil_0 fil_02 = fim_0.a().a(efh_02.i());
            if (fil_02 == null || !bPg.b(fil_02)) continue;
            return true;
        }
        return false;
    }

    private static boolean b(efh_0 efh_02) {
        ejh_0 ejh_02 = (ejh_0)efc_0.a().b(efh_02.j());
        return bPg.a(ejh_02);
    }

    public static boolean a(ejh_0 ejh_02) {
        return ejh_02 instanceof ehj_0 || ejh_02 instanceof ehe_0;
    }
}

