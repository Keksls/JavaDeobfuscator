/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

public class dbJ
implements ahr_1,
ans_1 {
    private static final dbJ a = new dbJ();
    private ans_1 b;
    final ArrayList<String> c = new ArrayList();
    private dhb_0 d;
    private final boo_0 e = new boo_0();

    public static dbJ a() {
        return a;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 17347: {
                bmr_1 bmr_12 = azu_0.j().k();
                dfc dfc2 = (dfc)adt_12;
                byte by = dfc2.b();
                bol_0 bol_02 = bmr_12.cH();
                if (bol_02 == null) {
                    return false;
                }
                if (by != bol_02.c()) {
                    bol_02.a(by);
                    clr clr2 = new clr();
                    clr2.a(bmr_12.a_());
                    clr2.a(by);
                    azu_0.j().K().c(clr2);
                }
                this.b(bmr_12);
                return false;
            }
            case 16781: {
                return false;
            }
            case 18349: {
                dfc dfc3 = (dfc)adt_12;
                byte by = dfc3.b();
                if (azu_0.j().k().cW()) {
                    return false;
                }
                bmr_1 bmr_13 = azu_0.j().k();
                if (bmr_13.cH() != null) {
                    bop_0 bop_02 = (bop_0)bmr_13.cH().a((int)by);
                    if (bmr_13.cH().a((int)by) != null) {
                        fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("question.osaFreeCreature", bop_02.b()), cfn_0.a(0), 2073L, 102, 1);
                        fzm_02.a(new dbK(this, bop_02, bmr_13, by));
                    }
                }
                return false;
            }
            case 16537: {
                bmr_1 bmr_14 = azu_0.j().k();
                dfc dfc4 = (dfc)adt_12;
                byte by = dfc4.b();
                bol_0 bol_03 = bmr_14.cH();
                if (bol_03 == null) {
                    return false;
                }
                eqy_1 eqy_12 = bol_03.a((int)by);
                if (eqy_12 == null) {
                    return false;
                }
                String string = dfc4.h();
                if (string.isEmpty()) {
                    return false;
                }
                if (!cfq_0.checkNameValidity(string)) {
                    return false;
                }
                if (!cby_2.a().a(string)) {
                    aUh.a("error.chat.operationNotPermited", new Object[0]);
                    return false;
                }
                eqy_12.a(string);
                clq_0 clq_02 = new clq_0();
                clq_02.a(bmr_14.a_());
                clq_02.a(by);
                clq_02.a(string);
                clq_02.a(true);
                azu_0.j().K().c(clq_02);
                return false;
            }
        }
        return true;
    }

    private void b(bmr_1 bmr_12) {
        if (this.d == null) {
            return;
        }
        if (azu_0.j().c(cYZ.o())) {
            return;
        }
        bvx_2 bvx_22 = bmr_12.bz();
        if (bvx_22 == null) {
            return;
        }
        if (bvx_22.A().q() != bmr_12.a_()) {
            return;
        }
        add_2.b().a(this.d);
        bmr_12.ch();
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            dhb_0 dhb_02 = new dhb_0();
            dhb_02.a((bpl_0)azu_0.j().k().aZ().c(7348));
            dhb_02.a_(16245);
            this.d = dhb_02;
            this.b = new dbl_0(this);
            fpm_0.b().a(this.b);
            this.c();
            fpm_0.b().a("osamodasSymbiotDialog", cfi_0.a("osamodasSymbiotDialog"), 32769L, (short)10000);
            fpm_0.b().a("wakfu.osamodasSymbiot", ciy_0.class);
        }
    }

    public void c() {
        bol_0 bol_02 = azu_0.j().k().cH();
        this.e.a(bol_02);
        bol_02.a(this.e);
        bOQ.a().a(bol_02);
        fis_1.a().a("osamodasSymbiot", bOQ.a());
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.b);
            for (String string : (ArrayList)this.c.clone()) {
                if (!fpm_0.b().q(string)) continue;
                fpm_0.b().o(string);
            }
            this.c.clear();
            fpm_0.b().o("osamodasSymbiotDialog");
            fis_1.a().a("osamodasSymbiot");
            fis_1.a().a("osamodasSymbiot.describedCreature");
            fpm_0.b().e("wakfu.osamodasSymbiot");
            this.d = null;
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public void a(bop_0 bop_02) {
        bol_0 bol_02 = azu_0.j().k().cH();
        if (bol_02 == null) {
            return;
        }
        String string = dbJ.a(bol_02.a(bop_02));
        if (fpm_0.b().q(string)) {
            fpm_0.b().o(string);
            this.c.remove(string);
        } else {
            this.c.add(string);
            fpm_0.b().a(string, cfi_0.a("monsterDetailDialog"), 1L, (short)10000);
            fis_1.a().a("monsterDetail", (Object)bop_02, string);
        }
    }

    @NotNull
    private static String a(int n) {
        return "monsterDetailDialog" + n;
    }

    @Override
    public void dialogUnloaded(String string) {
        this.c.remove(string);
    }

    public void a(bmr_1 bmr_12) {
        dhb_0 dhb_02 = new dhb_0();
        dhb_02.a((bpl_0)bmr_12.aZ().c(7348));
        dhb_02.a_(16245);
        this.d = dhb_02;
        bOQ.a().a(bmr_12.cH());
        fis_1.a().a("osamodasSymbiot", bOQ.a());
        fis_1.a().a("osamodasSymbiot", "capturedCreatures");
    }

    public void d() {
        if (this.c.isEmpty()) {
            return;
        }
        bol_0 bol_02 = azu_0.j().k().cH();
        if (bol_02 == null) {
            return;
        }
        for (int k = 0; k < 10; ++k) {
            String string = dbJ.a(k);
            if (!this.c.contains(string)) continue;
            eqy_1 eqy_12 = bol_02.a(k);
            fis_1.a().a("monsterDetail", (Object)eqy_12, string);
        }
    }
}

