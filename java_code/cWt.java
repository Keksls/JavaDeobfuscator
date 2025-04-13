/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import org.apache.log4j.Logger;

public class cWt
extends cuu_0
implements ahr_1 {
    private static final cWt d = new cWt();
    protected static final Logger c = Logger.getLogger(cWt.class);
    private final TLongObjectHashMap<abo_2<Byte, ezr_0>> e = new TLongObjectHashMap();
    private cwv_0 f;
    private cwv_0 g;
    private fsQ h;
    private fsQ i;
    private ans_1 j;
    private final ans_1 k = string -> {
        if (string.equals("dimensionalBagFleaListDialog")) {
            azu_0.j().b(cWt.e());
        } else if (string.equals("dimensionalBagFleaDialog")) {
            cWt.a().c();
        }
    };

    public static cWt e() {
        return d;
    }

    private cWt() {
        b = -3L;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        return true;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        fpm_0.b().a(this.k);
        this.c();
        fvE fvE2 = (fvE)fpm_0.b().a("dimensionalBagFleaListDialog", cfi_0.a("dimensionalBagFleaListDialog"), 32769L, (short)10000);
        this.h = (fsQ)fvE2.getElementMap().a("fleaList");
        fvk_0 fvk_02 = (fvk_0)fvE2.getElementMap().a("fleaWindow");
        this.f = new cwv_0(this.h, fvk_02);
        this.h.addListContentListener(this.f);
        azu_0.j().K().a(cfj_1.a());
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        bmr_1 bmr_12;
        if (bl) {
            return;
        }
        fpm_0.b().b(this.k);
        fpm_0.b().b(this.j);
        this.j = null;
        this.h.removeListContentLoadListener(this.f);
        this.h = null;
        this.f = null;
        if (this.i != null) {
            this.i.removeListContentLoadListener(this.g);
            this.i = null;
            this.g = null;
        }
        if ((bmr_12 = azu_0.j().k()) != null && bmr_12.eE() instanceof bpp_2) {
            bmr_12.dN();
        }
        this.d();
        fpm_0.b().o("dimensionalBagFleaListDialog");
        fpm_0.b().o("dimensionalBagFleaDialog");
        fpm_0.b().o("confirmFleaPurchaseDialog");
        azu_0.j().K().b(cfj_1.a());
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public void b(long l) {
        this.e.remove(l);
    }

    public void a(long l, abo_2 abo_22) {
        this.e.put(l, (Object)abo_22);
    }

    public abo_2 c(long l) {
        return (abo_2)this.e.get(l);
    }

    public void f() {
        fpm_0.b().o("dimensionalBagFleaDialog");
    }

    public void a(bhm_0 bhm_02) {
        if (fpm_0.b().q("dimensionalBagFleaDialog")) {
            return;
        }
        fvk_0 fvk_02 = (fvk_0)fpm_0.b().h().d("dimensionalBagFleaListDialog").a("fleaWindow");
        fvk_0 fvk_03 = (float)(fvk_02.getX() + fvk_02.getWidth() * 2) > fpm_0.b().j().E() ? (fvk_0)fpm_0.b().a("dimensionalBagFleaDialog", cfi_0.a("dimensionalBagFleaDialog"), "dimensionalBagFleaListDialog", "dimensionalBagFleaListDialog", "fleaControlGroup", 1L, (short)10000) : (fvk_0)fpm_0.b().a("dimensionalBagFleaDialog", cfi_0.a("dimensionalBagFleaDialog"), 17L, (short)10000);
        if (fvk_03 != null) {
            this.i = (fsQ)fvk_03.getElementMap().a("itemsList");
            this.g = new cwv_0(this.i, fvk_02);
            this.i.addListContentListener(this.g);
        }
    }

    @Override
    public void a(Object object, bpc_2 bpc_22) {
        b = System.currentTimeMillis();
        a = new cWu(this, object, bpc_22);
        ahs.d().b(a, b);
    }

    public void g() {
        if (this.h == null) {
            return;
        }
        this.f.a(this.h.getOffset());
    }
}

