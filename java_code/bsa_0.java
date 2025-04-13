/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopReference
 *  org.jetbrains.annotations.Nullable
 */
import com.ankama.haapi.client.okhttp.ankama.model.ShopReference;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bSA
 */
public class bsa_0
extends bss_0<Integer, ShopReference> {
    public bsa_0(Integer n, @Nullable String string, String string2, String string3, String string4, Float f2, Float f3, bsz_1 bsz_12, Integer n2, ArrayList<bSJ> arrayList, List<ShopReference> list, ArrayList<bsg_2> arrayList2, ArrayList<bse_0> arrayList3, wt_0 wt_02, Float f4, Float f5, bsz_1 bsz_13) {
        super(n, string, string2, string3, string4, f2 != null ? Double.valueOf(f2.doubleValue()) : null, f3 != null ? Double.valueOf(f3.doubleValue()) : null, bsz_12, n2, arrayList, list, arrayList2, arrayList3, wt_02, f4 != null ? Double.valueOf(f4.doubleValue()) : null, f5 != null ? Double.valueOf(f5.doubleValue()) : null, bsz_13);
    }

    @Override
    public boolean a(bsw_0 bsw_02) {
        return this.K.stream().anyMatch(shopReference -> shopReference.getType().equals(bsw_02.a()));
    }
}

