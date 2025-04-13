/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;

/*
 * Renamed from cWi
 */
public class cwi_0
implements ahr_1 {
    private static final Logger d = Logger.getLogger(cwi_0.class);
    private static final cwi_0 e = new cwi_0();
    public static final int a = 2000;
    private ans_1 f;
    bhh_0 g;
    private final ArrayList<cWm> h = new ArrayList();
    private static final int i = 25;
    private amj_1 j;
    bIA k;
    exk_2 l;
    private boolean m = false;
    Runnable b;
    final aei_1 c = new cWl(this);

    public static cwi_0 a() {
        return e;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        return true;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            if (this.g == null || this.k == null) {
                return;
            }
            this.f = new cwj_0(this);
            fpm_0.b().a(this.f);
            fpm_0.b().a("wakfu.blindBox", cFH.class);
            fvk_0 fvk_02 = (fvk_0)fpm_0.b().a("blindBoxDialog", cfi_0.a("blindBoxDialog"), 8448L, (short)10005);
            fyy_0 fyy_02 = fpm_0.b().h().d("blindBoxDialog");
            fsQ fsQ2 = (fsQ)fyy_02.a("rollingItemList1");
            this.h.add(new cWm(this, fsQ2));
            this.h.add(new cWm(this, (fsQ)fyy_02.a("rollingItemList2")));
            this.h.add(new cWm(this, (fsQ)fyy_02.a("rollingItemList3")));
            this.m = false;
            fis_1.a().a("blindBox", this.g);
            ans_0.D().e().a(this.c, true);
        }
    }

    private void f() {
        this.g.a(false);
        for (cWm cWm2 : this.h) {
            cWm2.a(false, 0.9f);
        }
        this.b = new cWk(this);
        ado_1.a().a(this.b, 2000L, 1);
        this.j = cdw_0.n().a(600152L, true);
        if (this.j != null) {
            this.j.c(0.0f);
            this.j.a(1.0f, 100.0f);
        }
    }

    private void a(short s2) {
        for (cWm cWm2 : this.h) {
            cWm2.a(s2, false, 0.9f);
        }
    }

    private void b(short s2) {
        for (cWm cWm2 : this.h) {
            cWm2.a(s2);
        }
        this.m = false;
    }

    public void c() {
        if (this.b != null) {
            ado_1.a().b(this.b);
            this.b = null;
            this.m = true;
            this.k.b(this.l.a());
        }
    }

    int a(fsQ fsQ2, float f2) {
        if (fsQ2 == null) {
            return -1;
        }
        fsQ2.setListOffset(f2);
        this.g.a(f2);
        return -1;
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            if (this.j != null) {
                this.j.f(true);
                this.j.a(0.0f, 100.0f);
                this.j = null;
            }
            for (cWm cWm2 : this.h) {
                ado_1.a().b(cWm2);
            }
            this.h.clear();
            this.m = false;
            fpm_0.b().b(this.f);
            fis_1.a().a("blindBox");
            fpm_0.b().o("blindBoxDialog");
            fpm_0.b().e("wakfu.blindBox");
            ans_0.D().e().a(this.c);
        }
    }

    public void a(bhh_0 bhh_02) {
        this.g = bhh_02;
    }

    public static ArrayList<exi_2> a(int n) {
        Optional<aSx> optional = cwi_0.c(n);
        if (optional.isEmpty()) {
            return Lists.newArrayList();
        }
        aSx aSx2 = optional.get();
        aSy[] aSyArray = aSx2.d();
        if (aSyArray == null) {
            return Lists.newArrayList();
        }
        HashMap<Integer, exi_2> hashMap = new HashMap<Integer, exi_2>();
        List list = Stream.of(aSyArray).flatMap(aSy2 -> cwi_0.a(aSy2).stream()).collect(Collectors.toList());
        for (exi_2 exi_22 : list) {
            hashMap.put(exi_22.aT_(), exi_22);
        }
        return Lists.newArrayList(hashMap.values());
    }

    private static ArrayList<exi_2> a(aSy aSy2) {
        if (aSy2.e()) {
            return cwi_0.a(aSy2.a());
        }
        Optional<exi_2> optional = cwi_0.b(aSy2);
        if (optional.isEmpty()) {
            return Lists.newArrayList();
        }
        return Lists.newArrayList((Object[])new exi_2[]{optional.get()});
    }

    private static Optional<exi_2> b(aSy aSy2) {
        int n = aSy2.a();
        short s2 = aSy2.c();
        Object r2 = eyo_1.g().d(n);
        if (r2 == null) {
            return Optional.empty();
        }
        exi_2 exi_22 = new exi_2((ezr_0)r2);
        exi_22.a(s2);
        return Optional.of(exi_22);
    }

    private static Optional<aSx> c(int n) {
        try {
            aSx aSx2 = new aSx();
            if (!asw_2.a().a(n, aSx2)) {
                return Optional.empty();
            }
            return Optional.of(aSx2);
        }
        catch (Exception exception) {
            d.error((Object)("unable to load Loot List " + n), (Throwable)exception);
            return Optional.empty();
        }
    }

    public void b(int n) {
        int n2 = this.g.a(n);
        if (this.m) {
            this.b((short)n2);
        } else {
            this.a((short)n2);
        }
    }

    public void a(bIA bIA2, exk_2 exk_22) {
        this.l = exk_22;
        this.k = bIA2;
        this.g = new bhh_0(exk_22, cwi_0.a(bIA2.g()));
    }

    public byte d() {
        byte by = 0;
        for (cWm cWm2 : this.h) {
            if (!cWm2.a()) continue;
            by = (byte)(by + 1);
        }
        return by;
    }

    void g() {
        int n = -1;
        byte by = this.d();
        switch (by) {
            case 1: {
                n = 600153;
                break;
            }
            case 2: {
                n = 600154;
                break;
            }
            case 3: {
                n = 600155;
                break;
            }
            default: {
                return;
            }
        }
        cdw_0.n().c((long)n);
        if (by < 3) {
            return;
        }
        this.g.a(true);
        this.g.c();
        cdw_0.n().c(600156L);
        fyy_0 fyy_02 = fpm_0.b().h().d("blindBoxDialog");
        fso fso2 = (fso)fyy_02.a("containerParticle");
        fbx_1 fbx_12 = new fbx_1();
        fbx_12.onCheckOut();
        fbx_12.setUseParentScissor(true);
        fbx_12.setFile("6001051.xps");
        fbx_12.setAlignment(frs_0.e);
        fso2.getAppearance().add(fbx_12);
        if (this.j != null) {
            this.j.f(true);
            this.j.a(0.0f, 100.0f);
            this.j = null;
        }
    }

    public void e() {
        if (this.g.a()) {
            if (this.g.e() > 0) {
                this.f();
            } else {
                fpm_0.b().o("blindBoxDialog");
            }
        } else {
            this.c();
        }
    }
}

