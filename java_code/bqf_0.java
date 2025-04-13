/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bqF
 */
public class bqf_0
extends bqE {
    public static final String l = "buy-compartment-id";

    public bqf_0() {
        super(l, "", azf_2.y, (short)Short.MAX_VALUE);
    }

    @Override
    @Nullable
    public Object b(String string) {
        if ("isMarket".equals(string)) {
            return true;
        }
        return super.b(string);
    }

    @Override
    public boolean k() {
        return true;
    }
}

