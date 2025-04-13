/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;

/*
 * Renamed from bii
 */
public enum bii_2 {
    a(new bid_2()),
    b(new bie_2()),
    c(new bif_2());

    private final Predicate<Integer> d;

    private bii_2(Predicate<Integer> predicate) {
        this.d = predicate;
    }

    public boolean a(int n) {
        return this.d.apply((Object)n);
    }
}

