/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.map.hash.TByteObjectHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bLC
 */
public class blc_1
implements ajh_1 {
    private static final Logger i = Logger.getLogger(blc_1.class);
    private static final float[] j = new float[]{1.0f, 1.0f, 1.0f, 1.0f};
    public static final String a = "points";
    public static final String b = "compass";
    private bum_0 k = new bum_0();
    protected final acy_2<TLongObjectHashMap<fjg_1>> d = new acy_2();
    protected final ArrayList<fjg_1> e = new ArrayList();
    protected final acy_2<TLongObjectHashMap<fjg_1>> f = new acy_2();
    protected final ArrayList<fjg_1> g = new ArrayList();
    protected final TLongObjectHashMap<fjg_1> h = new TLongObjectHashMap();
    private final TByteObjectHashMap<ArrayList<fjg_1>> l = new TByteObjectHashMap();
    private final aod_0 m = new aod_0();
    private bLt n = bLt.b;
    private fsS o;
    private final TLongArrayList p = new TLongArrayList();
    private static final LoadingCache<String, byte[]> q = CacheBuilder.newBuilder().expireAfterAccess(30L, TimeUnit.SECONDS).build((CacheLoader)new bld_1());

    @Override
    public String[] d() {
        return b_;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(b)) {
            return this.g;
        }
        if (string.equals(a)) {
            return this.e;
        }
        return null;
    }

    public void a(fsS fsS2) {
        this.o = fsS2;
        if (this.o != null) {
            TLongObjectIterator tLongObjectIterator = this.h.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                this.o.a((fjg_1)tLongObjectIterator.value());
            }
        }
    }

    public void a() {
        this.e();
        ccy_2 ccy_22 = cci_2.a.e();
        ArrayList<fjg_1> arrayList = new ArrayList<fjg_1>();
        this.l.put(buq_0.c.a(), arrayList);
        bLx.a(ccy_22, arrayList);
        this.o();
    }

    public bLt b() {
        return this.n;
    }

    public void a(bLt bLt2) {
        this.n = bLt2;
    }

    private void b(long l) {
        byte[] byArray;
        String string;
        if (!this.p.contains(l)) {
            this.p.add(l);
        }
        try {
            string = String.format(azs_0.a().a("mapsPoiPath"), l);
        }
        catch (gm_0 gm_02) {
            i.error((Object)"Probl\u00e8me lors de la lecture de mapsPoiPath");
            return;
        }
        try {
            byArray = (byte[])q.get((Object)string);
        }
        catch (ExecutionException executionException) {
            i.error((Object)("Unable to load map (" + string + ") in CACHE"), (Throwable)executionException);
            return;
        }
        if (byArray == null) {
            i.error((Object)("Unable to load map (" + string + ")"));
            return;
        }
        try {
            this.m.b(arf_1.a(byArray), false);
        }
        catch (IOException iOException) {
            i.error((Object)("Unable to load land marks from " + string), (Throwable)iOException);
            return;
        }
    }

    void a(TLongArrayList tLongArrayList) {
        this.e();
        int n = tLongArrayList.size();
        for (int k = 0; k < n; ++k) {
            this.b(tLongArrayList.get(k));
        }
        this.o();
    }

    public TLongArrayList c() {
        return this.p;
    }

    private String a(String string, CharSequence charSequence) {
        return string.replace("[default]", charSequence);
    }

    private afe a(afd afd2) {
        ArrayList<afe> arrayList = afd2.n;
        if (arrayList == null) {
            return null;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            afe afe2 = arrayList.get(k);
            if (afe2.d != null && !afe2.d.b(bmr_12, null, null, bmr_12.Q_())) continue;
            return afe2;
        }
        return null;
    }

    private void o() {
        try {
            this.p();
            int n = this.p.size();
            for (int k = 0; k < n; ++k) {
                this.c(this.p.get(k));
            }
            this.f();
        }
        catch (Exception exception) {
            i.error((Object)"Exception levee", (Throwable)exception);
        }
    }

    public void e() {
        this.m();
        this.l.clear();
        this.m.b();
        this.p.clear();
    }

    private void p() {
        TIntObjectIterator tIntObjectIterator = this.m.a().iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            this.b((afd)tIntObjectIterator.value());
        }
    }

    private void b(afd afd2) {
        afe afe2 = this.a(afd2);
        if (afe2 == null) {
            return;
        }
        int n = blc_1.c(afd2);
        if (n > 0) {
            return;
        }
        fjg_1 fjg_12 = afd2.k == bur_0.a.a() ? this.a(afd2, afe2) : (afd2.k == bur_0.b.a() ? this.b(afd2, afe2) : (afd2.k == bur_0.c.a() ? this.d(afd2, afe2) : (afd2.k == bur_0.d.a() ? this.c(afd2, afe2) : null)));
        if (fjg_12 == null) {
            return;
        }
        if (n == 0) {
            fjg_12.c(bLs.p);
        }
    }

    private long q() {
        if (this.p.isEmpty()) {
            return -1L;
        }
        return this.p.get(0);
    }

    private fjg_1 a(afd afd2, afe afe2) {
        fjh_1 fjh_12;
        fjh_1 fjh_13 = bLs.a.a(afe2.b);
        ArrayList<fjg_1> arrayList = this.b(afd2.f, true);
        fjh_1 fjh_14 = fjh_12 = afe2.b == 46 ? fjh_13 : null;
        if (fjh_13 == null) {
            return null;
        }
        fjg_1 fjg_12 = new fjg_1(afd2.c, afd2.d, afd2.e, this.q(), bae.h().a(35, (long)afe2.a, new Object[0]), afd2, fjh_13, fjh_12, j, false, false);
        arrayList.add(fjg_12);
        return fjg_12;
    }

    private fjg_1 b(afd afd2, afe afe2) {
        afc afc2 = this.m.a(afd2.l);
        if (afc2 == null) {
            return null;
        }
        bFZ bFZ2 = (bFZ)bfv_0.b().a(afc2.a, afc2.b, afc2.d);
        if (bFZ2 == null) {
            return null;
        }
        fjh_1 fjh_12 = bLs.a.a(afe2.b == -1 ? afc2.f : afe2.b);
        if (fjh_12 == null) {
            return null;
        }
        ArrayList<fjg_1> arrayList = this.b(bFX.a(afc2.b).c().a(), true);
        String string = this.a(bae.h().a(35, (long)afe2.a, new Object[0]), bFZ2.al_());
        fjg_1 fjg_12 = new fjg_1(afd2.c, afd2.d, afd2.e, this.q(), string, afc2, fjh_12, j);
        arrayList.add(fjg_12);
        bFZ2.release();
        return fjg_12;
    }

    private fjg_1 c(afd afd2, afe afe2) {
        bMn bMn2 = (bMn)bMs.a.e(afd2.l);
        if (bMn2 == null) {
            bMn2 = bMs.a.a(afd2.l);
        }
        if (bMn2 == null) {
            return null;
        }
        ani_2 ani_22 = new ani_2();
        bmp_0.a(ani_22, bMn2);
        String string = this.a(bae.h().a(35, (long)afe2.a, new Object[0]), ani_22.r());
        fjh_1 fjh_12 = bLs.a.a(afe2.b == -1 ? buq_0.i.a() : afe2.b);
        if (fjh_12 == null) {
            return null;
        }
        ArrayList<fjg_1> arrayList = this.b(buq_0.i.a(), true);
        fjg_1 fjg_12 = new fjg_1(afd2.c, afd2.d, afd2.e, this.q(), string, afd2, fjh_12, j);
        arrayList.add(fjg_12);
        return fjg_12;
    }

    @Nullable
    private fjg_1 d(afd afd2, afe afe2) {
        String string;
        ezb_2 ezb_22 = ezd_2.a.b(afd2.l);
        if (ezb_22 == null) {
            return null;
        }
        int n = fas.a.c(ezb_22.a());
        if (fas.a.a(n)) {
            return null;
        }
        ani_2 ani_22 = new ani_2();
        ani_22.a((CharSequence)bae.h().a(137, (long)ezb_22.a(), new Object[0]));
        ani_22.m().a((CharSequence)bae.h().a("required.level.custom", ezb_22.c()));
        if (n != -1 && !(string = bte.a(azu_0.j().k(), n)).isEmpty()) {
            ani_22.m().a((CharSequence)string);
        }
        string = this.a(bae.h().a(35, (long)afe2.a, new Object[0]), ani_22.r());
        fjh_1 fjh_12 = bLs.a.a(afe2.b == -1 ? buq_0.j.a() : afe2.b);
        if (fjh_12 == null) {
            return null;
        }
        ArrayList<fjg_1> arrayList = this.b(buq_0.j.a(), true);
        fjg_1 fjg_12 = new fjg_1(afd2.c, afd2.d, afd2.e, this.q(), string, afd2, fjh_12, j);
        fjg_12.e(ans_0.F().k().dt() < ezb_22.c());
        arrayList.add(fjg_12);
        return fjg_12;
    }

    private static int c(afd afd2) {
        if (afd2.i > 1) {
            return 1;
        }
        if (afd2.i == 1 && afd2.j > 86) {
            return 1;
        }
        if (afd2.i == 1 && afd2.j == 86) {
            return 0;
        }
        return -1;
    }

    private void a(ArrayList<afc> arrayList) {
        bfv_0 bfv_02 = bfv_0.b();
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            fjh_1 fjh_12;
            afc afc2 = arrayList.get(k);
            bFZ bFZ2 = (bFZ)bfv_02.a(afc2.a, afc2.b, afc2.d);
            if (bFZ2 == null || (fjh_12 = bLs.a.a(afc2.f)) == null) continue;
            ArrayList<fjg_1> arrayList2 = this.b(bFX.a(afc2.b).c().a(), true);
            arrayList2.add(new fjg_1(bFZ2.G(), bFZ2.H(), bFZ2.I(), this.q(), bFZ2.al_(), afc2, fjh_12, j));
            bFZ2.release();
        }
    }

    private void c(long l) {
        TIntObjectIterator tIntObjectIterator = bup_0.a().a(l).iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            this.b((buo_0)tIntObjectIterator.value(), false);
        }
    }

    public void a(buq_0 buq_02) {
        bun_0 bun_02 = this.k.a(buq_02.a());
        if (bun_02 == null) {
            return;
        }
        ArrayList<fjg_1> arrayList = this.b(bun_02.a(), false);
        if (arrayList == null) {
            return;
        }
        for (fjg_1 fjg_12 : this.n.a(arrayList)) {
            this.n.a(fjg_12);
            if (bun_02.a(fjg_12)) {
                this.b(fjg_12);
                continue;
            }
            this.a(fjg_12);
        }
    }

    public void f() {
        for (buq_0 buq_02 : buq_0.values()) {
            this.a(buq_02);
        }
    }

    private void a(fjg_1 fjg_12) {
        if (this.h.remove((long)fjg_12.j().hashCode()) != null && this.o != null) {
            this.o.b(fjg_12);
        }
    }

    private void b(fjg_1 fjg_12) {
        if (this.h.put((long)fjg_12.j().hashCode(), (Object)fjg_12) == null && this.o != null) {
            this.o.a(fjg_12);
        }
    }

    private boolean r() {
        return !this.l.isEmpty();
    }

    private ArrayList<fjg_1> b(byte by, boolean bl) {
        ArrayList arrayList = (ArrayList)this.l.get(by);
        if (bl && arrayList == null) {
            arrayList = new ArrayList();
            this.l.put(by, arrayList);
        }
        return arrayList;
    }

    public void g() {
        try {
            this.k.b();
            this.f();
        }
        catch (Exception exception) {
            i.error((Object)"Exception levee", (Throwable)exception);
        }
    }

    public void h() {
        this.k.c();
        this.f();
    }

    public void i() {
        this.k.e();
    }

    public void a(bum_0 bum_02) {
        this.k = bum_02;
        this.f();
    }

    public bum_0 j() {
        return this.k;
    }

    public void a(byte by, boolean bl) {
        this.a(by, bl, true);
    }

    public void a(byte by, boolean bl, boolean bl2) {
        this.k.a(by, bl, bl2);
        this.f();
    }

    public void b(buq_0 buq_02) {
        Object object;
        ArrayList<fjg_1> arrayList = this.b(buq_02.a(), false);
        if (arrayList == null) {
            return;
        }
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            object = arrayList.remove(0);
            this.a((fjg_1)object);
        }
        TIntObjectHashMap<afd> tIntObjectHashMap = this.m.a();
        TIntObjectIterator tIntObjectIterator = tIntObjectHashMap.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            object = (afd)tIntObjectIterator.value();
            if (((afd)object).f != buq_02.a()) continue;
            this.b((afd)object);
        }
        this.a(buq_02);
    }

    public void a(buo_0 buo_02, boolean bl) {
        if (buo_02 == null) {
            return;
        }
        ArrayList<fjg_1> arrayList = this.b(buq_0.b.a(), false);
        if (arrayList == null) {
            return;
        }
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            fjg_1 fjg_12 = arrayList.get(k);
            if (fjg_12.j() != buo_02) continue;
            arrayList.remove(k);
            this.a(fjg_12);
            break;
        }
        if (bl) {
            this.f();
        }
    }

    public void a(buo_0 buo_02) {
        this.b(buo_02, true);
        if (!this.k.a(buq_0.b.a()).a(null)) {
            this.a(buq_0.b.a(), true, false);
        }
    }

    private void b(buo_0 buo_02, boolean bl) {
        if (buo_02 == null) {
            return;
        }
        fjh_1 fjh_12 = bLs.a.a(buo_02.f());
        if (fjh_12 == null) {
            return;
        }
        ArrayList<fjg_1> arrayList = this.b(buq_0.b.a(), true);
        arrayList.add(new fjg_1(buo_02.b(), buo_02.c(), buo_02.d(), this.q(), buo_02.e(), buo_02, fjh_12, bLs.f, j, true, true));
        if (bl) {
            this.f();
        }
    }

    public buo_0 a(int n, int n2, int n3) {
        return this.a(n, n2, 0, n3, bae.h().a("desc.landMark.personalNote", new Object[0]));
    }

    public buo_0 a(int n, int n2, int n3, int n4, String string) {
        return this.a(n, n2, n3, n4, string, false);
    }

    public buo_0 a(int n, int n2, int n3, int n4, String string, boolean bl) {
        buo_0 buo_02 = bup_0.a().a(n, n2, n3, string, n4, bl);
        this.a(buo_02);
        return buo_02;
    }

    public buo_0 a(int n, int n2, int n3, int n4) {
        return this.a(n, n2, n3, n4, bae.h().a("desc.landMark.personalNote", new Object[0]));
    }

    public void b(buo_0 buo_02) {
        if (!bup_0.a().a(buo_02)) {
            return;
        }
        this.a(buo_02, true);
    }

    public void c(buo_0 buo_02) {
        ArrayList<fjg_1> arrayList = this.b(buq_0.b.a(), false);
        if (arrayList == null) {
            return;
        }
        for (int k = arrayList.size() - 1; k >= 0; --k) {
            fjg_1 fjg_12 = arrayList.get(k);
            if (buo_02 != fjg_12.j()) continue;
            fjg_12.a(buo_02.e());
        }
    }

    public void a(long l, int n, float f2, float f3, float f4, String string, Object object, fjh_1 fjh_12, String string2, float[] fArray, long l2) {
        fjg_1 fjg_12;
        if (fjh_12 == null) {
            return;
        }
        TLongObjectHashMap tLongObjectHashMap = this.d.g(n);
        if (tLongObjectHashMap == null) {
            tLongObjectHashMap = new TLongObjectHashMap();
            this.d.a(n, (TLongObjectHashMap<fjg_1>)tLongObjectHashMap);
        }
        if ((fjg_12 = (fjg_1)tLongObjectHashMap.get(l)) != null) {
            fjg_12.a(f2, f3, f4);
            fjg_12.a(fjh_12);
            fjg_12.a(fArray);
            fjg_12.b(string2);
        } else {
            tLongObjectHashMap.put(l, (Object)new fjg_1(f2, f3, f4, l2, string, object, fjh_12, string2, fArray));
        }
        this.s();
    }

    public void a(long l, int n, float f2, float f3, float f4, long l2, String string, Object object, fjh_1 fjh_12, float[] fArray) {
        fjg_1 fjg_12;
        if (fjh_12 == null) {
            return;
        }
        TLongObjectHashMap tLongObjectHashMap = this.f.g(n);
        if (tLongObjectHashMap == null) {
            tLongObjectHashMap = new TLongObjectHashMap();
            this.f.a(n, (TLongObjectHashMap<fjg_1>)tLongObjectHashMap);
        }
        if ((fjg_12 = (fjg_1)tLongObjectHashMap.get(l)) != null) {
            fjg_12.a(f2, f3, f4);
            fjg_12.a(fjh_12);
            fjg_12.a(fArray);
        } else {
            tLongObjectHashMap.put(l, (Object)new fjg_1(f2, f3, f4, l2, string, object, fjh_12, fArray));
        }
        this.t();
    }

    public void a(float f2, float f3, float f4, long l, String string, Object object, fjh_1 fjh_12, float[] fArray) {
        TLongObjectHashMap<fjg_1> tLongObjectHashMap = this.f.g(5);
        if (tLongObjectHashMap != null) {
            tLongObjectHashMap.clear();
        }
        this.a(0L, 5, f2, f3, f4, l, string, object, fjh_12, fArray);
    }

    protected fjg_1 k() {
        TLongObjectHashMap<fjg_1> tLongObjectHashMap = this.f.g(5);
        if (tLongObjectHashMap == null) {
            return null;
        }
        return (fjg_1)tLongObjectHashMap.get(0L);
    }

    void a(long l, int n, float f2, float f3, float f4, long l2) {
        if (this.a(l, n, f2, f3, f4, l2, this.d)) {
            this.s();
        }
        if (this.a(l, n, f2, f3, f4, l2, this.f)) {
            this.t();
        }
    }

    private boolean a(long l, int n, float f2, float f3, float f4, long l2, acy_2<TLongObjectHashMap<fjg_1>> acy_22) {
        TLongObjectHashMap<fjg_1> tLongObjectHashMap = acy_22.g(n);
        if (tLongObjectHashMap == null) {
            return false;
        }
        fjg_1 fjg_12 = (fjg_1)tLongObjectHashMap.get(l);
        if (fjg_12 != null) {
            fjg_12.a(f2, f3, f4);
            fjg_12.a(l2);
            return true;
        }
        return false;
    }

    public void a(int n, long l) {
        TLongObjectHashMap<fjg_1> tLongObjectHashMap = this.d.g(n);
        if (tLongObjectHashMap == null) {
            return;
        }
        if (tLongObjectHashMap.remove(l) != null) {
            this.s();
        }
    }

    public void b(int n, long l) {
        TLongObjectHashMap<fjg_1> tLongObjectHashMap = this.f.g(n);
        if (tLongObjectHashMap == null) {
            return;
        }
        if (tLongObjectHashMap.remove(l) != null) {
            this.t();
        }
    }

    public void l() {
        TLongObjectHashMap<fjg_1> tLongObjectHashMap = this.f.g(5);
        if (tLongObjectHashMap == null) {
            return;
        }
        if (tLongObjectHashMap.remove(0L) != null) {
            this.t();
        }
    }

    public void a(long l) {
        fjg_1 fjg_12 = (fjg_1)this.h.remove(l);
        this.a(fjg_12);
    }

    public void m() {
        if (this.o != null) {
            this.o.g();
        }
        this.h.clear();
    }

    private void s() {
        this.e.clear();
        int n = this.d.d();
        for (int k = 0; k < n; ++k) {
            TLongObjectHashMap<fjg_1> tLongObjectHashMap = this.d.h(k);
            TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                this.e.add((fjg_1)tLongObjectIterator.value());
            }
        }
        fis_1.a().a((ajf_1)this, a);
    }

    private void t() {
        this.g.clear();
        int n = this.f.d();
        for (int k = 0; k < n; ++k) {
            TLongObjectHashMap<fjg_1> tLongObjectHashMap = this.f.h(k);
            TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                this.g.add((fjg_1)tLongObjectIterator.value());
            }
        }
        fis_1.a().a((ajf_1)this, b);
    }

    public void a(int n) {
        if (this.d.f(n) != null) {
            this.s();
        }
    }

    public void n() {
        int n;
        if (this.d != null) {
            n = this.d.d();
            this.d.c();
            this.e.clear();
            i.info((Object)("Nettoyage des points contenus dans la map (" + this.d.d() + " restants sur " + n + ")"));
        }
        if (this.f != null) {
            n = this.f.d();
            this.f.c();
            this.g.clear();
            i.info((Object)("Nettoyage des points contenus dans la map (" + this.f.d() + " restants sur " + n + ")"));
        }
        i.info((Object)"Nettoyage de la boussole contenue dans la map");
        if (this.h != null) {
            n = this.h.size();
            this.h.clear();
            if (this.o != null) {
                this.o.g();
            }
            i.info((Object)("Nettoyage des rep\u00e8res contenus dans la map (" + this.h.size() + " restants sur " + n + ")"));
        }
    }
}

