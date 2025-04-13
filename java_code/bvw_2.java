/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.hash.TLongByteHashMap
 *  gnu.trove.set.hash.TByteHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.framework.graphics.engine.material.Material;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TLongByteHashMap;
import gnu.trove.set.hash.TByteHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bvW
 */
public class bvw_2
implements su_0,
Sq,
Sv,
afu_0,
apk_1<Su>,
bwh_0 {
    private static final Logger a = Logger.getLogger(bvw_2.class);
    private final So b;
    private final List<blx_1> c = new ArrayList<blx_1>();
    private final List<blx_1> d = new ArrayList<blx_1>();
    private final bgw_2 e;
    private final TLongByteHashMap f = new TLongByteHashMap();
    @NotNull
    private final emr_2 g;
    private int h = -1;
    private elp_0 i;
    private int j = 0;
    private ArrayList<abo_2<Short, Short>> k = new ArrayList();
    private aiD l = new bvv_2();
    private tg_0 m;
    private blx_1 n;
    private blx_1 o;
    private long p;
    private long q;
    private final List<Long> r = new ArrayList<Long>();
    private final List<Long> s = new ArrayList<Long>();
    private short t;
    private final wt_0 u;
    private TByteHashSet v;
    private TByteHashSet w;
    private fzm_0 x;
    private final bas y = new bas();

    public void a(List<Long> list) {
        this.r.addAll(list);
    }

    public void b(List<Long> list) {
        this.s.addAll(list);
    }

    public boolean b(long l) {
        return this.r.contains(l);
    }

    public boolean c(long l) {
        return this.s.contains(l);
    }

    public bvw_2(@NotNull emr_2 emr_22, long l) {
        this(emr_22, l, null, null);
    }

    public bvw_2(@NotNull emr_2 emr_22, long l, TByteHashSet tByteHashSet, TByteHashSet tByteHashSet2) {
        this.g = emr_22;
        this.b = new bgf_0(this);
        this.e = new bgw_2(this, this.b);
        this.u = wc_0.p().j();
        this.u.a(l);
        this.v = tByteHashSet != null ? tByteHashSet : new TByteHashSet();
        this.w = tByteHashSet2 != null ? tByteHashSet2 : new TByteHashSet();
    }

    public void a(byte by, boolean bl) {
        if (bl) {
            this.v.add(by);
        } else {
            this.v.remove(by);
        }
    }

    public boolean b(byte by) {
        return this.v.contains(by);
    }

    public void a() {
        this.v.clear();
    }

    public void b(byte by, boolean bl) {
        if (bl) {
            this.w.add(by);
        } else {
            this.w.remove(by);
        }
    }

    public boolean c(byte by) {
        return this.w.contains(by);
    }

    public void b() {
        this.w.clear();
    }

    public void a(byte by, long l) {
        blx_1 blx_12 = bmf_2.a().c(l);
        if (blx_12 == null) {
            this.f.put(l, by);
            return;
        }
        this.a(blx_12, by);
    }

    public void a(blx_1 blx_12, byte by) {
        if (!this.c.contains(blx_12)) {
            this.c.add(blx_12);
            this.f.put(blx_12.a_(), by);
            blx_12.bx();
            blx_12.gl();
            aPc.f().a(blx_12, this.h);
            if (blx_12.S_()) {
                this.d.add(blx_12);
            }
            blx_12.a(this);
            blx_12.bv().a(this);
        } else {
            a.error((Object)("Ajout multiple du fighter " + blx_12 + " au combat externe ID=" + this.c()));
        }
    }

    @Override
    public int c() {
        return this.h;
    }

    @Override
    @NotNull
    public emr_2 af_() {
        return this.g;
    }

    @Override
    public elp_0 e() {
        return this.i;
    }

    public void a(elp_0 elp_02) {
        this.i = elp_02;
        if (elp_02 == elp_0.c) {
            this.C();
        }
    }

    private void C() {
        if (this.x != null) {
            this.x.a(16, null);
        }
        this.x = null;
    }

    public ema_1 b(blx_1 blx_12, byte by) {
        if (blx_12.ak()) {
            return ema_1.b;
        }
        if (blx_12.ab_()) {
            return ema_1.d;
        }
        if (by < 0 || by >= this.g.c()) {
            return ema_1.e;
        }
        if (!emb_0.a(this, (epq_2)blx_12)) {
            return ema_1.w;
        }
        cct_1 cct_12 = ccs_1.a().a(blx_12.T_());
        if (cct_12.a() && !this.c(blx_12, by)) {
            return ema_1.w;
        }
        if (!emb_0.a(this, blx_12, by)) {
            return ema_1.j;
        }
        if (!emb_0.a(this, blx_12, by)) {
            return ema_1.i;
        }
        if (!emb_0.b(this, blx_12, by)) {
            return ema_1.i;
        }
        ema_1 ema_12 = emb_0.c(this, blx_12, by);
        if (ema_12 != ema_1.a) {
            return ema_12;
        }
        if (by == 0 && this.g.t()) {
            return ema_1.a;
        }
        Collection<blx_1> collection = this.g(by);
        int n = collection.size();
        byte by2 = blx_12.gY();
        if (by2 == 0 || by2 == 5 ? n > this.g.d() : n > this.g.e()) {
            return ema_1.c;
        }
        return ema_1.a;
    }

    private boolean c(blx_1 blx_13, byte by) {
        Optional<fhe_0> optional = cxj_2.a.b();
        if (optional.isEmpty()) {
            return false;
        }
        fhe_0 fhe_02 = optional.get();
        int n = blx_13.bM();
        TIntArrayList tIntArrayList = fhe_02.i();
        Predicate<blx_1> predicate = blx_12 -> blx_12.f(erl_2.bi);
        boolean bl = this.f(by).stream().anyMatch(predicate.or(blx_12 -> tIntArrayList.contains(blx_12.bM())));
        if (bl && tIntArrayList.contains(n)) {
            return false;
        }
        TIntArrayList tIntArrayList2 = fhe_02.j();
        Predicate<blx_1> predicate2 = blx_12 -> blx_12.f(erl_2.bj);
        boolean bl2 = this.f(by).stream().anyMatch(predicate2.or(blx_12 -> tIntArrayList2.contains(blx_12.bM())));
        return !bl2 || !tIntArrayList2.contains(n);
    }

    @Override
    public byte d(long l) {
        if (this.f.contains(l)) {
            return this.f.get(l);
        }
        return -1;
    }

    @Override
    public byte f() {
        return this.f.get(this.p);
    }

    @Override
    public tg_0 g() {
        return this.m;
    }

    @Override
    public So h() {
        return this.b;
    }

    @Override
    public ss_0 i() {
        return this.e;
    }

    public void a(tg_0 tg_02) {
        this.m = tg_02;
    }

    public void a(int n) {
        this.h = n;
        this.y.a(this);
    }

    public void a(blx_1 blx_12) {
        if (!this.f.containsKey(blx_12.a_())) {
            a.warn((Object)String.format("[FIGHT_REFACTOR]Tentative de spawn du fighter %d sans connaitre sa team", blx_12.a_()));
            return;
        }
        byte by = this.f.get(blx_12.a_());
        this.a(blx_12, by);
        boolean bl = false;
        if (this.o == null && this.q == blx_12.a_()) {
            this.o = blx_12;
            bl = true;
        }
        if (this.n == null && this.p == blx_12.a_()) {
            this.n = blx_12;
            bl = true;
        }
        if (bl && this.n != null && this.o != null) {
            aPc.f().a(this);
        }
    }

    public void a(abz_0 abz_02, boolean bl) {
        block3: {
            Iterator<blx_1> iterator;
            block2: {
                iterator = this.j().iterator();
                if (!bl) break block2;
                if (!den.b()) break block3;
                while (iterator.hasNext()) {
                    blx_1 blx_12 = iterator.next();
                    Material material = bvw_2.d(blx_12.Y());
                    blx_12.bv().b(material);
                    material.u();
                }
                break block3;
            }
            while (iterator.hasNext()) {
                biI biI2 = iterator.next().bv();
                biI2.ad();
            }
        }
    }

    @Override
    public Collection<blx_1> j() {
        return Collections.unmodifiableCollection(this.c);
    }

    protected static Material d(byte by) {
        Material material = (Material)Material.d.d();
        switch (by) {
            case 0: {
                material.b(0.5f, 0.0f, 0.0f);
                break;
            }
            case 1: {
                material.b(0.0f, 0.0f, 0.5f);
                break;
            }
            default: {
                if (by > 7) {
                    material.b(1.0f, 1.0f, 1.0f);
                    a.error((Object)("team id : " + by + " > 7"));
                    break;
                }
                material.b(by, by, by);
            }
        }
        return material;
    }

    @Override
    public Collection<blx_1> e(byte by) {
        ArrayList<blx_1> arrayList = new ArrayList<blx_1>();
        for (blx_1 blx_12 : this.c) {
            if (this.f.get(blx_12.a_()) != by || !blx_12.o() || blx_12.a(eoz_1.bh)) continue;
            arrayList.add(blx_12);
        }
        return arrayList;
    }

    public boolean l() {
        for (blx_1 blx_12 : this.j()) {
            this.g(blx_12);
        }
        return true;
    }

    private boolean g(blx_1 blx_12) {
        biI biI2 = blx_12.bv();
        biI2.b(this);
        return true;
    }

    public void m() {
        for (blx_1 blx_12 : this.j()) {
            this.c(blx_12);
        }
    }

    @Override
    public void c(sd_0 sd_02) {
        if (!sd_02.as()) {
            return;
        }
        if (sd_02.i() != null) {
            if (sd_02.i() instanceof blx_1) {
                ((blx_1)sd_02.i()).bv().b((ejh_0)sd_02, false);
            }
        } else if (sd_02.h() != null && sd_02.h() instanceof blx_1) {
            ((blx_1)sd_02.h()).bv().b((ejh_0)sd_02, true);
        }
    }

    @Override
    public void a(sr_0 sr_02) {
        aPc.f().a(this, sr_02);
    }

    @Override
    public void a(sd_0 sd_02) {
        if (sd_02.i() != null) {
            if (sd_02.i() instanceof blx_1) {
                ((blx_1)sd_02.i()).bv().c((ejh_0)sd_02, false);
            }
        } else if (sd_02.h() != null && sd_02.h() instanceof blx_1) {
            ((blx_1)sd_02.h()).bv().c((ejh_0)sd_02, true);
        }
    }

    @Override
    public void a(sr_0 sr_02, apq_2 apq_22) {
    }

    @Override
    public void b(sd_0 sd_02) {
        this.a(sd_02);
    }

    @Override
    public void b(sr_0 sr_02, apq_2 apq_22) {
    }

    @Override
    public void d(sd_0 sd_02) {
        if (!sd_02.as()) {
            return;
        }
        if (sd_02.i() != null) {
            if (sd_02.i() instanceof blx_1) {
                ((blx_1)sd_02.i()).bv().a((ejh_0)sd_02, false);
            }
        } else if (sd_02.h() != null && sd_02.h() instanceof blx_1) {
            ((blx_1)sd_02.h()).bv().a((ejh_0)sd_02, true);
        }
    }

    @Override
    public void b(sr_0 sr_02) {
        aPc.f().c(this, sr_02);
    }

    @Override
    public void c(sr_0 sr_02) {
    }

    @Override
    public void c(sr_0 sr_02, apq_2 apq_22) {
    }

    @Override
    public void d(sr_0 sr_02) {
        aPc.f().b(this, sr_02);
    }

    public void a(ekk_0 ekk_02) {
        if (ekk_02 == null) {
            return;
        }
        if (!(ekk_02 instanceof erc_2)) {
            return;
        }
        erc_2 erc_22 = (erc_2)((Object)ekk_02);
        boolean bl = erc_22.hh();
        if (!bl) {
            return;
        }
        if (erc_22.hf() != null) {
            erc_22.hf().ap();
        }
    }

    @Override
    public Su f_(long l) {
        sr_0 sr_02 = null;
        if (this.e != null) {
            sr_02 = this.e.a(l);
        }
        if (sr_02 != null) {
            return sr_02;
        }
        for (blx_1 blx_12 : this.c) {
            if (blx_12.a_() != l) continue;
            return blx_12;
        }
        return null;
    }

    @Override
    public long a(byte by) {
        throw new UnsupportedOperationException("On ne doit pas cr\u00e9er de nouvelles ID ici");
    }

    public void n() {
        while (!this.c.isEmpty()) {
            this.h(this.c.get(0));
        }
        this.C();
        if (this.l != null) {
            aed.a.b((aei_0)((Object)this.l));
            this.l = null;
        }
    }

    private void h(blx_1 blx_12) {
        try {
            this.b(blx_12);
        }
        catch (Exception exception) {
            a.error((Object)("Erreur au retrait d'un personnage depuis une ExternalFightInfo " + aho_2.a(exception, 10)));
        }
        finally {
            blx_12.a((bvw_2)null);
        }
    }

    public void b(blx_1 blx_12) {
        if (!this.c.remove(blx_12)) {
            return;
        }
        if (this.n != null && this.n.a_() == blx_12.a_()) {
            this.n = null;
        } else if (this.o != null && this.o.a_() == blx_12.a_()) {
            this.o = null;
        }
        aPc.f().b(blx_12, this.h);
        this.c(blx_12);
        blx_12.a((byte)-1);
    }

    public void c(blx_1 blx_12) {
        this.g(blx_12);
        blx_12.bv().av();
    }

    @Override
    public void o() {
        this.m();
        aPc.f();
        aPc.b(this);
        ArrayList<blx_1> arrayList = new ArrayList<blx_1>(this.j());
        for (blx_1 su : arrayList) {
            try {
                this.d(su);
            }
            catch (Exception exception) {
                a.error((Object)"Exception levee", (Throwable)exception);
            }
        }
        for (sr_0 sr_02 : this.i().f()) {
            this.b(sr_02);
        }
        if (this.l != null) {
            aed.a.b((aei_0)((Object)this.l));
        }
        for (blx_1 blx_12 : this.d) {
            bmf_2.a().e(blx_12);
        }
        this.f.clear();
        this.c.clear();
        this.d.clear();
    }

    public Iterator<Su> p() {
        return new aca_1<Su>((Iterator<Su>)this.c.iterator(), (Iterator<Su>)this.e.c().iterator());
    }

    @Override
    public Collection<blx_1> f(byte by) {
        ArrayList<blx_1> arrayList = new ArrayList<blx_1>();
        for (blx_1 blx_12 : this.c) {
            if (this.f.get(blx_12.a_()) == by) continue;
            arrayList.add(blx_12);
        }
        return arrayList;
    }

    @Override
    public blx_1 e(long l) {
        for (blx_1 blx_12 : this.c) {
            if (blx_12.a_() != l) continue;
            return blx_12;
        }
        return null;
    }

    @Override
    public Collection<blx_1> g(byte by) {
        ArrayList<blx_1> arrayList = new ArrayList<blx_1>();
        for (blx_1 blx_12 : this.c) {
            if (this.f.get(blx_12.a_()) != by) continue;
            arrayList.add(blx_12);
        }
        return arrayList;
    }

    @Override
    public boolean e(sr_0 sr_02) {
        return sr_02.w() != ele_0.d.a() && sr_02.w() != ele_0.e.a() && sr_02.w() != ele_0.k.a() && sr_02.w() != ele_0.b.a();
    }

    @Override
    public aiD q() {
        return this.l;
    }

    @Override
    public Iterator<Su> k() {
        return this.p();
    }

    @Override
    public long r() {
        return 0L;
    }

    @Override
    public bas s() {
        return this.y;
    }

    @Override
    public List<Su> a(aff_1 aff_12) {
        return this.a(aff_12.d(), aff_12.e(), aff_12.f());
    }

    @Override
    public List<Su> a(int n, int n2, int n3) {
        ArrayList<Su> arrayList = new ArrayList<Su>();
        Iterator<Su> iterator = this.k();
        while (iterator.hasNext()) {
            Su su = iterator.next();
            if (aob_2.a(su, n, n2) != 0) continue;
            arrayList.add(su);
        }
        return arrayList;
    }

    public void d(blx_1 blx_12) {
        this.b(blx_12);
        blx_12.a((bvw_2)null);
        blx_12.bH();
        blx_12.by();
        aPc.f().b(blx_12, this.c());
    }

    public void t() {
        ++this.j;
    }

    public void u() {
        bwh_0 bwh_02;
        --this.j;
        if (this.j == 0 && (bwh_02 = bwj_1.a().a(this.c())) instanceof bvw_2) {
            this.o();
            bwj_1.a().b(this);
        }
    }

    public void a(fzm_0 fzm_02) {
        if (fzm_02 == this.x) {
            this.x = null;
        }
    }

    public int v() {
        return this.c.size() + this.e.e();
    }

    public ArrayList<abo_2<Short, Short>> w() {
        return this.k;
    }

    public blx_1 x() {
        return this.n;
    }

    public void e(blx_1 blx_12) {
        this.n = blx_12;
    }

    public blx_1 y() {
        return this.o;
    }

    public void f(blx_1 blx_12) {
        this.o = blx_12;
    }

    public void a(ArrayList<abo_2<Short, Short>> arrayList) {
        this.k = arrayList;
    }

    public void b(fzm_0 fzm_02) {
        this.C();
        this.x = fzm_02;
    }

    public void f(long l) {
        this.p = l;
    }

    public void g(long l) {
        this.q = l;
    }

    public void a(short s2) {
        this.t = s2;
    }

    public short z() {
        return this.t;
    }

    public void h(long l) {
        this.u.a(l);
    }

    public ww_0 A() {
        wt_0 wt_02 = wc_0.p().j();
        wt_0 wt_03 = wc_0.p().j();
        Long l = this.g.o();
        if (l == null) {
            int n = enp_2.a.b(ens_2.aO);
            wt_03.a(this.u.h() + (long)n);
        } else {
            wt_03.a(this.u.h() + l);
        }
        return wt_02.g(wt_03);
    }

    public String B() {
        wt_0 wt_02 = wc_0.p().j();
        wt_02.a(wc_0.p().g());
        ww_0 ww_02 = this.u.g(wt_02);
        StringBuilder stringBuilder = new StringBuilder();
        if (ww_02.c() > 0) {
            stringBuilder.append(String.format("%d:%02d:%02d", ww_02.c(), ww_02.b(), ww_02.a()));
        } else {
            stringBuilder.append(String.format("%02d:%02d", ww_02.b(), ww_02.a()));
        }
        return stringBuilder.toString();
    }

    @Override
    public /* synthetic */ ema_1 a(elw_0 elw_02, byte by) {
        return this.b((blx_1)elw_02, by);
    }

    @Override
    public /* synthetic */ elw_0 i(long l) {
        return this.e(l);
    }
}

