/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;
import java.util.function.Supplier;

/*
 * Renamed from Ee
 */
public final class ee_1 {
    private static final Fz[] a = new Fz[0];

    private ee_1() {
    }

    public static int a(fs_0 fs_02, eg_1 eg_12, int n) {
        int n2 = eg_12.b() & 0xFFFF;
        ft_0[] ft_0Array = new ft_0[n2];
        for (int k = 0; k < ft_0Array.length; ++k) {
            ft_0Array[k] = ef_0.a(eg_12);
        }
        fs_02.a(ft_0Array);
        return ee_1.b(fs_02, eg_12, n);
    }

    private static int b(fs_0 fs_02, eg_1 eg_12, int n) {
        int n2 = eg_12.a() & 0xFF;
        if (n2 == 0) {
            fs_02.a(a);
            return eg_12.b() & 0xFFFF;
        }
        Fz[] fzArray = new Fz[n2];
        for (int k = 0; k < fzArray.length; ++k) {
            fk_1 fk_12;
            Optional<DR> optional;
            byte by = (byte)(eg_12.a() & 0xFF);
            byte by2 = (byte)(eg_12.a() & 0xFF);
            Optional<fk_1> optional2 = fk_1.a(by);
            if (optional2.isEmpty() || (optional = DR.a(fk_12 = optional2.get())).isEmpty()) continue;
            Supplier<? extends Fz> supplier = fk_12.b();
            DQ<? extends DP> dQ = optional.get().b();
            Fz fz = supplier.get();
            DP dP = dQ.a(fz);
            fz.a(n);
            dP.a(by2, eg_12);
            fzArray[k] = fz;
        }
        fs_02.a(fzArray);
        return eg_12.b() & 0xFFFF;
    }
}

