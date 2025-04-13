/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 */
import gnu.trove.iterator.TLongObjectIterator;
import java.util.ArrayList;

public class bUA
extends fcm_0 {
    public static final String a = "efcc0a";
    private int r;
    private int s;

    public bUA(faX faX2) {
        super(faX2);
        this.q = new bUB(this);
    }

    @Override
    protected fcg b() {
        return new bUv();
    }

    @Override
    public long d(long l) {
        return 0L;
    }

    @Override
    public void a(long l, String string) {
        b.info((Object)"Demande d'enregistrement d'un candidat \u00e0 la nation !!!");
        fbl fbl2 = new fbl();
        fbl2.a(this.g().c());
        fbl2.a(l);
        fbl2.a(string);
        bUT.a.a(fbl2);
    }

    @Override
    public void a(long l, fcf fcf2) {
        throw new UnsupportedOperationException("[NATION] Impossible d'enregistrer des CandidateInfo d\u00e9j\u00e0 initialis\u00e9s \u00e0 partir d'ici");
    }

    @Override
    public void a(ArrayList<fcf> arrayList) {
        this.d();
        bUW.a().o();
        for (int k = 0; k < arrayList.size(); ++k) {
            fcf fcf2 = arrayList.get(k);
            this.i.put(fcf2.a(), (Object)fcf2);
        }
        bUW.a().w();
    }

    @Override
    public void a(int n, int n2) {
        this.r = n;
        this.s = n2;
    }

    @Override
    public void a(long l, byte by, long l2) {
        fbr fbr2 = new fbr();
        fbr2.a(this.g().c());
        fbr2.a(l);
        fbr2.a(by);
        fbr2.b(l2);
        bUT.a.a(fbr2);
    }

    @Override
    public void a(fcu_0 fcu_02, fcu_0 fcu_03, fcx_0 fcx_02) {
        fbt fbt2 = new fbt();
        fbt2.a(this.g().c());
        fbt2.a(fcu_02.a());
        fbt2.b(fcu_03.a());
        fbt2.a(fcx_02);
        bUT.a.a(fbt2);
    }

    @Override
    public void a(wu_0 wu_02, wx_0 wx_02, boolean bl) {
        this.a(wu_02);
        this.g.a(wx_02);
        this.e = bl;
    }

    @Override
    public boolean c() {
        this.i.clear();
        return true;
    }

    @Override
    public void b(long l, long l2) {
        fbn fbn2 = new fbn();
        fbn2.a(this.g().c());
        fbn2.b(l2);
        fbn2.a(l);
        bUT.a.a(fbn2);
    }

    @Override
    protected void d() {
        this.s = 0;
        this.r = 0;
        TLongObjectIterator<fcf> tLongObjectIterator = this.g().z();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            long l = tLongObjectIterator.key();
            faU faU2 = this.g().i(l);
            if (faU2 == null) continue;
            ((bUH)faU2.fE()).g();
        }
        super.d();
    }

    @Override
    public int e() {
        return this.r;
    }

    @Override
    public int f() {
        return this.s;
    }

    @Override
    public void a(int n) {
        this.s = n;
    }

    @Override
    public void a(long l, long l2) {
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void b(long l) {
    }

    @Override
    public void c(long l) {
    }

    @Override
    public void a() {
    }

    static /* synthetic */ boolean a(bUA bUA2, boolean bl) {
        bUA2.e = bl;
        return bUA2.e;
    }

    static /* synthetic */ ww_0 a(bUA bUA2) {
        return bUA2.g;
    }

    static /* synthetic */ ww_0 b(bUA bUA2) {
        return bUA2.h;
    }
}

