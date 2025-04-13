/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ankama.model.AlmanaxMonth
 *  com.google.common.primitives.Ints
 */
import com.ankama.haapi.client.okhttp.ankama.model.AlmanaxMonth;
import com.google.common.primitives.Ints;

/*
 * Renamed from bkh
 */
public class bkh_1 {
    private final int a;

    public bkh_1(int n) {
        this.a = n;
    }

    public int a() {
        return this.a;
    }

    public static bkh_1 a(AlmanaxMonth almanaxMonth) {
        int n = Ints.saturatedCast((long)almanaxMonth.getMonth());
        return new bkh_1(n);
    }
}

