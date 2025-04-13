/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cnC
 */
public final class cnc_0
extends Pw {
    private final long a;
    private final ArrayList<esl_2> b = new ArrayList();

    public cnc_0(long l) {
        this.a = l;
    }

    public boolean a(esl_2 esl_22) {
        return !this.b.contains(esl_22) && this.b.add(esl_22);
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        for (int k = 0; k < this.b.size(); ++k) {
            esl_2 esl_22 = this.b.get(k);
            abx_22.a(esl_22.a().k);
            abx_22.b(esl_22.g());
        }
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 13394;
    }

    @Override
    public String toString() {
        return "HavenWorldManageActionRequest{m_actions=" + this.b.size() + "}";
    }
}

