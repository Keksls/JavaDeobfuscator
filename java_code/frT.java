/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.awt.Rectangle;

public class frT
extends frO {
    public static final String TAG = "animatedLoadingViewer";

    @Override
    protected void a() {
        Entity entity = this.a.t();
        ayx_2 ayx_22 = (ayx_2)entity.D().c(0);
        ayx_22.a((float)this.m_size.getWidth() / 2.0f + this.b, (float)this.m_size.getHeight() / 2.0f + this.c, 0.0f);
        float f2 = 1.0f;
        if (this.a.an() != null) {
            int n;
            afk_2 afk_22;
            int n2;
            float f3;
            double d2;
            f2 = this.a.an().p();
            fjf_2 fjf_22 = this.getSize();
            double d3 = fjf_22.getWidth();
            double d4 = d3 / (d2 = fjf_22.getHeight());
            this.d = d4 < (double)(f3 = (float)(n2 = (afk_22 = this.a.an().A()).b() - afk_22.a()) / (float)(n = afk_22.d() - afk_22.c())) ? (float)(d3 / (double)n2) : (float)(d2 / (double)n);
            float f4 = 0.8f;
            float f5 = 0.74f;
            float f6 = (float)n2 * this.d * 0.8f;
            float f7 = (float)n * this.d * 0.74f;
            this.setScissor(new Rectangle((int)((d3 - (double)f6) / 2.0), (int)((d2 - (double)f7) / 2.0), (int)f6, (int)f7));
        }
        ayx_22.b(this.d / f2, this.d / f2, 0.0f);
        entity.D().e();
        this.e = false;
    }

    @Override
    public void setSize(int n, int n2) {
        super.setSize(n, n2);
        this.setNeedsToPostProcess();
    }

    @Override
    public String getTag() {
        return TAG;
    }
}

