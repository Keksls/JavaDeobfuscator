/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from Fc
 */
public class fc_0 {
    private final fq_0 a;

    public fc_0(fq_0 fq_02) {
        this.a = fq_02;
    }

    public void a(gh_0 gh_02) {
        Object object;
        gh_02.a(this.a.d());
        if (this.a.a()) {
            object = this.a.e();
            gh_02.a((short)((HashMap)object).size());
            for (Map.Entry entry : ((HashMap)object).entrySet()) {
                gh_02.a((Integer)entry.getKey());
                gh_02.a((Byte)entry.getValue());
            }
        }
        if (this.a.b()) {
            object = this.a.c();
            gh_02.a((float)object[0]);
            gh_02.a((float)object[1]);
            gh_02.a((float)object[2]);
        }
    }
}

