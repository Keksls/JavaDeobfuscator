/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import org.apache.log4j.Logger;

/*
 * Renamed from awV
 */
public class awv_2
implements awr_2 {
    private static final Logger a = Logger.getLogger(awv_2.class);
    private static final awv_2 b = new awv_2();

    public static awv_2 a() {
        return b;
    }

    private awv_2() {
    }

    @Override
    public void a(VertexBufferPCT vertexBufferPCT, float[] fArray, int n) {
        vertexBufferPCT.c(fArray, n);
    }

    @Override
    public void a(float[] fArray) {
    }
}

