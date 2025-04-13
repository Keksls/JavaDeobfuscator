/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from ccY
 */
public class ccy_2
extends fkh_0 {
    public static final int a = 2;
    private static final Logger d = Logger.getLogger(ccy_2.class);
    private cde_1 e;
    private boolean f;
    private final TLongObjectHashMap<TLongArrayList> g = new TLongObjectHashMap();

    public ccy_2(long l) {
        super(l);
    }

    private ccy_2(ccy_2 ccy_22) {
        super(ccy_22);
        this.f = true;
    }

    public static ccy_2 a(byte[] byArray, byte[] byArray2) {
        ccy_2 ccy_22 = new ccy_2(0L);
        ccy_22.a(byArray);
        ccy_22.a(byArray2, false);
        ccy_22.f = true;
        return ccy_22;
    }

    public ccy_2 a() {
        return new ccy_2(this);
    }

    private void q() {
        if (this.f) {
            throw new UnsupportedOperationException("Ne doit pas \u00eatre appel\u00e9 avec un monde servant \u00e0 l'edition");
        }
    }

    public ccj_2 a(int n) {
        return (ccj_2)cck_2.a.c(n);
    }

    public void a(byte ... byArray) {
        this.q();
        this.a(-4, -10, 8, 11);
        this.a(fkk_0.c);
        this.b(byArray);
        this.b();
    }

    private void b(byte ... byArray) {
        this.q();
        if (byArray == null || byArray.length == 0) {
            return;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        while (byteBuffer.hasRemaining()) {
            short s2 = byteBuffer.getShort();
            short s3 = byteBuffer.getShort();
            short s4 = byteBuffer.getShort();
            short s5 = byteBuffer.getShort();
            short s6 = byteBuffer.getShort();
            short s7 = byteBuffer.getShort();
            this.b(s2, s3, s4, s5, s6, s7);
        }
    }

    public void a(short s2, short s3, short s4, short s5, short s6, short s7) {
        this.q();
        this.b(s2, s3, s4, s5, s6, s7);
        this.f(s2, s3);
        this.b();
        this.r();
    }

    public void a(esd_1 esd_12) {
        this.q();
        boolean bl = this.a(esd_12, true);
        if (bl |= this.c(esd_12)) {
            this.r();
        }
    }

    public void a(long l, int n) {
        this.q();
        esy_2 esy_22 = this.b(l, n);
        if (esy_22 != null) {
            this.c(esy_22);
            this.r();
        }
    }

    private void b(esy_2 esy_22) {
        this.q();
        btz_1 btz_12 = bta_2.a.a(esy_22.d());
        if (btz_12 == null) {
            return;
        }
        ahn ahn2 = ahp.a().a(ccc_1.a.b());
        ahn ahn3 = ahp.a().a(ccc_1.c.b());
        ArrayList<btb_2> arrayList = btz_12.a();
        for (btb_2 btb_22 : arrayList) {
            try {
                ahn ahn4 = btb_22.a() ? ahn3 : ahn2;
                ahm ahm2 = this.a(esy_22, btb_22, ahn4);
                ahm2.b();
                abe_0.d().a(ahm2);
                this.a(esy_22.c(), ahm2.a());
            }
            catch (IOException iOException) {
                d.error((Object)"IOException during addBuildingVisuals", (Throwable)iOException);
            }
        }
    }

    private ahm a(esy_2 esy_22, btb_2 btb_22, ahn ahn2) {
        long l = abd_1.c();
        aff_1 aff_12 = btb_22.d();
        return ahm.a(l, btb_22.b(), esy_22.h() + aff_12.d(), esy_22.i() + aff_12.e(), aff_12.f(), btb_22.f(), btb_22.g(), (byte)btb_22.e().a(), ahn2, btb_22.c());
    }

    private void a(long l, long l2) {
        TLongArrayList tLongArrayList = (TLongArrayList)this.g.get(l);
        if (tLongArrayList == null) {
            tLongArrayList = new TLongArrayList();
            this.g.put(l, (Object)tLongArrayList);
        }
        tLongArrayList.add(l2);
    }

    private void c(long l) {
        TLongArrayList tLongArrayList = (TLongArrayList)this.g.get(l);
        if (tLongArrayList == null) {
            return;
        }
        for (int k = 0; k < tLongArrayList.size(); ++k) {
            long l2 = tLongArrayList.get(k);
            abe_0.d().a(l2);
        }
        this.g.remove(l);
    }

    public void a(long l) {
        esy_2 esy_22 = this.b(l);
        if (esy_22 != null) {
            this.c(esy_22);
            this.r();
        }
        this.c(l);
    }

    private void f(short s2, short s3) {
        YX.a(s2, s3);
    }

    private void r() {
        this.q();
        if (this.e != null) {
            this.e.a();
        }
        ans_0.D().c().b().e();
        cde_1 cde_12 = this.c();
        cci_2.a.f().a(cde_12);
        acs_0.b().e();
        acw.a().c();
        this.s();
        blj_1.D().E();
    }

    private void s() {
        afz_0.d().c();
        ahs.d().c();
        bNT.f().c();
        abe_0.d().c();
    }

    private boolean c(esy_2 esy_22) {
        afk_2 afk_22 = esy_22.k();
        for (int k = afk_22.d; k < afk_22.e; ++k) {
            for (int i2 = afk_22.b; i2 < afk_22.c; ++i2) {
                this.f((short)i2, (short)k);
                YX.a(XZ.c(i2), XZ.d(k), 0);
            }
        }
        return true;
    }

    public void a(byte[] byArray, boolean bl) {
        this.q();
        if (byArray == null || byArray.length == 0) {
            return;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        while (byteBuffer.hasRemaining()) {
            esd_1 esd_12 = cdj_1.a(byteBuffer);
            this.a(esd_12, bl);
        }
    }

    private boolean a(esy_2 esy_22, boolean bl) {
        this.a(esy_22);
        if (bl) {
            this.b(esy_22);
        }
        return true;
    }

    public void b() {
        short[][] sArray = this.d();
        for (int k = 0; k < this.j(); ++k) {
            for (int i2 = 0; i2 < this.k(); ++i2) {
                int n;
                int n2 = k + this.h();
                if (!this.a(n2, n = i2 + this.i()) || !cch_2.b(sArray, k, i2)) continue;
                short s2 = cch_2.a(sArray, k, i2);
                this.a(n2, n, s2);
            }
        }
    }

    public cdc_1 a(short s2, short s3) {
        this.q();
        cdc_1 cdc_12 = new cdc_1();
        cdc_12.a(s2, s3);
        this.a(s2, s3, cdc_12);
        return cdc_12;
    }

    public aoc_0 b(short s2, short s3) {
        this.q();
        cdi_1 cdi_12 = new cdi_1();
        cdi_12.a(s2, s3);
        this.a(s2, s3, cdi_12);
        return cdi_12;
    }

    public cde_1 c() {
        this.q();
        cde_1 cde_12 = new cde_1();
        for (int k = this.h(); k <= this.l(); ++k) {
            int n = k * 9;
            for (int i2 = this.i(); i2 <= this.m(); ++i2) {
                ccj_2 ccj_22 = (ccj_2)this.c(k, i2);
                if (ccj_22 == null) continue;
                int n2 = i2 * 9;
                cde_12.a(n, n2, ccj_22);
            }
        }
        this.a(new ccz_2(this, cde_12));
        cde_12.f();
        this.e = cde_12;
        return cde_12;
    }

    @Override
    public short[][] d() {
        short[][] sArray = this.n();
        for (int k = 0; k < sArray.length; ++k) {
            for (int i2 = 0; i2 < sArray[k].length; ++i2) {
                if (fkk_0.a((int)sArray[k][i2]).a() != 1) continue;
                sArray[k][i2] = fkk_0.c;
            }
        }
        return sArray;
    }

    @Override
    public short a(short[][] sArray, int n, int n2) {
        int n3 = n - this.h();
        int n4 = n2 - this.i();
        if (this.a(n, n2) && cch_2.b(sArray, n3, n4)) {
            return cch_2.a(sArray, n3, n4);
        }
        return 0;
    }

    @Override
    public boolean a(TObjectProcedure<esy_2> tObjectProcedure) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        super.a(new cda_1(this, arrayList2, arrayList));
        for (esy_2 esy_22 : arrayList) {
            if (tObjectProcedure.execute((Object)esy_22)) continue;
            return false;
        }
        for (esy_2 esy_22 : arrayList2) {
            if (tObjectProcedure.execute((Object)esy_22)) continue;
            return false;
        }
        return true;
    }

    @Override
    public /* synthetic */ fkh_0 e() {
        return this.a();
    }

    @Override
    public /* synthetic */ fkk_0 b(int n) {
        return this.a(n);
    }

    @Override
    public /* synthetic */ fkj_0 f() {
        return this.a();
    }
}

