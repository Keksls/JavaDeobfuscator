/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bkH
 */
public class bkh_2
implements ajh_1 {
    public static final String a = "name";
    bkm_2 b;

    bkh_2() {
    }

    bkh_2(bkm_2 bkm_22) {
        this.b = bkm_22;
    }

    @Override
    public String[] d() {
        return b_;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            if (this.b == null) {
                return bae.h().a("battleground.gameplay.name.all", new Object[0]);
            }
            return this.b.b(a);
        }
        return null;
    }
}

