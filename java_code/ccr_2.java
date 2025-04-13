/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.THashMap;
import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from ccR
 */
public class ccr_2
implements YW {
    private static final Logger a = Logger.getLogger(ccr_2.class);
    private static final int b = 375;
    private aew_0 c;
    private acs_0 d;
    private aev e;
    private final ccy_2 f;

    public ccr_2(ccy_2 ccy_22) {
        this.f = ccy_22;
    }

    void a(cde_1 cde_12) {
        this.d.a(cde_12, cde_12.g());
        this.a();
    }

    @Override
    public void a(aew_0 aew_02, acs_0 acs_02, aev aev2) {
        this.c = aew_02;
        this.d = acs_02;
        this.e = aev2;
    }

    @Override
    public void b(short s2, short s3) {
        cch_1 cch_12;
        enJ enJ2 = this.f.c(s2, s3);
        yz_0.a(this.f.o(), s2, s3, (short)0, enJ2);
        cdc_1 cdc_12 = this.f.a(s2, s3);
        this.e.a(s2, s3, cdc_12);
        aoc_0 aoc_02 = this.f.b(s2, s3);
        ccv_1.a.a(aoc_02);
        this.c.a(s2, s3, aoc_02);
        if (ccm_1.g().a() && (cch_12 = (cch_1)ccm_1.g().b(s2, s3)) != null) {
            cch_12.b(new ccs_2(this));
        }
    }

    @Override
    public void a(long l) {
        try {
            this.a(this.f.c());
        }
        catch (Exception exception) {
            a.error((Object)"", (Throwable)exception);
        }
    }

    private void a() {
        int[] nArray = new int[]{1};
        THashMap tHashMap = new THashMap();
        TShortObjectHashMap tShortObjectHashMap = new TShortObjectHashMap();
        this.f.a((TObjectProcedure<esy_2>)((TObjectProcedure)esy_22 -> {
            cdl_1 cdl_12 = (cdl_1)esy_22.m();
            ccu_2 ccu_22 = new ccu_2(nArray[0], (TShortObjectHashMap<short[]>)tShortObjectHashMap, cdl_12.c());
            cdl_12.a(ccu_22);
            nArray[0] = nArray[0] + cdl_12.c();
            tHashMap.put(esy_22, (Object)ccu_22.a());
            return true;
        }));
        this.a((THashMap<esy_2, cct_2>)tHashMap, (TShortObjectHashMap<short[]>)tShortObjectHashMap);
        YY.a().a(nArray[0], (TShortObjectHashMap<short[]>)tShortObjectHashMap);
    }

    private void a(THashMap<esy_2, cct_2> tHashMap, TShortObjectHashMap<short[]> tShortObjectHashMap) {
        ArrayList arrayList = new ArrayList();
        this.f.a((TObjectProcedure<esy_2>)((TObjectProcedure)esy_22 -> {
            arrayList.add(esy_22);
            return true;
        }));
        for (esy_2 esy_23 : arrayList) {
            for (esy_2 esy_24 : arrayList) {
                if (esy_23 == esy_24) continue;
                cct_2 cct_22 = (cct_2)tHashMap.get((Object)esy_23);
                cct_2 cct_23 = (cct_2)tHashMap.get((Object)esy_24);
                cct_2.a(cct_22, cct_23, tShortObjectHashMap);
            }
        }
    }

    @Override
    public boolean a(short s2, short s3) {
        return this.f.d(s2, s3);
    }

    @Override
    public void b() {
    }

    @Override
    public void b(long l) {
        aes_0.a().a(375L);
        aes_0.a().c();
    }
}

