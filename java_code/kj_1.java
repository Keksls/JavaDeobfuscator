/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from KJ
 */
public class kj_1 {
    private final List<lk_2> a = new ArrayList<lk_2>();

    public void a(lk_2 lk_22) {
        this.a.add(lk_22);
    }

    public List<lk_2> a() {
        return Collections.unmodifiableList(this.a);
    }

    public String toString() {
        return "EpsTags{" + this.a + "}";
    }
}

