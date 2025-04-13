/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  gnu.trove.iterator.TByteIntIterator
 *  gnu.trove.map.hash.TByteIntHashMap
 *  org.apache.log4j.Logger
 */
import com.google.protobuf.InvalidProtocolBufferException;
import gnu.trove.iterator.TByteIntIterator;
import gnu.trove.map.hash.TByteIntHashMap;
import java.util.Iterator;
import org.apache.log4j.Logger;

/*
 * Renamed from erd
 */
public class erd_2
extends eqy_1 {
    private static erd_2 a;
    private static final Logger h;
    protected fiz<fio_0> b;
    protected final epc_0 c = new epc_0();
    protected int d;
    protected int e;
    protected eb f;
    protected TByteIntHashMap g;

    public erd_2() {
    }

    public erd_2(short s2, tv_0<fio_0, yt_2> tv_02, tt_0<fio_0> tt_02, boolean bl, boolean bl2, boolean bl3) {
        this.b = new fiz<fio_0>(s2, tv_02, tt_02, bl, bl2, bl3);
    }

    public static erd_2 s() {
        return a;
    }

    public static void a(erd_2 erd_22) {
        a = erd_22;
    }

    public erd_2 b(short s2, String string, int n, short s3, epq_2 epq_22, int n2, fiz<fio_0> fiz2) {
        return new erd_2(s2, string, n, s3, epq_22, n2, fiz2);
    }

    public erd_2 b() {
        return new erd_2();
    }

    public erd_2 b(short s2, tv_0<fio_0, yt_2> tv_02, tt_0<fio_0> tt_02, boolean bl, boolean bl2, boolean bl3) {
        return new erd_2(s2, tv_02, tt_02, bl, bl2, bl3);
    }

    public erd_2(short s2, String string, int n, short s3, epq_2 epq_22, int n2, fiz<fio_0> fiz2) {
        super(s2, string, n, (short)Math.min(s3, epq_22.dr()));
        Object object;
        this.a(epq_22.dp());
        this.e = epq_22.X_();
        this.d = n2;
        this.b = fiz2;
        double d2 = (float)this.d / 100.0f;
        epq_1 epq_12 = epq_22.Z_();
        this.c.a();
        epc_0 epc_02 = epq_22.hF();
        eov_1<epa_1> eov_12 = epc_02 != null ? epc_02 : epq_22.gP();
        for (eps_0 eps_02 : eps_0.values()) {
            if (eps_02.k()) {
                this.c.e(eps_02).g(eov_12.d(eps_02));
                continue;
            }
            this.c.e(eps_02).b(eov_12.c(eps_02));
        }
        if (epq_12 instanceof epn_2) {
            ((epn_2)epq_12).g().a(this.c, s3);
        }
        this.c.e(eps_0.c).n();
        this.c.e(eps_0.e).b(epq_22.c(eps_0.e));
        this.c.e(eps_0.d).n();
        this.c.e(eps_0.l).g(0);
        for (eps_1 eps_12 : ept_1.a().b()) {
            int n3 = eps_12.a();
            int n4 = eps_12.a(s3);
            object = eps_0.a((byte)n3);
            if (object == null || this.c.e((ru_0)object) == null) continue;
            this.c.e((ru_0)object).j(n4);
        }
        if (d2 != 1.0) {
            for (eps_0 eps_03 : eps_0.values()) {
                if (eps_03 == eps_0.c || eps_03 == eps_0.d || eps_03 == eps_0.e) continue;
                object = this.c.e(eps_03);
                if (eps_03.k()) {
                    ((epa_1)object).g((int)Math.ceil((double)((epa_1)object).c() * d2));
                    continue;
                }
                ((epa_1)object).b((int)Math.ceil((double)((epa_1)object).a() * d2));
            }
        }
        this.c.e(eps_0.b).b(epq_22.c(eps_0.b));
        this.c.e(eps_0.b).g((int)((double)eov_12.d(eps_0.b) * d2));
    }

    @Override
    public void a(epq_2 epq_22, epq_2 epq_23) {
        super.a(epq_22, epq_23);
        this.b(epq_22);
        this.a(epq_22);
    }

    private void b(epq_2 epq_22) {
        epq_22.gP().a(this.c);
        if (this.c() > 0) {
            epq_22.a_(eps_0.b).b(this.c());
        }
    }

    protected void a(epq_2 epq_22) {
        fiz<? extends fio_0> fiz2 = epq_22.aZ();
        if (fiz2 == null || this.b == null) {
            return;
        }
        for (fio_0 fio_02 : this.b) {
            try {
                ((uf_0)fiz2).a((fio_0)fio_02.i());
            }
            catch (uz_0 uz_02) {
                h.error((Object)"InventoryCapacityReachedException lors de l'initialisation des sorts d'un double : ", (Throwable)uz_02);
            }
            catch (Uy uy) {
                h.error((Object)"ContentAlreadyPresentException lors de l'initialisation des sorts d'un double : ", (Throwable)uy);
            }
        }
        this.b = fiz2;
    }

    @Override
    public byte n() {
        return this.f != null ? (byte)this.f.y() : (byte)0;
    }

    @Override
    public boolean a(wf_1 wf_12) {
        wf_12.c();
        super.a(wf_12);
        wf_12.g = new wg_2();
        wf_12.g.a.a = this.d;
        wf_12.g.a.b = this.e;
        wf_12.g.a.d = this.r();
        wf_12.g.a.c = this.f.toByteArray();
        if (this.b != null) {
            this.b.a(wf_12.g.a.e);
        }
        this.c.a(wf_12.g.a.f);
        wf_12.g.a.g.clear();
        if (this.g != null) {
            TByteIntIterator tByteIntIterator = this.g.iterator();
            while (tByteIntIterator.hasNext()) {
                tByteIntIterator.advance();
                um_1 um_12 = new um_1();
                um_12.a = tByteIntIterator.key();
                um_12.b = tByteIntIterator.value();
                wf_12.g.a.g.add(um_12);
            }
        }
        return true;
    }

    protected byte r() {
        return 1;
    }

    @Override
    public boolean b(wf_1 wf_12) {
        boolean bl = super.b(wf_12);
        this.d = wf_12.g.a.a;
        this.e = wf_12.g.a.b;
        this.f = this.c(wf_12);
        if (this.b != null) {
            bl &= this.b.b(wf_12.g.a.e);
        }
        bl &= this.c.b(wf_12.g.a.f);
        this.g = null;
        if (wf_12.g.a.g.size() > 0) {
            Iterator<um_1> iterator = wf_12.g.a.g.iterator();
            this.g = new TByteIntHashMap();
            while (iterator.hasNext()) {
                um_1 um_12 = iterator.next();
                this.g.put(um_12.a, um_12.b);
            }
        }
        return bl;
    }

    private eb c(wf_1 wf_12) {
        try {
            return eb.a(wf_12.g.a.c);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw new RuntimeException("Error when unserializing appearance", invalidProtocolBufferException);
        }
    }

    public fiz<fio_0> t() {
        return this.b;
    }

    @Override
    public void q() {
        super.q();
        if (this.b != null) {
            this.b.c();
            this.b.i();
        }
    }

    static {
        h = Logger.getLogger(erd_2.class);
    }
}

