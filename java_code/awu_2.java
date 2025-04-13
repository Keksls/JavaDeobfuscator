/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import java.nio.FloatBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from awU
 */
public class awu_2
implements awr_2 {
    private static final Logger a = Logger.getLogger(awu_2.class);
    private int b;
    private VertexBufferPCT c;
    private float[] d;

    @Override
    public void a(VertexBufferPCT vertexBufferPCT, float[] fArray, int n) {
        this.c = vertexBufferPCT;
        this.b = vertexBufferPCT.j() * 4;
        if (this.d == null || this.d.length != n) {
            this.d = new float[n];
        }
        System.arraycopy(fArray, 0, this.d, 0, n);
    }

    @Override
    public void a(float[] fArray) {
        if (this.d == null) {
            return;
        }
        float f2 = fArray[0];
        float f3 = fArray[1];
        float f4 = fArray[2];
        float f5 = 1.0f;
        int n = 0;
        int n2 = this.d.length / 4;
        for (int k = 0; k < n2; ++k) {
            int n3 = n++;
            this.d[n3] = this.d[n3] * f2;
            int n4 = n++;
            this.d[n4] = this.d[n4] * f3;
            int n5 = n++;
            this.d[n5] = this.d[n5] * f4;
            int n6 = n++;
            this.d[n6] = this.d[n6] * 1.0f;
        }
        FloatBuffer floatBuffer = this.c.c();
        floatBuffer.position(this.b);
        floatBuffer.put(this.d);
    }
}

