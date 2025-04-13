/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.set.hash.THashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.set.hash.THashSet;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from eqt
 */
final class eqt_1 {
    private static final Logger a = Logger.getLogger(eqt_1.class);
    private final epq_2 b;
    private final efj_0 c = new efj_0().a(14);
    private final efj_0 d = new efj_0().a(31);

    eqt_1(epq_2 epq_22) {
        this.b = epq_22;
    }

    public void a() {
        this.b.ht();
        this.i();
        try {
            this.d();
            this.f();
            this.h();
            this.g();
            this.e();
        }
        catch (Exception exception) {
            a.error((Object)("[Items] Error while reloading item effects of character " + this.b), (Throwable)exception);
        }
        finally {
            this.j();
        }
        this.b.hu();
    }

    private void d() {
        this.b.dR().a(12).forEach(sd_02 -> {
            if (!(sd_02 instanceof eja_0)) {
                return;
            }
            Object EC = sd_02.k();
            if (!(EC instanceof exk_2)) {
                return;
            }
            ezr_0<?> ezr_02 = ((exk_2)EC).T();
            if (ezr_02 == null) {
                return;
            }
            if (!ezr_02.U()) {
                return;
            }
            ((ejh_0)sd_02).bm_();
            this.b.dR().b((sd_0)sd_02);
        });
    }

