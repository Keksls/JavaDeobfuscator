/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ankama.model.MoneyBalance
 *  com.ankama.haapi.client.okhttp.ankama.model.MoneyBalance$CurrencyEnum
 */
import com.ankama.haapi.client.okhttp.ankama.model.MoneyBalance;
import java.util.List;

/*
 * Renamed from bTe
 */
class bte_1
implements bsk_2 {
    final /* synthetic */ bSO a;

    bte_1(bSO bSO2) {
        this.a = bSO2;
    }

    @Override
    public void a(int n, List<MoneyBalance> list) {
        this.a.d(n);
        int n2 = 0;
        for (MoneyBalance moneyBalance : list) {
            if (moneyBalance.getCurrency() != MoneyBalance.CurrencyEnum.OGR) continue;
            n2 = Hw.c(moneyBalance.getAmount().floatValue());
        }
        this.a.b(n2);
        this.a.l();
    }

    @Override
    public void a(int n, boolean bl) {
        if (bl) {
            bsf_0 bsf_02 = this.a.c(n);
            if (bsf_02 != null) {
                this.a.a(bsf_02);
            } else {
                this.a.n();
            }
        }
        this.a.d(n);
        this.a.l();
    }

    @Override
    public void a(int n, bsj_2 bsj_22) {
        this.a.d(n);
        this.a.l();
    }
}

