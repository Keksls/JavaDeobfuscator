/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

/*
 * Renamed from Ff
 */
public class ff_0 {
    private final FV a;

    public ff_0(FV fV) {
        this.a = fV;
    }

    public void a(gh_0 gh_02) {
        Collection<FU> collection = this.a.a();
        gh_02.a((short)collection.size());
        for (FU fU : collection) {
            new fe_0(fU).a(gh_02);
        }
    }
}

