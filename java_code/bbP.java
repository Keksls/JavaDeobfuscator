/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Optional;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class bbP {
    public static final String a = "[se]";
    public static final String b = "[target]";
    public static final String c = "[casterName]";
    public static final String d = "\\[se\\]";
    public static final String e = "\\[target\\]";
    public static final String f = "\\[casterName\\]";
    private final bbN g;
    private static final Logger h = Logger.getLogger(bbP.class);
    private static final int[] i = new int[]{efc_0.a.a(), efc_0.an.a(), efc_0.e.a()};

    public bbP(bbN bbN2) {
        this.g = bbN2;
    }

    void a() {
        bwh_0 bwh_02 = this.g.B();
        bmr_1 bmr_12 = azu_0.j().k();
        if (bwh_02 == null || bmr_12 == null || !bwh_02.equals(bmr_12.cP())) {
            return;
        }
        if (!this.c()) {
            return;
        }
        if (this.g.y() instanceof eja_0) {
            return;
        }
        if (!this.b()) {
            return;
        }
        Su su = this.g.y().h();
        if (su == null) {
            return;
        }
        if (su instanceof blx_1 && box_2.a((blx_1)su)) {
            return;
        }
        long l = this.g.h();
        if (!bbP.a(bwh_02, l)) {
            return;
        }
        String string = this.d();
        if (!string.isEmpty()) {
            bbN.n.a(string);
        }
    }

    private static boolean a(bwh_0 bwh_02, long l) {
        if (l == Long.MIN_VALUE) {
            return true;
        }
        if (bwh_02.e(l) != null) {
            return true;
        }
        if (bwh_02.i().b(l) != null) {
            return true;
        }
        if (bwh_02 instanceof bvx_2) {
            return ((bvx_2)bwh_02).l(l) != null;
        }
        return false;
    }

    private boolean b() {
        return this.g.y().f() != null && ((efh_0)this.g.y().f()).G();
    }

    private boolean c() {
        return !ArrayUtils.contains((int[])i, (int)this.g.y().bt_());
    }

    private String a(long l) {
        Su su;
        bwh_0 bwh_02 = this.g.B();
        blx_1 blx_12 = bwh_02.e(l);
        if (blx_12 != null) {
            return blx_12.dp();
        }
        ekk_0 ekk_02 = (ekk_0)bwh_02.i().b(l);
        if (ekk_02 != null) {
            return ekk_02.ap();
        }
        if (bwh_02 instanceof bvx_2 && (su = ((bvx_2)bwh_02).l(l)) instanceof bFZ) {
            return ((bFZ)((Object)su)).al_();
        }
        return "";
    }

    @NotNull
    private String d() {
        ani_2 ani_22 = new ani_2();
        boolean bl = ((efh_0)this.g.y().f()).J() || this.g.h() == Long.MIN_VALUE;
        long l = bl ? this.g.t() : this.g.h();
        ani_22.i().a(aug_0.h).a((CharSequence)this.a(l));
        ani_22.a((CharSequence)bae.h().a("colon", new Object[0]));
        ani_22.j();
        ani_22.i().a(aug_0.g);
        String string = this.a(ani_22, false);
        return string == null ? "" : string;
    }

    private String a(ani_2 ani_22, boolean bl) {
        Object object;
        Optional<String> optional;
        int n;
        int n2 = this.g.y().bt_();
        ArrayList<String> arrayList = new ArrayList<String>();
        efh_0 efh_02 = (efh_0)this.g.y().f();
        int n3 = efh_02.i();
        String string = "";
        if (n3 != -1 && !bl && bae.h().a(13, (long)n3)) {
            boolean bl2 = n2 == efc_0.eR.a() && efh_02.F() > 0;
            int n4 = n = bl2 ? efh_02.a(0, ((efi_0)this.g.y().k()).c(), eFb.a) : this.g.y().n();
            if (n2 == efc_0.es.a()) {
                String string2 = "";
                if (efh_02.F() > 1) {
                    string2 = String.valueOf(efh_02.a(1, ((efi_0)this.g.y().k()).c(), eFb.a));
                }
                optional = (bpe_0)fih_0.a().a(this.g.y().n());
                string = bae.h().a(13, (long)n3, ((bpe_0)((Object)optional)).g(), string2);
            } else if (n2 == efc_0.eq.a()) {
                eGm eGm2 = (eGm)this.g.y();
                int n5 = 0;
                if (this.g.y().f() != null && ((efh_0)this.g.y().f()).F() >= 2) {
                    n5 = ((efh_0)this.g.y().f()).a(1, eGm2.aZ(), eFb.a);
                }
                object = (bpe_0)fih_0.a().a(eGm2.aI());
                string = bae.h().a(13, (long)n3, eDi.a((fie_0)object, ((eGm)this.g.y()).aJ(), ((fie_0)object).D(), true), n5);
            } else if (n2 == efc_0.du.a() || n2 == efc_0.dt.a() || n2 == efc_0.dA.a() || n2 == efc_0.dB.a()) {
                int n6 = 0;
                if (this.g.y().f() != null && ((efh_0)this.g.y().f()).F() >= 1) {
                    n6 = ((efh_0)this.g.y().f()).a(0, this.g.y().aZ(), eFb.a);
                }
                optional = bae.h().a(6, (long)n6, new Object[0]);
                string = bae.h().a(13, (long)n3, optional);
            } else if (n2 == efc_0.dD.a() || n2 == efc_0.dE.a()) {
                int n7 = 0;
                if (this.g.y().f() != null && ((efh_0)this.g.y().f()).F() >= 2) {
                    n7 = ((efh_0)this.g.y().f()).a(1, this.g.y().aZ(), eFb.a);
                }
                optional = bae.h().a(6, (long)n7, new Object[0]);
                string = bae.h().a(13, (long)n3, optional);
            } else if (n2 == efc_0.dI.a()) {
                if (this.g.y().f() != null && ((efh_0)this.g.y().f()).F() >= 1) {
                    int n8 = ((efh_0)this.g.y().f()).a(0, this.g.y().aZ(), eFb.a);
                    arrayList.add(bae.h().a(7, (long)n8, new Object[0]));
                }
            } else {
                string = bae.h().a(13, (long)n3, bae.h().a((long)n));
            }
        }
        if (string.contains(a)) {
            String string3 = this.a(ani_22, true);
            string = string.replaceAll(d, string3);
        } else if (bl || string.isEmpty() || n3 == eFQ.ai().i()) {
            String string4 = "";
            if (bae.h().a(10, (long)n2)) {
                string4 = bae.h().a(30, n2);
            }
            if (!string4.isEmpty()) {
                if (n2 == efc_0.eq.a()) {
                    eGm eGm3 = (eGm)this.g.y();
                    String string5 = String.valueOf(eGm3.aJ());
                    optional = (bpe_0)fih_0.a().a(eGm3.aI());
                    switch (eGm3.bk()) {
                        case 3: 
                        case 6: {
                            return null;
                        }
                        case 2: {
                            string4 = bae.h().a("effect.immuned", ((bpe_0)((Object)optional)).g());
                            break;
                        }
                        default: {
                            object = new StringBuilder(eDi.a((fie_0)((Object)optional), ((eGm)this.g.y()).aJ(), ((fie_0)((Object)optional)).D(), true));
                            this.a((StringBuilder)object);
                            arrayList.add(((StringBuilder)object).toString());
                            arrayList.add(string5);
                            break;
                        }
                    }
                } else if (n2 == efc_0.es.a()) {
                    bpe_0 bpe_02 = (bpe_0)fih_0.a().a(this.g.y().n());
                    StringBuilder stringBuilder = new StringBuilder(bpe_02.g());
                    this.a(stringBuilder);
                    arrayList.add(stringBuilder.toString());
                } else if (n2 == efc_0.dq.a() || n2 == efc_0.dr.a() || n2 == efc_0.dv.a()) {
                    StringBuilder stringBuilder = new StringBuilder().append(bae.h().a(6, (long)this.g.y().n(), new Object[0]));
                    this.a(stringBuilder);
                    arrayList.add(stringBuilder.toString());
                } else if (n2 == efc_0.dG.a()) {
                    bjw_1 bjw_12 = (bjw_1)eyo_1.g().d(this.g.y().n());
                    StringBuilder stringBuilder = bjw_12 != null ? new StringBuilder(bjw_12.e()) : new StringBuilder("");
                    this.a(stringBuilder);
                    arrayList.add(stringBuilder.toString());
                } else if (n2 == efc_0.dN.a()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    this.a(stringBuilder);
                    arrayList.add(stringBuilder.toString());
                } else if (n2 == efc_0.h.a() || n2 == efc_0.an.a()) {
                    if (this.g.y().f() != null && ((efh_0)this.g.y().f()).F() >= 3) {
                        eGN eGN2 = (eGN)this.g.y();
                        int n9 = eGN2.n();
                        int n10 = ((efh_0)eGN2.f()).a(2, eGN2.aZ(), eFb.a);
                        arrayList.add(String.valueOf(n9));
                        arrayList.add(eDi.a(n10));
                    }
                } else if (n2 == efc_0.cC.a() || n2 == efc_0.cD.a()) {
                    if (this.g.y().f() != null && ((efh_0)this.g.y().f()).F() >= 1) {
                        n = ((efh_0)this.g.y().f()).a(0, this.g.y().aZ(), eFb.a);
                        arrayList.add(eDi.b(n));
                    }
                } else if (n2 == efc_0.cA.a() || n2 == efc_0.cB.a()) {
                    if (this.g.y().f() != null && ((efh_0)this.g.y().f()).F() >= 1) {
                        n = ((efh_0)this.g.y().f()).a(0, this.g.y().aZ(), eFb.a);
                        arrayList.add(eDi.c(n));
                    }
                } else if (n2 == efc_0.cE.a() || n2 == efc_0.cF.a()) {
                    if (this.g.y().f() != null && ((efh_0)this.g.y().f()).F() >= 1) {
                        n = ((efh_0)this.g.y().f()).a(0, this.g.y().aZ(), eFb.a);
                        arrayList.add(eDi.d(n));
                    }
                } else if (n2 == efc_0.du.a() || n2 == efc_0.ds.a() || n2 == efc_0.dn.a() || n2 == efc_0.dt.a()) {
                    if (this.g.y().f() != null && ((efh_0)this.g.y().f()).F() >= 1) {
                        n = ((efh_0)this.g.y().f()).a(0, this.g.y().aZ(), eFb.a);
                        arrayList.add(bae.h().a(6, (long)n, new Object[0]));
                    }
                } else if (n2 == efc_0.dA.a() || n2 == efc_0.dB.a()) {
                    if (this.g.y().f() != null && ((efh_0)this.g.y().f()).F() >= 1) {
                        n = ((efh_0)this.g.y().f()).a(0, this.g.y().aZ(), eFb.a);
                        arrayList.add(bae.h().a(6, (long)n, new Object[0]));
                    }
                } else if (n2 == efc_0.dD.a() || n2 == efc_0.dE.a()) {
                    if (this.g.y().f() != null && ((efh_0)this.g.y().f()).F() >= 2) {
                        n = ((efh_0)this.g.y().f()).a(1, this.g.y().aZ(), eFb.a);
                        arrayList.add(bae.h().a(6, (long)n, new Object[0]));
                    }
                } else if (n2 == efc_0.dI.a()) {
                    if (this.g.y().f() != null && ((efh_0)this.g.y().f()).F() >= 1) {
                        n = ((efh_0)this.g.y().f()).a(0, this.g.y().aZ(), eFb.a);
                        arrayList.add(bae.h().a(7, (long)n, new Object[0]));
                    }
                } else if (n2 == efc_0.co.a() || n2 == efc_0.cy.a()) {
                    if (this.g.y().f() != null) {
                        Su su = this.g.y().h();
                        efa_0 efa_02 = eiu_0.a(su);
                        arrayList.add(String.valueOf(this.g.w()));
                        arrayList.add(this.e());
                        optional = eDi.ar.a(efa_02);
                        optional.ifPresent(arrayList::add);
                    }
                } else if (n2 == efc_0.cn.a()) {
                    if (this.g.y().f() != null) {
                        efa_0 efa_03 = eiu_0.b(this.g.y().i());
                        arrayList.add(String.valueOf(this.g.w()));
                        arrayList.add(this.e());
                        Optional<String> optional2 = eDi.ar.a(efa_03);
                        optional2.ifPresent(arrayList::add);
                    }
                } else {
                    StringBuilder stringBuilder = new StringBuilder().append(bae.h().a((long)this.g.y().n()));
                    this.a(stringBuilder);
                    arrayList.add(stringBuilder.toString());
                    arrayList.add(this.e());
                }
                string4 = this.a(string4);
                ani_22.a((CharSequence)string4);
                this.a(ani_22);
                ani_22.j();
                try {
                    string = Cr.a(ani_22.r(), arrayList.toArray());
                }
                catch (Exception exception) {
                    h.error((Object)("probl\u00e8me dans le formattage de la chaine " + ani_22), (Throwable)exception);
                }
            }
        } else if (string != null) {
            ani_22.a((CharSequence)this.a(string));
            ani_22.j();
            string = ani_22.r();
        }
        return string;
    }

    private void a(ani_2 ani_22) {
        switch (this.g.y().bk()) {
            case 7: {
                ani_22.a((CharSequence)" (").a((CharSequence)bae.h().a("exec.block.chat", new Object[0])).a((CharSequence)")");
            }
        }
    }

    private String a(String string) {
        blx_1 blx_12;
        String string2 = eDO.a(string);
        if (!string2.contains(b) && !string2.contains(c)) {
            return string2;
        }
        bwh_0 bwh_02 = this.g.B();
        String string3 = bwh_02.e(this.g.h()).dp();
        string2 = string2.replaceAll(e, string3);
        Su su = this.g.y().h();
        if (su != null && (blx_12 = bwh_02.e(su.a_())) != null) {
            string2 = string2.replaceAll(f, blx_12.dp());
        }
        return string2;
    }

    private String e() {
        if (biL.a(this.g)) {
            ani_2 ani_22 = new ani_2();
            ani_22.a(' ');
            biL.a(ani_22);
            return ani_22.r();
        }
        return "";
    }

    private void a(StringBuilder stringBuilder) {
        switch (this.g.y().bk()) {
            case 4: {
                stringBuilder.append(" (").append(bae.h().a("exec.absorb", new Object[0])).append(")");
                break;
            }
            case 1: {
                stringBuilder.append(" (").append(bae.h().a("exec.failed", new Object[0])).append(")");
                break;
            }
            case 2: {
                stringBuilder.append(" (").append(bae.h().a("exec.immune", new Object[0])).append(")");
                break;
            }
            case 13: {
                stringBuilder.append(" (").append(bae.h().a("exec.seduction.immunity", new Object[0])).append(")");
                break;
            }
            case 3: 
            case 6: {
                stringBuilder.append(" (").append(bae.h().a("exec.resist", new Object[0])).append(")");
                break;
            }
            case 12: {
                stringBuilder.append(" (").append(bae.h().a("exec.level.too.high", new Object[0])).append(")");
                break;
            }
            case 14: {
                stringBuilder.append(" (").append(bae.h().a("exec.seduction.success", new Object[0])).append(")");
            }
        }
    }
}

