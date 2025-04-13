/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  org.apache.log4j.Logger
 */
import com.jogamp.opengl.GL;
import org.apache.log4j.Logger;

/*
 * Renamed from axG
 */
public abstract class axg_1
implements axz_2 {
    protected static final Logger a = Logger.getLogger(axg_1.class);
    protected GL b;

    @Override
    public void a() {
        this.b = auj_1.a.a().e();
    }

    @Override
    public void c() {
        this.b = null;
    }
}

