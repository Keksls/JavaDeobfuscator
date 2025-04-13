/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongLongIterator
 *  gnu.trove.map.hash.TLongLongHashMap
 *  gnu.trove.procedure.TLongProcedure
 *  gnu.trove.set.hash.TLongHashSet
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TLongLongIterator;
import gnu.trove.map.hash.TLongLongHashMap;
import gnu.trove.procedure.TLongProcedure;
import gnu.trove.set.hash.TLongHashSet;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.Nullable;

public class eJL
extends se_0
implements adv_1 {
    private static boolean u = true;
    private static final TLongProcedure v = new eJM();
    private long w = 10L;
    private final Su x;
    private final TLongLongHashMap y = new TLongLongHashMap();
    private final TLongLongHashMap z = new TLongLongHashMap();
    private final eJK A = new eJK(this);
    private final TLongHashSet B = new TLongHashSet();
    protected final sj_0 t;

    public eJL(Su su) {
        this.x = su;
        this.t = new eJN(this);
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (!(adt_12 instanceof adh_2)) {
            return false;
        }
        long l = this.y.get(((adh_2)adt_12).b());
        if (l != 0L) {
            So so;
            sd_0 sd_02 = (sd_0)this.b.get(l);
            if (sd_02 != null && sd_02.bt_() == efc_0.b.a() && (so = sd_02.m()) instanceof efq_0) {
                return true;
            }
            this.a(l, true);
        }
        return true;
    }

    @Override
    public void a() {
        this.y.clear();
        this.z.clear();
        super.a();
    }

    @Override
    public void c() {
        this.y.forEachKey(v);
        this.y.clear();
        this.z.clear();
        super.c();
    }

    @Override
    public long a_() {
        return this.w;
    }

    @Override
    public void a(long l) {
        this.w = l;
    }

    @Override
    public Su f() {
        return this.x;
    }

    public long e(sd_0 sd_02) {
        sd_0 sd_03 = sd_02;
        if (this.e(sd_03.c())) {
            long l = sd_03.c();
            return this.d(l) - System.currentTimeMillis();
        }
        if (sd_03 instanceof eja_0) {
            fie_0 fie_02 = ((eja_0)sd_03).aF();
            if (!fie_02.z()) {
                a.error((Object)("Le temps de fin pour un etat non infini n'est pas contenu dans la map des effets en cours : effect.uid=" + sd_03.c() + ", effect.id=" + sd_03.bt_() + ", stateId=" + fie_02.p()));
            }
        } else {
            a.error((Object)("Le temps de fin n'est pas contenu dans la map des effets en cours : effect.uid=" + sd_03.c() + ", effect.id=" + sd_03.bt_()));
        }
        return 0L;
    }

    @Override
    public void a(sd_0 sd_02) {
        if (sd_02 == null) {
            return;
        }
        ejh_0 ejh_02 = (ejh_0)sd_02;
        if (ejh_02.m() == null || !ejh_02.as()) {
            return;
        }
        if (!ejh_02.at() && ejh_02.bp_()) {
            long l = ejh_02.bo_();
            long l2 = adi_2.a().a(this, l, 0, 1L);
            super.a((sd_0)ejh_02);
            this.y.put(l2, ejh_02.c());
            this.z.put(ejh_02.c(), System.currentTimeMillis() + l);
        } else {
            super.a((sd_0)ejh_02);
        }
    }

    public void k() {
        this.c();
    }

    public byte[] b(boolean bl) {
        return this.A.a(bl);
    }

    public byte[] l() {
        return this.A.a();
    }

    long d(long l) {
        return this.z.get(l);
    }

    boolean e(long l) {
        return this.z.containsKey(l);
    }

    boolean m() {
        return this.x instanceof epq_2 && ((epq_2)this.x).gY() == 5;
    }

    public void a(byte[] byArray, So so) {
        this.a();
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        short s2 = byteBuffer.getShort();
        for (short s3 = 0; s3 < s2; s3 = (short)(s3 + 1)) {
            si_0 si_02 = (si_0)efc_0.a().b(byteBuffer.getInt());
            if (si_02 == null) {
                a.error((Object)"Impossible d'instancier un runningEffect ");
            }
            byte[] byArray2 = new byte[byteBuffer.getShort()];
            byteBuffer.get(byArray2);
            if (si_02 == null) continue;
            if (so == null) {
                a.error((Object)"contexte null au moment de d\u00e9s\u00e9rialiser un effet");
            }
            ejh_0 ejh_02 = (ejh_0)si_02.a(so, null);
            try {
                ejh_02.b(byArray2);
            }
            catch (Exception exception) {
                a.error((Object)("Exception during RunningEffect unserialize " + si_02.bt_()), (Throwable)exception);
                this.o();
                break;
            }
            int n = byteBuffer.getInt();
            if (n != 0) {
                ejh_02.f((long)n);
            }
            this.a((sd_0)ejh_02);
        }
    }

    private void o() {
        this.a((sd_0<?, ?> sd_02) -> {
            Object FX = sd_02.f();
            if (FX == null) {
                a.info((Object)sd_02.bt_());
            } else {
                a.info((Object)("Action Id " + sd_02.bt_() + ", EffectId " + FX.i()));
            }
        });
    }

    public boolean a(zb_1 zb_12) {
        return this.a(zb_12, true, false);
    }

    public boolean a(zb_1 zb_12, boolean bl, boolean bl2) {
        zb_12.a.clear();
        this.a((sd_0<?, ?> sd_02) -> {
            if (!(sd_02 instanceof eja_0)) {
                return;
            }
            eja_0 eja_02 = (eja_0)sd_02;
            fie_0 fie_02 = eja_02.aF();
            if (bl && !fie_02.E()) {
                return;
            }
            if (bl2 && fie_02.E()) {
                return;
            }
            boolean bl3 = true;
            int n = 0;
            if (this.e(sd_02.c())) {
                long l = sd_02.c();
                n = (int)(this.d(l) - System.currentTimeMillis());
                if (n < 0 && fie_02.o() != -1 && fie_02.m() != -1) {
                    bl3 = false;
                }
            } else if (fie_02.o() != -1000 && fie_02.m() != -1) {
                bl3 = false;
            }
            if (bl3) {
                zd_1 zd_12 = new zd_1();
                zd_12.a = sd_02.c();
                zd_12.b = fie_02.p();
                zd_12.c = fie_02.c();
                zd_12.d = n;
                zd_12.e = eja_02.aS();
                zb_12.a.add(zd_12);
            }
        });
        return true;
    }

    public static boolean a(zb_1 zb_12, So<efh_0> so, Su su) {
        for (zd_1 zd_12 : zb_12.a) {
            si_0 si_02 = (si_0)efc_0.a().b(efc_0.b.a());
            if (si_02 == null) {
                a.error((Object)"On des\u00e9rialise un effet qui n'existe pas : RUNNING_STATE");
                return false;
            }
            eja_0 eja_02 = eja_0.a(so, su, null, fie_0.a(zd_12.b, zd_12.c));
            if (eja_02 == null) {
                a.error((Object)("Effect not unserialized because of an unknown state : " + zd_12.b));
                continue;
            }
            fie_0 fie_02 = eja_02.aF();
            if (zd_12.d <= 0 && fie_02.o() != -1000 && fie_02.m() != -1) {
                eja_02.q();
                continue;
            }
            eja_02.a(zd_12.a);
            eja_02.f((long)zd_12.d);
            eja_02.e(zd_12.e);
            eja_02.b(su);
            eja_02.a(eFO.ad());
            sd_0.bs_();
            try {
                eja_02.ad();
            }
            catch (StackOverflowError stackOverflowError) {
                a.error((Object)("Possible infinite loop on state effect execution : " + fie_02));
                a.error((Object)("Possible infinite loop, effects list : " + zb_12.a));
                a.error((Object)("Possible infinite loop, effects already on manager : " + su.x_()));
                a.error((Object)"Possible infinite loop on effect execution", (Throwable)stackOverflowError);
            }
            su.x_().a((sd_0)eja_02);
            eja_02.Y();
        }
        return true;
    }

    public void a(Su su, So so) {
        ArrayList<ejh_0> arrayList = new ArrayList<ejh_0>();
        for (sd_0 sd_02 : this) {
            ejh_0 ejh_02 = (ejh_0)sd_02;
            if (ejh_02.bg()) continue;
            ejh_02.a(so);
            arrayList.add(ejh_02);
        }
        for (ejh_0 ejh_03 : arrayList) {
            if (ejh_03.bo_() == 0L) continue;
            ejh_03.b(su);
            this.a((sd_0)ejh_03);
            sd_0.bs_();
            ejh_03.a(null, false);
        }
    }

    @Override
    public boolean b(sd_0 sd_02) {
        return this.a(sd_02.c(), true);
    }

    public boolean a(sd_0 sd_02, boolean bl) {
        return this.a(sd_02.c(), bl);
    }

    public boolean a(long l, boolean bl) {
        sd_0 sd_02 = (sd_0)this.b.get(l);
        if (sd_02 != null && sd_02.bt_() == efc_0.b.a()) {
            this.a((eja_0)sd_02, bl);
            return true;
        }
        return this.b(l);
    }

    private void a(List<eja_0> list, boolean bl) {
        for (eja_0 eja_02 : list) {
            this.a(eja_02, bl);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(eja_0 eja_02, boolean bl) {
        long l = eja_02.c();
        if (this.B.contains(l)) {
            fie_0 fie_02 = eja_02.aF();
            a.warn((Object)("We are trying to remove a state that is already being removed " + l + ", refId " + (fie_02 != null ? fie_02.p() : (short)0)));
            return;
        }
        this.B.add(l);
        try {
            eja_02.aM();
            this.a(eja_02);
            if (bl) {
                this.b(l);
            }
        }
        catch (Exception exception) {
            a.error((Object)"Exception levee", (Throwable)exception);
        }
        finally {
            this.B.remove(l);
        }
    }

    private void a(eja_0 eja_02) {
        fie_0 fie_02 = eja_02.aF();
        if (fie_02 == null) {
            a.warn((Object)"On veut retirer les effets d'un \u00e9tat inconnu");
            return;
        }
        sn_0 sn_02 = this.a(fie_02);
        ArrayList<sd_0> arrayList = new ArrayList<sd_0>();
        while (sn_02.hasNext()) {
            arrayList.add(sn_02.a());
        }
        for (sd_0 sd_02 : arrayList) {
            try {
                ejh_0 ejh_02 = (ejh_0)sd_02;
                if (ejh_02.bt_() == efc_0.b.a()) continue;
                if (eja_02.bb()) {
                    ejh_02.i(true);
                }
                this.b(ejh_02.c());
            }
            catch (Exception exception) {
                a.error((Object)("Exception lors du retrait des effets lies a l'etat " + fie_02.p()), (Throwable)exception);
            }
        }
    }

    @Override
    public void c(Su su) {
        this.a(su, false);
    }

    public void a(Su su, boolean bl) {
        this.a(su, bl, false, false);
    }

    public void a(Su su, boolean bl, boolean bl2, boolean bl3) {
        so_0 so_02 = this.a(su);
        ArrayList<eja_0> arrayList = new ArrayList<eja_0>();
        while (so_02.hasNext()) {
            fie_0 fie_02;
            ejh_0 ejh_02 = (ejh_0)so_02.a();
            if (bl2 && ejh_02.a(eff_0.h)) continue;
            if (bl3 && ejh_02 instanceof eja_0 && (fie_02 = ((eja_0)ejh_02).aF()) != null && fie_02.B()) {
                ejh_02.i(true);
                arrayList.add((eja_0)ejh_02);
                continue;
            }
            if (ejh_02.bt_() == efc_0.b.a() || !eJL.a(ejh_02) || bl && (ejh_02.f() == null || ((efh_0)ejh_02.f()).h() != 2)) continue;
            so_02.remove();
        }
        so_02.b();
        this.a(arrayList);
    }

    private void a(List<eja_0> list) {
        this.a(list, true);
    }

    public void d(Su su) {
        so_0 so_02 = this.a(su);
        ArrayList<eja_0> arrayList = new ArrayList<eja_0>();
        this.a(so_02, true, arrayList);
        so_02.b();
        this.a(arrayList);
    }

    public void b(Sm sm) {
        this.a(sm, false);
    }

    @Override
    public void a(Sm sm, boolean bl) {
        sn_0 sn_02 = this.a(sm);
        ArrayList<eja_0> arrayList = new ArrayList<eja_0>();
        this.a(sn_02, arrayList);
        this.a(arrayList, bl);
    }

    public void a(exk_2 exk_22, boolean bl) {
        ejp_0 ejp_02 = new ejp_0(this, this.iterator(), exk_22);
        ArrayList<eja_0> arrayList = new ArrayList<eja_0>();
        this.a(ejp_02, arrayList);
        this.a(arrayList, bl);
    }

    private void a(Iterator<sd_0> iterator, List<eja_0> list) {
        this.a(iterator, false, list);
    }

    private void a(Iterator<sd_0> iterator, boolean bl, List<eja_0> list) {
        ArrayList<sd_0> arrayList = new ArrayList<sd_0>();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next());
        }
        this.a(arrayList, bl, list);
    }

    private void a(Iterable<sd_0> iterable, boolean bl, List<eja_0> list) {
        for (sd_0 sd_02 : iterable) {
            ejh_0 ejh_02 = (ejh_0)sd_02;
            if (bl) {
                ejh_02.i(true);
            }
            if (ejh_02.bt_() == efc_0.b.a()) {
                list.add((eja_0)ejh_02);
                continue;
            }
            if (!eJL.a(ejh_02)) continue;
            this.b(ejh_02.c());
        }
    }

    @Override
    public void a(Sm sm, boolean bl, boolean bl2) {
        sn_0 sn_02 = this.a(sm);
        ArrayList<eja_0> arrayList = new ArrayList<eja_0>();
        while (sn_02.hasNext()) {
            ejh_0 ejh_02 = (ejh_0)sn_02.a();
            if (ejh_02.bt_() == efc_0.b.a()) {
                ejh_02.i(bl2);
                arrayList.add((eja_0)ejh_02);
                continue;
            }
            if (!eJL.a(ejh_02)) continue;
            ejh_02.i(bl2);
            sn_02.remove();
        }
        this.a(arrayList, bl);
    }

    @Override
    public sj_0 g() {
        return this.t;
    }

    private static boolean a(ejh_0 ejh_02) {
        return ejh_02.k() == null || ((efi_0)ejh_02.k()).G_() != 1;
    }

    public void f(int n) {
        Iterator<sd_0> iterator = this.iterator();
        while (iterator.hasNext()) {
            sd_0 sd_02 = iterator.next();
            if (sd_02.k() == null || sd_02.k().G_() != n || !this.f(sd_02)) continue;
            iterator.remove();
            this.c(sd_02);
        }
    }

    private boolean f(sd_0 sd_02) {
        Object FX = sd_02.f();
        if (!(FX instanceof efh_0)) {
            return false;
        }
        efh_0 efh_02 = (efh_0)FX;
        return efh_02.S().hasNext() || efh_02.T().hasNext();
    }

    public void g(int n) {
        this.a(n, false, false);
    }

    public void a(int n, boolean bl, boolean bl2) {
        ArrayList arrayList = new ArrayList();
        for (Object object : this) {
            if (((sd_0)object).k() == null || ((sd_0)object).k().G_() != n || arrayList.contains(((sd_0)object).k())) continue;
            arrayList.add(((sd_0)object).k());
        }
        for (Object object : arrayList) {
            if (bl2) {
                this.a((Sm)object, bl, bl2);
                continue;
            }
            this.a((Sm)object, bl);
        }
    }

    public void a(eoz_1 eoz_12) {
        ArrayList arrayList = new ArrayList();
        this.a((sd_0<?, ?> sd_02) -> {
            ehx_0 ehx_02;
            if (sd_02 instanceof ehx_0 && (ehx_02 = (ehx_0)sd_02).aD() == eoz_12 && !arrayList.contains(ehx_02.k())) {
                arrayList.add(ehx_02.k());
            }
        });
        for (Sm sm : arrayList) {
            this.a(sm, true);
        }
    }

    public int h(int n) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        ArrayList<eja_0> arrayList = new ArrayList<eja_0>();
        this.a((sd_0<?, ?> sd_02) -> {
            eja_0 eja_02;
            fie_0 fie_02;
            if (sd_02 instanceof eja_0 && (fie_02 = (eja_02 = (eja_0)sd_02).aF()) != null && fie_02.p() == n) {
                arrayList.add(eja_02);
                atomicInteger.incrementAndGet();
            }
        });
        this.a(arrayList);
        return atomicInteger.get();
    }

    public List<eja_0> n() {
        ArrayList<eja_0> arrayList = new ArrayList<eja_0>();
        this.a((sd_0<?, ?> sd_02) -> {
            if (sd_02.bt_() == efc_0.b.a()) {
                arrayList.add((eja_0)sd_02);
            }
        });
        return arrayList;
    }

    public eja_0 i(int n) {
        return this.a((sd_0<?, ?> sd_02) -> {
            if (sd_02.bt_() == efc_0.b.a() && ((eja_0)sd_02).aF().p() == n) {
                return (eja_0)sd_02;
            }
            return null;
        });
    }

    @Nullable
    public sd_0 a(eff_0 eff_02) {
        for (sd_0 sd_02 : this) {
            if (!((ejh_0)sd_02).a(eff_02)) continue;
            return sd_02;
        }
        return null;
    }

    @Override
    public void c(sd_0 sd_02) {
        super.c(sd_02);
        long l = sd_02.c();
        TLongLongIterator tLongLongIterator = this.y.iterator();
        while (tLongLongIterator.hasNext()) {
            tLongLongIterator.advance();
            long l2 = tLongLongIterator.key();
            if (tLongLongIterator.value() != l) continue;
            adi_2.a().a(l2);
            tLongLongIterator.remove();
        }
        this.z.remove(l);
    }
}

