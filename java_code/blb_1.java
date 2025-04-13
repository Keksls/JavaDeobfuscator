/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.net.MalformedURLException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Renamed from bLB
 */
public class blb_1
extends bLP {
    private int a = -1;
    private boolean b;

    public blb_1(long l, boolean bl) {
        super(l, null, null, null);
        if (bl) {
            this.h();
        }
    }

    @Override
    public String b() {
        try {
            String string = azs_0.b("fullMapPath", this.j());
            try {
                return arl_1.c(string).toString();
            }
            catch (MalformedURLException malformedURLException) {
                return null;
            }
        }
        catch (gm_0 gm_02) {
            return null;
        }
    }

    public long c() {
        return this.j();
    }

    public boolean g() {
        return this.b;
    }

    public void h() {
        int[] nArray = fgT.a.c();
        long l = this.c();
        for (int n : nArray) {
            bmf_0 bmf_02 = (bmf_0)fgT.a.a(n);
            if (bmf_02.f() != l) continue;
            bLP bLP2 = blf_1.a(bmf_02.e(), l);
            if (bLP2 != null) {
                bLP2.a(this);
            }
            this.a = bmf_02.e();
        }
        this.b = true;
    }

    @Override
    public List<fwB> i() {
        return Collections.emptyList();
    }

    @Override
    public Collection<? extends fwA> bb_() {
        TLongObjectHashMap<bLP> tLongObjectHashMap = blg_1.a().b(blh_1.a);
        if (tLongObjectHashMap == null) {
            return Collections.emptyList();
        }
        return tLongObjectHashMap.valueCollection().stream().filter(bmh_0.class::isInstance).map(bmh_0.class::cast).filter(bmh_02 -> bmh_02.h() == this.c()).collect(Collectors.toList());
    }

    @Override
    public void a(blo_0 blo_02) {
        long l = this.c();
        bme_0.a.b(l);
        TLongArrayList tLongArrayList = new TLongArrayList();
        tLongArrayList.add(l);
        blo_02.z().a(tLongArrayList);
    }

    @Override
    public boolean e() {
        long l = this.c();
        cct_1 cct_12 = (cct_1)((fjw_0)fjw_0.e()).c(l);
        return cct_12 != null && cct_12.t;
    }

    @Override
    public boolean f() {
        bLP bLP2 = blg_1.a().b(blh_1.b, this.k());
        if (bLP2 == null) {
            return false;
        }
        long l = this.c();
        cct_1 cct_12 = (cct_1)((fjw_0)fjw_0.e()).c(l);
        return cct_12.u;
    }

    @Override
    public void b(blo_0 blo_02) {
        bLP bLP2 = blg_1.a().b(blh_1.b, this.k());
        if (bLP2 != null) {
            blo_02.a(bLP2);
        }
    }

    public long k() {
        bmf_0 bmf_02;
        int n = this.a;
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.T_() == this.c() && (bmf_02 = bme_0.a.a(bmr_12.G(), bmr_12.H())) != null) {
            n = bmf_02.e();
        }
        return n;
    }

    @Override
    public String d() {
        return blf_1.a(this.j());
    }
}

