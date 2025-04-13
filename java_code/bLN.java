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

public class bLN
extends bLP {
    private final long a;

    public bLN(int n, long l) {
        super(n, null, null, null);
        this.a = l;
    }

    public long g() {
        return this.a;
    }

    public int h() {
        return (int)this.j();
    }

    @Override
    public String b() {
        try {
            String string = String.format(azs_0.z("fullSubMapPath"), this.g(), this.h() / 100);
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
        return tLongObjectHashMap.valueCollection().stream().filter(bmh_0.class::isInstance).map(bmh_0.class::cast).filter(bmh_02 -> bmh_02.h() == this.a).collect(Collectors.toList());
    }

    @Override
    public void a(blo_0 blo_02) {
        bme_0.a.b(this.a);
        TLongArrayList tLongArrayList = new TLongArrayList();
        tLongArrayList.add(this.a);
        blo_02.z().a(tLongArrayList);
    }

    @Override
    public boolean e() {
        cct_1 cct_12 = (cct_1)((fjw_0)fjw_0.e()).c(this.a);
        return cct_12 != null && cct_12.t;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public void b(blo_0 blo_02) {
    }

    @Override
    public String d() {
        bmf_0 bmf_02 = (bmf_0)fgT.a.a(this.h());
        if (bmf_02 == null) {
            return null;
        }
        short s2 = bmf_02.c();
        short s3 = bmf_02.d();
        if (s2 == -1 || s3 == -1) {
            return null;
        }
        return bae.h().a("recommended.level", s2, s3);
    }

    @Override
    public String bc_() {
        return bae.h().a(66, (long)this.h(), new Object[0]);
    }
}