    private void e() {
        this.b().g(31);
        exh_1 exh_12 = this.b.dS();
        if (exh_12 == null) {
            return;
        }
        TLongObjectIterator<exg_2> tLongObjectIterator = exh_12.i();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            exg_2 exg_22 = (exg_2)tLongObjectIterator.value();
            this.a(exg_22);
        }
    }

    private void a(exg_2 exg_22) {
        Object r2 = eyo_1.g().d(exg_22.d());
        if (r2 == null) {
            return;
        }
        Iterator<efh_0> iterator = ((ezr_0)r2).u();
        So so = this.c();
        int n = this.b.G();
        int n2 = this.b.H();
        short s2 = this.b.I();
        while (iterator.hasNext()) {
            efh_0 efh_02 = iterator.next();
            if (efh_02.h() != 0 || efh_02.L()) continue;
            efh_02.a(this.d.a(), this.b, so, efc_0.a(), n, n2, s2, this.b, null, false);
        }
    }

    private void f() {
        Optional<exk_2> optional;
        Object object;
        THashSet tHashSet = new THashSet();
        if (this.b.a(eqr_1.b) && (object = this.b.cG()) != null && ((eyz_0)object).a(this.b)) {
            for (Map.Entry object2 : ((eyz_0)object).a().entrySet()) {
                try {
                    exk_2 exk_22;
                    optional = eZi.a(this.b, (exh_2)object2.getKey());
                    if (optional.isEmpty() || !(exk_22 = optional.get()).aU_()) continue;
                    if (exk_22.T().x() != 0) {
                        Object ItemSet = this.b.cj().b(exk_22.T().x());
                        tHashSet.add(ItemSet);
                    }
                    this.a(exk_22);
                    this.c(exk_22);
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    a.error((Object)("ConcurrentModificationException while applyingItemAndSetEffects for item " + object2.getValue() + " on breed " + this.b.gO()));
                    throw concurrentModificationException;
                }
            }
        }
        object = this.k();
        if (this.b.a(eqr_1.d) && object != null) {
            Iterator<Object> iterator = ((TL)object).iterator();
            while (iterator.hasNext()) {
                exk_2 exk_23 = (exk_2)iterator.next();
                try {
                    if (!exk_23.aU_()) continue;
                    if (exk_23.T().x() != 0) {
                        optional = this.b.cj().b(exk_23.T().x());
                        tHashSet.add(optional);
                    }
                    this.a(exk_23);
                    this.c(exk_23);
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    a.error((Object)("ConcurrentModificationException while applyingItemAndSetEffects for item " + exk_23.aT_() + " on breed " + this.b.gO()));
                    throw concurrentModificationException;
                }
            }
        }
        for (exo_2 exo_22 : tHashSet) {
            this.a(exo_22);
        }
    }

    private void g() {
        boolean bl;
        So so = this.c();
        HashSet<exk_2> hashSet = new HashSet<exk_2>();
        eyt_0 eyt_02 = this.b.dC();
        eaz_0<? extends epq_2> eaz_02 = this.b.cZ();
        block0: do {
            Object object;
            bl = false;
            if (this.b.a(eqr_1.b) && (object = this.b.cG()) != null && ((eyz_0)object).a(this.b)) {
                for (Map.Entry entry : ((eyz_0)object).a().entrySet()) {
                    exk_2 exk_22;
                    Optional<exk_2> optional = eyt_02.b((Long)entry.getValue());
                    if (optional.isEmpty() || !(exk_22 = optional.get()).aU_() || hashSet.contains(exk_22) || exk_22.aQ_() && this.b.ak() || exf_1.a().a(exk_22, (Su)this.b, so) && !enp_2.a.h(ens_2.aH).contains(exk_22.aT_())) continue;
                    bl = true;
                    hashSet.add(exk_22);
                    this.a(exk_22);
                    if (eaz_02 == null) break;
                    eaz_02.a((exh_2)entry.getKey());
                    break;
                }
            }
            object = this.k();
            if (!this.b.a(eqr_1.d) || object == null) continue;
            Iterator<Object> iterator = ((TL)object).iterator();
            while (iterator.hasNext()) {
                exk_2 exk_23 = (exk_2)iterator.next();
                if (!exk_23.aU_() || hashSet.contains(exk_23) || exk_23.aQ_() && this.b.ak() || exf_1.a().a(exk_23, (Su)this.b, so)) continue;
                bl = true;
                hashSet.add(exk_23);
                this.a(exk_23);
                if (eaz_02 == null) continue block0;
                eaz_02.a(exh_2.a((byte)((TL)object).f(exk_23.a())));
                continue block0;
            }
        } while (bl);
    }

    private void h() {
        eaz_0<? extends epq_2> eaz_02 = this.b.cZ();
        if (eaz_02 == null) {
            return;
        }
        eaz_02.c();
        eaz_02.a();
        if (!this.b.a(eqr_1.b)) {
            exq_2 exq_22 = this.k();
            if (exq_22 == null) {
                return;
            }
            for (exk_2 exk_22 : exq_22) {
                if (!exk_22.aU_() || !exk_22.y()) continue;
                exh_2 exh_22 = exh_2.a((byte)exq_22.g(exk_22));
                eaz_02.a(exh_22, exk_22.C());
            }
            eaz_02.b();
            return;
        }
        eyz_0 eyz_02 = this.b.cG();
        if (eyz_02 == null || !eyz_02.a(this.b)) {
            return;
        }
        eyt_0 eyt_02 = this.b.dC();
        if (eyt_02 == null) {
            return;
        }
        for (Map.Entry<exh_2, Long> entry : eyz_02.a().entrySet()) {
            exk_2 exk_23;
            Optional<exk_2> optional = eyt_02.b(entry.getValue());
            if (optional.isEmpty() || !(exk_23 = optional.get()).aU_() || !exk_23.y()) continue;
            eaz_02.a(entry.getKey(), exk_23.C());
        }
        eaz_02.b();
    }

    void a(exk_2 exk_22) {
        this.b().a(exk_22, true);
    }

    boolean b(exk_2 exk_22) {
        So so = this.c();
        if (!exf_1.a().a(exk_22, (Su)this.b, so)) {
            return false;
        }
        return this.c(exk_22);
    }

    void a(eyz_0 eyz_02) {
        exp_1 exp_12 = this.b.cj();
        Map<exh_2, Long> map = eyz_02.a();
        for (Map.Entry<exh_2, Long> entry : map.entrySet()) {
            Optional<exk_2> optional = eZi.a(this.b, eyz_02, entry.getKey());
            if (optional.isEmpty()) {
                a.warn((Object)("Impossible to remove item effects : Item Unknown " + entry));
                return;
            }
            exk_2 exk_22 = optional.get();
            short s2 = exk_22.T().x();
            if (s2 > 0 && exp_12 != null) {
                Object ItemSet = exp_12.b(s2);
                this.a(exk_22, (exo_2)ItemSet);
                continue;
            }
            this.a(exk_22);
        }
    }

    boolean c(exk_2 exk_22) {
        if (!exk_22.aU_()) {
            return false;
        }
        So so = this.c();
        int n = this.b.G();
        int n2 = this.b.H();
        short s2 = this.b.I();
        for (efh_0 efh_02 : exk_22) {
            if (efh_02.h() != 0 || efh_02.L()) continue;
            efh_02.a(exk_22, this.b, so, efc_0.a(), n, n2, s2, this.b, null, false);
        }
        return true;
    }

    void a(exk_2 exk_22, exo_2 exo_22) {
        this.b().a(exk_22, true);
        this.a(exo_22);
    }

    private void a(exo_2 exo_22) {
        efi_0 efi_02 = this.c.a((long)exo_22.h()).a();
        this.b().a(efi_02, true);
        short s2 = this.b(exo_22);
        ArrayList<exz_2> arrayList = exo_22.d(s2);
        if (arrayList.isEmpty()) {
            return;
        }
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            this.a(arrayList.get(k), this.b.Q_());
        }
    }

    private short b(exo_2<? extends ezr_0> exo_22) {
        eyz_0 eyz_02 = this.b.cG();
        exq_2 exq_22 = this.k();
        eyt_0 eyt_02 = this.b.dC();
        short s2 = 0;
        for (ezr_0 ezr_02 : exo_22) {
            Object object;
            if (eyz_02 != null && eyt_02 != null && eyz_02.a(this.b)) {
                object = eyz_02.a().entrySet().iterator();
                while (object.hasNext()) {
                    exk_2 exk_22;
                    Map.Entry entry = (Map.Entry)object.next();
                    Optional<exk_2> optional = eyt_02.b((Long)entry.getValue());
                    if (!optional.isPresent() || (exk_22 = optional.get()).aT_() != ezr_02.n() || !eyf_1.a(this.b, eyz_02, exk_22, eyz_02.a(exk_22.a()), this.c(), false)) continue;
                    s2 = (short)(s2 + 1);
                }
            }
            if (exq_22 == null || !this.b.a(eqr_1.d) || (object = (exk_2)exq_22.c(ezr_02.n())) == null || !exf_1.a().a((exk_2)object, (Su)this.b, this.c())) continue;
            s2 = (short)(s2 + 1);
        }
        return s2;
    }

    private void a(exz_2 exz_22, So so) {
        int n = this.b.G();
        int n2 = this.b.H();
        short s2 = this.b.I();
        for (efh_0 efh_02 : exz_22) {
            efh_02.a(exz_22, this.b, so, efc_0.a(), n, n2, s2, this.b, null, false);
        }
    }

    private void i() {
        this.a(this.a(eps_0.c));
        this.a(this.a(eps_0.d));
        this.a(this.a(eps_0.e));
        this.a(this.a(eps_0.b));
    }

    private void a(epa_1 epa_12) {
        if (epa_12 != null) {
            epa_12.y();
        }
    }

    private void j() {
        this.b(this.a(eps_0.c));
        this.b(this.a(eps_0.d));
        this.b(this.a(eps_0.e));
        this.b(this.a(eps_0.b));
    }

    private void b(epa_1 epa_12) {
        if (epa_12 != null) {
            epa_12.z();
        }
    }

    private exq_2 k() {
        exq_2 exq_22 = this.b.R_();
        Optional<ezi_1> optional = eBx.a(this.b);
        if (optional.isEmpty()) {
            return exq_22;
        }
        exq_2 exq_23 = new exq_2();
        eZh eZh2 = eZh.a(optional.get().a());
        Map<exh_2, Integer> map = eZh2.a();
        for (Map.Entry<exh_2, Integer> entry : map.entrySet()) {
            try {
                Integer n = entry.getValue();
                exh_2 exh_22 = entry.getKey();
                exq_23.b(eBx.a(exh_22, n), exh_22.a());
            }
            catch (Uy uy) {
                a.error((Object)("Unable to generate fake EquipmentSheet for " + this.b), (Throwable)uy);
            }
            catch (uc_0 uc_02) {
                a.error((Object)("Unable to generate fake EquipmentSheet for " + this.b), (Throwable)uc_02);
            }
            catch (uz_0 uz_02) {
                a.error((Object)("Unable to generate fake EquipmentSheet for " + this.b), (Throwable)uz_02);
            }
        }
        return exq_23;
    }

    public eJL b() {
        return this.b.dR();
    }

    public So c() {
        return this.b.Q_();
    }

    public epa_1 a(ru_0 ru_02) {
        return this.b.a_(ru_02);
    }
}

