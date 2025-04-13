/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TByteObjectIterator
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TByteObjectIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;

public class bOw
implements ajh_1 {
    private static final Logger o = Logger.getLogger(bOw.class);
    public static final String a = "currentShortcutBarType";
    public static final String b = "selectedShortcutBar";
    public static final String d = "currentShortcutBarNumber";
    public static final String e = "currentShortcutBarNumberText";
    public static final String f = "leftHandWeaponShortcut";
    public static final String g = "rightHandWeaponShortcut";
    public static final String h = "closedShortcutBars";
    public static final String i = "shortcutBar2";
    public static final String j = "shortcutBar3";
    public static final String k = "shortcutBar4";
    public static final String l = "displaySymbiotBar";
    public static final String[] m = new String[]{"currentShortcutBarType", "selectedShortcutBar", "currentShortcutBarNumber", "currentShortcutBarNumberText", "leftHandWeaponShortcut", "rightHandWeaponShortcut", "closedShortcutBars", "displaySymbiotBar"};
    private bOv[] p;
    private boolean q = false;
    private byte r = 0;
    private byte s = 0;
    private byte[] t;
    private byte[] u;
    private final boq_0 v;
    private final boq_0 w;
    private fid x = fid.a;
    private final ArrayList<bOy> y = new ArrayList();
    private long z;

    public void a(long l) {
        this.z = l;
    }

    public bOw() {
        int n = fid.g();
        this.p = new bOv[n];
        byte by = 0;
        for (fid n5 : fid.values()) {
            int n2 = n5.d();
            bOv[] bOvArray = new bOv[n2];
            for (int k = 0; k < n2; ++k) {
                switch (n5) {
                    case c: {
                        bOvArray[k] = new bOC(by);
                        break;
                    }
                    default: {
                        bOvArray[k] = new bOv(n5, by);
                    }
                }
                this.p[by] = bOvArray[k];
                by = (byte)(by + 1);
            }
        }
        Object r2 = eyo_1.g().d(2145);
        if (r2 != null) {
            this.w = boq_0.a(fie.d, -1L, ((ezr_0)r2).n(), ((ezr_0)r2).C());
            this.v = boq_0.a(fie.d, -1L, -1, 0);
        } else {
            this.w = null;
            this.v = null;
        }
        int n3 = 0;
        int n4 = 0;
        this.t = new byte[fid.b.d()];
        this.u = new byte[fid.a.d()];
        for (int n5 = 0; n5 < this.p.length; n5 = (int)((byte)(n5 + 1))) {
            if (this.p[n5].a() == fid.b) {
                int n6 = n3;
                n3 = (byte)(n3 + 1);
                this.t[n6] = n5;
                continue;
            }
            if (this.p[n5].a() != fid.a) continue;
            int n7 = n4;
            n4 = (byte)(n4 + 1);
            this.u[n7] = n5;
        }
        if (this.u.length > 0) {
            this.r = this.u[0];
        }
        if (this.t.length > 0) {
            this.s = this.t[0];
        }
    }

    public void a(fiz<bpl_0> fiz2) {
        ArrayList<bpl_0> arrayList = fiz2.b(ts_02 -> true);
        this.a(arrayList);
    }

    public void a(Iterable<bpl_0> iterable) {
        this.f();
        bOv bOv2 = this.d((byte)0);
        bOv bOv3 = this.d((byte)1);
        bOv2.i();
        bOv3.i();
        this.a(iterable, bOv2, bOv3);
        bOv2.j();
        bOv3.j();
        this.z();
    }

    private void a(Iterable<bpl_0> iterable, bOv bOv2, bOv bOv3) {
        Iterator<bpl_0> iterator = iterable.iterator();
        int n = 0;
        while (iterator.hasNext() && n < 12) {
            bpl_0 bpl_02 = iterator.next();
            if (bpl_02 == null) {
                ++n;
                continue;
            }
            if (((bph_0)bpl_02.r()).w()) continue;
            if (n < 6) {
                bOv2.a(boq_0.a(fie.a, bpl_02.a(), bpl_02.aT_(), bpl_02.n()), (short)n);
            } else {
                bOv3.a(boq_0.a(fie.a, bpl_02.a(), bpl_02.aT_(), bpl_02.n()), (short)(n % 6));
            }
            ++n;
        }
    }

    public void a() {
        if (this.w != null) {
            this.w.release();
        }
        if (this.v != null) {
            this.v.release();
        }
        Arrays.stream(this.p).forEach(bOv::q);
        this.p = null;
    }

    public void a(boolean bl) {
        cJz.a = bl;
    }

    public void a(fid fid2) {
        for (int k = this.y.size() - 1; k >= 0; --k) {
            this.y.get(k).a(fid2);
        }
    }

    public void a(bOy bOy2) {
        if (!this.y.contains(bOy2)) {
            this.y.add(bOy2);
        }
    }

    public void b(bOy bOy2) {
        this.y.remove(bOy2);
    }

    public fid b() {
        return this.x;
    }

    public bOC c() {
        return (bOC)this.p[fid.c.e()];
    }

    public void e() {
        if (!this.q) {
            this.q = true;
            this.b(fid.c);
            this.w();
            fis_1.a().a((ajf_1)this, l);
        }
    }

    public void f() {
        if (this.q) {
            this.q = false;
            this.b(fid.b);
            this.w();
            fis_1.a().a((ajf_1)this, l);
        }
    }

    public void a(ezm_1 ezm_12) {
        for (bOv bOv2 : this.p) {
            bOv2.r().forEach(boq_02 -> {
                if (boq_02.n() != fie.f) {
                    return;
                }
                int n = boq_02.aT_();
                ezj_1 ezj_12 = ezm_12.a(n);
                if (ezj_12 == null) {
                    return;
                }
                boq_02.a(ezj_12.d());
            });
        }
    }

    public void b(fid fid2) {
        bvx_0 bvx_02 = (bvx_0)ans_0.D().h();
        this.a(fid2, true, (byte)bvx_02.d(fid2 == fid.b ? bWe.l : bWe.m));
    }

    public void a(fid fid2, boolean bl) {
        bvx_0 bvx_02 = (bvx_0)ans_0.D().h();
        this.a(fid2, bl, (byte)bvx_02.d(fid2 == fid.b ? bWe.l : bWe.m));
    }

    public void a(fid fid2, byte by) {
        this.a(fid2, true, by);
    }

    public void a(fid fid2, boolean bl, byte by) {
        if (this.q && fid2 != fid.c) {
            return;
        }
        if (this.x == fid2) {
            return;
        }
        this.a(fid2);
        this.x = fid2;
        this.a(by != -1 ? by : (byte)this.x.e(), false);
        if (bl) {
            this.w();
        }
        dcj_0.a().f();
        if (fid2.b()) {
            ((bvx_0)ans_0.D().h()).a((agp_0)bWe.k, this.x.name());
        }
        fis_1.a().a((ajf_1)this, i, j, k);
    }

    private boolean g(byte by) {
        for (byte by2 : this.u) {
            if (by2 != by) continue;
            return true;
        }
        return false;
    }

    private boolean h(byte by) {
        for (byte by2 : this.t) {
            if (by2 != by) continue;
            return true;
        }
        return false;
    }

    public bOv g() {
        if (this.s < 0 || this.s >= this.p.length) {
            return null;
        }
        return this.p[this.s];
    }

    public byte h() {
        return this.s;
    }

    public String i() {
        return String.valueOf(this.h() - this.g().a().e() + 1);
    }

    public void a(byte by) {
        this.b(by, true);
    }

    private void b(byte by, boolean bl) {
        if (this.s != by && this.h(by)) {
            this.s = by;
            ((bvx_0)ans_0.D().h()).a((agp_0)bWe.l, this.s);
            if (bl) {
                this.w();
            }
        }
    }

    public Function<bpl_0, Short> j() {
        return bpl_02 -> bpl_02 == null ? (short)Short.MAX_VALUE : this.a(bpl_02.aT_(), fid.b);
    }

    public bOv k() {
        if (this.r < 0 || this.r >= this.p.length) {
            return null;
        }
        return this.p[this.r];
    }

    public byte l() {
        return this.r;
    }

    public String m() {
        return String.valueOf(this.l() - this.k().a().e() + 1);
    }

    public void b(byte by) {
        this.c(by, true);
    }

    private void c(byte by, boolean bl) {
        if (this.r != by && this.g(by)) {
            this.r = by;
            ((bvx_0)ans_0.D().h()).a((agp_0)bWe.m, this.r);
            if (bl) {
                this.w();
            }
        }
    }

    public int a(bOv bOv2) {
        for (int k = 0; k < this.p.length; ++k) {
            if (this.p[k] != bOv2) continue;
            return k;
        }
        return -1;
    }

    private void C() {
        int n = -1;
        for (int k = 0; k < this.t.length; ++k) {
            if (this.t[k] != this.s) continue;
            n = k;
            break;
        }
        if (n != -1) {
            this.a(this.t[(n + 1) % this.t.length]);
        }
    }

    private void D() {
        int n = -1;
        for (int k = 0; k < this.t.length; ++k) {
            if (this.t[k] != this.s) continue;
            n = k;
            break;
        }
        if (n != -1) {
            this.a(this.t[(n - 1 + this.t.length) % this.t.length]);
        }
    }

    private void E() {
        int n = -1;
        for (int k = 0; k < this.u.length; ++k) {
            if (this.u[k] != this.r) continue;
            n = k;
            break;
        }
        if (n != -1) {
            this.b(this.u[(n + 1) % this.u.length]);
        }
    }

    private void F() {
        int n = -1;
        for (int k = 0; k < this.u.length; ++k) {
            if (this.u[k] != this.r) continue;
            n = k;
            break;
        }
        if (n != -1) {
            this.b(this.u[(n - 1 + this.u.length) % this.u.length]);
        }
    }

    public void n() {
        if (this.x == fid.b) {
            this.C();
        } else if (this.x == fid.a) {
            this.E();
        }
        fis_1.a().a((ajf_1)this, h);
    }

    public void o() {
        if (this.x == fid.b) {
            this.D();
        } else if (this.x == fid.a) {
            this.F();
        }
        fis_1.a().a((ajf_1)this, h);
    }

    public bOv c(byte by) {
        return this.b(fid.a, by);
    }

    public bOv d(byte by) {
        return this.b(fid.b, by);
    }

    public bOv e(byte by) {
        return this.b(this.x, by);
    }

    public bOv b(fid fid2, byte by) {
        assert (by >= 0 && by < fid2.d()) : "On essaye de r\u00e9cup\u00e9rer une ShortCutBar de type " + fid2 + " de num\u00e9ro " + by;
        if (this.p.length <= by + fid2.e()) {
            return null;
        }
        return this.p[by + fid2.e()];
    }

    public ArrayList<bOv> b(boolean bl) {
        if (this.x == fid.b) {
            return this.c(bl);
        }
        if (this.x == fid.a) {
            return this.d(bl);
        }
        return null;
    }

    public ArrayList<bOv> c(boolean bl) {
        return this.a(fid.b, this.h(), bl);
    }

    public ArrayList<bOv> d(boolean bl) {
        return this.a(fid.a, this.l(), bl);
    }

    private ArrayList<bOv> a(fid fid2, byte by, boolean bl) {
        short s2 = fid2.e();
        ArrayList<bOv> arrayList = new ArrayList<bOv>();
        for (int k = 0; k < fid2.d(); ++k) {
            int n = k + s2;
            if (bl && n == by) continue;
            arrayList.add(this.p[n]);
        }
        return arrayList;
    }

    public bOv f(byte by) {
        assert (by >= 0 && by < this.p.length) : "On essaye de r\u00e9cup\u00e9rer la shortcutBar de num\u00e9ro " + by;
        return this.p[by];
    }

    private byte a(fid fid2, boq_0 boq_02) {
        int n = -1;
        byte by = -1;
        byte by2 = -1;
        for (byte by3 = 0; by3 < fid2.d(); by3 = (byte)(by3 + 1)) {
            byte by4 = (byte)(by3 + fid2.e());
            short s2 = this.p[by4].a(boq_02);
            if (s2 != -1) {
                by = by4;
                n = by;
                break;
            }
            if (!this.p[by4].b(boq_02)) continue;
            by2 = by4;
            n = by2;
            break;
        }
        if (n != -1) {
            switch (fid2) {
                case a: {
                    this.b(by);
                    break;
                }
                case b: {
                    this.a(by);
                }
            }
        }
        return by2;
    }

    public boolean a(boq_0 boq_02, int n, short s2) {
        if (n == -1) {
            fid fid2 = this.b();
            if (fid2 == fid.b) {
                if (!this.g().m()) {
                    n = this.h();
                }
            } else if (!this.k().m()) {
                n = this.l();
            }
            if (n == -1) {
                n = this.a(fid2, boq_02);
            }
        }
        if (n == -1) {
            return false;
        }
        bOv bOv2 = this.f((byte)n);
        boolean bl = bOv2.a(boq_02, s2);
        if (bl && s2 == -1) {
            switch (bOv2.a()) {
                case a: {
                    this.b((byte)n);
                    break;
                }
                case b: {
                    this.a((byte)n);
                }
            }
        }
        return bl;
    }

    public void a(int n, fie fie2, boolean bl) {
        for (bOv bOv2 : this.p) {
            bOv2.a(n, fie2, bl);
        }
    }

    public void a(long l, boolean bl) {
        for (bOv bOv2 : this.p) {
            bOv2.a(l, bl);
        }
    }

    public boolean a(int n, short s2, boolean bl) {
        return this.f((byte)n).a(s2, bl);
    }

    public void b(boq_0 boq_02, int n, short s2) {
        this.f((byte)n).b(boq_02, s2);
    }

    public void p() {
        if (this.p == null) {
            return;
        }
        clz clz2 = null;
        int n = 0;
        for (bOv bOv2 : this.p) {
            if (bOv2.a() == fid.b) {
                bOv2.e();
            }
            if (bOv2.c()) {
                if (clz2 == null) {
                    clz2 = new clz(this.z);
                }
                byte by = (byte)(n - bOv2.a().e());
                TByteObjectIterator<boq_0> tByteObjectIterator = bOv2.f();
                while (tByteObjectIterator.hasNext()) {
                    tByteObjectIterator.advance();
                    clz2.a((byte)bOv2.a().ordinal(), by, tByteObjectIterator.key(), (boq_0)tByteObjectIterator.value());
                }
                tByteObjectIterator = bOv2.g();
                while (tByteObjectIterator.hasNext()) {
                    tByteObjectIterator.advance();
                    clz2.a((byte)bOv2.a().ordinal(), by, tByteObjectIterator.key());
                }
                tByteObjectIterator = bOv2.h();
                while (tByteObjectIterator.hasNext()) {
                    tByteObjectIterator.advance();
                    clz2.a((byte)bOv2.a().ordinal(), by, tByteObjectIterator.key());
                }
                bOv2.e();
            }
            n = (byte)(n + 1);
        }
        if (clz2 != null) {
            azu_0.j().K().c(clz2);
        }
    }

    public boolean a(int n) {
        for (bOv bOv2 : this.p) {
            if (bOv2.b(n) == null) continue;
            return true;
        }
        return false;
    }

    public short a(int n, fid fid2) {
        for (bOv bOv2 : this.a(fid2, (byte)-1, false)) {
            boq_0 boq_02 = bOv2.b(n);
            if (boq_02 == null) continue;
            return (short)(bOv2.a(boq_02) + bOv2.n() * fid2.c());
        }
        return Short.MAX_VALUE;
    }

    public void q() {
        this.a(this.v);
    }

    public void r() {
        this.a(this.w);
    }

    private void a(boq_0 boq_02) {
        byte by;
        exk_2 exk_22;
        Object object;
        bmr_1 bmr_12 = azu_0.j().k();
        Optional<exk_2> optional = bmr_12.dC().b(boq_02.a());
        if (optional.isEmpty()) {
            if (boq_02.aT_() != 2145) {
                return;
            }
            object = eyo_1.g().d(2145);
            exk_2 exk_23 = new exk_2(-1L);
            exk_23.b((ezr_0)object);
            exk_23.a((short)1);
            exk_22 = exk_23;
            by = exh_2.p.A;
        } else {
            exk_22 = optional.get();
            object = bmr_12.cG().a(exk_22.a());
            if (object == null) {
                return;
            }
            by = ((exh_2)object).a();
        }
        if (exk_22.aU_()) {
            object = new dgm_0();
            ((dgm_0)object).a(exk_22, by);
            ((anw_1)object).a_(18450);
            add_2.b().a((adt_1)object);
        }
    }

    public void a(byte by, short s2) {
        cJz.useItem(null, this.f(by).b(s2), false);
    }

    public void a(exk_2 exk_22) {
        int n = exk_22.aT_();
        for (bOv bOv2 : this.p) {
            ArrayList<boq_0> arrayList = bOv2.a(n);
            if (arrayList == null) continue;
            for (int k = arrayList.size() - 1; k >= 0; --k) {
                boq_0 boq_02 = arrayList.get(k);
                fis_1.a().a((ajf_1)boq_02, "quantity", "usable");
            }
        }
    }

    public void b(exk_2 exk_22) {
        if (exk_22 == null) {
            return;
        }
        Set set = Stream.of(this.p).flatMap(bOv2 -> bOv2.a(exk_22.aT_()).stream()).collect(Collectors.toSet());
        for (boq_0 boq_02 : set) {
            boq_02.a((byte)(exk_22.X() && exk_22.aU_() ? 2 : 3));
        }
    }

    public void a(exk_2 exk_22, exk_2 exk_23) {
        byte by;
        if (exk_23 != null) {
            by = exk_23.X() && exk_23.aU_() ? (byte)2 : 3;
            this.v.b(fie.c, exk_23.a(), exk_23.aT_(), exk_23.I());
            this.v.a(by);
        } else {
            this.v.b(fie.d, -1L, -1, 0);
        }
        if (exk_22 != null) {
            by = exk_22.X() && exk_22.aU_() ? (byte)2 : 3;
            this.w.b(fie.c, exk_22.a(), exk_22.aT_(), exk_22.I());
            this.w.a(by);
        } else {
            Object r2 = eyo_1.g().d(2145);
            this.w.b(fie.d, -1L, ((ezr_0)r2).n(), ((ezr_0)r2).C());
        }
        fis_1.a().a((ajf_1)this, f, g);
    }

    public void a(exk_2 exk_22, um_0 um_02) {
        try {
            if (um_02.d() == exh_2.p.A || um_02.d() == exh_2.q.a()) {
                int n;
                boolean bl = false;
                int n2 = 0;
                int n3 = n = exk_22.X() && exk_22.aU_() ? 2 : 3;
                if (um_02.d() == exh_2.q.A) {
                    this.v.b(fie.c, exk_22.a(), exk_22.aT_(), exk_22.I());
                    this.v.a((byte)n);
                    bl = true;
                } else {
                    this.w.b(fie.c, exk_22.a(), exk_22.aT_(), exk_22.I());
                    this.w.a((byte)n);
                    n2 = 1;
                }
                if (bl) {
                    fis_1.a().a((ajf_1)this, f);
                }
                if (n2 != 0) {
                    fis_1.a().a((ajf_1)this, g);
                }
            }
            if (exk_22.X() && exk_22.aU_()) {
                for (bOv bOv2 : this.p) {
                    try {
                        ArrayList<boq_0> arrayList = bOv2.a(exk_22.aT_());
                        for (boq_0 boq_02 : arrayList) {
                            boq_02.a((byte)2);
                        }
                    }
                    catch (Exception exception) {
                        o.error((Object)("Erreur a la modification d'un shortcut " + exception));
                    }
                }
            } else {
                for (bOv bOv3 : this.p) {
                    try {
                        ArrayList<boq_0> arrayList = bOv3.a(exk_22.aT_());
                        for (boq_0 boq_03 : arrayList) {
                            boq_03.a((byte)3);
                        }
                    }
                    catch (Exception exception) {
                        o.error((Object)("Erreur a la modification d'un shortcut " + exception));
                    }
                }
            }
            this.z();
        }
        catch (Exception exception) {
            o.error((Object)("Erreur a l'ajout d'un shortcut " + exception));
        }
    }

    public void c(exk_2 exk_22) {
        boolean bl = false;
        boolean bl2 = false;
        if (exk_22.a() == this.v.a()) {
            this.v.b(fie.d, -1L, -1, 0);
            bl = true;
        } else if (exk_22.a() == this.w.a()) {
            this.w.b(fie.d, -1L, -1, 0);
            bl2 = true;
        }
        if (this.v.aT_() == -1 && this.w.aT_() == -1) {
            Object r2 = eyo_1.g().d(2145);
            this.w.b(fie.d, -1L, ((ezr_0)r2).n(), ((ezr_0)r2).C());
            bl2 = true;
        }
        if (bl) {
            fis_1.a().a((ajf_1)this, f);
        }
        if (bl2) {
            fis_1.a().a((ajf_1)this, g);
        }
        for (bOv bOv2 : this.p) {
            try {
                ArrayList<boq_0> arrayList = bOv2.a(exk_22.aT_());
                for (boq_0 boq_02 : arrayList) {
                    if (exk_22.T().a(exh_2.p) || exk_22.T().a(exh_2.q)) {
                        boq_02.a((byte)5);
                        continue;
                    }
                    boq_02.a((byte)0);
                }
            }
            catch (Exception exception) {
                o.error((Object)("Erreur a la modification d'un shortcut " + exception));
            }
        }
        this.z();
    }

    public void a(fie fie2, int n, int n2) {
        for (bOv bOv2 : this.p) {
            for (boq_0 boq_02 : bOv2.r()) {
                if (boq_02 == null || boq_02.n() != fie2 || boq_02.aT_() != n) continue;
                boq_02.a(n2);
            }
        }
    }

    @Override
    public String[] d() {
        return m;
    }

    @Override
    public Object b(String string) {
        switch (string) {
            case "currentShortcutBarType": {
                return this.x.ordinal();
            }
            case "selectedShortcutBar": {
                return this.v();
            }
            case "currentShortcutBarNumber": {
                return this.u();
            }
            case "currentShortcutBarNumberText": {
                return this.t();
            }
            case "leftHandWeaponShortcut": {
                return this.v == null || this.v.aT_() == -1 ? null : this.v;
            }
            case "rightHandWeaponShortcut": {
                return this.w.aT_() != -1 ? this.w : null;
            }
            case "displaySymbiotBar": {
                return this.q;
            }
            case "shortcutBar2": {
                return this.e((byte)1);
            }
            case "shortcutBar3": {
                return this.e((byte)2);
            }
            case "shortcutBar4": {
                return this.e((byte)3);
            }
        }
        return null;
    }

    public boolean s() {
        return this.q;
    }

    public String t() {
        if (this.x == fid.b) {
            return this.i();
        }
        if (this.x == fid.a) {
            return this.m();
        }
        return null;
    }

    public byte u() {
        if (this.x == fid.b) {
            return this.h();
        }
        if (this.x == fid.a) {
            return this.l();
        }
        return -1;
    }

    public void a(byte by, boolean bl) {
        if (this.x == fid.b) {
            this.b(by, bl);
        } else if (this.x == fid.a) {
            this.c(by, bl);
        }
    }

    public bOv v() {
        if (this.q) {
            return this.c();
        }
        if (this.x == fid.b) {
            return this.g();
        }
        if (this.x == fid.a) {
            return this.k();
        }
        return null;
    }

    public void w() {
        fis_1.a().a((ajf_1)this, a, b, d, e, h);
        this.x();
    }

    public void x() {
        fis_1.a().a((ajf_1)this, g, f);
    }

    public void y() {
        for (bOv bOv2 : this.p) {
            bOv2.k();
        }
    }

    public void z() {
        int n;
        int n2 = this.x.d() + n;
        for (n = this.x.e(); n < n2; ++n) {
            this.p[n].j();
        }
        fis_1.a().a((ajf_1)this, f, g);
    }

    public void a(sb_2 sb_22) {
        int n;
        int n2 = sb_22.c.size();
        fid[] fidArray = fid.values();
        int[] nArray = new int[fidArray.length];
        boolean[] blArray = new boolean[fid.g()];
        Arrays.fill(nArray, 0);
        Arrays.fill(blArray, false);
        fid[] fidArray2 = fidArray;
        int n3 = fidArray2.length;
        for (int k = 0; k < n3; ++k) {
            fid fid2 = fidArray2[k];
            nArray[fid2.ordinal()] = fid2.e();
        }
        for (n = 0; n < n2; ++n) {
            byte by = sb_22.c.get((int)n).a.a;
            nArray[by] = nArray[by] + 1;
            blArray[n3] = true;
            if (this.p[n3].a(sb_22.c.get((int)n).a)) continue;
            o.error((Object)("Impossible de r\u00e9cup\u00e9rer l'inventaire de shortcut #" + n));
        }
        for (n = 0; n < blArray.length; ++n) {
            if (blArray[n]) continue;
            this.p[n].i();
        }
    }

    public boq_0 A() {
        return this.v;
    }

    public boq_0 B() {
        return this.w;
    }
}

