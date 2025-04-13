/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bRN
 */
public class brn_0
implements Comparator<bNS> {
    private static final brn_0 a = new brn_0();

    public int a(bNS bNS2, bNS bNS3) {
        return bNS2.a().j() - bNS3.a().j();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bNS)object, (bNS)object2);
    }
}

