/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class dcc
implements ahr_1 {
    private static final dcc b = new dcc();
    private fil_1 c;
    private ajf_1 d;
    private boolean e;
    private String f;
    private static final String g = "spellDetailPopup";
    public static final String a = "itemDetailPopup";
    private static final String h = "itemSimplePopup";
    private String i = "";

    public static dcc a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (adt_12 instanceof adh_2) {
            adh_2 adh_22 = (adh_2)adt_12;
            adi_2.a().a(adh_22.b());
            if (this.e) {
                return false;
            }
            this.c();
            return false;
        }
        switch (adt_12.a()) {
            case 16278: {
                dhm dhm2 = (dhm)adt_12;
                boolean bl = false;
                if (this.c == null || this.d == null) {
                    adi_2.a().a(this);
                    return false;
                }
                if (this.d instanceof bpl_0 && dhm2.k() instanceof bpl_0) {
                    bpl_0 bpl_02 = (bpl_0)this.d;
                    bpl_0 bpl_03 = (bpl_0)dhm2.k();
                    bl = ((bph_0)bpl_02.r()).i() == ((bph_0)bpl_03.r()).i();
                } else {
                    bl = this.d.equals(dhm2.k());
                }
                if (bl) {
                    this.e = !fpu_0.closePopup(null, this.c);
                    fis_1.a().a(this.f);
                }
                return false;
            }
            case 19927: {
                dhm dhm3 = (dhm)adt_12;
                this.d = dhm3.k();
                if (this.d == null) {
                    return false;
                }
                if (dhm3.c() > 0) {
                    this.e = false;
                    adi_2.a().a(this, dhm3.c(), -1, 1L);
                } else {
                    this.c();
                }
                return false;
            }
        }
        return true;
    }

    private void c() {
        this.a(this.d);
        if (this.c != null) {
            this.c.b(this.c.getParentOfType(fvE.class));
        }
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().a("wakfu.popupInfos", cJl.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().e("wakfu.popupInfos");
            this.i = null;
            this.d = null;
            this.c = null;
        }
    }

    @Override
    public long a_() {
        return 10L;
    }

    @Override
    public void a(long l) {
    }

    public void a(ajf_1 ajf_12) {
        Object object;
        String string = "";
        if (ajf_12 instanceof bpl_0) {
            string = g;
            this.f = "describedSpell";
        } else if (ajf_12 instanceof exk_2 || ajf_12 instanceof bjw_1 || ajf_12 instanceof bHN || ajf_12 instanceof bwk_2) {
            exk_2 exk_22 = null;
            if (ajf_12 instanceof exk_2) {
                object = (bjw_1)((exk_2)ajf_12).T();
                exk_22 = (exk_2)ajf_12;
            } else if (ajf_12 instanceof bjw_1) {
                object = (bjw_1)ajf_12;
            } else if (ajf_12 instanceof bHN) {
                object = (bjw_1)((bHN)ajf_12).h().T();
            } else if (ajf_12 instanceof bwk_2) {
                object = ((bwk_2)ajf_12).a();
            } else {
                return;
            }
            bht_1 bht_12 = ((bjw_1)object).b();
            ArrayList<String> arrayList = bht_12.g();
            ArrayList<String> arrayList2 = bht_12.e();
            string = arrayList2 == null && arrayList == null ? h : a;
            this.f = "itemPopupDetail";
        }
        if (this.f != null && !this.f.isEmpty() && ajf_12 != null && !ajf_12.equals(fis_1.a().e(this.f))) {
            fis_1.a().a(this.f, ajf_12);
        }
        if (!string.isEmpty() && !string.equals(this.i)) {
            object = fpm_0.b().h().d("worldAndFightBarDialog");
            if (object != null) {
                this.c = (fil_1)((fyy_0)object).a(string);
            }
            this.i = string;
        }
    }
}

