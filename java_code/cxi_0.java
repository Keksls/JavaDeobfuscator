/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIntIterator
 *  gnu.trove.map.hash.TIntIntHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntIntIterator;
import gnu.trove.map.hash.TIntIntHashMap;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cXI
 */
public class cxi_0
implements ahr_1 {
    private static final cxi_0 b = new cxi_0();
    private ans_1 c;
    protected static final Logger a = Logger.getLogger(cxi_0.class);
    private ArrayList<cxk_0> d = new ArrayList();
    private int e = 0;
    private int f;

    public static cxi_0 a() {
        return b;
    }

    public void c() {
        if (this.d.size() != 0) {
            this.e = (this.e + 1) % this.d.size();
            this.f();
        }
    }

    public void d() {
        if (this.d.size() != 0) {
            this.e = (this.e - 1 + this.d.size()) % this.d.size();
            this.f();
        }
    }

    public void e() {
        cxk_0 cxk_02 = this.d.get(this.e);
        this.d = this.h();
        this.e = this.d.indexOf(cxk_02);
        this.f();
    }

    private void f() {
        if (!this.d.isEmpty()) {
            cxk_0 cxk_02 = this.d.get(this.e);
            String string = this.e + 1 + "/" + this.d.size();
            fis_1.a().a("currentPage", (Object)string, "dimensionalBagAppearanceManagerDialog");
            fis_1.a().a("dimensionalBag.selected.appearance", cxk_02);
        }
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 19802: {
                dfs_0 dfs_02 = (dfs_0)adt_12;
                fis_1.a().a("dimensionalBag.selected.appearance", dfs_02.k());
                return false;
            }
        }
        return true;
    }

    private void g() {
        cxk_0 cxk_02;
        int n;
        if (this.d.size() != 0 && (n = (cxk_02 = this.d.get(this.e)).a()) != this.f) {
            this.f = n;
            cpO cpO2 = new cpO();
            cpO2.b(n);
            azu_0.j().K().c(cpO2);
        }
    }

    private ArrayList<cxk_0> h() {
        this.e = -1;
        boolean bl = false;
        bmr_1 bmr_12 = azu_0.j().k();
        bsx_2 bsx_22 = bmr_12.dj();
        if (bsx_22 != null) {
            bl = bsx_22.m();
            this.f = bsx_22.f();
        }
        int n = cxi_0.a(bmr_12);
        int n2 = 0;
        ArrayList<cxk_0> arrayList = new ArrayList<cxk_0>();
        TIntIntHashMap tIntIntHashMap = ((bFW)bfv_0.b().a()).a(bfy_0.c.a());
        TIntIntIterator tIntIntIterator = tIntIntHashMap.iterator();
        while (tIntIntIterator.hasNext()) {
            tIntIntIterator.advance();
            int n3 = tIntIntIterator.key();
            boolean bl2 = bol_1.a(n3, ft_1.o);
            if (!bl2 || !ffh.a(n, n3) || !(bl2 = bl ? ffc.a.c(n3) : ffc.a.b(n3))) continue;
            if (n3 == this.f) {
                this.e = n2;
            }
            arrayList.add(new cxk_0(n3, tIntIntIterator.value()));
            ++n2;
        }
        if (this.e == -1) {
            this.e = 0;
            this.f = arrayList.get(this.e).a();
        }
        return arrayList;
    }

    private static int a(bmr_1 bmr_12) {
        faV faV2 = bmr_12.fE();
        return faV2 == null ? 0 : faV2.n();
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.c = new cxj_0(this);
            fpm_0.b().a(this.c);
            fpm_0.b().a("dimensionalBagAppearanceManagerDialog", cfi_0.a("dimensionalBagAppearanceManagerDialog"), 32768L, (short)10000);
            this.e = 0;
            this.d = this.h();
            this.f();
            fpm_0.b().a("wakfu.appearanceManager", cgy_0.class);
            cdw_0.n().z();
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.g();
            bsx_2 bsx_22 = azu_0.j().k().dj();
            if (bsx_22 != null) {
                bsx_22.a(this.f);
            }
            this.d = null;
            fpm_0.b().b(this.c);
            fis_1.a().a("editableDimensionalBag");
            fpm_0.b().o("dimensionalBagAppearanceManagerDialog");
            fpm_0.b().e("wakfu.appearanceManager");
            cdw_0.n().A();
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

