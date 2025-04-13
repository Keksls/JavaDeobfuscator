/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from Jk
 */
public final class jk_2 {
    public static final jk_2 a = new jk_2();
    private final HashMap<Class<? extends ll_2>, kd_2> b = new HashMap();
    private final HashMap<Class<? extends ll_2>, ke_2> c = new HashMap();

    private jk_2() {
        this.a();
    }

    private void a(Class<? extends ll_2> clazz, kd_2 kd_22, ke_2 ke_22) {
        this.b.put(clazz, kd_22);
        this.c.put(clazz, ke_22);
    }

    public ki_2 a(ll_2 ll_22) {
        kd_2 kd_22 = this.b.get(ll_22.getClass());
        return kd_22.a(ll_22);
    }

    public lo_1 b(ll_2 ll_22) {
        ke_2 ke_22 = this.c.get(ll_22.getClass());
        return ke_22.a(ll_22);
    }

    private void a() {
        this.a(ln_2.class, new jl_1(this), new jw_1(this));
        this.a(lp_2.class, new jh_1(this), new js_2(this));
        this.a(lq_2.class, new jy_2(this), new jz_2(this));
        this.a(lr_2.class, new ka_2(this), new kb_1(this));
        this.a(ls_2.class, new kc_1(this), new jm_1(this));
        this.a(lt_2.class, new jn_2(this), new jo_1(this));
        this.a(lu_2.class, new jp_2(this), new jq_1(this));
        this.a(lv_2.class, new jr_2(this), new js_1(this));
        this.a(lw_2.class, new jt_1(this), new ju_1(this));
        this.a(lx_2.class, new jv_2(this), new jx_1(this));
        this.a(ly_2.class, new jy_1(this), new jz_1(this));
        this.a(lz_2.class, new ja_2(this), new jb_2(this));
        this.a(la_2.class, new jc_2(this), new jd_2(this));
        this.a(lb_2.class, new je_2(this), new jf_2(this));
        this.a(lc_2.class, new jg_2(this), new ji_1(this));
        this.a(ld_2.class, new jj_2(this), new jk_1(this));
        this.a(le_2.class, new jl_2(this), new jm_2(this));
        this.a(lf_2.class, new jn_1(this), new jo_2(this));
        this.a(lh_2.class, new jp_1(this), new jq_2(this));
        this.a(li_2.class, new jr_1(this), new jt_2(this));
        this.a(lj_2.class, new ju_2(this), new jv_1(this));
        this.a(lk_1.class, new jw_2(this), new jx_2(this));
    }
}

