/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.chat.console.command.AwayCommand;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.LinkedList;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from cWW
 */
public class cww_0
extends xv_0
implements ahr_1,
fzu {
    private static final Logger b = Logger.getLogger(cww_0.class);
    private static final cww_0 c = new cww_0();
    private String d;
    private boolean e = true;
    private boolean f;
    private fvk_0 g;
    private final TIntObjectHashMap<dep> h = new TIntObjectHashMap();
    private static final int i = 2;
    static final TIntObjectHashMap<cXa> j = new TIntObjectHashMap();
    static final TIntObjectHashMap<cXa> k = new TIntObjectHashMap();
    public static final int a = 5000;
    private final LinkedList<Long> l = new LinkedList();

    public boolean a() {
        return this.g != null;
    }

    public static cww_0 c() {
        return c;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (adt_12 instanceof adh_2) {
            adh_2 adh_22 = (adh_2)adt_12;
            switch (adh_22.c()) {
                case 2: {
                    if (this.l.isEmpty()) break;
                    long l = this.l.removeFirst();
                    ble_1.E().G();
                }
            }
            return false;
        }
        switch (adt_12.a()) {
            case 17513: {
                aUv aUv2;
                dfv dfv2 = (dfv)adt_12;
                AwayCommand.b();
                auc_0 auc_02 = dfv2.k();
                if (auc_02 == null && (aUv2 = aUxx.a().f()) != null) {
                    auc_02 = aUv2.h();
                }
                if (auc_02 != null) {
                    aul_0.a().b().c(dfv2.o());
                }
                return false;
            }
            case 18583: {
                dfx dfx2 = (dfx)adt_12;
                AwayCommand.b();
                aUv aUv3 = aUxx.a().f();
                if (aUv3 == null || aUv3.h() == null) {
                    return false;
                }
                aUr aUr2 = aUv3.h();
                bhx bhx2 = dfx2.k();
                Object object = bhx2.o() ? bhx2.l() : aUr2.i() + " " + bhx2.l();
                aul_0.a().b().c((String)object);
                return false;
            }
            case 18120: {
                dfu dfu2 = (dfu)adt_12;
                auc_0 auc_03 = dfu2.o();
                aUY aUY2 = dfu2.k();
                auc_03.a(aUY2.a(), true);
                return false;
            }
            case 19517: {
                if (fpm_0.b().q("contactListDialog")) {
                    azu_0.j().b(cxs_0.a());
                } else {
                    azu_0.j().a(cxs_0.a());
                }
                return false;
            }
            case 16086: {
                dfc dfc2 = (dfc)adt_12;
                aUxx.a().c(dfc2.c());
                return false;
            }
            case 19390: {
                aUxx.a().f().b();
                aUxx.a().o();
                return false;
            }
            case 19398: {
                dfy dfy2 = (dfy)adt_12;
                aUxx.a().f().a(dfy2.k(), true);
                aUxx.a().o();
                return false;
            }
            case 17113: {
                dfc dfc3 = (dfc)adt_12;
                return this.a(dfc3.h(), aUe.b);
            }
            case 17760: {
                dfc dfc4 = (dfc)adt_12;
                return this.a(dfc4.h(), aUe.g);
            }
            case 18741: {
                dfc dfc5 = (dfc)adt_12;
                String string = dfc5.h();
                String string2 = aUr.e(string);
                aUv aUv4 = bdk_1.a(null, aUe.b, string);
                int n = aUv4.a();
                aUr aUr3 = aUv4.a(0);
                aUr3.a(string2);
                aUxx.a().g(n);
                fis_1.a().a("chat", (Object)aUv4, "exchangeDialog");
                return false;
            }
            case 16769: {
                dey.a();
                return false;
            }
            case 16701: {
                dfw dfw2 = (dfw)adt_12;
                String string = dfw2.k();
                String string3 = aUr.e(string);
                aUv aUv5 = bdk_1.a(null, aUe.b, string);
                int n = aUv5.a();
                aUr aUr4 = aUv5.a(0);
                aUr4.a(string3);
                aUxx.a().h(n);
                fis_1.a().a("chat", (Object)aUv5, "moderatorChatDialog");
                if (dfw2.o() != null) {
                    dfw2.o().a(aUv5);
                }
                return false;
            }
            case 17566: {
                dey.a();
                return false;
            }
            case 16511: {
                dfc dfc6 = (dfc)adt_12;
                int n = dfc6.c();
                this.d(n);
                return false;
            }
            case 19743: {
                dfc dfc7 = (dfc)adt_12;
                blx_1 blx_12 = bmf_2.a().b(dfc7.h());
                if (blx_12 == null || !blx_12.bv().at()) {
                    aUh.a("error.group.memberTooFar", new Object[0]);
                    return false;
                }
                aff_1 aff_12 = blx_12.P_();
                bmr_1 bmr_12 = azu_0.j().k();
                long l = blx_12.a_();
                if (!this.l.contains(l)) {
                    ble_1.E().a(aff_12.d(), aff_12.e(), aff_12.f(), blx_12.T_(), blx_12, false);
                    adi_2.a().a(this, 5000L, 2, 1L);
                    this.l.add(l);
                }
                return false;
            }
            case 19090: {
                dfc dfc8 = (dfc)adt_12;
                boolean bl = dfc8.i();
                if (!bl && this.e) {
                    return false;
                }
                long l = dfc8.d();
                int n = dfc8.c();
                cXa cXa2 = (cXa)k.get(n);
                if (cXa2 != null && bl) {
                    ado_1.a().b(cXa2);
                }
                if ((cXa2 = (cXa)j.get(n)) != null) {
                    ado_1.a().b(cXa2);
                }
                if (l == -1L) {
                    return false;
                }
                if (cXa2 == null) {
                    cXa2 = new cXa(this, n, true);
                }
                j.put(n, (Object)cXa2);
                ado_1.a().a(cXa2, l, 1);
                return false;
            }
            case 16373: {
                dfc dfc9 = (dfc)adt_12;
                boolean bl = dfc9.i();
                if (!bl && this.e) {
                    return false;
                }
                long l = dfc9.d();
                int n = dfc9.c();
                cXa cXa3 = (cXa)j.get(n);
                if (cXa3 != null && bl) {
                    ado_1.a().b(cXa3);
                }
                if ((cXa3 = (cXa)k.get(n)) != null) {
                    ado_1.a().b(cXa3);
                }
                if (cXa3 == null) {
                    cXa3 = new cXa(this, n, false);
                }
                k.put(n, (Object)cXa3);
                ado_1.a().a(cXa3, l, 1);
                return false;
            }
            case 18946: {
                this.e = ((dfc)adt_12).i();
                return false;
            }
            case 16337: {
                if (azu_0.j().k().ak()) {
                    return false;
                }
                long l = ((dfc)adt_12).d();
                Optional<cYN> optional = cYL.a().b(l);
                if (optional.isEmpty()) {
                    return false;
                }
                if (azu_0.j().c(cYL.a())) {
                    if (cYL.a().c() == l) {
                        azu_0.j().b(cYL.a());
                    } else {
                        cYL.a().a(optional.get());
                    }
                    return false;
                }
                cYL.a().a(optional.get());
                azu_0.j().a(cYL.a());
                return false;
            }
        }
        return true;
    }

    private boolean a(String string, aUe aUe2) {
        aUr aUr2 = aUxx.a().a(string, aUe2);
        if (aUr2 != null) {
            cFS.selectView(aUr2);
            return false;
        }
        aUv aUv2 = aUxx.a().c();
        boolean bl = aUv2 == null;
        return this.a(string, aUe2, bdk_1.a(aUv2, aUe2, string), bl);
    }

    private boolean a(String string, aUe aUe2, aUv aUv2, boolean bl) {
        aUr aUr2 = aUv2.h();
        aUr2.a(aUr.a(string, aUe2));
        int n = aUv2.a();
        String string2 = dey.a(n);
        fvk_0 fvk_02 = bl ? (fvk_0)this.a(aUv2, this.d) : this.b(aUv2.a());
        fpm_0.b().a(new cwx_0(this, string2, n));
        fid_1 fid_12 = (fid_1)fvk_02.getLayoutData();
        fid_12.setAlign(frk_0.i);
        this.d = string2;
        this.h.put(n, (Object)new dep(fvk_02, aUv2));
        aUxx.a().c(aUv2.a());
        fvk_02.a(new cWY(this, fvk_02));
        fis_1.a().a("chat", (Object)aUv2, string2);
        fis_1.a().a((ajf_1)aUv2, aUv.h);
        fis_1.a().a("chat.channels.list.displayed", (Object)false, string2);
        return false;
    }

    void d(int n) {
        String string = dey.a(n);
        aUxx.a().a(n, -1);
        this.a(n);
        if (string != null && string.equals(this.d)) {
            this.d = null;
        }
    }

    public fvk_0 d() {
        aUv aUv2 = aUxx.a().f();
        return aUv2 != null ? ((dep)this.h.get(aUv2.a())).a() : null;
    }

    @Override
    public long a_() {
        return 10L;
    }

    @Override
    public void a(long l) {
    }

    void a(boolean bl, int n) {
        dep dep2 = (dep)this.h.get(n);
        if (dep2 == null) {
            return;
        }
        dey.a(n, dep2, bl);
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.e = !((bvx_0)ans_0.D().h()).a(bWe.L);
            fis_1.a().a("chat.isMaximize", false);
            fis_1.a().a("chatManager", aUxx.a());
            fis_1.a().a("chat.editedView", (Object)null);
            TIntObjectIterator<aUv> tIntObjectIterator = aUxx.a().h();
            boolean bl2 = true;
            String string = null;
            boolean bl3 = ((bvx_0)ans_0.D().h()).a(bWe.R);
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                aUv aUv2 = (aUv)tIntObjectIterator.value();
                fyb_0 fyb_02 = this.a(aUv2, null);
                if (bl3) {
                    string = fyb_02.getElementMap().c();
                }
                if (this.e) continue;
                aUh.c(tIntObjectIterator.key(), false);
            }
            fpm_0.b().a("wakfu.chat", cFS.class);
            fta_0.getInstance().addEventListener(frd_0.u, this, false);
            fta_0.getInstance().addEventListener(frd_0.E, this, false);
            cgu_2.a().a(this);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            TIntObjectIterator<aUv> tIntObjectIterator = this.h.iterator();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                ((dep)tIntObjectIterator.value()).b();
            }
            fta_0.getInstance().removeEventListener(frd_0.u, this, false);
            fta_0.getInstance().removeEventListener(frd_0.E, this, false);
            j.clear();
            k.clear();
            this.h.clear();
            this.g = null;
            this.l.clear();
            aUi.a().b();
            adi_2.a().a(this);
            fis_1.a().a("chatManager");
            fis_1.a().a("chat.editedView");
            try {
                tIntObjectIterator = aUxx.a().h();
                while (tIntObjectIterator.hasNext()) {
                    tIntObjectIterator.advance();
                    aUv aUv2 = (aUv)tIntObjectIterator.value();
                    aUv2.n();
                    fpm_0.b().o(dey.a(aUv2.a()));
                }
            }
            catch (Exception exception) {
                b.error((Object)("Erreur \u00e0 la fermeture des chats " + exception));
            }
            fpm_0.b().e("wakfu.chat");
            cgu_2.a().b(this);
        }
    }

    public fyb_0 a(aUv aUv2, String string) {
        fyb_0 fyb_02 = dey.a(aUv2, string);
        this.h.put(aUv2.a(), (Object)new dep((fvk_0)fyb_02, aUv2));
        return fyb_02;
    }

    public aUv a(fck_2 fck_22) {
        TIntObjectIterator tIntObjectIterator = this.h.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            fvk_0 fvk_02 = ((dep)tIntObjectIterator.value()).a();
            if (!fvk_02.getAppearance().a(fck_22.a(fvk_02), fck_22.b(fvk_02))) continue;
            return aUxx.a().b(tIntObjectIterator.key());
        }
        return null;
    }

    public fvk_0 b(fck_2 fck_22) {
        TIntObjectIterator tIntObjectIterator = this.h.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            fvk_0 fvk_02 = ((dep)tIntObjectIterator.value()).a();
            if (!fvk_02.getAppearance().a(fck_22.a(fvk_02), fck_22.b(fvk_02))) continue;
            return fvk_02;
        }
        return null;
    }

    public aUr c(fck_2 fck_22) {
        TIntObjectIterator tIntObjectIterator = this.h.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            fvk_0 fvk_02 = ((dep)tIntObjectIterator.value()).a();
            if (!fvk_02.getAppearance().a(fck_22.a(fvk_02), fck_22.b(fvk_02))) continue;
            fsQ fsQ2 = (fsQ)fvk_02.getElementMap().a("viewsList");
            fvE fvE2 = fsQ2.getWidget(fck_22.a(fsQ2), fck_22.b(fsQ2));
            if (fvE2 == null) {
                return null;
            }
            return (aUr)fvE2.getRenderableParent().getItemValue();
        }
        return null;
    }

    @Override
    public boolean run(fzs fzs2) {
        fck_2 fck_22 = (fck_2)fzs2;
        block0 : switch (fzs2.f()) {
            case u: {
                TIntObjectIterator tIntObjectIterator = this.h.iterator();
                while (tIntObjectIterator.hasNext()) {
                    tIntObjectIterator.advance();
                    fvk_0 fvk_02 = ((dep)tIntObjectIterator.value()).a();
                    if (fvk_02.isUnloading()) continue;
                    fyy_0 fyy_02 = fvk_02.getElementMap();
                    fvE fvE2 = (fvE)fyy_02.a("chatWindow");
                    boolean bl = fvE2.getAppearance().a(fck_22.a(fvk_02), fck_22.b(fvk_02));
                    fvk_0 fvk_03 = this.g = bl ? fvk_02 : null;
                    if (!bl) continue;
                    break block0;
                }
                break;
            }
            case E: {
                if (this.g == null) break;
                fue_0 fue_02 = (fue_0)this.g.getElementMap().a("chatScrollContainer");
                if (fck_22.z() > 0) {
                    cFS.goDownText(fck_22, fue_02, false);
                    break;
                }
                cFS.goUpText(fck_22, fue_02, false);
            }
        }
        return false;
    }

    public void a(int n) {
        dep dep2 = (dep)this.h.remove(n);
        if (dep2 == null) {
            return;
        }
        fvk_0 fvk_02 = dep2.a();
        if (fvk_02 == null) {
            return;
        }
        String string = fvk_02.getElementMap().c();
        String string2 = fvk_02.getId();
        fkc_1 fkc_12 = (fkc_1)fvk_02.getUserDefinedManager();
        fpm_0.b().o(dey.a(n));
        fkc_12.c(string, string2);
    }

    public fvk_0 b(int n) {
        dep dep2 = (dep)this.h.get(n);
        return dep2 == null ? null : dep2.a();
    }

    public void a(aUv aUv2) {
        fis_1.a().a((ajf_1)aUv2, aUv2.d());
    }

    @Override
    public boolean a(int n, long l) {
        return this.a(n, l, -1);
    }

    public boolean a(int n, long l, int n2) {
        if (!((bvx_0)ans_0.D().h()).a(bWe.X)) {
            return false;
        }
        return cww_0.b(n, l, n2);
    }

    public static boolean b(int n, long l, int n2) {
        blx_1 blx_12 = bmf_2.a().c(l);
        if (blx_12 == null) {
            return der.a(n, l, n2);
        }
        epq_1 epq_12 = blx_12.Z_();
        if (epq_12 instanceof bpb_1) {
            return der.a(n, l, n2, blx_12);
        }
        return der.a(n, blx_12);
    }

    public void a(boolean bl) {
        if (this.h == null) {
            return;
        }
        TIntObjectIterator tIntObjectIterator = this.h.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            fyy_0 fyy_02 = ((dep)tIntObjectIterator.value()).a().getElementMap();
            if (fyy_02 == null) {
                return;
            }
            fyb_0 fyb_02 = fyy_02.a("chatOptionsButton");
            if (fyb_02 == null) {
                return;
            }
            ((fup_0)fyb_02).setSelected(bl);
        }
    }

    public void c(int n) {
        fvk_0 fvk_02 = this.b(n);
        dey.a(fvk_02);
    }
}

