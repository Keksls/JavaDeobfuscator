/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;
import java.nio.ByteBuffer;
import java.util.HashMap;
import org.jetbrains.annotations.Nullable;

public class bMs
extends fge_0<bMn> {
    final HashMap<Integer, Integer> c = new HashMap();
    private final HashMap<Integer, Integer> d = new HashMap();
    private final asy_2<atg_0> e;
    private final asy_2<atg_0> f = new asz_2<atg_0>(new atg_0());
    public static final bMs a = new bMs();

    private bMs() {
        this.e = new asz_2<atg_0>(new atg_0());
        this.a();
    }

    @Override
    public boolean a(bMn bMn2) {
        atg_0 atg_02 = this.e.a(bMn2.B());
        if (atg_02 == null) {
            return false;
        }
        bMz bMz2 = bMs.a(atg_02);
        aff_1 aff_12 = bMz2.b();
        bMn2.a(aff_12.d(), aff_12.e(), aff_12.f());
        for (bmx_0 bmx_02 : bMz2.c()) {
            bMn2.a(bmx_02);
        }
        bMn2.a(bMz2.d());
        return super.a(bMn2);
    }

    @Nullable
    public bMn a(int n) {
        bMn bMn2 = (bMn)super.e(n);
        if (bMn2 != null) {
            return bMn2;
        }
        atg_0 atg_02 = this.f.a(n);
        if (atg_02 == null) {
            return null;
        }
        bMn bMn3 = bMs.b(atg_02);
        bMn3.a(atg_02.m(), atg_02.n(), atg_02.o());
        return bMn3;
    }

    @Nullable
    public bMn b(int n) {
        if (this.c.containsKey(n)) {
            return this.a(this.c.get(n));
        }
        return null;
    }

    public void a(int n, int n2) {
        if (this.d.containsKey(n) && this.d.get(n) == n2) {
            return;
        }
        this.d.put(n, n2);
        this.d(n);
    }

    public int c(int n) {
        this.d(n);
        if (this.d.containsKey(n)) {
            return this.d.get(n);
        }
        return -1;
    }

    public int b(bMn bMn2) {
        if (this.d.containsKey(bMn2.B())) {
            return this.d.get(bMn2.B());
        }
        return -1;
    }

    public void d(int n) {
        bMn bMn2 = (bMn)this.e(n);
        if (bMn2 == null) {
            return;
        }
        if (this.d.containsKey(n)) {
            bMn2.b(fbc_0.a.a((int)this.d.get(n)));
        }
    }

    public final void a() {
        this.c.clear();
        try {
            asw_2.a().a(new atg_0(), new bMt(this));
        }
        catch (Exception exception) {
            b.error((Object)"", (Throwable)exception);
        }
    }

    private static bMz a(atg_0 atg_02) {
        bMz bMz2 = new bMz(atg_02.c());
        bMz2.a(atg_02.m(), atg_02.n(), atg_02.o());
        for (atj_0 atj_02 : atg_02.q()) {
            bMz2.a(new bmx_0(atj_02.a(), atj_02.b(), atj_02.c(), atj_02.d()));
        }
        bMz2.a(atg_02.p());
        return bMz2;
    }

    private static bMn b(atg_0 atg_02) {
        int n = atg_02.c();
        int n2 = atg_02.j();
        int n3 = atg_02.k();
        int n4 = atg_02.d();
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        for (aTh aTh2 : atg_02.r()) {
            tIntObjectHashMap.put(aTh2.a(), (Object)new aeo_2(aTh2.b(), aTh2.c()));
        }
        TIntObjectHashMap tIntObjectHashMap2 = new TIntObjectHashMap();
        for (aTi aTi2 : atg_02.s()) {
            tIntObjectHashMap2.put(aTi2.a(), (Object)new aeo_2(aTi2.b(), aTi2.c()));
        }
        xr_1 xr_12 = new xr_1();
        xr_12.a = n;
        xr_12.b = new xc_1();
        xr_12.b.a = n2;
        xr_12.b.b = n2;
        xr_12.b.c = n3;
        xr_12.c = new xs_2();
        xr_12.c.a = n4;
        xr_12.c.b = -1L;
        xr_12.l = new xy_1();
        tIntObjectHashMap.forEachEntry((TIntObjectProcedure)new bmu_0(xr_12));
        xr_12.m = new xg_1();
        tIntObjectHashMap2.forEachEntry((TIntObjectProcedure)new bmv_0(xr_12));
        ByteBuffer byteBuffer = ByteBuffer.wrap(bMy.a.a(xr_12));
        bMn bMn2 = (bMn)bmb_0.c.a(byteBuffer);
        for (atj_0 atj_02 : atg_02.q()) {
            bMn2.a(new bmx_0(atj_02.a(), atj_02.b(), atj_02.c(), atj_02.d()));
        }
        return bMn2;
    }
}

