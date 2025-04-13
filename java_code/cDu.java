/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.Table
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

public class cDu
implements akp_0,
cde_0 {
    private final Table<Byte, Integer, cdv_0> a = HashBasedTable.create();
    private cdv_0 b;
    private String c;

    @Override
    public akr_0 a(byte by, int n, String string) {
        cdv_0 cdv_02 = (cdv_0)this.a.get((Object)by, (Object)n);
        akr_0 akr_02 = this.a(string, cdv_02);
        if (cdv_02 != null) {
            return akr_02;
        }
        cdv_0 cdv_03 = (cdv_0)this.a.get((Object)by, (Object)0);
        akr_0 akr_03 = this.a(string, cdv_03);
        if (akr_03 != null) {
            return akr_03;
        }
        return this.b.a(string);
    }

    @Nullable
    private akr_0 a(String string, @Nullable cdv_0 cdv_02) {
        if (cdv_02 == null) {
            return null;
        }
        return cdv_02.a(string);
    }

    public void a() {
        this.a(this.c);
    }

    public void a(String string) {
        this.c = string;
        atg_2 atg_22 = new atg_2();
        ath_2 ath_22 = new ath_2();
        atg_22.a(string);
        atg_22.a(ath_22, new aqy_2[0]);
        atg_22.l();
        this.a.clear();
        ati_2 ati_22 = ath_22.a();
        for (aqx_2 aqx_22 : ati_22.e("mount")) {
            byte by = aqx_22.f("type").e();
            ArrayList<aqx_2> arrayList = aqx_22.d("skin");
            for (aqx_2 aqx_23 : arrayList) {
                cdv_0 cdv_02 = new cdv_0();
                int n = aqx_23.f("id").g();
                for (aqx_2 aqx_24 : aqx_23.k()) {
                    if (aqx_24.k().isEmpty()) continue;
                    String string2 = aqx_24.b();
                    ArrayList<aqx_2> arrayList2 = aqx_24.d("sound");
                    for (aqx_2 aqx_25 : arrayList2) {
                        cdv_02.a(this.a(aqx_25), string2);
                    }
                }
                this.a.put((Object)by, (Object)n, (Object)cdv_02);
            }
        }
        this.b = (cdv_0)this.a.get((Object)0, (Object)0);
    }
}

