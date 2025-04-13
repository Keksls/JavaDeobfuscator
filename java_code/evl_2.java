/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from eVL
 */
public class evl_2 {
    public static int a(long l, int n) {
        Optional<emy_0> optional = ena_0.a().a(l, end_0.e);
        if (optional.isEmpty()) {
            return 0;
        }
        emy_0 emy_02 = optional.get();
        if (!(emy_02 instanceof evm_2)) {
            return 0;
        }
        evm_2 evm_22 = (evm_2)emy_02;
        return evm_22.a(n);
    }
}

