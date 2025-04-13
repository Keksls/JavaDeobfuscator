/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bdi
 */
public class bdi_2
implements ajh_1 {
    @Override
    public String[] d() {
        return b_;
    }

    @Override
    @Nullable
    public Object b(String string) {
        ens_2 ens_22 = ens_2.a(string);
        if (ens_22 != null) {
            switch (ens_22.e()) {
                case a: {
                    return enp_2.a.d(ens_22);
                }
                case b: {
                    return enp_2.a.b(ens_22);
                }
                case c: {
                    return enp_2.a.e(ens_22);
                }
                case e: {
                    return enp_2.a.h(ens_22);
                }
                case d: {
                    return enp_2.a.f(ens_22);
                }
                case f: {
                    return enp_2.a.g(ens_22);
                }
                case g: {
                    return Float.valueOf(enp_2.a.i(ens_22));
                }
            }
            return null;
        }
        return null;
    }
}

